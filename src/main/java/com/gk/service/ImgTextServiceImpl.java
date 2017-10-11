/*
package com.gk.service;

import com.gk.dao.impl.MasterDAOImpl;
import com.gk.dao.jpa.MasterDAO;
import com.gk.dao.jpa.SchoolDAO;
import com.gk.entity.condition.PageSelectInfo;
import com.gk.entity.imgText.*;
import com.gk.entity.imgText.protocol.*;
import com.gk.entity.imgText.view.ViewImgTextBaseInfo;
import com.gk.entity.imgText.view.ViewImgTextCommentInfo;
import com.gk.entity.imgText.view.ViewImgTextFileInfo;
import com.gk.entity.imgText.view.ViewImgTextPraiseInfo;
import com.gk.entity.master.ClassBaseInfo;
import com.gk.entity.master.ViewUserBaseInfo;
import com.gk.util.BasicUtils;
import com.gk.util.defs.ErrorMsgDefs;
import com.gk.util.defs.ProtocolDefs;
import com.gk.util.defs.UserRoleDefs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ImgTextServiceImpl implements ImgTextService
{
    private MasterDAO masterDAO;
    private ImgTextDAO imgTextDAO;
    private SchoolDAO schoolDAO;

    public void setSchoolDAO(SchoolDAOImpl schoolDAO)
    {
        this.schoolDAO = schoolDAO;
    }

    public void setMasterDAO(MasterDAOImpl masterDAO)
    {
        this.masterDAO = masterDAO;
    }

    public void setImgTextDAO(ImgTextDAOImpl ImgTextDAO)
    {
        this.imgTextDAO = ImgTextDAO;
    }

    @Override
    public boolean updateImgTextFileInfo(List<ImgTextFileInfo> list)
    {
        return this.imgTextDAO.updateImgTextFileInfo(list);
    }

    @Override
    public boolean updateImgTextCommentInfo(List<ImgTextCommentInfo> list)
    {
        return this.imgTextDAO.updateImgTextCommentInfo(list);
    }

    @Override
    public boolean delImgTextCommentInfo(Long id)
    {
        return this.imgTextDAO.delImgTextCommentInfo(id);
    }

    @Override
    public boolean updateImgTextCommentInfo(ImgTextCommentInfo info)
    {
        return this.imgTextDAO.updateImgTextCommentInfo(info);
    }

    @Override
    public boolean delImgTextPraiseInfo(Long userId, Long ImgTextId)
    {
        return this.imgTextDAO.delImgTextPraiseInfo(userId, ImgTextId);
    }

    @Override
    public boolean updateImgTextPraiseInfo(ImgTextPraiseInfo info)
    {
        return this.imgTextDAO.updateImgTextPraiseInfo(info);
    }

    @Override
    public ViewImgTextCommentInfo queryViewImgTextCommnetInfo(Long userId, Long ImgTextId)
    {
        return this.imgTextDAO.queryViewImgTextCommnetInfo(userId, ImgTextId);
    }

    @Override
    public ViewImgTextPraiseInfo queryViewImgTextPraiseInfo(Long userId, Long ImgTextId)
    {
        return this.imgTextDAO.queryViewImgTextPraiseInfo(userId, ImgTextId);
    }

    @Override
    public ImgTextPraiseInfo queryImgTextPraiseInfo(Long userId, Long ImgTextId)
    {
        return this.imgTextDAO.queryImgTextPraiseInfo(userId, ImgTextId);
    }

    @Override
    public ViewImgTextBaseInfo queryViewImgTextBaseInfoByImgTextId(Long ImgTextId)
    {
        return this.imgTextDAO.queryViewImgTextBaseInfoByImgTextId(ImgTextId);
    }

    @Override
    public List<ViewImgTextCommentInfo> queryListViewImgTextCommnetInfo(long userId, long ImgTextId)
    {
        return this.imgTextDAO.queryListViewImgTextCommnetInfo(userId, ImgTextId);
    }

    @Override
    public ImgTextBaseInfo queryImgTextBaseInfoByContentId(long id)
    {
        return this.imgTextDAO.queryImgTextBaseInfoByContentId(id);
    }

    @Override
    public ImgTextBaseInfo queryImgTextBaseInfoByPraiseInfo(long id)
    {
        return this.imgTextDAO.queryImgTextBaseInfoByPraiseInfo(id);
    }

    @Override
    public ImgTextCommentInfo queryImgTextCommentInfo(Long id)
    {
        return this.imgTextDAO.queryImgTextCommentInfo(id);
    }

    @Override
    public ImgTextPraiseInfo queryImgTextPraiseInfo(Long id)
    {
        return this.imgTextDAO.queryImgTextPraiseInfo(id);
    }

    @Override
    public Integer queryPraiseNum(long ImgTextId)
    {
        return this.imgTextDAO.queryPraiseNum(ImgTextId);
    }

    @Override
    public ViewImgTextBaseInfo queryViewImgTextBaseInfo(long imgTextId)
    {
        return this.imgTextDAO.queryViewImgTextBaseInfo(imgTextId);
    }

    @Override
    public List<ViewImgTextFileInfo> queryListViewImgTextFileInfoByImgTextId(Long imgTextId)
    {
        return this.imgTextDAO.queryListViewImgTextFileInfoByImgTextId(imgTextId);
    }

    @Override
    public List<ViewImgTextCommentInfo> queryListViewImgTextCommnetInfoByImgTextId(Long imgTextId)
    {
        return this.imgTextDAO.queryListViewImgTextCommnetInfoByImgTextId(imgTextId);

    }

    @Override
    public List<ViewImgTextPraiseInfo> queryListViewImgTextPraiseInfoByImgTextId(Long imgTextId)
    {
        return this.imgTextDAO.queryListViewImgTextPraiseInfoByImgTextId(imgTextId);

    }

    @Override
    public ImgTextBaseInfo queryImgTextBaseInfo(Long id)
    {
        return this.imgTextDAO.queryImgTextBaseInfo(id);

    }

    @Override
    public boolean updateImgTextBaseInfo(ImgTextBaseInfo info)
    {
        return this.imgTextDAO.updateImgTextBaseInfo(info);

    }

    @Override
    public boolean delImgTextBaseInfo(Long id)
    {
        return this.imgTextDAO.delImgTextBaseInfo(id);

    }

    @Override
    public List<ViewImgTextBaseInfo> queryListViewImgTextBaseInfoByUserId(Long userId, Long studentId, Integer type, String timeStart, Integer count)
    {
        return this.imgTextDAO.queryListViewImgTextBaseInfoByUserId(userId, studentId, type, timeStart, count);
    }

    @Override
    public List<ViewImgTextBaseInfo> queryListViewImgTextBaseInfoByUserId(Long userId, Long studentId, Integer type, String timeStart, String timeLastUpdate)
    {
        return this.imgTextDAO.queryListViewImgTextBaseInfoByUserId(userId, studentId, type, timeStart, timeLastUpdate);
    }

    @Override
    public List<ViewImgTextBaseInfo> queryListViewImgTextBaseInfoByLabelId(Long userId, List<Long> labelId, PageSelectInfo pageSelectInfo)
    {
        return this.imgTextDAO.queryListViewImgTextBaseInfoByLabelId(userId, labelId, pageSelectInfo);

    }

    @Override
    public List<ImgTextReceiptInfo> queryListReader(Long classId, Long imgTextId)
    {
        return this.imgTextDAO.queryListReader(classId, imgTextId);
    }

    @Override
    public String cancelTopImgText(Long userId, Long imgTextId, boolean isWeb)
    {
        ImgTextBaseInfo imgTextBaseInfo = imgTextDAO.queryImgTextBaseInfo(imgTextId);
        if (imgTextBaseInfo == null || (!imgTextBaseInfo.getCreateUserId().equals(userId) && !isWeb))
        {
            return ErrorMsgDefs.CANCEL_TOP_NEWS_FAIL;
        }
        imgTextBaseInfo.setIsTop(false);
        if (!this.imgTextDAO.updateImgTextBaseInfo(imgTextBaseInfo))
        {
            return ErrorMsgDefs.CANCEL_TOP_NEWS_FAIL;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    @Override
    public boolean updateImgTextBaseLabelInfo(List<ImgTextBaseLabelInfo> list)
    {
        return this.imgTextDAO.updateImgTextBaseLabelInfo(list);
    }

    @Override
    public List<ImgTextLabelInfo> queryListImgTextLabelInfo(Long userId)
    {
        return this.imgTextDAO.queryListImgTextLabelInfo(userId);

    }

    @Override
    public boolean updateImgTextLabelInfo(ImgTextLabelInfo info)
    {
        return this.imgTextDAO.updateImgTextLabelInfo(info);
    }

    @Override
    public boolean delImgTextBaseLabelInfo(Long docId)
    {
        return this.imgTextDAO.delImgTextBaseLabelInfo(docId);
    }

    @Override
    public boolean updateImgTextReceiptInfo(List<ImgTextReceiptInfo> list)
    {
        return this.imgTextDAO.updateImgTextReceiptInfo(list);
    }

    @Override
    public boolean delImgTextLabelInfo(List<Long> listLabelId)
    {
        return this.imgTextDAO.delImgTextLabelInfo(listLabelId);
    }

    @Override
    public List<ImgTextLabelInfo> queryListImgTextLabelInfo(String labelName, Long userId)
    {
        return this.imgTextDAO.queryListImgTextLabelInfo(labelName, userId);
    }

    // 家长端回复回执
    private String addReceiptReq(List<FamilyMemberInfo> listFamilyMemberInfo, ImgTextReceiptReq reqValue, Integer schoolId, Long classIdSave, Long classId, Long studentId, Long userId)
    {
        Long imgTextId = reqValue.getImgTextId();
        if (imgTextId == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }

        Timestamp currentTime = BasicUtils.getCurrentTime();
        List<ImgTextMemberInfo> listImgTextMemberInfo = reqValue.getListTextMemberInfo();
        Boolean isPartIn = null;
        if (listImgTextMemberInfo != null)
        {
            if (listImgTextMemberInfo.size() > 0)
            {
                isPartIn = true;
            }
            else
            {
                isPartIn = false;
            }
        }
        List<ImgTextReceiptInfo> listReceiptInfo = new ArrayList<>();
        // 在一个学生选项卡上添加回执，其它孩子也添加相应回执 以孩子创建回执，所有家长标记为已回执，通过孩子id和公告id
        for (FamilyMemberInfo familyMemberInfo : listFamilyMemberInfo)
        {
            Integer memSchoolId = familyMemberInfo.getViewSchoolInfo().getId();
            Long memClassId = familyMemberInfo.getViewUserStudentInfo().getClassId();
            Integer memRole = familyMemberInfo.getViewUserBaseInfo().getRole();
            if (memRole.equals(UserRoleDefs.USER_ROLE_STUDENT))
            {
                if (classIdSave != null && memClassId.equals(classId) || (classIdSave == null && memSchoolId.equals(schoolId)))
                {
                    ImgTextReceiptInfo receiptInfo = new ImgTextReceiptInfo(imgTextId, schoolId, classId, familyMemberInfo.getViewUserBaseInfo().getUserId(), isPartIn, userId, currentTime);
                    listReceiptInfo.add(receiptInfo);
                }
            }
        }
        // 存入回执记录
        if (!imgTextDAO.updateImgTextReceiptInfo(listReceiptInfo))
        {
            return ErrorMsgDefs.ADD_RECEIPT_FAIL;
        }
        // 活动
        if (listImgTextMemberInfo != null && listImgTextMemberInfo.size() > 0)
        {
            if (!imgTextDAO.updateImgTextMemberInfo(listImgTextMemberInfo))
            {
                return ErrorMsgDefs.ADD_RECEIPT_FAIL;
            }
            List<ImgTextReceiptMemberInfo> listImgTextReceiptMemberInfo = new ArrayList<>();
            for (ImgTextReceiptInfo imgTextReceiptInfo : listReceiptInfo)
            {
                for (ImgTextMemberInfo imgTextMemberInfo : listImgTextMemberInfo)
                {
                    ImgTextReceiptMemberInfo imgTextReceiptMemberInfo = new ImgTextReceiptMemberInfo();
                    imgTextReceiptMemberInfo.setMemberId(imgTextMemberInfo.getId());
                    imgTextReceiptMemberInfo.setReceiptId(imgTextReceiptInfo.getId());
                    listImgTextReceiptMemberInfo.add(imgTextReceiptMemberInfo);
                }
            }
            if (!imgTextDAO.updateImgTextReceiptMemberInfo(listImgTextReceiptMemberInfo))
            {
                return ErrorMsgDefs.ADD_RECEIPT_FAIL;
            }

        }

        return ErrorMsgDefs.OPR_SUCCESS;
    }

    // 家长端回复回执
    @Override
    public String updateReceiptReq(List<FamilyMemberInfo> listFamilyMemberInfo, ImgTextReceiptReq reqValue, Integer schoolId, Long classId, Long studentId, Long userId)
    {
        Long imgTextId = reqValue.getImgTextId();
        if (imgTextId == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        ImgTextBaseInfo imgTextBaseInfo = imgTextDAO.queryImgTextBaseInfo(imgTextId);
        if (imgTextBaseInfo != null)
        {
            imgTextBaseInfo.setLastUpdateTime(BasicUtils.getCurrentTime());
            Timestamp enterTime = imgTextBaseInfo.getEndEnterTime();
            Timestamp currentTime = BasicUtils.getCurrentTime();
            if (reqValue.getListTextMemberInfo() != null && reqValue.getListTextMemberInfo().size() > 0 && enterTime != null && currentTime.after(enterTime))
            {
                return ErrorMsgDefs.AFTER_ENTER_TIME;
            }
        }
        else
        {
            return ErrorMsgDefs.NO_IMGTEXT;
        }

        if (!imgTextDAO.updateImgTextBaseInfo(imgTextBaseInfo))
        {
            return ErrorMsgDefs.ADD_RECEIPT_FAIL;
        }
        // 判断是学校还是班级的
        Long classIdSave = imgTextBaseInfo.getClassId();
        List<Long> listStudentId = new ArrayList<>();
        for (FamilyMemberInfo familyMemberInfo : listFamilyMemberInfo)
        {
            Integer memRole = familyMemberInfo.getViewUserBaseInfo().getRole();
            if (memRole.equals(UserRoleDefs.USER_ROLE_STUDENT))
            {
                listStudentId.add(familyMemberInfo.getViewUserBaseInfo().getUserId());
            }
        }
        // 删除家长下所有孩子的回执记录
        List<ImgTextReceiptInfo> listImgTextReceiptInfo = imgTextDAO.queryImgTextReceiptInfoByListStudentId(imgTextId, listStudentId);
        if (listImgTextReceiptInfo == null)
        {
            return addReceiptReq(listFamilyMemberInfo, reqValue, schoolId, classIdSave, classId, studentId, userId);
        }
        for (ImgTextReceiptInfo imgTextReceiptInfo : listImgTextReceiptInfo)
        {
            List<ImgTextReceiptMemberInfo> listImgTextReceiptMemberInfo = imgTextDAO.queryListImgTextReceiptMemberInfo(imgTextReceiptInfo.getId());
            for (ImgTextReceiptMemberInfo imgTextReceiptMemberInfo : listImgTextReceiptMemberInfo)
            {
                ImgTextMemberInfo imgTextMemberInfo = imgTextDAO.queryImgTextMemberInfo(imgTextReceiptMemberInfo.getMemberId());
                if (!imgTextDAO.delImgTextMemberInfo(imgTextMemberInfo))
                {
                    return ErrorMsgDefs.ADD_RECEIPT_FAIL;
                }

            }
            if (!imgTextDAO.delImgTextReceiptMemberInfo(listImgTextReceiptMemberInfo))
            {
                return ErrorMsgDefs.ADD_RECEIPT_FAIL;
            }

        }
        if (!imgTextDAO.delImgTextReceiptInfo(listImgTextReceiptInfo))
        {
            return ErrorMsgDefs.ADD_RECEIPT_FAIL;
        }

        return addReceiptReq(listFamilyMemberInfo, reqValue, schoolId, classIdSave, classId, studentId, userId);
    }

    */
