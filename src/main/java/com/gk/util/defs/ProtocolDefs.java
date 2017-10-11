package com.gk.util.defs;

public class ProtocolDefs
{

    public static final Integer PROTOCOL_VERSION                                                 = 1;

    public static final Integer PROTOCOL_RSP_STATUS_NEED_UPGRADE                                 = 0xF000;

    public static final int     PROTOCOL_RESULT_SUCCESS                                          = 0;
    public static final int     PROTOCOL_RESULT_FAIL                                             = 1;

    public static final int     PROTOCOL_TYPE_LOGIN                                              = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_LOGIN                                          = 0x01;
    public static final int     PROTOCOL_SUB_TYPE_REQ_LOGIN_SMS_CODE                             = 0x21;
    public static final int     PROTOCOL_SUB_TYPE_REQ_REG_SMS_CODE                               = 0x22;
    public static final int     PROTOCOL_SUB_TYPE_REQ_RESETPASSWD_SMS_CODE                       = 0x23;
    public static final int     PROTOCOL_SUB_TYPE_REQ_REG                                        = 0x31;
    public static final int     PROTOCOL_SUB_TYPE_REQ_RESETPASSWD                                = 0x32;

    public static final int     PROTOCOL_TYPE_COMMON                                             = 0x0002;

    public static final int     PROTOCOL_SUB_TYPE_GETLISTSTAGE                                   = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTTEXTBOOKVERSION                         = 0x0002;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTGRADE                                   = 0x0003;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTCOURSE                                  = 0x0004;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTGRADENUMBER                             = 0x0005;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTFILETYPE                                = 0x0011;

    public static final int     PROTOCOL_SUB_TYPE_GETLISTTEXTBOOKVERSION_FROM_STAGE              = 0x0021;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTCOURSE_FROM_STAGE_TEXTBOOKVERSION       = 0x0022;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTGRADE_FROM_STAGE_TEXTBOOKVERSION_COURSE = 0x0023;
    public static final int     PROTOCOL_SUB_TYPE_GETLISTUNIT_FROM_TEXTBOOKVERSION_COURSE_GRADE  = 0x0024;

    public static final int     PROTOCOL_SUB_TYPE_QUERY_NATION                                   = 0x0031;
    public static final int     PROTOCOL_SUB_TYPE_QUERY_PROVINCE                                 = 0x0032;
    public static final int     PROTOCOL_SUB_TYPE_QUERY_CITY                                     = 0x0033;
    public static final int     PROTOCOL_SUB_TYPE_QUERY_COUNTY                                   = 0x0034;
    public static final int     PROTOCOL_SUB_TYPE_QUERY_ALL                                      = 0x003F;

    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD                                    = 0x0100;
    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD_HEAD                               = 0x0101;
    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD_HOMEWORK                           = 0x0111;
    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD_HOMEWORK_ANSWER                    = 0x0112;
    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD_HOMEWORK_REVIEW                    = 0x0113;
    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD_NOTES                              = 0x0121;
    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD_MYRES                              = 0x0131;
    public static final int     PROTOCOL_SUB_TYPE_FILE_UPLOAD_NEWS                               = 0x0141;

    public static final int     PROTOCOL_TYPE_NEW                                                = 0x0003; // 发现模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_GETLIST_ANNOUNCEMENT                           = 0x0001; // 获取学校公告列表
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_PRESENCE                               = 0x0002; // 获取校园文化列表
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_GARDEN                                 = 0x0003; // 获取班级园地列表

    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_ANNOUNCEMENT                         = 0x0011; // 获取学校公告详情
    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_PRESENCE                             = 0x0012; // 获取校园文化详情
    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_GARDEN                               = 0x0013; // 获取班级园地详情

