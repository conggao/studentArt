package com.gk.service.file.impl;

import com.gk.dao.jpa.file.*;
import com.gk.entity.file.*;
import com.gk.entity.file.protocol.*;
import com.gk.service.file.MyResService;
import com.gk.util.BasicUtils;
import com.gk.util.FileMgtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 网盘服务类
 */
@Service
public class MyResServiceImpl implements MyResService {
    @Autowired
    private FileDAO fileDAO;
    @Autowired
    private DirDAO dirDAO;
    @Autowired
    private UserResDAO userResDAO;
    @Autowired
    private ViewUserResDAO viewUserResDAO;
    @Autowired
    private ViewUserDirDAO viewUserDirDAO;
    private boolean isDel = false;


    @Override
    public boolean addDir(MyResDirReq reqValue, Integer schoolId, Long userId) {
        // 取得父目录和新建子文件夹名
        if (reqValue.getName() != null && reqValue.getParentId() != null) {
            DirInfo dirInfo = new DirInfo();
            if (reqValue.isShare()) {
                dirInfo.setSchoolId(schoolId);
            }
            dirInfo.setName(reqValue.getName());
            dirInfo.setCreateTime(BasicUtils.getCurrentTime());
            dirInfo.setDel(false);
            dirInfo.setParentId(reqValue.getParentId());
            dirInfo.setCreateUserId(userId);
            int i = 1;
            String dirName = dirInfo.getName();
            while (!CollectionUtils.isEmpty(dirDAO.findByParentIdAndName(dirInfo.getParentId(), dirName))) {
                dirName = reqValue.getName() + "(" + i + ")";
                i += 1;
            }
            dirInfo.setName(dirName);
            if (dirInfo != null) {
                if (null != dirDAO.save(dirInfo)) {
                    return true;
                }
            }
            return false;
        }
        return false;

    }

    // 目录共享
    @Override
    public boolean share(MyResCopyReq reqValue, Integer schoolId, Long userId) {

        // 根目录处理
        DirInfo dirInfo = null;
        DirInfo rootDirInfo = dirDAO.findBySchoolId(schoolId);
        if (null == rootDirInfo) {
            rootDirInfo = createShareRoot(schoolId, userId);
            if (null == rootDirInfo) {
                return false;
            }
        }
        if (null == reqValue.getDesId()) {
            reqValue.setDesId(rootDirInfo.getId());
        }
        // 新增共享文件夹
        if (null != reqValue.getDirList()) {
            for (Long id : reqValue.getDirList()) {
                dirInfo = dirDAO.findOne(id);
                Long srcId = dirInfo.getId();
                dirInfo.setParentId(reqValue.getDesId());
                dirInfo.setSchoolId(schoolId);
                if (null != reqValue.getDesId()) {
                    dirInfo.setParentId(reqValue.getDesId());
                } else {
                    dirInfo.setParentId(rootDirInfo.getId());
                }
                if (null == dirDAO.save(dirInfo)) {
                    return false;
                }
                copyAllFilesInDir(dirInfo, srcId, dirInfo.getId());
            }
        }
        if (null != reqValue.getResList()) {
            for (Long id : reqValue.getResList()) {
                UserResInfo resInfo = userResDAO.findOne(id);
                // 资源设为共享
                if (null != resInfo) {
                    Long dirId = reqValue.getDesId();
                    if (null != dirId) {
                        resInfo.setDirId(dirId);
                    } else {
                        resInfo.setDirId(rootDirInfo.getId());
                    }
                } else {
                    return false;
                }
                if (null == userResDAO.save(resInfo)) {
                    return false;
                }
            }
        }
        return true;

    }

    private DirInfo createShareRoot(Integer schoolId, Long userId) {
        DirInfo dirInfo = new DirInfo();
        dirInfo.setSchoolId(schoolId);
        dirInfo.setCreateTime(BasicUtils.getCurrentTime());
        dirInfo.setDel(false);
        dirInfo.setName("schoolRoot");
        dirInfo.setCreateUserId(userId);
        if (null != dirDAO.save(dirInfo)) {
            return dirInfo;
        }
        return null;
    }