/**
     * 图文发布服务
     *//*


    @Override
    public AddImgTextResult addImgTextReq(ImgTextCreateReq reqValue, Integer subType, Long createUserId)
    {
        AddImgTextResult addImgTextResult = new AddImgTextResult();
        List<Long> listUserId = reqValue.getListUserId();
        List<Long> listClassId = reqValue.getListClassId();
        Integer schoolId = reqValue.getSchoolId();
        Long imgTextBaseId = null;
        if (schoolId == null)
        {
            addImgTextResult.setErrorType(ErrorMsgDefs.REQ_ERROR_PARAMETER);
            return addImgTextResult;
        }
        ImgTextBaseInfo topBaseInfo = imgTextDAO.queryTopImgTextBaseInfo(schoolId);

        if (reqValue.isTop() && topBaseInfo != null)
        {
            addImgTextResult.setErrorType(ErrorMsgDefs.HAD_TOP_FAIL);
            return addImgTextResult;
        }
        // 园长发布
        if ((listUserId == null || listUserId.size() == 0) && (listClassId == null || listClassId.size() == 0))
        {
            ImgTextBaseInfo imgTextBaseInfo = new ImgTextBaseInfo();
            imgTextBaseInfo.setType(ImgTextTypeDefs.publishImgTextType.get(subType));
            setPublish(reqValue, imgTextBaseInfo, createUserId);
            imgTextBaseInfo.setSchoolId(schoolId);
            if (false == imgTextDAO.updateImgTextBaseInfo(imgTextBaseInfo))
            {
                addImgTextResult.setErrorType(ErrorMsgDefs.PUBLISH_INFO_FAIL);
                return addImgTextResult;
            }
            imgTextBaseId = imgTextBaseInfo.getId();

            // 为图文基本表关联文件
            if (false == setFileList(reqValue, imgTextBaseInfo.getId()))
            {
                addImgTextResult.setErrorType(ErrorMsgDefs.PUBLISH_ADD_FILE_FAIL);
                return addImgTextResult;
            }
        }
        // 添加发布到班级的图文班级关联记录
        if (listClassId != null && listClassId.size() > 0)
        {
            for (int i = 0; i < listClassId.size(); i++)
            {
                ImgTextBaseInfo imgTextBaseInfo = new ImgTextBaseInfo();
                imgTextBaseInfo.setType(ImgTextTypeDefs.publishImgTextType.get(subType));
                setPublish(reqValue, imgTextBaseInfo, createUserId);
                imgTextBaseInfo.setClassId(listClassId.get(i));
                if (false == imgTextDAO.updateImgTextBaseInfo(imgTextBaseInfo))
                {
                    addImgTextResult.setErrorType(ErrorMsgDefs.PUBLISH_INFO_FAIL);
                    return addImgTextResult;
                }
                imgTextBaseId = imgTextBaseInfo.getId();

                // 为图文基本表关联文件
                if (false == setFileList(reqValue, imgTextBaseInfo.getId()))
                {
                    addImgTextResult.setErrorType(ErrorMsgDefs.PUBLISH_ADD_FILE_FAIL);
                    return addImgTextResult;
                }
            }
        }
        // 添加发布到孩子的图文user关联记录
        if (listUserId != null && listUserId.size() > 0)
        {
            for (int i = 0; i < listUserId.size(); i++)
            {
                ImgTextBaseInfo imgTextBaseInfo = new ImgTextBaseInfo();
                imgTextBaseInfo.setType(ImgTextTypeDefs.publishImgTextType.get(subType));
                setPublish(reqValue, imgTextBaseInfo, createUserId);
                imgTextBaseInfo.setStudentId(listUserId.get(i));
                if (false == imgTextDAO.updateImgTextBaseInfo(imgTextBaseInfo))
                {
                    addImgTextResult.setErrorType(ErrorMsgDefs.PUBLISH_INFO_FAIL);
                    return addImgTextResult;
                }
                imgTextBaseId = imgTextBaseInfo.getId();
                // 为图文基本表关联文件
                if (false == setFileList(reqValue, imgTextBaseInfo.getId()))
                {
                    addImgTextResult.setErrorType(ErrorMsgDefs.PUBLISH_ADD_FILE_FAIL);
                    return addImgTextResult;
                }
                */