    public static final int     PROTOCOL_SUB_TYPE_DEL_ANNOUNCEMENT                               = 0x0031; // 删除学校公告
    public static final int     PROTOCOL_SUB_TYPE_DEL_PRESENCE                                   = 0x0032; // 删除校园文化
    public static final int     PROTOCOL_SUB_TYPE_DEL_GARDEN                                     = 0x0033; // 删除班级园地

    public static final int     PROTOCOL_SUB_TYPE_PRAISE_ANNOUNCEMENT                            = 0x0041; // 点赞学校公告
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_PRAISE_ANNOUNCEMENT                     = 0x0042; // 取消点赞学校公告
    public static final int     PROTOCOL_SUB_TYPE_PRAISE_PRESENCE                                = 0x0043; // 点赞校园文化
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_PRAISE_PRESENCE                         = 0x0044; // 取消点赞校园文化
    public static final int     PROTOCOL_SUB_TYPE_PRAISE_GARDEN                                  = 0x0045; // 点赞班级园地
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_PRAISE_GARDEN                           = 0x0046; // 取消点赞班级园地

    public static final int     PROTOCOL_SUB_TYPE_COMMENT_ANNOUNCEMENT                           = 0x0051; // 评论学校公告
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_COMMENT_ANNOUNCEMENT                    = 0x0052; // 取消评论学校公告
    public static final int     PROTOCOL_SUB_TYPE_COMMENT_PRESENCE                               = 0x0053; // 评论校园文化
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_COMMENT_PRESENCE                        = 0x0054; // 取消评论校园文化
    public static final int     PROTOCOL_SUB_TYPE_COMMENT_GARDEN                                 = 0x0055; // 评论班级园地
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_COMMENT_GARDEN                          = 0x0056; // 取消评论班级园地

    public static final int     PROTOCOL_SUB_TYPE_PUBLISH_ANNOUNCEMENT                           = 0x0021; // 发布学校公告
    public static final int     PROTOCOL_SUB_TYPE_PUBLISH_PRESENCE                               = 0x0022; // 发布校园文化
    public static final int     PROTOCOL_SUB_TYPE_PUBLISHL_GARDEN                                = 0x0023; // 发布班级园地

    public static final int     PROTOCOL_SUB_TYPE_TOP_ANNOUNCEMENT                               = 0x0061; // 置顶学校公告
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_TOP_ANNOUNCEMENT                        = 0x0062; // 取消置顶学校公告
    public static final int     PROTOCOL_SUB_TYPE_TOP_PRESENCE                                   = 0x0063; // 置顶校园文化
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_TOP_PRESENCE                            = 0x0064; // 取消置顶校园文化
    public static final int     PROTOCOL_SUB_TYPE_TOP_GARDEN                                     = 0x0065; // 置顶班级园地
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_TOP_GARDEN                              = 0x0066; // 取消置顶班级园地

    public static final int     PROTOCOL_SUB_TYPE_FAVORITES_ANNOUNCEMENT                         = 0x0071; // 收藏学校公告
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAVORITES_ANNOUNCEMENT                  = 0x0072; // 取消收藏学校公告
    public static final int     PROTOCOL_SUB_TYPE_FAVORITES_PRESENCE                             = 0x0073; // 收藏校园文化
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAVORITES_PRESENCE                      = 0x0074; // 取消收藏校园文化
    public static final int     PROTOCOL_SUB_TYPE_FAVORITES_GARDEN                               = 0x0075; // 收藏班级园地
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAVORITES_GARDEN                        = 0x0076; // 取消收藏班级园地

    public static final int     PROTOCOL_SUB_TYPE_GET_FAVINFO_ANNOUNCEMENT                       = 0x0077; // 获取学校公告收藏列表
    public static final int     PROTOCOL_SUB_TYPE_GET_FAVINFO_PRESENCE                           = 0x0078; // 获取校园文化收藏列表
    public static final int     PROTOCOL_SUB_TYPE_GET_FAVINFO_GARDEN                             = 0x0079; // 获取班级园地收藏列表

