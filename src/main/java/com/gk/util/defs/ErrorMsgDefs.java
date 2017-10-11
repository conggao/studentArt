package com.gk.util.defs;

public class ErrorMsgDefs
{

    public static final String OPR_SUCCESS = "操作成功";
    public static final String REQ_ERROR_PARAMETER = "请求参数非法";
    public static final String REQ_PARAMETER_JSON_ERROR = "JSON解析出错";
    public static final String REQ_PARAMETER_DECODE_ERROR = "请求参数解析出错";

    public static final String LOGIN_USER_NOT_EXIST = "此登录用户不存在";
    public static final String LOGIN_PASSWD_NOT_EXIST = "此登录密码不存在";
    public static final String LOGIN_UNKNOWN_ERROR = "此登录用户不存在或密码有误";
    public static final String LOGIN_COOKIE_SET_FAIL = "设置登陆Cookie失败";
    public static final String LOGIN_TOKEN_SET_FAIL = "设置登陆token失败";

    public static final String VERIFICATION_CODE_IS_NOT_CORRECT = "验证码不正确";
    public static final String USER_PASSWD_NOT_CORRECT = "用户密码不正确";

    public static final String REQ_ERROR_NO_LOGIN = "您还没有登陆";
    public static final String REQ_ERROR_NO_POWER = "您没有此操作权限";

    public static final String NO_EXIST_USER = "不存在此用户";
    public static final String NO_EXIST_MOBILEPHONE = "不存在此手机号";
    public static final String NO_EXIST_VERIFICATION_CODE = "不存在此验证码";
    public static final String UPDATE_SMS_VERIFICATION_CODE_FAIL = "更新短信验证码失败";
    public static final String NO_ALLOW_NULL_MOBILEPHONE = "不允许手机号为空";
    public static final String NO_EXIST_SCHOOL_INVITE_CODE = "不存在此学校邀请码";
    public static final String NO_EXIST_CLASS_INVITE_CODE = "不存在此班级邀请码";

    public static final String ALREADY_EXIST_MOBILEPHONE = "此手机号已经存在，不能再注册了";
    public static final String ADD_USER_BASE_INFO_FAIL = "增加用户基本信息失败";
    public static final String UPDATE_USER_BASE_INFO_FAIL = "更新用户基本信息失败";
    public static final String ADD_USER_PASSWORD_INFO = "增加用户密码信息失败";
    public static final String UPDATE_USER_PASSWORD_INFO = "更新用户密码信息失败";
    public static final String ADD_USER_IM_INFO_FAIL = "增加用户聊天账号信息失败";
    public static final String UPDATE_USER_IM_INFO_FAIL = "更新用户聊天账号信息失败";
    public static final String DEL_TEACHER_CLASS_INFO = "删除教师班级信息失败";
    public static final String ADD_TEACHER_CLASS_INFO = "增加教师班级信息失败";
    public static final String UPDATE_TEACHER_CLASS_INFO = "更新教师班级信息失败";
    public static final String DEL_STUDENT_CLASS_INFO = "删除学生班级信息失败";
    public static final String ADD_STUDENT_CLASS_INFO = "增加学生班级信息失败";
    public static final String ADD_USER_SCHOOL_INFO = "增加用户学校信息失败";
    public static final String UPDATE_USER_SCHOOL_INFO = "更新用户学校信息失败";
    public static final String REG_USR_SUCCESS = "注册成功";
    public static final String DEL_SCHOOL_INFO = "删除教师班级信息失败";
    public static final String UPDATE_SCHOOL_INFO = "更新学校码失败";

    public static final String UPLOAD_FILE_SUCCESS = "上传文件成功";
    public static final String UPLOAD_FILE_FAIL = "上传文件失败";
    public static final String UPLOAD_FILE_NOT_ALLOW_NULL = "上传的文件不能为空";

    public static final String NEW_USER_SUCCESS = "添加用户成功";
    public static final String MODIFY_USER_SUCCESS = "修改用户成功";
    public static final String DEL_USER_SUCCESS = "删除用户成功";
    public static final String MODIFY_USER_PASSWORD_SUCCESS = "修改用户密码成功";
    public static final String ALREADY_EXIST_USERNAME = "此用户名已经存在，不能再注册了";

