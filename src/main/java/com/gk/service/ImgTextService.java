/*
package com.gk.service;

import com.gk.entity.condition.PageSelectInfo;
import com.gk.entity.imgText.*;
import com.gk.entity.imgText.protocol.*;
import com.gk.entity.imgText.view.ViewImgTextBaseInfo;
import com.gk.entity.imgText.view.ViewImgTextCommentInfo;
import com.gk.entity.imgText.view.ViewImgTextFileInfo;
import com.gk.entity.imgText.view.ViewImgTextPraiseInfo;

import java.util.List;

public interface ImgTextService
{
    // 查询
    List<ViewImgTextBaseInfo> queryListViewImgTextBaseInfoByUserId(Long userId, Long studentId, Integer type, String timeStart, Integer count);

    List<ViewImgTextBaseInfo> queryListViewImgTextBaseInfoByUserId(Long userId, Long studentId, Integer type, String timeStart, String timeLastUpdate);

    List<ViewImgTextBaseInfo> queryListViewImgTextBaseInfoByLabelId(Long userId, List<Long> labelId, PageSelectInfo pageSelectInfo);

    List<ImgTextLabelInfo> queryListImgTextLabelInfo(Long userId);

    List<ImgTextLabelInfo> queryListImgTextLabelInfo(String labelName, Long userId);

    ViewImgTextBaseInfo queryViewImgTextBaseInfoByImgTextId(Long imgTextId);

    ViewImgTextBaseInfo queryViewImgTextBaseInfo(long imgTextId);

    // 评论、附件、点赞表
    List<ViewImgTextFileInfo> queryListViewImgTextFileInfoByImgTextId(Long imgTextId);

    List<ViewImgTextCommentInfo> queryListViewImgTextCommnetInfoByImgTextId(Long imgTextId);

    List<ViewImgTextPraiseInfo> queryListViewImgTextPraiseInfoByImgTextId(Long imgTextId);

    // 通过id查找
    ImgTextBaseInfo queryImgTextBaseInfo(Long id);

    // 查看过图文id的学生列表
    List<ImgTextReceiptInfo> queryListReader(Long classId, Long imgTextId);

    // 评论操作
    List<ViewImgTextCommentInfo> queryListViewImgTextCommnetInfo(long userId, long imgTextId);

    ViewImgTextCommentInfo queryViewImgTextCommnetInfo(Long userId, Long imgTextId);

    AddImgTextResult addImgTextReq(ImgTextCreateReq reqValue, Integer subType, Long createUserId);

    // 添加图文附件
    boolean updateImgTextFileInfo(List<ImgTextFileInfo> list);

    // 添加图文回执
    boolean updateImgTextReceiptInfo(List<ImgTextReceiptInfo> list);

    boolean updateImgTextLabelInfo(ImgTextLabelInfo info);

    boolean updateImgTextBaseLabelInfo(List<ImgTextBaseLabelInfo> list);

    boolean updateImgTextCommentInfo(List<ImgTextCommentInfo> list);

    boolean updateImgTextCommentInfo(ImgTextCommentInfo list);

    // 更新点赞表
    boolean updateImgTextPraiseInfo(ImgTextPraiseInfo info);

    // 更新图文基本表
    boolean updateImgTextBaseInfo(ImgTextBaseInfo info);

    boolean delImgTextBaseInfo(Long id);

    boolean delImgTextBaseLabelInfo(Long docId);

    boolean delImgTextCommentInfo(Long id);

    // 取消点赞、评论、收藏
    boolean delImgTextPraiseInfo(Long userId, Long imgTextId);

    ImgTextPraiseInfo queryImgTextPraiseInfo(Long userId, Long imgTextId);

    // 是否点赞、评论

    ViewImgTextPraiseInfo queryViewImgTextPraiseInfo(Long userId, Long imgTextId);

    ImgTextBaseInfo queryImgTextBaseInfoByContentId(long id);

    ImgTextBaseInfo queryImgTextBaseInfoByPraiseInfo(long id);

    ImgTextCommentInfo queryImgTextCommentInfo(Long id);

    ImgTextPraiseInfo queryImgTextPraiseInfo(Long id);

    Integer queryPraiseNum(long imgTextId);

    boolean delImgTextLabelInfo(List<Long> listLabelId);

    ImgTextListRsp setListRsp(ImgTextReq imgTextListReq, List<ViewImgTextBaseInfo> listViewImgTextBaseInfo, Integer type, Long userId, List<Long> listClassId, Integer schoolId, Long studentId, PageSelectInfo pageSelectInfo);

    ImgTextDetailRsp setDetailRsp(Long userId, ViewImgTextBaseInfo viewImgTextBaseInfo, Integer type, Long studentId);

    ImgTextReceiptSchoolRsp getReceipt(LoginUserInfo loginUserInfo, ImgTextReceiptReq reqValue, List<Long> listClassId);

    String setTop(ImgTextOptReq imgTextOptReq, Integer schoolId, int type);

    String cancelTopImgText(Long userId, Long imgTextId, boolean isWeb);

    String updateReceiptReq(List<FamilyMemberInfo> listFamilyMemberInfo, ImgTextReceiptReq reqValue, Integer schoolId, Long classId, Long studentId, Long userId);

    String checkHaveTop(Integer schoolId);

}
*/