    public static final int     PROTOCOL_SUB_TYPE_GET_TOPINFO_ANNOUNCEMENT                       = 0x0100; // 获取学校公告置顶信息
    public static final int     PROTOCOL_SUB_TYPE_GET_TOPINFO_PRESENCE                           = 0x0101; // 获取校园文化置顶信息
    public static final int     PROTOCOL_SUB_TYPE_GET_TOPINFO_GARDEN                             = 0x0102; // 获取班级园地置顶信息

    public static final int     PROTOCOL_TYPE_HOMEWORK                                           = 0x0004; // 作业模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_GETLIST_HOMEWORK_TEACHER                       = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_HOMEWORK_STUDENT                       = 0x0002;
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_HOMEWORK_PARENT                        = 0x0003;

    public static final int     PROTOCOL_SUB_TYPE_GETLATELY_HOMEWORK_TEACHER                     = 0x0004;
    public static final int     PROTOCOL_SUB_TYPE_GETLATELY_HOMEWORK_STUDENT                     = 0x0005;
    public static final int     PROTOCOL_SUB_TYPE_GETLATELY_HOMEWORK_PARENT                      = 0x0006;

    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_HOMEWORK                             = 0x0011;

    public static final int     PROTOCOL_SUB_TYPE_PUBLISH_HOMEWORK                               = 0x0021;
    public static final int     PROTOCOL_SUB_TYPE_DEL_HOMEWORK                                   = 0x0022;
    public static final int     PROTOCOL_SUB_TYPE_ANSWER_HOMEWORK                                = 0x0023;
    public static final int     PROTOCOL_SUB_TYPE_SIGN_HOMEWORK                                  = 0x0024;
    public static final int     PROTOCOL_SUB_TYPE_REVIEW_HOMEWORK                                = 0x0025;

    public static final int     PROTOCOL_SUB_TYPE_DELETE_HOMEWORK                                = 0x0031;

    public static final int     PROTOCOL_SUB_TYPE_GET_CLASS_STATUS                               = 0x0100;

    public static final int     PROTOCOL_TYPE_CLASSNOTES                                         = 0x0005; // 课堂笔记模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_GETLIST_CLASSNOTES_CLASS                       = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_CLASSNOTES_TEACHER                     = 0x0002;

    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_CLASSNOTES                           = 0x0011;

    public static final int     PROTOCOL_SUB_TYPE_PUBLISH_CLASSNOTES                             = 0x0021;
    public static final int     PROTOCOL_SUB_TYPE_DEL_CLASSNOTES                                 = 0x0022;

    public static final int     PROTOCOL_TYPE_INFORMATION                                        = 0x0006; // 资讯模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_GETLIST_INFORMATION                            = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_INFORMATION                          = 0x0011;
    public static final int     PROTOCOL_SUB_TYPE_PUBLISH_INFORMATION                            = 0x0021;
    public static final int     PROTOCOL_SUB_TYPE_DEL_INFORMATION                                = 0x0022;

    public static final int     PROTOCOL_TYPE_ONLINERES                                          = 0x0007; // 在线资源模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_GETLIST_ONLINERES                              = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_ONLINERES                            = 0x0011;

    public static final int     PROTOCOL_TYPE_CONTACT                                            = 0x0010; // 联系人模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_GETLIST_CLASS_ALLUSER                          = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_SCHOOL_ALLTEACHER                      = 0x0010;
    public static final int     PROTOCOL_SUB_TYPE_GETDETAIL_USRE_INFO                            = 0x0100;

    public static final int     PROTOCOL_TYPE_SELF                                               = 0x0011; // “我”模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_GET_DETAIL                                     = 0x0001;

    public static final int     PROTOCOL_SUB_TYPE_MODIFY_PASSWORD                                = 0x0010;
    public static final int     PROTOCOL_SUB_TYPE_MODIFY_HEAD_PIC                                = 0x0011;
    public static final int     PROTOCOL_SUB_TYPE_MODIFY_SEX                                     = 0x0012;
    public static final int     PROTOCOL_SUB_TYPE_MODIFY_BIRTHDAY                                = 0x0013;