    // 获取目录下文件和子目录
    @Override
    public MyResDirListRsp getListItems(MyResDirReq reqValue, Integer schoolId, Long userId) {
        DirInfo dir = null;
        if (reqValue.getParentId() != null) {
            dir = dirDAO.findOne(reqValue.getParentId());
        } else {
            if (reqValue.isShare()) {
                dir = dirDAO.findBySchoolId(schoolId);
                if (null == dir) {
                    dir = createShareRoot(schoolId, userId);
                }

            } else {
                dir = dirDAO.findByCreateUserId(userId);
                if (null == dir) {
                    dir = new DirInfo();
                    dir.setDel(false);
                    dir.setCreateUserId(userId);
                    dir.setName("root");
                    dir.setCreateTime(BasicUtils.getCurrentTime());
                }
            }

            if (null == dirDAO.save(dir)) {
                //this.getSessionAction().setErrorMessage(ErrorMsgDefs.OPEN_MYRES);
                return null;
            }

        }
        // 获取目录下文件和子目录
        List<ViewUserDirInfo> dirList = null;
        List<ViewUserResInfo> resList = null;
        if (null != reqValue.getCondition() && !reqValue.getCondition().equals("")) {
            resList = viewUserResDAO.findByFileNameLikeAndDirIdAndCreateUserId(reqValue.getCondition(), null, userId);
            if (reqValue.isShare()) {
                dirList = viewUserDirDAO.findByNameLikeAndParentIdAndCreateUserIdAndSchoolId(reqValue.getCondition(), dir.getId(), null, schoolId);
            } else {

                dirList = viewUserDirDAO.findByNameLikeAndParentIdAndCreateUserIdAndSchoolId(reqValue.getCondition(), null, userId, null);
            }

        } else {
            resList = viewUserResDAO.findByFileNameLikeAndDirIdAndCreateUserId(reqValue.getCondition(), dir.getId(), null);
            if (reqValue.isShare()) {
                dirList = viewUserDirDAO.findByNameLikeAndParentIdAndCreateUserIdAndSchoolId(reqValue.getCondition(), dir.getId(), null, schoolId);
            } else {
                dirList = viewUserDirDAO.findByNameLikeAndParentIdAndCreateUserIdAndSchoolId(reqValue.getCondition(), dir.getId(), null, null);
            }

        }
        MyResDirListRsp listRsp = new MyResDirListRsp();
        listRsp.setDirList(dirList);
        listRsp.setResList(resList);
        listRsp.setParentId(dir.getId());
        listRsp.setGrandId(dir.getParentId());
        return listRsp;
    }

    // 获取文件夹树形结构
    @Override
    public DirListRsp getDirList(MyResDirReq reqValue, Integer schoolId, Long userId) {
        DirInfo dir = null;
        if (reqValue.getParentId() != null)
            dir = dirDAO.findOne(reqValue.getParentId());
        else {
            if (reqValue.isShare()) {
                dir = dirDAO.findBySchoolId(schoolId);
                if (null == dir)
                    dir = createShareRoot(schoolId, userId);

            } else {
                dir = dirDAO.findByCreateUserId(userId);
                if (null == dir) {
                    dir = new DirInfo();
                    dir.setDel(false);
                    dir.setCreateUserId(userId);
                    dir.setName("root");
                    dir.setCreateTime(BasicUtils.getCurrentTime());
                }
            }

            if (null == dirDAO.save(dir)) {
//                this.getSessionAction().setErrorMessage(ErrorMsgDefs.OPEN_MYRES);
                return null;
            }

        }
        List<DirInfo> dirList = null;
        if (null != reqValue.getCondition()) {
            if (reqValue.isShare()) {
                dirList = dirDAO.findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel(reqValue.getCondition(), null, userId, schoolId, isDel);
            } else {
                dirList = dirDAO.findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel(reqValue.getCondition(), null, userId, null, isDel);
            }
        } else {
            if (reqValue.isShare()) {
                dirList = dirDAO.findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel(reqValue.getCondition(), dir.getId(), null, schoolId, isDel);
            } else {

                dirList = dirDAO.findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel(reqValue.getCondition(), dir.getId(), null, null, isDel);
            }
        }
        DirListRsp listRsp = new DirListRsp();
        listRsp.setId(dir.getId());
        listRsp.setName(dir.getName());
        if (reqValue.isShare()) {
            getDirListInDir(listRsp, schoolId);
        } else {
            getDirListInDir(listRsp, null);
        }
        return listRsp;
    }

