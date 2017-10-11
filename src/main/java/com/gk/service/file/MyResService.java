package com.gk.service.file;

import com.gk.entity.file.UploadFileInfo;
import com.gk.entity.file.protocol.*;

public interface MyResService {
    boolean addDir(MyResDirReq reqValue, Integer schoolId, Long userId);

    // 目录共享
    boolean share(MyResCopyReq reqValue, Integer schoolId, Long userId);

    // 获取目录下文件和子目录
    MyResDirListRsp getListItems(MyResDirReq reqValue, Integer schoolId, Long userId);

    // 获取文件夹树形结构
    DirListRsp getDirList(MyResDirReq reqValue, Integer schoolId, Long userId);

    boolean addRes(MyResAddReq reqValue, UploadFileInfo uploadFileInfo, Long userId);

    // 删除
    boolean delete(MyResDelReq reqValue);

    // 重命名
    boolean rename(MyResRenameReq reqValue);

    // 复制
    boolean copy(MyResCopyReq reqValue, boolean isCopy);
}