    public static final String NO_EXIST_HOMEWORK_INFO = "不存在此作业信息";
    public static final String ADD_HOMEWORK_BASE_INFO_FAIL = "增加作业基本信息失败";
    public static final String DEL_HOMEWORK_BASE_INFO_FAIL = "删除作业基本信息失败";
    public static final String ADD_HOMEWORK_FILE_INFO_FAIL = "增加作业文件信息失败";
    public static final String DEL_HOMEWORK_FILE_INFO_FAIL = "删除作业文件信息失败";

    public static final String NO_EXIST_HOMEWORK_RESULT_INFO = "不存在此作业答案";
    public static final String ADD_HOMEWORK_RESULT_BASE_INFO_FAIL = "增加作业答案基本信息失败";
    public static final String UPDATE_HOMEWORK_RESULT_BASE_INFO_FAIL = "更新作业答案基本信息失败";
    public static final String ADD_HOMEWORK_RESULT_FILE_INFO_FAIL = "增加作业答案文件信息失败";
    public static final String DEL_HOMEWORK_RESULT_FILE_INFO_FAIL = "删除作业答案文件信息失败";

    public static final String NO_EXIST_HOMEWORK_SIGN_INFO = "不存在此作业签名";
    public static final String ADD_HOMEWORK_SIGN_INFO_FAIL = "增加作业签名信息失败";
    public static final String DEL_HOMEWORK_SIGN_INFO_FAIL = "删除作业签名信息失败";

    public static final String NO_EXIST_HOMEWORK_REVIEW_INFO = "不存在此作业评阅";
    public static final String ADD_HOMEWORK_REVIEW_BASE_INFO_FAIL = "增加作业评阅基本信息失败";
    public static final String ADD_HOMEWORK_REVIEW_FILE_INFO_FAIL = "增加作业评阅文件信息失败";
    public static final String DEL_HOMEWORK_REVIEW_FILE_INFO_FAIL = "删除作业评阅文件信息失败";

    public static final String ADD_NEWS_COMMENT_INFO_FAIL = "增加评论失败";
    public static final String DEL_NEWS_COMMENT_INFO_FAIL = "删除评论失败";
    public static final String QUERY_NEWS_DETAIL_INFO_FAIL = "获取公告详情失败";
    public static final String DEL_NEWS_INFO_FAILD = "删除公告失败";
    public static final String PUBLISH_NEWS_INFO_FAIL = "发布公告失败";
    public static final String PUBLISH_NEWS_ADD_FILE_FAIL = "增加公告中的文件信息失败";
    public static final String CANCEL_FAV_INFO_FAIL = "取消收藏失败";
    public static final String FAV_INFO_FAIL = "收藏失败";
    public static final String TOP_NEWS_FAIL = "置顶失败";
    public static final String CANCEL_TOP_NEWS_FAIL = "取消置顶失败";
    public static final String PRAISE_NEWS_FAIL = "点赞失败";
    public static final String CANCEL_PRAISE_NEWS_FAIL = "取消点赞失败";
    public static final String FAV_NEWS_FAIL = "收藏失败";
    public static final String CANCEL_FAV_NEWS_FAIL = "取消收藏";

    public static final String NO_EXIST_CLASSNOTES_INFO = "不存在此课程笔记信息";
    public static final String ADD_CLASSNOTES_BASE_INFO_FAIL = "增加课程笔记基本信息失败";
    public static final String DEL_CLASSNOTES_BASE_INFO_FAIL = "删除课程笔记基本信息失败";
    public static final String ADD_CLASSNOTES_FILE_INFO_FAIL = "增加课程笔记文件信息失败";
    public static final String DEL_CLASSNOTES_FILE_INFO_FAIL = "删除课程笔记文件信息失败";

    public static final String NO_EXIST_INFORMATION_INFO = "不存在此资讯信息";
    public static final String ADD_INFORMATION_BASE_INFO_FAIL = "增加资讯基本信息失败";
    public static final String ADD_INFORMATION_FILE_INFO_FAIL = "增加资讯文件信息失败";
    public static final String DEL_INFORMATION_FILE_INFO_FAIL = "删除资讯文件信息失败";