/*
                 * if (ImgTextTypeDefs.canLabel.get(subType)) { List<Long>
                 * listLabelId = reqValue.getListLabelId(); String result =
                 * addLabel(listUserId, listLabelId, imgTextBaseInfo.getId());
                 * if (!result.equals(ErrorMsgDefs.OPR_SUCCESS)) {
                 * addImgTextResult.setErrorType(result); return
                 * addImgTextResult; } }
                 *//*

            }
        }
        ViewImgTextBaseInfo viewImgTextBaseInfo = imgTextDAO.queryViewImgTextBaseInfo(imgTextBaseId);
        addImgTextResult.setErrorType(ErrorMsgDefs.OPR_SUCCESS);
        addImgTextResult.setViewImgTextBaseInfo(viewImgTextBaseInfo);
        return addImgTextResult;

    }

    */
/**
     * 发布公共函数添加基本信息
     * 
     * @param imgTextBaseInfo
     *//*

    private void setPublish(ImgTextCreateReq reqValue, ImgTextBaseInfo imgTextBaseInfo, Long userId)
    {
        imgTextBaseInfo.setIsCanComment(reqValue.getIsCanComment());
        imgTextBaseInfo.setTitle(reqValue.getTitle());
        imgTextBaseInfo.setIsTop(reqValue.isTop());
        imgTextBaseInfo.setIsCanPraise(reqValue.isCanPraise());

        if (null != reqValue.getReceiptType())
        {
            imgTextBaseInfo.setReceiptType(reqValue.getReceiptType());
            String endEnterTime = reqValue.getEndEnterTime();
            if (null != endEnterTime && !endEnterTime.equals(""))
            {
                endEnterTime += " 23:59:59";
                imgTextBaseInfo.setEndEnterTime(Timestamp.valueOf(endEnterTime));
            }
        }
        if (null != reqValue.getSchoolId())
        {
            imgTextBaseInfo.setSchoolId(reqValue.getSchoolId());
        }
        imgTextBaseInfo.setContent(reqValue.getContent());
        imgTextBaseInfo.setCreateUserId(userId);
        imgTextBaseInfo.setCreateTime(BasicUtils.getCurrentTime());
        imgTextBaseInfo.setLastUpdateTime(imgTextBaseInfo.getCreateTime());
        imgTextBaseInfo.setPraiseNum(0);
        imgTextBaseInfo.setCommentNum(0);
        imgTextBaseInfo.setIsDel(false);
    }

    // baseLabel表中存放孩子对应的标签id
    private String addLabel(List<Long> listUserId, List<Long> listLabelId, Long imgTextBaseId)
    {
        if (listLabelId != null && listLabelId.size() > 0 && listLabelId.size() < 4 && listUserId != null && listUserId.size() > 0)
        {
            if (listLabelId.size() > 0 && listLabelId.size() < 4)
            {
                List<ImgTextBaseLabelInfo> listBaseLabelInfo = new ArrayList<>();
                for (Long labelId : listLabelId)
                {
                    for (Long userId : listUserId)
                    {
                        ImgTextBaseLabelInfo baseLabelInfo = new ImgTextBaseLabelInfo();
                        baseLabelInfo.setLabelId(labelId);
                        baseLabelInfo.setCreateUserId(userId);
                        baseLabelInfo.setImgTextId(imgTextBaseId);
                        listBaseLabelInfo.add(baseLabelInfo);
                    }
                }
                if (false == imgTextDAO.updateImgTextBaseLabelInfo(listBaseLabelInfo))
                {
                    return ErrorMsgDefs.PUBLISH_INFO_FAIL;
                }
            }
            else
            {
                return ErrorMsgDefs.LABEL_NUM_FAIL;
            }
        }
        else
        {
            return ErrorMsgDefs.PUBLISH_INFO_FAIL;
        }
        return ErrorMsgDefs.OPR_SUCCESS;

    }

    */