    public static final int     PROTOCOL_SUB_TYPE_TEACHER_UPDATE_CLASSCOURSE                     = 0x0020;
    public static final int     PROTOCOL_SUB_TYPE_TEACHER_QUERY_CLASSCOURSE                      = 0x0021;
    
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_MYRES                                  = 0x0100;
    public static final int     PROTOCOL_SUB_TYPE_ADD_MYRES                                      = 0x0101;
    public static final int     PROTOCOL_SUB_TYPE_DEL_MYRES                                      = 0x0102;
    public static final int     PROTOCOL_SUB_TYPE_GETLIST_ITEMS                                  = 0x0103; // 获取列表下的文件夹和资源
    public static final int     PROTOCOL_SUB_TYPE_ADD_DIR                                        = 0x0104; // 创建目录
    public static final int     PROTOCOL_SUB_TYPE_DEL                                            = 0x0105; // 删除目录和资源
    public static final int     PROTOCOL_SUB_TYPE_COPY                                           = 0x0106; // 复制目录和资源
    public static final int     PROTOCOL_SUB_TYPE_CUT                                            = 0x0107; // 移动目录和资源
    public static final int     PROTOCOL_SUB_TYPE_RENAME                                         = 0x0108; // 重命名目录和资源
    public static final int     PROTOCOL_SUB_TYPE_SHARE                                          = 0x0109; // 分享网盘

    public static final int     PROTOCOL_TYPE_FAV                                                = 0x0008; // 收藏模块主协议类型

    public static final int     PROTOCOL_SUB_TYPE_FAV_LIST                                       = 0x0001;

    public static final int     PROTOCOL_SUB_TYPE_FAV_NEWS                                       = 0x0002;
    public static final int     PROTOCOL_SUB_TYPE_FAV_FILE                                       = 0x0003;
    public static final int     PROTOCOL_SUB_TYPE_FAV_HOMEWORK                                   = 0x0004;
    public static final int     PROTOCOL_SUB_TYPE_FAV_RES                                        = 0x0005;
    public static final int     PROTOCOL_SUB_TYPE_FAV_TEXT                                       = 0x0006;
    public static final int     PROTOCOL_SUB_TYPE_FAV_CLASSNOTES                                 = 0x000D;

    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAV_NEWS                                = 0x0007;
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAV_FILE                                = 0x0008;
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAV_HOMEWORK                            = 0x0009;
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAV_RES                                 = 0x000A;
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAV_TEXT                                = 0x000B;
    public static final int     PROTOCOL_SUB_TYPE_CANCEL_FAV_CLASSNOTES                          = 0x000C;

    public static final int     PROTOCOL_TYPE_HX                                                 = 0x0009; // 聊天模块主协议类型
    public static final int     PROTOCOL_SUB_TYPE_HX_ADD_GROUP                                   = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_HX_ADD_MEMBER                                  = 0x0002;
    public static final int     PROTOCOL_SUB_TYPE_HX_DEL_MEMBER                                  = 0x0003;
    public static final int     PROTOCOL_SUB_TYPE_HX_MODIFY_GROUP_NAME                           = 0x0004;
    public static final int     PROTOCOL_SUB_TYPE_HX_DEL_GROUP                                   = 0x0005;
    public static final int     PROTOCOL_SUB_TYPE_HX_Get_HEADURL                                 = 0x0006;

    public static final int     PROTOCOL_TYPE_DICTATION                                          = 0x000A; // 听写模块主协议类型
    public static final int     PROTOCOL_SUB_TYPE_DICTATION_DIR_LIST                             = 0x0001;
    public static final int     PROTOCOL_SUB_TYPE_DICTATION_RES_LIST                             = 0x0002;

}
