/*
package com.gk.dao.jpa;

import java.util.List;

public interface MasterDAO
{
    // 缓存操作
    ViewUserStudentInfo queryViewUserStudentInfoByUserId(Long userId);

    List<ViewUserStudentInfo> queryViewUserStudentInfoBySchoolId(Integer schoolId);

    AdminUserInfo queryAdminUserInfoByUserName(String userName);

    List<ViewUserBaseInfo> queryListViewUserBaseInfoByClassId(Long classId, String creatDay);

    AdminUserInfo queryAdminUserInfo(Long userId);

    boolean updateAdminUserInfo(AdminUserInfo info);

    AdminUserCookie queryAdminUserCookie(Long userId);

    boolean updateAdminUserCookie(AdminUserCookie info);

    List<UserBaseInfo> queryListUserBaseInfo();

    ViewUpgradeInfo queryLatelyViewUpgradeInfo(Integer osId, String swName);

    SmsVerificationCode querySmsVerificationCode(Long userId, Integer type);

    SmsVerificationCode querySmsVerificationCode(String mobilePhone, Integer type);

    boolean updateSmsVerificationCode(SmsVerificationCode info);

    UserBaseInfo queryUserBaseInfoByUserId(Long userId);

    UserBaseInfo queryUserBaseInfoByUserName(String userName);

    UserBaseInfo queryUserBaseInfoByUserNameAndMobilePhone(String userName, String mobilePhone);

    boolean isExistMobilePhoneAlreadReg(String mobilePhone);

    UserBaseInfo queryUserBaseInfo(String where);

    List<UserBaseInfo> queryListUserBaseInfo(Integer schoolId);

    boolean delUserBaseInfo(Long userId);

    boolean updateUserBaseInfo(UserBaseInfo info);

    UserPasswordInfo queryUserPasswordInfo(Long userId);

    boolean updateUserPasswordInfo(UserPasswordInfo info);

    boolean delUserPasswordInfo(Long userId);

    UserToken queryUserToken(Long userId);

    boolean updateUserToken(UserToken info);
    
    boolean delUserTolen(Long userId);

    UserCookie queryUserCookie(Long userId);

    boolean updateUserCookie(UserCookie info);

    UserLoginRecord queryLatelyUserLoginRecordByUserId(Long userId);

    boolean addUserLoginRecord(UserLoginRecord info);

    List<UserOprRecord> queryUserOprRecordByUserId(Long userId);

    boolean addUserOprRecord(UserOprRecord info);

    UserStudentInfo queryUserStudentInfoByUserId(Long userId);

    boolean updateUserStudentInfo(UserStudentInfo info);

    boolean delUserStudentInfo(Long userId);

    ViewUserTeacherInfo queryViewUserTeacherInfo(Long id);

    List<ViewUserTeacherInfo> queryViewUserTeacherInfoByUserId(Long userId);

    List<UserTeacherInfo> queryUserTeacherInfoByUserId(Long userId);

    boolean updateUserTeacherInfo(UserTeacherInfo info);

    boolean delUserTeacherInfo(Long id);

    boolean updateUserTeacherInfo(List<UserTeacherInfo> list);

    boolean delUserTeacherInfoByUserId(Long userId);

    // 查询学生班级的所有老师
    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId);

    // 查询学生班级的所有家长
    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId);

    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId);

    // 查询学生班级的所有老师
    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId, String timeStart, String timeLastUpdate);

    // 查询学生班级的所有家长
    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId, String timeStart, String timeLastUpdate);

    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId, String timeStart, String timeLastUpdate);

    ClassContactListRsp queryListViewUserSimpleInfoBySchoolIdForTeacher(Integer schoolId, String timeStart, String timeLastUpdate);

    // 查询学校所有的老师
    ClassContactListRsp queryListViewUserSimpleInfoBySchoolIdForTeacher(Integer schoolId);

    ViewSchoolInfo queryViewSchoolInfo(Integer id);

    ViewUserSimpleInfo queryViewUserSimpleInfo(Long userId);

    ViewUserSimpleInfo queryViewUserSimpleInfoByImAccount(String imAccount);

    ViewUserBaseInfo queryViewUserBaseInfo(Long userId);

    UserPushInfo queryUserPushInfo(Long userId);

    boolean updateUserPushInfo(UserPushInfo info);

    boolean delUserPushInfo(Long userId);

    Integer queryClassStudentNum(Long classId);

    FamilyInfo queryFamilyInfo(Long id);

    boolean updateFamilyInfo(FamilyInfo info);

    UserFamilyInfo queryUserFamilyInfo(Long userId, Long familyId);

    boolean updateUserFamilyInfo(UserFamilyInfo info);

    ViewUserFamilyInfo queryViewUserFamilyInfo(Long userId);

    List<ViewUserFamilyInfo> queryListViewUserFamilyInfo(Long familyId);

    List<UserBaseInfo> queryUserBaseInfoListByRegistrationId(String registrationId);

    ViewUserSimpleInfo queryViewUserSimpleInfoByUserName(String name);

    List<SysIdDesc> querySysIdDesc();

    List<SysPrivilegeDesc> querySysPrivilegeDescBySysId(Integer sysId);

    List<SysPrivilegeDesc> querySysPrivilegeDesc();

    List<ViewSysPrivilegeDesc> queryViewSysPrivilegeDesc();

    List<SysPrivilegeUser> querySysPrivilegeUserByUserId(Long userId);

    List<SysPrivilegeUser> querySysPrivilegeUserBySchoolId(Integer schoolId);

    List<ViewSysPrivilegeUser> queryViewSysPrivilegeUserByUserId(Long userId);

    List<ViewSysPrivilegeUser> queryViewSysPrivilegeUserBySchoolId(Integer schoolId);

    List<ViewSysPrivilegeUser> queryViewSysPrivilegeUser(QueryPrivilegeCondition queryPrivilegeCondition);

    boolean addSysPrivilege(Integer schoolId, Long userId, Integer privilegeId);

    boolean delSysPrivilege(Long userId, Integer privilegeId);

    List<TeacherSchoolRoleType> queryTeacherSchoolRoleType();

    TeacherSchoolRoleInfo queryTeacherSchoolRoleInfoByUserId(Long userId);

    List<ViewSelfInfo> queryViewStudentBaseInfoByStudentId(Long id);

    // 查询学生基本信息
    HealthBaseInfo queryHealthBaseInfo(Long studentId, String time);

    List<HealthBaseInfo> queryListHealthBaseInfo(Long studentId);

    List<FoodBaseInfo> queryListFoodBaseInfo(Long classId);

    List<FoodBaseInfo> queryListFoodBaseInfo(Long classId, String time);

    // 查询学生基本信息
    ViewSelfInfo queryViewStudentBaseInfo(Long userId);

    // 查询某一日的食谱信息
    ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId, String foodTime);

    // 获取最近一天的食谱信息
    ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId);

    // 查询食谱信息列表
    List<ViewFoodBaseInfo> queryListViewFoodBaseInfo(Long classId, String startTime, String endTime);

    // 查询入离园信息总条数
    Integer queryListIOTotalInfo(Long studentId, String startTime, String endTime, Boolean isUnusual);

    // 获取一天的食谱信息
    List<FoodBaseInfo> queryUserFoodInfo(Integer schoolId, String foodTime);

    // 发布学生健康信息
    boolean addHealthBaseInfo(HealthBaseInfo healthBaseInfo);

    List<ViewTeacherStudentInfo> queryListViewTeacherStudentInfo(Long userId);

    boolean delUserFamilyInfo(UserFamilyInfo userFamilyInfo);

    boolean delUserParentInfo(Long userId, Long classId);

    boolean updateUserParentInfo(UserParentInfo userParentInfo);
    
    List<UserParentInfo> queryUserParentInfoByUserIdAndStudentId(Long userId, Long studentId);

    // 校车模块
    List<BusLinesInfo> queryListBusLinesInfo(Long busId);

    boolean delBusLinesInfoByBusLineId(Long busLineId);

    boolean delBusLinesInfoByBusId(Long busId);

    boolean updateBusLinesInfo(List<BusLinesInfo> list);

    List<SchoolBusInfo> queryListSchoolBusInfo(Long id);

    boolean delSchoolBusInfo(Long busId);

    boolean updateSchoolBusInfo(SchoolBusInfo schoolBusInfo);

    boolean updateFeedBackInfo(FeedBackInfo info);

    List<Long> queryUserParentInfo(Long studentId);

    List<UserStudentInfo> queryUserStudentInfoByStudentId(Integer schoolId, Long studentId);

    UserStudentInfo queryUserStudentInfo(Long classId, Long studentId);

    boolean delUserFamilyInfo(Long userId);

    List<SchoolBusInfo> queryListSchoolBusInfoBySchoolId(Integer schoolId);

    ViewClassBaseInfo queryViewClassBaseInfo(Long classId);

    boolean updateTeacherSchoolRoleInfo(TeacherSchoolRoleInfo info);

    CacheUserInfo updateCacheClassUserInfo(ViewUserBaseInfo viewUserBaseInfo, Long classId);

    List<UserStudentInfo> queryListUserStudentInfoByClassId(Long classId);

    // 打卡系统
    List<ViewCardChildInfo> queryListViewCardChildInfo(Integer schoolId);

    List<ViewCardChildInfo> queryListViewCardChildInfo(Integer schoolId, String lastUpdateTime);

    List<CardFamilyInfo> queryListCardFamilyInfo(Integer schoolId, String lastUpdateTime);
    
    CardFamilyInfo queryCardFamilyInfo(Long childId, String roleName);

    List<CardFamilyInfo> queryListCardFamilyInfo(Long childId);

    List<CardFamilyInfo> queryListCardFamilyInfo(Integer schoolId);

    List<CardInfo> queryListCardInfo(Integer schoolId, String lastUpdateTime);

    ViewCardChildInfo queryViewCardChildInfo(Long userId);

    boolean delCardFamilyInfo(List<CardFamilyInfo> listCardFamilyInfoSave);

    boolean updateCardFamilyInfo(List<CardFamilyInfo> listCardFamilyInfo);

    boolean checkUserName(String mobilePhone);

    CardFamilyInfo queryCardFamilyInfo(Long id);

    CardPushInfo queryCardPushInfo(String deviceId);

    boolean updateCardPushInfo(CardPushInfo cardPushInfo);
    
    List<CardInfo> queryListCardInfo(Integer schoolId);

    boolean updateCardChildInfo(CardChildInfo cardChildInfo);

    boolean updateCardInfo(CardInfo cardInfo);

    boolean delCardInfo(Long cardId);

    List<CardInfo> queryCardInfo(Long userId);

    boolean updateFamilyRoleType(FamilyRoleType familyRoleType);

    List<CardPushInfo> queryListCardPushInfo(Integer schoolId);

}
*/