/**
     * 图文添加文件列表
     * 
     * @param imgTextBaseInfo
     *//*

    private boolean setFileList(ImgTextCreateReq reqValue, Long imgTextId)
    {
        List<Long> listFileId = reqValue.getListFileId();
        if (listFileId != null && listFileId.size() > 0)
        {
            List<ImgTextFileInfo> listImgTextFileInfo = new ArrayList<ImgTextFileInfo>();
            for (Long fileId : listFileId)
            {
                ImgTextFileInfo imgTextFileInfo = new ImgTextFileInfo();
                imgTextFileInfo.setFileId(fileId);
                imgTextFileInfo.setImgTextId(imgTextId);
                listImgTextFileInfo.add(imgTextFileInfo);
            }
            if (false == imgTextDAO.updateImgTextFileInfo(listImgTextFileInfo))
            {
                return false;
            }
        }
        return true;
    }

    */
/**
     * 图文视图列表转换为列表响应
     * 
     * @author 高聪
     * @param listViewImgTextBaseInfo
     * @param type
     * @return
     *//*

    @Override
    public ImgTextListRsp setListRsp(ImgTextReq imgTextListReq, List<ViewImgTextBaseInfo> listViewImgTextBaseInfo, Integer type, Long userId, List<Long> listClassId, Integer schoolId, Long studentId, PageSelectInfo pageSelectInfo)
    {
        if (listViewImgTextBaseInfo == null && (imgTextListReq != null || pageSelectInfo != null))
        {
            listViewImgTextBaseInfo = getImgTextList(imgTextListReq, type, userId, listClassId, schoolId, pageSelectInfo);
        }
        if (listViewImgTextBaseInfo != null && listViewImgTextBaseInfo.size() > 0)
        {
            List<ImgTextSimpleRsp> listImgTextSimpleRsp = new ArrayList<ImgTextSimpleRsp>();

            for (int i = 0; i < listViewImgTextBaseInfo.size(); i++)
            {
                ViewImgTextBaseInfo viewImgTextBaseInfo = listViewImgTextBaseInfo.get(i);
                if(viewImgTextBaseInfo != null)
                {
                    ImgTextSimpleRsp rsp = viewImgTextBaseInfo2ImgTextSimpleRsp(viewImgTextBaseInfo, userId, type, studentId);
                    listImgTextSimpleRsp.add(rsp);
                }
            }
            ImgTextListRsp imgTextListRsp = new ImgTextListRsp();
            Integer notReceiptNum = imgTextDAO.countImgTextNotReceiptNum(listClassId, schoolId, type, studentId);
            imgTextListRsp.setNotReceiptNum(notReceiptNum);
            imgTextListRsp.setList(listImgTextSimpleRsp);
            imgTextListRsp.setUpdateTime(BasicUtils.getCurrentDateTimeString_Sql());
            return imgTextListRsp;
        }
        else
        {
            return null;
        }
    }

    // ViewImgTextBaseInfo--->ImgTextSimpleRsp
    public ImgTextSimpleRsp viewImgTextBaseInfo2ImgTextSimpleRsp(ViewImgTextBaseInfo viewImgTextBaseInfo, Long userId, Integer type, Long studentId)
    {
        ImgTextSimpleRsp imgTextSimpleRsp = new ImgTextSimpleRsp();

        imgTextSimpleRsp.setBase(viewImgTextBaseInfo);
        imgTextSimpleRsp.setIsTop(viewImgTextBaseInfo.getIsTop());
        if (ImgTextTypeDefs.listCanReceipt.get(type))
        {
            Long imgTextId = viewImgTextBaseInfo.getId();
            ImgTextReceiptInfo receiptInfo = imgTextDAO.queryImgTextReceiptInfo(imgTextId, studentId);
            if (receiptInfo != null)
            {
                imgTextSimpleRsp.setReceipt(true);
            }
        }

        List<ViewImgTextFileInfo> listViewImgTextFileInfo = imgTextDAO.queryListViewImgTextFileInfoByImgTextId(viewImgTextBaseInfo.getId());
        imgTextSimpleRsp.setListFile(listViewImgTextFileInfo);
        // 设置是否点赞、评论
        if (ImgTextTypeDefs.listCanOpt.get(type))
        {
            if (viewImgTextBaseInfo.getIsCanPraise())
            {
                long id = viewImgTextBaseInfo.getId();
                setPraise(id, userId, imgTextSimpleRsp);
            }
            if (viewImgTextBaseInfo.getIsCanComment())
            {
                long id = viewImgTextBaseInfo.getId();
                setComment(id, userId, imgTextSimpleRsp);
            }
        }

        return imgTextSimpleRsp;
    }

    */