    public static final String NO_EXIST_ONLINERES_INFO = "不存在此在线资源";
    public static final String ADD_ONLINERES_HIT_BASE_INFO_FAIL = "增加在线资源点击基本信息失败";
    public static final String ADD_ONLINERES_HIT_COUNT_INFO_FAIL = "增加在线资源点击统计信息失败";

    public static final String NO_EXIST_MYRES_INFO = "不存在此资源 ";
    public static final String ADD_MYRES_INFO_FAIL = "增加我的资源失败";
    public static final String DEL_MYRES_INFO_FAIL = "删除我的资源失败";

    public static final String NEW_USER_GROUP_FAIL = "添加用户分组失败";
    public static final String DEL_USER_GROUP_FAIL = "删除用户分组失败";

    public static final String ILLEGAL_GROUPID = "分群ID不能为空或不合法";
    public static final String GROUP_NO_EXIST = "分群不存在";

    public static final String USER_GROUP_ILLEGAL_NAME = "分组名不能为空或不合法";
    public static final String USER_GROUP_ALREAD_EXIST_NAME = "分组名已经存在";

    public static final String NEW_GROUP_SUCCESS = "添加分组成功";
    public static final String MODIFY_GROUP_SUCCESS = "修改分组成功";
    public static final String DEL_GROUP_SUCCESS = "删除分组成功";

    public static final String UPDATE_GROUP_BASE_INFO_FAIL = "更新分组基本信息失败";
    public static final String DEL_GROUP_BASE_INFO_FAIL = "删除分组基本信息失败";
    public static final String UPDATE_GROUP_DEV_INFO_FAIL = "更新分组设备信息失败";
    public static final String DEL_GROUP_DEV_INFO_FAIL = "删除分组设备信息失败";

    public static final String DEL_INFORMATION_PUBLISH_OPR_RECORD_FAIL = "删除信息发布失败";

    public static final String DEL_NET_FILE_OPR_RECORD_FAIL = "删除网络同传记录失败";

    public static final String DEL_MACHINE_SWITCH_OPR_RECORD_FAIL = "删除定时开关机失败";

    public static final String UPDATE_CLASS_BELL_OPR_RECORD_FAIL = "更新课堂打铃基本信息失败";
    public static final String UPDATE_CLASS_BELL_TIMER_FAIL = "更新课堂打铃时间信息失败";
    public static final String DEL_CLASS_BELL_OPR_RECORD_FAIL = "删除课堂打铃基本信息失败";
    public static final String DEL_CLASS_BELL_TIMER_FAIL = "删除课堂打铃时间信息失败";

    public static final String UPDATE_EYE_EXERCISE_OPR_RECORD_FAIL = "更新眼保健操信息失败";
    public static final String DEL_EYE_EXERCISE_OPR_RECORD_FAIL = "删除眼保健操信息失败";

    public static final String ILLEGAL_RES_FILE = "非法的资源文件";
    public static final String ADD_RES_FILE_FAIL = "增加资源文件失败";
    public static final String DEL_RES_FILE_FAIL = "删除资源文件失败";
    public static final String DEL_DIR_INFO_FAIL = "删除资源文件夹失败";
    public static final String COPY_FAIL = "复制失败";
    public static final String CUT_FAIL  = "移动失败";
    public static final String OPEN_MYRES = "开通网盘失败";

    public static final String NO_FILE = "文件不存在";
    public static final String CLASS_NOT_EXIST = "不存在此班级信息";
    public static final String CLASS_ALREAD_EXIST = "此班级已经存在";
    public static final String ADD_CLASS_INFO_FAIL = "添加班级失败";
    public static final String DEL_CLASS_INFO_FAIL = "删除班级失败";
    public static final String UPDATE_CLASS_INFO_FAIL = "更新班级失败";

    public static final String ADD_FAMILIY_FAIL             = "添加家庭失败";
    public static final String ADD_USER_FAMILIY_FAIL        = "添加用户家庭信息失败";
    public static final String UPDATE_USER_FAMILIY_FAIL     = "更新用户家庭信息失败"; 

    public static final String ADD_PRIVILEGE_FAIL             = "添加权限失败";
    public static final String DEL_PRIVILEGE_FAIL             = "删除权限失败";
}