    /**
     * 上传资源文件
     *
     * @param reqValue
     * @param uploadFileInfo
     * @param userId
     * @return
     */
    @Override
    public boolean addRes(MyResAddReq reqValue, UploadFileInfo uploadFileInfo, Long userId) {
        Long fileId = reqValue.getFileId();
        // 无
        if (fileId == null) {
            if (uploadFileInfo != null && uploadFileInfo.getId() != null && uploadFileInfo.getExt() != null) {
                fileId = uploadFileInfo.getId();
            }
        } else {
            if (null != viewUserResDAO.findByFileIdAndCreateUserId(fileId, userId)) {
                return true;
            }
            UploadFileInfo fileInfo = fileDAO.findOne(fileId);
            fileInfo.setId(null);
            if (null != fileDAO.save(fileInfo)) {
                fileId = fileInfo.getId();
            }
        }

        List<Long> listClassId = reqValue.getListClassId();
        if (listClassId == null || listClassId.size() == 0) {
            listClassId = new ArrayList<Long>();
            listClassId.add(null);
        }
        List<UserResInfo> listUserResInfo = new ArrayList<UserResInfo>();
        for (int i = 0; i < listClassId.size(); i++) {
            UserResInfo userResInfo = new UserResInfo();
            userResInfo.setFileId(fileId);
            userResInfo.setClassId(listClassId.get(i));
            userResInfo.setCourseId(reqValue.getCourseId());
            userResInfo.setTitle(reqValue.getContent());
            userResInfo.setContent(reqValue.getContent());
            userResInfo.setPublic(false);
            userResInfo.setCreateUserId(userId);
            userResInfo.setCreateTime(BasicUtils.getCurrentTime());
            userResInfo.setUpdateTime(userResInfo.getCreateTime());
            if (null == reqValue.getDirId()) {
                DirInfo info = dirDAO.findByCreateUserId(userId);
                userResInfo.setDirId(info.getId());
            } else {
                userResInfo.setDirId(reqValue.getDirId());
            }
            userResInfo.setDel(false);
            UploadFileInfo fileInfo = fileDAO.findOne(fileId);
            int n = 1;
            String fileName = fileInfo.getName();
            // 判断目录下是否有重名文件
            while (null != viewUserResDAO.findByFileNameLikeAndDirIdAndFileName(userResInfo.getDirId(), fileName)) {
                String name = fileInfo.getName();
                fileName = name.substring(0, name.lastIndexOf(".")) + "(" + n + ")" + "." + FileMgtUtils.getFileSuffix(fileInfo.getName());
                n += 1;
            }
            fileInfo.setName(fileName);
            if (null == fileDAO.save(fileInfo)) {
//                this.getSessionAction().setErrorMessage(ErrorMsgDefs.ADD_MYRES_INFO_FAIL);
                return false;
            }
            listUserResInfo.add(userResInfo);
        }
        if (null == userResDAO.save(listUserResInfo)) {
//            this.getSessionAction().setErrorMessage(ErrorMsgDefs.ADD_MYRES_INFO_FAIL);
            return false;
        }
        return true;

    }