/**
     * 图文视图转换为详情协议响应
     * 
     * @author 高聪
     * @param listViewImgTextBaseInfo
     *//*

    @Override
    public ImgTextDetailRsp setDetailRsp(Long userId, ViewImgTextBaseInfo viewImgTextBaseInfo, Integer type, Long studentId)
    {

        if (viewImgTextBaseInfo != null)
        {
            // 构造ImgTextSimpleRsp
            ImgTextSimpleRsp imgTextSimpleRsp = new ImgTextSimpleRsp();
            imgTextSimpleRsp.setIsTop(viewImgTextBaseInfo.getIsTop());
            imgTextSimpleRsp.setBase(viewImgTextBaseInfo);
            List<ViewImgTextFileInfo> listViewImgTextFileInfo = imgTextDAO.queryListViewImgTextFileInfoByImgTextId(viewImgTextBaseInfo.getId());
            imgTextSimpleRsp.setListFile(listViewImgTextFileInfo);
            ImgTextDetailRsp imgTextDetailRsp = new ImgTextDetailRsp();
            long imgTextId = viewImgTextBaseInfo.getId();
            if (ImgTextTypeDefs.canReceipt.get(type))
            {
                ImgTextReceiptInfo receiptInfo = imgTextDAO.queryImgTextReceiptInfo(imgTextId, studentId);
                if (receiptInfo != null)
                {
                    imgTextDetailRsp.setReceipt(true);
                    imgTextDetailRsp.setImgTextReceiptInfo(receiptInfo);
                    List<ImgTextMemberInfo> listImgTextMemberInfo = imgTextDAO.queryListImgTextMemberInfo(receiptInfo.getId());
                    imgTextDetailRsp.setListImgTextMemberInfo(listImgTextMemberInfo);
                }
            }
            // 设置是否点赞、评论
            if (ImgTextTypeDefs.canOpt.get(type))
            {
                if (viewImgTextBaseInfo.getIsCanPraise())
                {
                    long id = viewImgTextBaseInfo.getId();
                    setPraise(id, userId, imgTextSimpleRsp);
                    List<ViewImgTextPraiseInfo> listViewImgTextPraiseInfo = imgTextDAO.queryListViewImgTextPraiseInfoByImgTextId(viewImgTextBaseInfo.getId());
                    imgTextDetailRsp.setListPraise(listViewImgTextPraiseInfo);

                }
                if (viewImgTextBaseInfo.getIsCanComment())
                {
                    long id = viewImgTextBaseInfo.getId();
                    setComment(id, userId, imgTextSimpleRsp);
                    List<ViewImgTextCommentInfo> listViewImgTextCommnetInfo = imgTextDAO.queryListViewImgTextCommnetInfoByImgTextId(viewImgTextBaseInfo.getId());
                    imgTextDetailRsp.setListCommnet(listViewImgTextCommnetInfo);

                }
            }

            // 设值ImgTextDetailRsp
            imgTextDetailRsp.setImgTextSimpleRsp(imgTextSimpleRsp);
            return imgTextDetailRsp;
        }
        else
        {
            return null;
        }
    }

    */
