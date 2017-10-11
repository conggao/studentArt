/*
package com.gk.service;

import java.util.List;

import com.entity.admin.AdminUserCookie;
import com.entity.admin.AdminUserInfo;
import com.entity.bus.BusLinesInfo;
import com.entity.bus.SchoolBusInfo;
import com.entity.bus.protocol.BusLineListReq;
import com.entity.bus.protocol.SchoolBusAddReq;
import com.entity.bus.protocol.SchoolBusRemoveReq;
import com.entity.card.protocol.CardReq;
import com.entity.card.protocol.ChildFamilyReq;
import com.entity.card.protocol.ChildFamilyRsp;
import com.entity.card.protocol.ModifyChildFamilyReq;
import com.entity.card.protocol.ModifyChildFamilyRsp;
import com.entity.card.protocol.UserInfoRefreshReq;
import com.entity.card.protocol.UserInfoReq;
import com.entity.card.protocol.UserInfoRsp;
import com.entity.condition.PageSelectInfo;
import com.entity.feedback.FeedBackInfo;
import com.entity.food.FoodBaseInfo;
import com.entity.login.AddChildReqInfo;
import com.entity.login.CheckChildrenRsp;
import com.entity.login.RegClassCourseInfo;
import com.entity.login.RegReqInfo;
import com.entity.manage.school.QueryPrivilegeCondition;
import com.entity.manage.school.QueryStudentCondition;
import com.entity.manage.school.QueryTeacherCondition;
import com.entity.manage.school.StudentSimpleInfo;
import com.entity.manage.school.TeacherSimpleInfo;
import com.entity.master.CardInfo;
import com.entity.master.CardPushInfo;
import com.entity.master.FamilyInfo;
import com.entity.master.HealthBaseInfo;
import com.entity.master.SmsVerificationCode;
import com.entity.master.SysIdDesc;
import com.entity.master.SysPrivilegeDesc;
import com.entity.master.SysPrivilegeUser;
import com.entity.master.TeacherSchoolRoleInfo;
import com.entity.master.TeacherSchoolRoleType;
import com.entity.master.UserBaseInfo;
import com.entity.master.UserCookie;
import com.entity.master.UserFamilyInfo;
import com.entity.master.UserLoginRecord;
import com.entity.master.UserOprRecord;
import com.entity.master.UserParentInfo;
import com.entity.master.UserPasswordInfo;
import com.entity.master.UserPushInfo;
import com.entity.master.UserStudentInfo;
import com.entity.master.UserTeacherInfo;
import com.entity.master.UserToken;
import com.entity.master.ViewFoodBaseInfo;
import com.entity.master.ViewSchoolInfo;
import com.entity.master.ViewSelfInfo;
import com.entity.master.ViewSysPrivilegeDesc;
import com.entity.master.ViewSysPrivilegeUser;
import com.entity.master.ViewTeacherStudentInfo;
import com.entity.master.ViewUserBaseInfo;
import com.entity.master.ViewUserFamilyInfo;
import com.entity.master.ViewUserSimpleInfo;
import com.entity.master.ViewUserStudentInfo;
import com.entity.master.ViewUserTeacherInfo;
import com.entity.schoolbase.SchoolInfo;
import com.entity.upgrade.ViewUpgradeInfo;
import com.entity.user.LoginUserInfo;
import com.entity.user.protocol.ClassContactListRsp;
import com.entity.user.protocol.ContactDetailReq;
import com.entity.user.protocol.ContactDetailResult;

public interface MasterService
{
    AdminUserInfo queryAdminUserInfoByUserName(String userName);

    AdminUserInfo queryAdminUserInfo(Long userId);

    boolean updateAdminUserInfo(AdminUserInfo info);

    AdminUserCookie queryAdminUserCookie(Long userId);

    boolean updateAdminUserCookie(AdminUserCookie info);

    ViewUpgradeInfo queryLatelyViewUpgradeInfo(Integer osId, String swName);

    List<ViewTeacherStudentInfo> queryListViewTeacherStudentInfo(Long userId);

    List<ViewUserTeacherInfo> queryListViewUserTeacherInfo(QueryTeacherCondition condition, PageSelectInfo pageSelectInfo);

    List<ViewUserStudentInfo> queryListViewUserStudentInfo(QueryStudentCondition condition, PageSelectInfo pageSelectInfo);

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

    boolean delUserParentInfo(Long userId, Long classId);

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

    ViewUserStudentInfo queryViewUserStudentInfo(Long userId);

    ClassContactListRsp queryListUserStudentInfo(Long classId);

    UserStudentInfo queryUserStudentInfo(Long userId);

    boolean updateUserStudentInfo(UserStudentInfo info);

    boolean delUserStudentInfo(Long userId);

    boolean delUserFamilyInfo(UserFamilyInfo userFamilyInfo);

    boolean delUserFamilyInfo(Long userId);

    ViewUserTeacherInfo queryViewUserTeacherInfo(Long id);

    List<ViewUserTeacherInfo> queryViewUserTeacherInfoByUserId(Long userId);

    List<UserTeacherInfo> queryUserTeacherInfoByUserId(Long userId);

    boolean updateUserTeacherInfo(UserTeacherInfo info);

    boolean updateUserTeacherInfo(List<UserTeacherInfo> list);

    boolean delUserTeacherInfoByUserId(Long userId);

    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId);

    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId);

    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId);

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
    HealthBaseInfo queryHealthBaseInfo(Long userId, String time);

    List<HealthBaseInfo> queryListHealthBaseInfo(Long userId);

    List<FoodBaseInfo> queryListFoodBaseInfo(Long classId);

    List<FoodBaseInfo> queryListFoodBaseInfo(Long classId, String time);

    // 查询学生基本信息列表
    ViewSelfInfo queryViewStudentBaseInfo(Long userId);

    // 查询某日食谱
    ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId, String foodTime);

    // 查询最近一天的食谱信息
    ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId);

    // 查询每日食谱列表
    List<ViewFoodBaseInfo> queryListViewFoodBaseInfo(Long classId, String startTime, String endTime);

    // 发布学生健康信息
    boolean addHealthBaseInfo(HealthBaseInfo healthBaseInfo);

    // 查询学生班级的所有老师
    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId, String timeStart, String timeLastUpdate);

    // 查询学生班级的所有家长
    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId, String timeStart, String timeLastUpdate);

    ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId, String timeStart, String timeLastUpdate);

    ClassContactListRsp queryListViewUserSimpleInfoBySchoolIdForTeacher(Integer schoolId, String timeStart, String timeLastUpdate);

    boolean updateUserParentInfo(UserParentInfo userParentInfo);

    // 校车模块
    List<BusLinesInfo> queryListBusLinesInfo(Long busId);

    boolean updateBusLinesInfo(List<BusLinesInfo> list);

    List<SchoolBusInfo> queryListSchoolBusInfo(Long id);

    boolean delSchoolBusInfo(Long busId);

    boolean updateFeedBackInfo(FeedBackInfo info);

    String addBusReq(SchoolBusAddReq schoolBusAddReq, Integer schoolId);

    String removeBusReq(SchoolBusRemoveReq schoolBusRemoveReq);

    List<SchoolBusInfo> getListBusReq(Integer schoolId);

    List<BusLinesInfo> getListBusLineReq(BusLineListReq busLineListReq);

    String updateTeacherClassInfo(Long userId, Integer schoolId, List<RegClassCourseInfo> listRegClassCourseInfo);

    // 添加老师
    String addTeacher(TeacherSimpleInfo teacherSimpleInfo, Integer schoolId);

    // 注册学生
    String regStudentInfo(AddChildReqInfo reqValue);

    List<Long> queryUserParentInfo(Long studentId);

    String regUser(RegReqInfo regReqInfo, Boolean isWeb, Integer teacherRole, SchoolInfo schoolInfo, Integer schoolId);

    String updateTeacherClassInfo(TeacherSimpleInfo teacherSimpleInfo, Long userId, Integer schoolId);

    List<Long> getListClassId(LoginUserInfo loginUserInfo, Long studentId);

    List<Integer> getListSchoolId(LoginUserInfo loginUserInfo, Long studentId);

    LoginUserInfo getLoginUserInfo(Long userId);

    ContactDetailResult getUserDetail(ContactDetailReq reqValue);

    String delTeacher(TeacherSimpleInfo teacherSimpleInfo);

    String updateStudentInfo(StudentSimpleInfo studentSimpleInfo, Integer schoolId);

    CheckChildrenRsp checkStudentReq(String inviteCode, Long studentId);

    // 打卡模块
    UserInfoRsp getListUserInfo(UserInfoReq reqValue);

    UserInfoRsp refreshUserInfo(UserInfoRefreshReq reqValue);

    //接送家长
    ChildFamilyRsp getListChildFamily(ChildFamilyReq reqValue);

    ModifyChildFamilyRsp modifyChildFamily(ModifyChildFamilyReq reqValue);

    boolean checkMobilePhone(String mobilePhone);

    CardPushInfo queryCardPushInfo(String deviceId);

    boolean updateCardPushInfo(CardPushInfo cardPushInfo);

    String addCard(CardReq cardReq, Integer schoolId);

    String removeCard(CardReq cardReq);

    List<CardInfo> queryCardInfo(Long userId);

    List<CardPushInfo> queryListCardPushInfo(Integer schoolId);
}
*/