    // 删除
    @Override
    public boolean delete(MyResDelReq reqValue) {
        List<Long> listResId = reqValue.getListResId();
        List<Long> listDirId = reqValue.getListDirId();
        if (null != listResId && listResId.size() > 0) {
            for (Long resId : listResId) {
                UserResInfo userResInfo = userResDAO.findOne(resId);
                if (userResInfo == null) {
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.NO_EXIST_MYRES_INFO);
                    return false;
                }
                userResInfo.setDel(true);
                userResInfo.setUpdateTime(BasicUtils.getCurrentTime());
                if (null == userResDAO.save(userResInfo)) {
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.DEL_MYRES_INFO_FAIL);
                    return false;
                }

            }
        }

        if (null != listDirId && listDirId.size() > 0) {
            for (Long dirId : listDirId) {
                dirDAO.delete(dirId);
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.DEL_DIR_INFO_FAIL);
                MyResDelReq req = new MyResDelReq();
                List<Long> listChildDirId = dirDAO.findByParentId(dirId,isDel);
                //List<Long> listChildResId = userResDAO.findByParentId(dirId);
                req.setListDirId(listChildDirId);
                // req.setListResId(listChildResId);
                if (!delete(req)) {
                    return false;
                }
            }
        }
        return true;
    }

    // 重命名
    @Override
    public boolean rename(MyResRenameReq reqValue) {
        String dirName = reqValue.getDirName();
        String resName = reqValue.getResName();
        if (reqValue.getDirName() != null) {
            DirInfo info = dirDAO.findOne(reqValue.getId());
            if (null != info) {
                info.setName(dirName);
                if (null == dirDAO.save(info)) {
                    return false;
                }

            }

        }
        if (reqValue.getResName() != null) {
            UserResInfo info = userResDAO.findOne(reqValue.getId());
            if (null != info) {
                UploadFileInfo fileInfo = fileDAO.findOne(info.getFileId());
                if (null == fileInfo) {
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.REQ_PARAMETER_DECODE_ERROR);
                    return false;
                }
                fileInfo.setName(resName);
                if (null == fileDAO.save(fileInfo)) {
                    return false;
                }

            }

        }
        return true;
    }

    // 复制
    @Override
    public boolean copy(MyResCopyReq reqValue, boolean isCopy) {
        if (reqValue.getDirList() != null) {
            for (Long sourceId : reqValue.getDirList()) {
                DirInfo info = dirDAO.findOne(sourceId);
                Long srcId = info.getId();
                if (isCopy) {
                    info.setId(null);
                } else {
                    Long pId = null;
                    if (reqValue.getDirList() != null && reqValue.getDirList().size() > 0) {
                        pId = info.getParentId();
                    }
                    // 移动到当前文件夹，不执行并返回
                    if (reqValue.getDesId().equals(pId)) {
                        return true;
                    }
                }
                info.setParentId(reqValue.getDesId());
                // 解决重名
                int i = 1;
                String dirName1 = info.getName();
                List<DirInfo> infoList = dirDAO.findByParentIdAndName(info.getParentId(), dirName1);
                while (null != infoList) {
                    dirName1 = info.getName() + "(" + i + ")";
                    i += 1;
                    infoList = dirDAO.findByParentIdAndName(info.getParentId(), dirName1);
                }
                info.setName(dirName1);
                if (null == dirDAO.save(info)) {
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.COPY_FAIL);
                    return false;
                }
                copyAllFilesInDir(info, srcId, info.getId());
            }
        }
        if (reqValue.getResList() != null) {
            for (Long sourceId : reqValue.getResList()) {
                UserResInfo info = userResDAO.findOne(sourceId);
                // 判断重名
                UploadFileInfo fileInfo = fileDAO.findOne(info.getFileId());
                if (isCopy) {
                    fileInfo.setId(null);
                    info.setId(null);
                } else {
                    Long pId = null;
                    if (reqValue.getResList() != null && reqValue.getResList().size() > 0) {
                        pId = info.getDirId();
                    }
                    if (reqValue.getDesId().equals(pId)) {
                        return true;
                    }
                }
                String fileName = fileInfo.getName();
                int n = 1;
                List<ViewUserResInfo> infoList = viewUserResDAO.findByFileNameLikeAndDirIdAndFileName(reqValue.getDesId(), fileName);
                while (null != infoList && infoList.size() > 0) {
                    String name = fileInfo.getName();
                    fileName = name.substring(0, name.lastIndexOf(".")) + "(" + n + ")" + "." + FileMgtUtils.getFileSuffix(fileInfo.getName());
                    n += 1;
                    infoList = viewUserResDAO.findByFileNameLikeAndDirIdAndFileName(info.getDirId(), fileName);
                }
                info.setDirId(reqValue.getDesId());
                fileInfo.setName(fileName);
                if (null == fileDAO.save(fileInfo)) {
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.COPY_FAIL);
                    return false;
                } else {
                    info.setFileId(fileInfo.getId());
                    if (null == userResDAO.save(info)) {
//                        this.getSessionAction().setErrorMessage(ErrorMsgDefs.COPY_FAIL);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * @param dir     待复制的文件夹对象
     * @param srcId   文件夹复制前id
     * @param childId 文件夹复制后id
     * @return 复制结果
     */
    private boolean copyAllFilesInDir(DirInfo dir, Long srcId, Long childId) {
        List<DirInfo> dirList;
        List<UserResInfo> resList;
        if (srcId == childId) {
            return true;
        }
        // 资源直接复制
        resList = userResDAO.findByDirId(srcId);
        if (null != resList) {
            for (UserResInfo info : resList) {
                info.setId(null);
                info.setDirId(dir.getId());
                info.setUpdateTime(BasicUtils.getCurrentTime());
                if (null == userResDAO.save(info)) {
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.COPY_FAIL);
                    return false;
                }
            }
        }

        // 文件夹递归遍历复制
        dirList = dirDAO.findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel(null, srcId, null, null, isDel);
        if (null != dirList) {
            for (DirInfo info : dirList) {
                Long srId = info.getId();
                info.setId(null);
                info.setParentId(dir.getId());
                if (childId.equals(srId)) {
                    continue;
                }
                if (null == dirDAO.save(info)) {
//                    this.getSessionAction().setErrorMessage(ErrorMsgDefs.COPY_FAIL);
                    return false;
                }
                copyAllFilesInDir(info, srId, info.getId());
            }
        }
        return true;
    }

    // 递归遍历目录树
    private boolean getDirListInDir(DirListRsp dir, Integer schoolId) {
        List<DirListRsp> listRsp = new ArrayList<>();
        List<DirInfo> dirList;
        dirList = dirDAO.findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel(null, dir.getId(), null, schoolId, isDel);
        if (null != dirList) {
            for (DirInfo dirInfo : dirList) {
                DirListRsp rsp = new DirListRsp();
                rsp.setId(dirInfo.getId());
                rsp.setName(dirInfo.getName());
                getDirListInDir(rsp, schoolId);
                listRsp.add(rsp);
            }
            dir.setDirList(listRsp);
        }
        return true;

    }

}