/**
     * 是否点赞评论收藏
     *//*

    private void setPraise(long ImgTextId, long userId, ImgTextSimpleRsp imgTextSimpleRsp)
    {
        ViewImgTextPraiseInfo praiseInfo = imgTextDAO.queryViewImgTextPraiseInfo(userId, ImgTextId);
        if (null != praiseInfo)
        {
            if (praiseInfo.getIsDel() == true)
            {
                imgTextSimpleRsp.setPraise(false);
            }
            else
            {
                imgTextSimpleRsp.setPraise(true);
            }
        }
        else
        {
            imgTextSimpleRsp.setPraise(false);
        }
    }

    private void setComment(long ImgTextId, long userId, ImgTextSimpleRsp imgTextSimpleRsp)
    {
        List<ViewImgTextCommentInfo> list = imgTextDAO.queryListViewImgTextCommnetInfo(userId, ImgTextId);
        if (list != null)
        {
            for (ViewImgTextCommentInfo info : list)
                if (null != info)
                {
                    if (info.getIsDel() == true)
                    {
                        imgTextSimpleRsp.setComment(false);
                    }
                    else
                    {
                        imgTextSimpleRsp.setComment(true);
                        break;
                    }
                }
                else
                {
                    imgTextSimpleRsp.setComment(false);
                }
        }
    }

    */
/**
     * 置顶公告
     * 
     * @author 高聪
     * @param imgTextListReq
     *//*

    @Override
    public String setTop(ImgTextOptReq imgTextOptReq, Integer schoolId, int type)
    {
        switch (type)
        {
            case ProtocolDefs.PROTOCOL_SUB_TYPE_TOP_ANNOUNCEMENT:
            {
                Long imgTextId = imgTextOptReq.getImgTextId();
                if (imgTextId == null || schoolId == null)
                {
                    return ErrorMsgDefs.REQ_ERROR_PARAMETER;
                }
                ImgTextBaseInfo topImgTextBaseInfo = imgTextDAO.queryTopImgTextBaseInfo(schoolId);
                if (topImgTextBaseInfo != null)
                {
                    return ErrorMsgDefs.TOP_NEWS_FAIL;
                }
                ImgTextBaseInfo imgTextBaseInfo = imgTextDAO.queryImgTextBaseInfo(imgTextId);
                imgTextBaseInfo.setIsTop(true);
                if (!imgTextDAO.updateImgTextBaseInfo(imgTextBaseInfo))
                {
                    return ErrorMsgDefs.TOP_NEWS_FAIL;
                }
            }
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    */
/**
     * 得到列表
     * 
     * @param imgTextListReq
     * @param type
     * @param userId
     * @param listClassId
     * @param schoolId
     * @param pageSelectInfo
     * @return
     *//*


    private List<ViewImgTextBaseInfo> getImgTextList(ImgTextReq imgTextListReq, Integer type, Long userId, List<Long> listClassId, Integer schoolId, PageSelectInfo pageSelectInfo)
    {
        String timeStart = null;
        String timeLastUpdate = null;
        Integer count = null;
        Long studentId = null;
        String keyWord = null;
        Boolean isReceiptList = null;
        if (imgTextListReq != null)
        {
            timeStart = imgTextListReq.getTimeStart();
            timeLastUpdate = imgTextListReq.getTimeLastUpdate();
            count = imgTextListReq.getCount();
            studentId = imgTextListReq.getStudentId();
            keyWord = imgTextListReq.getKeyWord();
            isReceiptList = imgTextListReq.getIsReceiptList();
        }
        List<ViewImgTextBaseInfo> listViewImgTextBaseInfo = null;

        switch (type)
        {
            case ProtocolDefs.PROTOCOL_SUB_TYPE_GETLIST_DOC:
            {
                if (timeStart != null)
                {
                    if (count != null)
                    {
                        listViewImgTextBaseInfo = imgTextDAO.queryListViewImgTextBaseInfoByUserId(userId, studentId, ImgTextTypeDefs.getListImgTextType.get(type), timeStart, count);
                        break;
                    }
                    else if (timeLastUpdate != null)
                    {

                        listViewImgTextBaseInfo = imgTextDAO.queryListViewImgTextBaseInfoByUserId(userId, studentId, ImgTextTypeDefs.getListImgTextType.get(type), timeStart, timeLastUpdate);
                        break;
                    }
                }
                else
                {
                    timeStart = BasicUtils.getCurrentDateTimeString_Sql();
                    if (count != null)
                    {
                        listViewImgTextBaseInfo = imgTextDAO.queryListViewImgTextBaseInfoByUserId(userId, studentId, ImgTextTypeDefs.getListImgTextType.get(type), timeStart, count);
                        break;
                    }
                }
                break;
            }
            case ProtocolDefs.PROTOCOL_SUB_TYPE_GETLIST_NEWS:
            case ProtocolDefs.PROTOCOL_SUB_TYPE_GETLIST_ANNOUNCEMENT:
            case ProtocolDefs.PROTOCOL_SUB_TYPE_GETLIST_ENCYCLOPEDIA:
            {
                if (timeStart != null)
                {
                    if (count != null)
                    {
                        listViewImgTextBaseInfo = imgTextDAO.queryListViewImgTextBaseInfoByClassId(listClassId, schoolId, ImgTextTypeDefs.getListImgTextType.get(type), timeStart, count, null, keyWord, isReceiptList, studentId);
                        break;
                    }
                    else if (timeLastUpdate != null)
                    {

                        listViewImgTextBaseInfo = imgTextDAO.queryListViewImgTextBaseInfoByClassId(listClassId, schoolId, ImgTextTypeDefs.getListImgTextType.get(type), timeStart, timeLastUpdate);
                        break;
                    }
                }
                else
                {
                    if (count != null)
                    {
                        listViewImgTextBaseInfo = imgTextDAO.queryListViewImgTextBaseInfoByClassId(listClassId, schoolId, ImgTextTypeDefs.getListImgTextType.get(type), timeStart, count, null, keyWord, isReceiptList, studentId);
                        break;
                    }
                }
                listViewImgTextBaseInfo = imgTextDAO.queryListViewImgTextBaseInfoByClassId(listClassId, schoolId, ImgTextTypeDefs.getListImgTextType.get(type), timeStart, count, pageSelectInfo, keyWord, isReceiptList, studentId);
                break;
            }
        }
        return listViewImgTextBaseInfo;
    }

    */
/**
     * 获取回执统计信息 listClassId 老师或园长管理的班级id
     *//*

    @Override
    public ImgTextReceiptSchoolRsp getReceipt(LoginUserInfo loginUserInfo, ImgTextReceiptReq reqValue, List<Long> listClassId)
    {
        Long imgTextId = reqValue.getImgTextId();
        Long userId = loginUserInfo.getUserBaseInfo().getUserId();
        Integer schoolId = loginUserInfo.getViewSchoolInfo().getId();
        ImgTextBaseInfo imgTextBaseInfo = imgTextDAO.queryImgTextBaseInfo(imgTextId);
        // 判定教师身份
        Integer teacherRole = masterDAO.queryTeacherSchoolRoleInfoByUserId(userId).getRoleId();
        ImgTextReceiptSchoolRsp rsp = null;
        // 未回执人数
        Integer unReceiptNum = 0;
        // 参加学生人数
        Integer participantsNum = 0;
        // 不参加学生人数
        Integer unParticipantsNum = 0;

        // 参加学生总人数
        Integer studentNum = 0;
        // 参加家长总人数
        Integer memberNum = 0;
        if (UserRoleDefs.USER_ROLE_DIRECTOR.equals(teacherRole))
        {
            rsp = new ImgTextReceiptSchoolRsp();
            List<ImgTextReceiptClassRsp> listRsp = new ArrayList<>();
            List<ClassBaseInfo> listClassBaseInfo = schoolDAO.queryListClassBaseInfo(schoolId, null, null);
            for (ClassBaseInfo classBaseInfo : listClassBaseInfo)
            {
                // 展示学校统计信息
                ImgTextReceiptClassRsp classRsp = new ImgTextReceiptClassRsp();
                classRsp = countImgTextReceipt(imgTextId, classBaseInfo.getId());
                unReceiptNum += classRsp.getUnReceiptNum();
                participantsNum += classRsp.getParticipantsNum();
                unParticipantsNum += classRsp.getUnParticipantsNum();
                studentNum += classRsp.getStudentNum();
                memberNum += classRsp.getMemberNum();
                listRsp.add(classRsp);
            }
            // 统计信息
            rsp.setMemberNum(memberNum);
            rsp.setParticipantsNum(unParticipantsNum);
            rsp.setStudentNum(studentNum);
            rsp.setUnParticipantsNum(unParticipantsNum);
            rsp.setUnReceiptNum(unReceiptNum);
            rsp.setListRsp(listRsp);
            rsp.setReceiptType(imgTextBaseInfo.getReceiptType());
            return rsp;
        }
        else if (UserRoleDefs.USER_ROLE_PURE_TEACHER.equals(teacherRole))
        {
            rsp = new ImgTextReceiptSchoolRsp();
            List<ImgTextReceiptClassRsp> listRsp = new ArrayList<>();
            ImgTextReceiptClassRsp classRsp = new ImgTextReceiptClassRsp();

            // 展示班级统计信息
            classRsp = countImgTextReceipt(imgTextId, listClassId.get(0));
            unReceiptNum += classRsp.getUnReceiptNum();
            participantsNum += classRsp.getParticipantsNum();
            unParticipantsNum += classRsp.getUnParticipantsNum();
            studentNum += classRsp.getStudentNum();
            memberNum += classRsp.getMemberNum();
            listRsp.add(classRsp);
            rsp.setListRsp(listRsp);
            // 统计信息
            rsp.setMemberNum(memberNum);
            rsp.setParticipantsNum(participantsNum);
            rsp.setStudentNum(studentNum);
            rsp.setUnParticipantsNum(unParticipantsNum);
            rsp.setUnReceiptNum(unReceiptNum);
            rsp.setReceiptType(imgTextBaseInfo.getReceiptType());
            return rsp;
        }
        return null;
    }

    private ImgTextReceiptClassRsp countImgTextReceipt(Long imgTextId, Long classId)
    {
        ImgTextReceiptClassRsp rsp = new ImgTextReceiptClassRsp();
        List<ImgTextReceiptClassRsp.ParticipantFamily> listParticipantFamilie = new ArrayList<>();
        // 获取参与学生列表
        List<ImgTextReceiptInfo> listImgTextReceiptInfo = imgTextDAO.queryListImgTextReceiptInfo(imgTextId, classId);
        List<ViewUserBaseInfo> listUnParticipant = new ArrayList<>();
        List<ViewUserBaseInfo> listReceipt = new ArrayList<>();
        // 参加家长总人数
        Integer memberNum = 0;
        List<Long> listMemberId = new ArrayList<>();
        Integer studentNum = null;
        for (ImgTextReceiptInfo imgTextReceiptInfo : listImgTextReceiptInfo)
        {
            ImgTextReceiptClassRsp.ParticipantFamily participantFamily = new ImgTextReceiptClassRsp.ParticipantFamily();
            ViewUserBaseInfo viewUserBaseInfo = masterDAO.queryViewUserBaseInfo(imgTextReceiptInfo.getStudentId());

            Boolean isPartIn = imgTextReceiptInfo.getIsPartIn();
            // 加入参加列表
            if (isPartIn != null && isPartIn.equals(true))
            {
                // 获取家长列表
                List<ImgTextMemberInfo> listImgTextMemberInfo = imgTextDAO.queryListImgTextMemberInfo(imgTextReceiptInfo.getId());
                if(listImgTextMemberInfo != null && listImgTextMemberInfo.size() > 0)
                {
                    for (ImgTextMemberInfo imgTextMemberInfo : listImgTextMemberInfo)
                    {
                        Long id = imgTextMemberInfo.getId();
                        if (!listMemberId.contains(id))
                        {
                            listMemberId.add(id);
                            memberNum += 1;
                        }
                    }
                    participantFamily.setListParent(listImgTextMemberInfo);
                }
                if(viewUserBaseInfo != null)
                {
                    participantFamily.setParticipant(viewUserBaseInfo);
                }
                listParticipantFamilie.add(participantFamily);
            }
            // 加入不参加列表
            else if (isPartIn != null && isPartIn.equals(false))
            {
                listUnParticipant.add(viewUserBaseInfo);

            }
            // 为空 公告，只返回已回执和未回执列表
            else
            {
                listReceipt.add(viewUserBaseInfo);
                studentNum = listReceipt.size();
            }
        }
        rsp.setListParticipantFamilie(listParticipantFamilie);
        // 获取不参加学生列表
        rsp.setListUnParticipant(listUnParticipant);
        // 获取未回执学生列表
        List<ViewUserBaseInfo> listUnReceipt = new ArrayList<>();
        List<Long> listStudentId = imgTextDAO.queryStudentIdNotReceipt(classId, null, imgTextId);
        if(listStudentId != null && listStudentId.size() > 0)
        {
            for (Long studentId : listStudentId)
            {
                ViewUserBaseInfo noReceiptViewUserBaseInfo = masterDAO.queryViewUserBaseInfo(studentId);
                if(noReceiptViewUserBaseInfo != null)
                {
                    listUnReceipt.add(noReceiptViewUserBaseInfo);
                }
            }
        }
        rsp.setListUnReceipt(listUnReceipt);
        // 未回执人数
        Integer unReceiptNum = listUnReceipt.size();
        // 参加学生人数
        Integer participantsNum = listParticipantFamilie.size();
        // 不参加学生人数
        Integer unParticipantsNum = listUnParticipant.size();
        // 参加学生总人数
        if (studentNum == null)
        {
            studentNum = participantsNum + unParticipantsNum;
        }
        rsp.setListReceipt(listReceipt);
        rsp.setUnReceiptNum(unReceiptNum);
        rsp.setParticipantsNum(participantsNum);
        rsp.setUnParticipantsNum(unParticipantsNum);
        rsp.setStudentNum(studentNum);
        rsp.setMemberNum(memberNum);
        rsp.setClassNo(schoolDAO.queryClassBaseInfo(classId).getClassNo());
        return rsp;
    }

    @Override
    public String checkHaveTop(Integer schoolId)
    {
        if (!imgTextDAO.checkHaveTop(schoolId))
        {
            return ErrorMsgDefs.TOP_HAVE_FAIL;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }
}
*/
