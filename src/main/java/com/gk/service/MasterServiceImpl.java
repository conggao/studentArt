/*
package com.gk.service;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.dao.FileDAO;
import com.dao.FileDAOImpl;
import com.dao.MasterDAO;
import com.dao.MasterDAOImpl;
import com.dao.SchoolDAO;
import com.dao.SchoolDAOImpl;
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
import com.entity.file.ViewUploadFileInfo;
import com.entity.food.FoodBaseInfo;
import com.entity.login.AddChildReqInfo;
import com.entity.login.CheckChildrenRsp;
import com.entity.login.RegChildrenInfo;
import com.entity.login.RegClassCourseInfo;
import com.entity.login.RegReqInfo;
import com.entity.login.RegReqUserBaseInfo;
import com.entity.manage.school.QueryPrivilegeCondition;
import com.entity.manage.school.QueryStudentCondition;
import com.entity.manage.school.QueryTeacherCondition;
import com.entity.manage.school.StudentSimpleInfo;
import com.entity.manage.school.TeacherSimpleInfo;
import com.entity.master.CardChildInfo;
import com.entity.master.CardFamilyInfo;
import com.entity.master.CardInfo;
import com.entity.master.CardPushInfo;
import com.entity.master.ClassBaseInfo;
import com.entity.master.FamilyInfo;
import com.entity.master.FamilyRoleType;
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
import com.entity.master.UserFamilyInfoId;
import com.entity.master.UserLoginRecord;
import com.entity.master.UserOprRecord;
import com.entity.master.UserParentInfo;
import com.entity.master.UserPasswordInfo;
import com.entity.master.UserPushInfo;
import com.entity.master.UserStudentInfo;
import com.entity.master.UserTeacherInfo;
import com.entity.master.UserToken;
import com.entity.master.ViewCardChildInfo;
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
import com.entity.user.FamilyMemberInfo;
import com.entity.user.LoginUserInfo;
import com.entity.user.protocol.ClassContactListRsp;
import com.entity.user.protocol.ContactDetailReq;
import com.entity.user.protocol.ContactDetailResult;
import com.entity.user.protocol.ContactDetailRsp;
import com.utils.BasicUtils;
import com.utils.MD5Utils;
import com.utils.defs.CommDefs;
import com.utils.defs.ErrorMsgDefs;
import com.utils.defs.UserRoleDefs;

public class MasterServiceImpl implements MasterService
{

    private MasterDAO masterDAO;
    private FileDAO   fileDAO;

    public void setFileDAO(FileDAOImpl fileDAO)
    {
        this.fileDAO = fileDAO;
    }

    public void setMasterDAO(MasterDAOImpl masterDAO)
    {
        this.masterDAO = masterDAO;
    }

    private SchoolDAO schoolDAO;

    public void setSchoolDao(SchoolDAOImpl schoolDAO)
    {
        this.schoolDAO = schoolDAO;
    }

    @Override
    public CardPushInfo queryCardPushInfo(String deviceId)
    {
        return masterDAO.queryCardPushInfo(deviceId);
    }

    @Override
    public boolean updateCardPushInfo(CardPushInfo cardPushInfo)
    {
        return masterDAO.updateCardPushInfo(cardPushInfo);
    }

    @Override
    public ViewUpgradeInfo queryLatelyViewUpgradeInfo(Integer osId, String swName)
    {
        return this.masterDAO.queryLatelyViewUpgradeInfo(osId, swName);
    }

    @Override
    public SmsVerificationCode querySmsVerificationCode(Long userId, Integer type)
    {
        return this.masterDAO.querySmsVerificationCode(userId, type);
    }

    @Override
    public SmsVerificationCode querySmsVerificationCode(String mobilePhone, Integer type)
    {
        return this.masterDAO.querySmsVerificationCode(mobilePhone, type);
    }

    @Override
    public boolean updateSmsVerificationCode(SmsVerificationCode info)
    {
        return this.masterDAO.updateSmsVerificationCode(info);
    }

    @Override
    public UserBaseInfo queryUserBaseInfoByUserId(Long userId)
    {
        return this.masterDAO.queryUserBaseInfoByUserId(userId);
    }

    @Override
    public UserBaseInfo queryUserBaseInfoByUserName(String userName)
    {
        return this.masterDAO.queryUserBaseInfoByUserName(userName);
    }

    @Override
    public UserBaseInfo queryUserBaseInfo(String where)
    {
        return this.masterDAO.queryUserBaseInfo(where);
    }

    @Override
    public List<UserBaseInfo> queryListUserBaseInfo(Integer schoolId)
    {
        return this.masterDAO.queryListUserBaseInfo(schoolId);
    }

    @Override
    public boolean delUserBaseInfo(Long userId)
    {
        return this.masterDAO.delUserBaseInfo(userId);
    }

    @Override
    public boolean updateUserBaseInfo(UserBaseInfo info)
    {
        return this.masterDAO.updateUserBaseInfo(info);
    }

    @Override
    public UserPasswordInfo queryUserPasswordInfo(Long userId)
    {
        return this.masterDAO.queryUserPasswordInfo(userId);
    }

    @Override
    public boolean updateUserPasswordInfo(UserPasswordInfo info)
    {
        return this.masterDAO.updateUserPasswordInfo(info);
    }

    @Override
    public boolean delUserPasswordInfo(Long userId)
    {
        return this.masterDAO.delUserPasswordInfo(userId);
    }

    @Override
    public UserToken queryUserToken(Long userId)
    {
        return this.masterDAO.queryUserToken(userId);
    }

    @Override
    public boolean updateUserToken(UserToken info)
    {
        return this.masterDAO.updateUserToken(info);
    }

    @Override
    public UserCookie queryUserCookie(Long userId)
    {
        return this.masterDAO.queryUserCookie(userId);
    }

    @Override
    public boolean updateUserCookie(UserCookie info)
    {
        return this.masterDAO.updateUserCookie(info);
    }

    @Override
    public UserLoginRecord queryLatelyUserLoginRecordByUserId(Long userId)
    {
        return this.masterDAO.queryLatelyUserLoginRecordByUserId(userId);
    }

    @Override
    public boolean addUserLoginRecord(UserLoginRecord info)
    {
        return this.masterDAO.addUserLoginRecord(info);
    }

    @Override
    public UserBaseInfo queryUserBaseInfoByUserNameAndMobilePhone(String userName, String mobilePhone)
    {
        return this.masterDAO.queryUserBaseInfoByUserNameAndMobilePhone(userName, mobilePhone);
    }

    @Override
    public boolean isExistMobilePhoneAlreadReg(String mobilePhone)
    {
        return this.masterDAO.isExistMobilePhoneAlreadReg(mobilePhone);
    }

    @Override
    public List<UserOprRecord> queryUserOprRecordByUserId(Long userId)
    {
        return this.masterDAO.queryUserOprRecordByUserId(userId);
    }

    @Override
    public boolean addUserOprRecord(UserOprRecord info)
    {
        return this.masterDAO.addUserOprRecord(info);
    }

    @Override
    public ViewUserStudentInfo queryViewUserStudentInfo(Long userId)
    {
        return this.masterDAO.queryViewUserStudentInfoByUserId(userId);
    }

    @Override
    public List<ViewTeacherStudentInfo> queryListViewTeacherStudentInfo(Long userId)
    {
        return this.masterDAO.queryListViewTeacherStudentInfo(userId);
    }

    @Override
    public UserStudentInfo queryUserStudentInfo(Long userId)
    {
        return this.masterDAO.queryUserStudentInfoByUserId(userId);
    }

    @Override
    public boolean updateUserStudentInfo(UserStudentInfo info)
    {
        return this.masterDAO.updateUserStudentInfo(info);
    }

    @Override
    public boolean delUserStudentInfo(Long userId)
    {
        return this.masterDAO.delUserStudentInfo(userId);
    }

    @Override
    public ViewUserTeacherInfo queryViewUserTeacherInfo(Long id)
    {
        return this.masterDAO.queryViewUserTeacherInfo(id);
    }

    @Override
    public List<ViewUserTeacherInfo> queryViewUserTeacherInfoByUserId(Long userId)
    {
        return this.masterDAO.queryViewUserTeacherInfoByUserId(userId);
    }

    @Override
    public List<UserTeacherInfo> queryUserTeacherInfoByUserId(Long userId)
    {
        return this.masterDAO.queryUserTeacherInfoByUserId(userId);
    }

    @Override
    public boolean updateUserTeacherInfo(UserTeacherInfo info)
    {
        return this.masterDAO.updateUserTeacherInfo(info);
    }

    @Override
    public boolean updateUserTeacherInfo(List<UserTeacherInfo> list)
    {
        return this.masterDAO.updateUserTeacherInfo(list);
    }

    @Override
    public boolean delUserTeacherInfoByUserId(Long userId)
    {
        return this.masterDAO.delUserTeacherInfoByUserId(userId);
    }

    @Override
    public ViewSchoolInfo queryViewSchoolInfo(Integer id)
    {
        return this.masterDAO.queryViewSchoolInfo(id);
    }

    @Override
    public ViewUserSimpleInfo queryViewUserSimpleInfo(Long userId)
    {
        return this.masterDAO.queryViewUserSimpleInfo(userId);
    }

    @Override
    public ViewUserBaseInfo queryViewUserBaseInfo(Long userId)
    {
        return this.masterDAO.queryViewUserBaseInfo(userId);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId)
    {
        return this.masterDAO.queryListViewUserSimpleInfoByClassIdForTeacher(classId);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId)
    {
        return this.masterDAO.queryListViewUserSimpleInfoByClassIdForParent(classId);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId)
    {
        return this.masterDAO.queryListViewUserSimpleInfoByClassIdForStudent(classId);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoBySchoolIdForTeacher(Integer schoolId)
    {
        return this.masterDAO.queryListViewUserSimpleInfoBySchoolIdForTeacher(schoolId);
    }

    @Override
    public UserPushInfo queryUserPushInfo(Long userId)
    {
        return this.masterDAO.queryUserPushInfo(userId);
    }

    @Override
    public boolean updateUserPushInfo(UserPushInfo info)
    {
        return this.masterDAO.updateUserPushInfo(info);
    }

    @Override
    public boolean delUserPushInfo(Long userId)
    {
        return this.masterDAO.delUserPushInfo(userId);
    }

    @Override
    public ViewUserSimpleInfo queryViewUserSimpleInfoByImAccount(String imAccount)
    {
        return this.masterDAO.queryViewUserSimpleInfoByImAccount(imAccount);
    }

    @Override
    public Integer queryClassStudentNum(Long classId)
    {
        return this.masterDAO.queryClassStudentNum(classId);
    }

    @Override
    public ViewUserFamilyInfo queryViewUserFamilyInfo(Long userId)
    {
        return this.masterDAO.queryViewUserFamilyInfo(userId);
    }

    @Override
    public List<ViewUserFamilyInfo> queryListViewUserFamilyInfo(Long familyId)
    {
        return this.masterDAO.queryListViewUserFamilyInfo(familyId);
    }

    @Override
    public List<UserBaseInfo> queryUserBaseInfoListByRegistrationId(String registrationId)
    {
        return this.masterDAO.queryUserBaseInfoListByRegistrationId(registrationId);

    }

    @Override
    public ViewUserSimpleInfo queryViewUserSimpleInfoByUserName(String name)
    {
        return this.masterDAO.queryViewUserSimpleInfoByUserName(name);
    }

    @Override
    public List<SysPrivilegeUser> querySysPrivilegeUserByUserId(Long userId)
    {
        return this.masterDAO.querySysPrivilegeUserByUserId(userId);
    }

    @Override
    public FamilyInfo queryFamilyInfo(Long id)
    {
        return this.masterDAO.queryFamilyInfo(id);
    }

    @Override
    public boolean updateFamilyInfo(FamilyInfo info)
    {
        return this.masterDAO.updateFamilyInfo(info);
    }

    @Override
    public UserFamilyInfo queryUserFamilyInfo(Long userId, Long familyId)
    {
        return this.masterDAO.queryUserFamilyInfo(userId, familyId);
    }

    @Override
    public boolean updateUserFamilyInfo(UserFamilyInfo info)
    {
        return this.masterDAO.updateUserFamilyInfo(info);
    }

    @Override
    public List<SysIdDesc> querySysIdDesc()
    {
        return this.masterDAO.querySysIdDesc();
    }

    @Override
    public List<SysPrivilegeDesc> querySysPrivilegeDescBySysId(Integer sysId)
    {
        return this.masterDAO.querySysPrivilegeDescBySysId(sysId);
    }

    @Override
    public List<SysPrivilegeDesc> querySysPrivilegeDesc()
    {
        return this.masterDAO.querySysPrivilegeDesc();
    }

    @Override
    public List<ViewSysPrivilegeDesc> queryViewSysPrivilegeDesc()
    {
        return this.masterDAO.queryViewSysPrivilegeDesc();
    }

    @Override
    public List<SysPrivilegeUser> querySysPrivilegeUserBySchoolId(Integer schoolId)
    {
        return this.masterDAO.querySysPrivilegeUserBySchoolId(schoolId);
    }

    @Override
    public List<ViewSysPrivilegeUser> queryViewSysPrivilegeUserByUserId(Long userId)
    {
        return this.masterDAO.queryViewSysPrivilegeUserByUserId(userId);
    }

    @Override
    public List<ViewSysPrivilegeUser> queryViewSysPrivilegeUser(QueryPrivilegeCondition queryPrivilegeCondition)
    {
        return this.masterDAO.queryViewSysPrivilegeUser(queryPrivilegeCondition);
    }

    @Override
    public List<ViewSysPrivilegeUser> queryViewSysPrivilegeUserBySchoolId(Integer schoolId)
    {
        return this.masterDAO.queryViewSysPrivilegeUserBySchoolId(schoolId);
    }

    @Override
    public boolean addSysPrivilege(Integer schoolId, Long userId, Integer privilegeId)
    {
        return this.masterDAO.addSysPrivilege(schoolId, userId, privilegeId);
    }

    @Override
    public boolean delSysPrivilege(Long userId, Integer privilegeId)
    {
        return this.masterDAO.delSysPrivilege(userId, privilegeId);
    }

    @Override
    public List<TeacherSchoolRoleType> queryTeacherSchoolRoleType()
    {
        return this.masterDAO.queryTeacherSchoolRoleType();
    }

    @Override
    public TeacherSchoolRoleInfo queryTeacherSchoolRoleInfoByUserId(Long userId)
    {
        return this.masterDAO.queryTeacherSchoolRoleInfoByUserId(userId);
    }

    @Override
    public List<ViewSelfInfo> queryViewStudentBaseInfoByStudentId(Long id)
    {
        return this.masterDAO.queryViewStudentBaseInfoByStudentId(id);
    }

    @Override
    public HealthBaseInfo queryHealthBaseInfo(Long userId, String time)
    {
        return this.masterDAO.queryHealthBaseInfo(userId, time);
    }

    @Override
    public List<HealthBaseInfo> queryListHealthBaseInfo(Long userId)
    {
        return this.masterDAO.queryListHealthBaseInfo(userId);
    }

    @Override
    public List<FoodBaseInfo> queryListFoodBaseInfo(Long userId)
    {
        return this.masterDAO.queryListFoodBaseInfo(userId);
    }

    @Override
    public List<FoodBaseInfo> queryListFoodBaseInfo(Long userId, String time)
    {
        return this.masterDAO.queryListFoodBaseInfo(userId, time);
    }

    @Override
    public ViewSelfInfo queryViewStudentBaseInfo(Long userId)
    {
        return this.masterDAO.queryViewStudentBaseInfo(userId);
    }

    @Override
    public ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId, String foodTime)
    {
        return this.masterDAO.queryViewFoodBaseInfo(classId, foodTime);
    }

    @Override
    public List<ViewFoodBaseInfo> queryListViewFoodBaseInfo(Long classId, String startTime, String endTime)
    {
        return this.masterDAO.queryListViewFoodBaseInfo(classId, startTime, endTime);
    }

    @Override
    public boolean addHealthBaseInfo(HealthBaseInfo healthBaseInfo)
    {
        return this.masterDAO.addHealthBaseInfo(healthBaseInfo);
    }

    @Override
    public ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId)
    {
        return this.masterDAO.queryViewFoodBaseInfo(classId);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId, String timeStart, String timeLastUpdate)
    {
        return this.masterDAO.queryListViewUserSimpleInfoByClassIdForTeacher(classId, timeStart, timeLastUpdate);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId, String timeStart, String timeLastUpdate)
    {
        return this.masterDAO.queryListViewUserSimpleInfoByClassIdForParent(classId, timeStart, timeLastUpdate);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId, String timeStart, String timeLastUpdate)
    {
        return this.masterDAO.queryListViewUserSimpleInfoByClassIdForStudent(classId, timeStart, timeLastUpdate);
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoBySchoolIdForTeacher(Integer schoolId, String timeStart, String timeLastUpdate)
    {
        return this.masterDAO.queryListViewUserSimpleInfoBySchoolIdForTeacher(schoolId, timeStart, timeLastUpdate);
    }

    @Override
    public boolean delUserFamilyInfo(UserFamilyInfo userFamilyInfo)
    {
        return this.masterDAO.delUserFamilyInfo(userFamilyInfo);
    }

    @Override
    public boolean updateUserParentInfo(UserParentInfo userParentInfo)
    {
        return this.masterDAO.updateUserParentInfo(userParentInfo);
    }

    @Override
    public boolean delUserParentInfo(Long userId, Long classId)
    {
        return this.masterDAO.delUserParentInfo(userId, classId);
    }

    @Override
    public List<BusLinesInfo> queryListBusLinesInfo(Long busId)
    {
        return this.masterDAO.queryListBusLinesInfo(busId);
    }

    @Override
    public boolean updateBusLinesInfo(List<BusLinesInfo> list)
    {
        return this.masterDAO.updateBusLinesInfo(list);
    }

    @Override
    public List<SchoolBusInfo> queryListSchoolBusInfo(Long id)
    {
        return this.masterDAO.queryListSchoolBusInfo(id);
    }

    @Override
    public boolean delSchoolBusInfo(Long busId)
    {
        return this.masterDAO.delSchoolBusInfo(busId);
    }

    @Override
    public boolean updateFeedBackInfo(FeedBackInfo info)
    {
        return this.masterDAO.updateFeedBackInfo(info);
    }

    @Override
    public AdminUserInfo queryAdminUserInfoByUserName(String userName)
    {
        return this.masterDAO.queryAdminUserInfoByUserName(userName);
    }

    @Override
    public AdminUserInfo queryAdminUserInfo(Long userId)
    {
        return this.masterDAO.queryAdminUserInfo(userId);
    }

    @Override
    public boolean updateAdminUserInfo(AdminUserInfo info)
    {
        return this.masterDAO.updateAdminUserInfo(info);
    }

    @Override
    public AdminUserCookie queryAdminUserCookie(Long userId)
    {
        return this.masterDAO.queryAdminUserCookie(userId);
    }

    @Override
    public boolean updateAdminUserCookie(AdminUserCookie info)
    {
        return this.masterDAO.updateAdminUserCookie(info);
    }

    */
/**
     * 添加公交车路线和站点
     *//*

    @Override
    public String addBusReq(SchoolBusAddReq schoolBusAddReq, Integer schoolId)
    {
        if (schoolBusAddReq == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        SchoolBusInfo schoolBusInfo = schoolBusAddReq.getSchoolBusInfo();
        List<BusLinesInfo> listBusLinesInfo = schoolBusAddReq.getListBusLinesInfo();
        schoolBusInfo.setSchoolId(schoolId);
        if (!masterDAO.updateSchoolBusInfo(schoolBusInfo))
        {
            return ErrorMsgDefs.ADD_BUS_INFO_FAIL;
        }
        if (listBusLinesInfo != null && listBusLinesInfo.size() > 0)
        {
            if (!masterDAO.delBusLinesInfoByBusId(schoolBusInfo.getId()))
            {
                return ErrorMsgDefs.DEL_BUS_LINES_INFO_FAIL;
            }
            for (BusLinesInfo busLinesInfo : listBusLinesInfo)
            {
                String stringEndTime = busLinesInfo.getStringEndTime();
                stringEndTime += ":00";
                Time time = Time.valueOf(stringEndTime);
                if (time == null)
                {
                    return ErrorMsgDefs.ADD_BUS_LINES_INFO_FAIL;
                }
                busLinesInfo.setEndTime(time);
                busLinesInfo.setBusId(schoolBusInfo.getId());
            }

        }
        if (!masterDAO.updateBusLinesInfo(listBusLinesInfo))
        {
            return ErrorMsgDefs.ADD_BUS_LINES_INFO_FAIL;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    */
/**
     * 删除公交车路线
     *//*

    @Override
    public String removeBusReq(SchoolBusRemoveReq schoolBusRemoveReq)
    {
        Long busId = schoolBusRemoveReq.getBusId();
        if (busId == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        if (!masterDAO.delSchoolBusInfo(busId))
        {
            return ErrorMsgDefs.DEL_BUS_INFO_FAIL;
        }
        if (!masterDAO.delBusLinesInfoByBusId(busId))
        {
            return ErrorMsgDefs.DEL_BUS_INFO_FAIL;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    @Override
    public List<SchoolBusInfo> getListBusReq(Integer schoolId)
    {
        return masterDAO.queryListSchoolBusInfoBySchoolId(schoolId);

    }

    @Override
    public List<BusLinesInfo> getListBusLineReq(BusLineListReq busLineListReq)
    {
        Long busId = busLineListReq.getBusId();
        List<BusLinesInfo> list = masterDAO.queryListBusLinesInfo(busId);
        if (list != null && list.size() > 0)
        {
            for (BusLinesInfo busLinesInfo : list)
            {
                Time endTime = busLinesInfo.getEndTime();
                String stringEndTime = endTime.toString();
                int i = stringEndTime.lastIndexOf(":");
                stringEndTime = stringEndTime.substring(0, i);
                busLinesInfo.setStringEndTime(stringEndTime);
            }
        }
        return list;

    }

    @Override
    public String delTeacher(TeacherSimpleInfo teacherSimpleInfo)
    {
        if (teacherSimpleInfo == null || teacherSimpleInfo.getUserId() == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        Long userId = teacherSimpleInfo.getUserId();
        UserBaseInfo userBaseInfo = masterDAO.queryUserBaseInfoByUserId(userId);
        if (userBaseInfo == null)
        {
            return ErrorMsgDefs.NO_EXIST_USER;
        }

        List<UserTeacherInfo> listUserTeacherInfo = masterDAO.queryUserTeacherInfoByUserId(userId);
        if (listUserTeacherInfo == null || listUserTeacherInfo.size() == 0)
        {
            return ErrorMsgDefs.NO_EXIST_USER;
        }
        if (!masterDAO.delUserTeacherInfoByUserId(userBaseInfo.getUserId()))
        {
            return ErrorMsgDefs.DEL_TEACHER_CLASS_INFO;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    @Override
    public String addTeacher(TeacherSimpleInfo teacherSimpleInfo, Integer schoolId)
    {
        String mobilePhone = teacherSimpleInfo.getMobilePhone();
        if (mobilePhone == null || mobilePhone.equals(""))
        {
            return ErrorMsgDefs.NO_ALLOW_NULL_MOBILEPHONE;
        }
        RegReqUserBaseInfo regReqUserBaseInfo = regUserWithMobilePhone(teacherSimpleInfo.getRealName(), mobilePhone, UserRoleDefs.USER_ROLE_TEACHER, teacherSimpleInfo.getSex());
        String result = regReqUserBaseInfo.getResult();
        UserBaseInfo userBaseInfo = regReqUserBaseInfo.getUserBaseInfo();

        if (!result.equals(ErrorMsgDefs.OPR_SUCCESS))
        {
            return ErrorMsgDefs.ADD_USER_BASE_INFO_FAIL;
        }
        if (userBaseInfo == null)
        {
            return ErrorMsgDefs.ADD_USER_BASE_INFO_FAIL;
        }

        if (!masterDAO.delUserTeacherInfoByUserId(userBaseInfo.getUserId()))
        {
            return ErrorMsgDefs.DEL_TEACHER_CLASS_INFO;
        }

        if (!updateTeacherClassInfo(teacherSimpleInfo, schoolId, userBaseInfo.getUserId()))
        {
            return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
        }

        TeacherSchoolRoleInfo teacherSchoolRoleInfo = new TeacherSchoolRoleInfo();
        teacherSchoolRoleInfo.setRoleId(6);
        teacherSchoolRoleInfo.setSchoolId(schoolId);
        teacherSchoolRoleInfo.setUserId(userBaseInfo.getUserId());
        if (!masterDAO.updateTeacherSchoolRoleInfo(teacherSchoolRoleInfo))
        {
            return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    public boolean updateTeacherClassInfo(TeacherSimpleInfo teacherSimpleInfo, Integer schoolId, Long userId)
    {

        List<ViewUserTeacherInfo> listViewUserTeacherInfo = teacherSimpleInfo.getListViewUserTeacherInfo();
        if (listViewUserTeacherInfo != null && listViewUserTeacherInfo.size() > 0)
        {
            List<RegClassCourseInfo> listRegClassCourseInfo = new ArrayList<RegClassCourseInfo>();
            for (int i = 0; i < listViewUserTeacherInfo.size(); i++)
            {
                ViewUserTeacherInfo viewUserTeacherInfo = listViewUserTeacherInfo.get(i);
                if (null != viewUserTeacherInfo && null != viewUserTeacherInfo.getGradeNo() && null != viewUserTeacherInfo.getClassNo())
                {
                    RegClassCourseInfo regClassCourseInfo = new RegClassCourseInfo();
                    regClassCourseInfo.setGradeNo(viewUserTeacherInfo.getGradeNo());
                    regClassCourseInfo.setClassNo(viewUserTeacherInfo.getClassNo());
                    listRegClassCourseInfo.add(regClassCourseInfo);
                }
            }

            if (listRegClassCourseInfo.size() > 0)
            {
                if (!updateTeacherClassInfo(userId, schoolId, listRegClassCourseInfo).equals(ErrorMsgDefs.OPR_SUCCESS))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public String updateTeacherClassInfo(Long userId, Long classId)
    {
        UserTeacherInfo userTeacherInfo = new UserTeacherInfo();
        userTeacherInfo.setId(null);
        userTeacherInfo.setUserId(userId);
        userTeacherInfo.setClassId(classId);
        userTeacherInfo.setCreateTime(BasicUtils.getCurrentTime());
        userTeacherInfo.setLastUpdateTime(BasicUtils.getCurrentTime());

        if (false == masterDAO.delUserTeacherInfoByUserId(userId))
        {
            return ErrorMsgDefs.DEL_TEACHER_CLASS_INFO;
        }

        if (false == masterDAO.updateUserTeacherInfo(userTeacherInfo))
        {
            return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    @Override
    public List<ViewUserTeacherInfo> queryListViewUserTeacherInfo(QueryTeacherCondition condition, PageSelectInfo pageSelectInfo)
    {
        return this.schoolDAO.queryListViewUserTeacherInfo(condition, pageSelectInfo);
    }

    @Override
    public List<ViewUserStudentInfo> queryListViewUserStudentInfo(QueryStudentCondition condition, PageSelectInfo pageSelectInfo)
    {
        return this.schoolDAO.queryListViewUserStudentInfo(condition, pageSelectInfo);
    }

    // 建立教师班级关联表
    @Override
    public String updateTeacherClassInfo(Long userId, Integer schoolId, List<RegClassCourseInfo> listRegClassCourseInfo)
    {
        if (listRegClassCourseInfo != null && listRegClassCourseInfo.size() > 0)
        {
            List<UserTeacherInfo> listUserTeacherInfo_Reset = new ArrayList<UserTeacherInfo>();
            for (int i = 0; i < listRegClassCourseInfo.size(); i++)
            {
                RegClassCourseInfo regClassCourseInfo = listRegClassCourseInfo.get(i);
                if (null != regClassCourseInfo && null != regClassCourseInfo.getGradeNo() && null != regClassCourseInfo.getClassNo())
                {
                    ClassBaseInfo classBaseInfo = schoolDAO.queryClassBaseInfo(schoolId, regClassCourseInfo.getGradeNo(), regClassCourseInfo.getClassNo());
                    if (classBaseInfo == null)
                    {
                        classBaseInfo = new ClassBaseInfo();
                        classBaseInfo.setClassNo(regClassCourseInfo.getClassNo());
                        classBaseInfo.setGradeNo(regClassCourseInfo.getGradeNo());
                        classBaseInfo.setSchoolId(schoolId);
                        classBaseInfo.setIsDel(false);
                        classBaseInfo.setStudentNum(0);
                        classBaseInfo.setUpdateTime(BasicUtils.getCurrentTime());
                        classBaseInfo.setInviteCode(BasicUtils.getIntegerRandomNumber());
                        if (false == schoolDAO.updateClassBaseInfo(classBaseInfo))
                        {
                            return ErrorMsgDefs.ADD_CLASS_INFO_FAIL;

                        }
                    }
                    UserTeacherInfo userTeacherInfo = new UserTeacherInfo();
                    userTeacherInfo.setId(null);
                    userTeacherInfo.setUserId(userId);
                    userTeacherInfo.setClassId(classBaseInfo.getId());
                    userTeacherInfo.setCreateTime(BasicUtils.getCurrentTime());
                    userTeacherInfo.setLastUpdateTime(BasicUtils.getCurrentTime());
                    listUserTeacherInfo_Reset.add(userTeacherInfo);
                }
            }

            if (false == masterDAO.delUserTeacherInfoByUserId(userId))
            {
                return ErrorMsgDefs.DEL_TEACHER_CLASS_INFO;
            }
            if (listUserTeacherInfo_Reset.size() > 0)
            {
                if (false == masterDAO.updateUserTeacherInfo(listUserTeacherInfo_Reset))
                {
                    return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
                }
            }
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    @Override
    public String updateTeacherClassInfo(TeacherSimpleInfo teacherSimpleInfo, Long userId, Integer schoolId)
    {
        List<ViewUserTeacherInfo> listViewUserTeacherInfo = teacherSimpleInfo.getListViewUserTeacherInfo();
        if (listViewUserTeacherInfo != null && listViewUserTeacherInfo.size() > 0)
        {
            List<RegClassCourseInfo> listRegClassCourseInfo = new ArrayList<RegClassCourseInfo>();
            for (int i = 0; i < listViewUserTeacherInfo.size(); i++)
            {
                ViewUserTeacherInfo viewUserTeacherInfo = listViewUserTeacherInfo.get(i);
                if (null != viewUserTeacherInfo && null != viewUserTeacherInfo.getGradeNo() && null != viewUserTeacherInfo.getClassNo())
                {
                    RegClassCourseInfo regClassCourseInfo = new RegClassCourseInfo();
                    regClassCourseInfo.setGradeNo(viewUserTeacherInfo.getGradeNo());
                    regClassCourseInfo.setClassNo(viewUserTeacherInfo.getClassNo());
                    listRegClassCourseInfo.add(regClassCourseInfo);
                }
            }

            if (listRegClassCourseInfo.size() > 0)
            {
                String result = updateTeacherClassInfo(userId, schoolId, listRegClassCourseInfo);
                if (!result.equals(ErrorMsgDefs.OPR_SUCCESS))
                {
                    return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
                }
                return result;
            }
        }
        return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
    }

    private RegReqUserBaseInfo regUserWithMobilePhone(String realName, String mobilePhone, Integer role, Boolean sex)
    {
        RegReqUserBaseInfo regReqUserBaseInfo = new RegReqUserBaseInfo();

        if (mobilePhone != null && !mobilePhone.equals("") && mobilePhone.length() > 8)
        {
            String pwd = BasicUtils.getIntegerRandomNumber().toString();
            String password = MD5Utils.string2MD5("a!#@!$1f" + pwd + "a!#@!$1f");
            regReqUserBaseInfo.setPassword(password);
            return regUser(realName, mobilePhone, mobilePhone, password, role, sex, null);
        }
        regReqUserBaseInfo.setResult(ErrorMsgDefs.REQ_PARAMETER_DECODE_ERROR);
        return regReqUserBaseInfo;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String regUser(RegReqInfo regReqInfo, Boolean isWeb, Integer teacherRole, SchoolInfo schoolInfo, Integer schoolId)
    {
        if (regReqInfo == null)
        {
            return ErrorMsgDefs.REQ_PARAMETER_DECODE_ERROR;
        }
        String realName = regReqInfo.getRealName();
        String mobilePhone = regReqInfo.getMobilePhone();
        String password = regReqInfo.getPassword();
        String smsCode = regReqInfo.getSmsVerificationCode();
        RegChildrenInfo regChildrenInfo = regReqInfo.getRegChildrenInfo();
        Long studentId = null;
        if (regChildrenInfo != null)
        {
            studentId = regReqInfo.getRegChildrenInfo().getStudentId();
        }
        Integer role = regReqInfo.getRole();
        Boolean sex = regReqInfo.getSex();
        Integer addrCityId = regReqInfo.getAddrCityId();
        String inviteCode = regReqInfo.getInviteCode();
        Long headPicId = regReqInfo.getHeadPicId();
        RegClassCourseInfo regClassCourseInfo = regReqInfo.getRegClassCourseInfo();

        if (realName == null || realName.equals("") || mobilePhone == null || mobilePhone.equals("") || password == null || password.equals("") || role == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        if (role.equals(UserRoleDefs.USER_ROLE_TEACHER))
        {
            if ((inviteCode == null || inviteCode.equals("")) && (regClassCourseInfo == null || regClassCourseInfo.getGradeNo() == null || regClassCourseInfo.getClassNo() == null))
            {
                return ErrorMsgDefs.REQ_ERROR_PARAMETER;
            }
        }
        else if (role.equals(UserRoleDefs.USER_ROLE_PARENT))
        {
            if (regChildrenInfo == null || regChildrenInfo.getStudentId() == null || regChildrenInfo.getInviteCode() == null)
            {
                return ErrorMsgDefs.REQ_ERROR_PARAMETER;
            }
        }
        else
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }

        // 确认此手机是否允许注册
        if (true == masterDAO.isExistMobilePhoneAlreadReg(mobilePhone))
        {
            return ErrorMsgDefs.ALREADY_EXIST_MOBILEPHONE;
        }
        if (!isWeb)
        {
            SmsVerificationCode smsVerificationCode = masterDAO.querySmsVerificationCode(mobilePhone, CommDefs.SMS_VERIFICATION_CODE_TYPE_REG);
            if (smsVerificationCode == null || smsVerificationCode.getCode() == null || !smsVerificationCode.getCode().equals(smsCode))
            {
                return ErrorMsgDefs.NO_EXIST_VERIFICATION_CODE;
            }
        }

        // 如果是老师
        if (role.equals(UserRoleDefs.USER_ROLE_TEACHER))
        {
            UserBaseInfo userBaseInfo = new UserBaseInfo();
            // 注册用户信息
            RegReqUserBaseInfo regReqUserBaseInfo = regUser(realName, mobilePhone, mobilePhone, password, role, sex, headPicId, userBaseInfo);
            String result = regReqUserBaseInfo.getResult();
            userBaseInfo = regReqUserBaseInfo.getUserBaseInfo();
            if (!result.equals(ErrorMsgDefs.OPR_SUCCESS) || userBaseInfo == null || userBaseInfo.getUserId() == null)
            {
                return ErrorMsgDefs.ADD_USER_BASE_INFO_FAIL;
            }
            if (schoolInfo == null)
            {
                schoolInfo = new SchoolInfo();
            }
            if (teacherRole.equals(UserRoleDefs.USER_ROLE_PURE_TEACHER))
            {
                ClassBaseInfo classBaseInfo = null;
                if (inviteCode != null)
                {
                    // 确定班级邀请码是否正确
                    classBaseInfo = getClassBaseInfoFromInviteCode(inviteCode);
                }
                else
                {
                    classBaseInfo = schoolDAO.queryClassBaseInfo(schoolId, regClassCourseInfo.getGradeNo(), regClassCourseInfo.getClassNo());
                }

                if (classBaseInfo == null)
                {
                    // 事务回滚
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    return ErrorMsgDefs.NO_EXIST_CLASS_INVITE_CODE;
                }
                // 确定学校邀请码是否正确
                if (schoolId != null && isWeb)
                {
                    schoolInfo = schoolDAO.querySchoolInfo(schoolId);
                }
                else
                {
                    schoolInfo = getSchoolInfoFromInviteCode(addrCityId, inviteCode);
                }
                if (schoolInfo == null)
                {
                    // 事务回滚
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    return ErrorMsgDefs.NO_EXIST_SCHOOL_INVITE_CODE;
                }
                // 添加老师课程关联表

                if (!updateTeacherClassInfo(userBaseInfo.getUserId(), classBaseInfo.getId()).equals(ErrorMsgDefs.OPR_SUCCESS))
                {
                    // 事务回滚
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
                }
            }
            else if (teacherRole.equals(UserRoleDefs.USER_ROLE_DIRECTOR))
            {
                if (!schoolDAO.updateSchoolInfo(schoolInfo))
                {
                    // 事务回滚
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    return ErrorMsgDefs.ADD_SCHOOL_INFO_FAIL;
                }
            }
            // 设置老师角色
            TeacherSchoolRoleInfo teacherSchoolRoleInfo = new TeacherSchoolRoleInfo(userBaseInfo.getUserId(), schoolInfo.getId(), teacherRole);
            if (!masterDAO.updateTeacherSchoolRoleInfo(teacherSchoolRoleInfo))
            {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ErrorMsgDefs.ADD_TEACHER_CLASS_INFO;
            }
            return ErrorMsgDefs.OPR_SUCCESS;
        }
        // 如果是家长
        else if (role.equals(UserRoleDefs.USER_ROLE_PARENT))
        {
            // 注册家长账号
            UserBaseInfo userBaseInfoParent = new UserBaseInfo();
            RegReqUserBaseInfo regReqUserBaseInfo = regUser(realName, mobilePhone, mobilePhone, password, UserRoleDefs.USER_ROLE_PARENT, sex, headPicId, userBaseInfoParent);
            String result = regReqUserBaseInfo.getResult();
            userBaseInfoParent = regReqUserBaseInfo.getUserBaseInfo();
            String familyRoleName = regReqInfo.getFamilyRoleName();
            if (!result.equals(ErrorMsgDefs.OPR_SUCCESS) || userBaseInfoParent == null || userBaseInfoParent.getUserId() == null || familyRoleName == null)
            {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ErrorMsgDefs.ADD_PARENT_INFO;
            }
            // 新增家庭
            FamilyInfo familyInfo = new FamilyInfo();
            familyInfo.setName(String.format("%s的家", realName));
            if (!masterDAO.updateFamilyInfo(familyInfo) || familyInfo == null || familyInfo.getId() == null)
            {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ErrorMsgDefs.ADD_USER_FAMILIY_FAIL;
            }

            // 登陆添加家长角色信息
            FamilyRoleType familyRoleType = new FamilyRoleType(familyRoleName);
            if (!masterDAO.updateFamilyRoleType(familyRoleType) || familyRoleType == null)
            {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ErrorMsgDefs.ADD_USER_FAMILIY_FAIL;
            }
            // 新增家长家庭关系
            UserFamilyInfo userFamilyInfoParent = new UserFamilyInfo();
            UserFamilyInfoId id = new UserFamilyInfoId();
            id.setUserId(userBaseInfoParent.getUserId());
            id.setFamilyId(familyInfo.getId());
            userFamilyInfoParent.setId(id);
            userFamilyInfoParent.setFamilyRoleTypeId(familyRoleType.getId());
            if (false == masterDAO.updateUserFamilyInfo(userFamilyInfoParent))
            {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ErrorMsgDefs.ADD_FAMILIY_FAIL;

            }
            AddChildReqInfo req = new AddChildReqInfo();
            regChildrenInfo.setStudentId(studentId);
            req.setFamilyId(familyInfo.getId());
            req.setMobilePhone(mobilePhone);
            req.setRegChildrenInfo(regChildrenInfo);
            req.setParentId(userBaseInfoParent.getUserId());
            if (regChildrenInfo.getUserId() == null || regChildrenInfo.getClassId() == null)
            {
                CheckChildrenRsp rsp = checkStudentReq(regChildrenInfo.getInviteCode(), regChildrenInfo.getStudentId());
                if (rsp == null || rsp.getUserId() == null || rsp.getClassId() == null)
                {
                    // 事务回滚
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    return ErrorMsgDefs.NO_EXIST_USERNAME;
                }
                regChildrenInfo.setUserId(rsp.getUserId());
                regChildrenInfo.setClassId(rsp.getClassId());

            }
            if (!regStudentInfo(req).equals(ErrorMsgDefs.OPR_SUCCESS))
            {
                // 事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ErrorMsgDefs.ADD_STUDENT_CLASS_INFO;
            }
            return ErrorMsgDefs.OPR_SUCCESS;
        }
        return ErrorMsgDefs.REQ_PARAMETER_DECODE_ERROR;
    }

    @Override
    public CheckChildrenRsp checkStudentReq(String inviteCode, Long studentId)
    {
        // 确定班级邀请码是否正确
        ClassBaseInfo classBaseInfo = getClassBaseInfoFromInviteCode(inviteCode);
        if (classBaseInfo == null)
        {
            return null;
        }

        UserStudentInfo userStudentInfo = masterDAO.queryUserStudentInfo(classBaseInfo.getId(), studentId);
        if (userStudentInfo == null)
        {
            return null;
        }
        CheckChildrenRsp rsp = new CheckChildrenRsp();
        rsp.setClassId(classBaseInfo.getId());
        rsp.setUserId(userStudentInfo.getUserId());
        return rsp;
    }

    @Override
    public String regStudentInfo(AddChildReqInfo reqValue)
    {
        RegChildrenInfo regChildrenInfo = reqValue.getRegChildrenInfo();
        if (regChildrenInfo == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        Long familyId = reqValue.getFamilyId();
        Long parentId = reqValue.getParentId();
        if (regChildrenInfo.getUserId() == null || regChildrenInfo.getClassId() == null)
        {
            CheckChildrenRsp rsp = checkStudentReq(regChildrenInfo.getInviteCode(), regChildrenInfo.getStudentId());
            if (rsp == null || rsp.getClassId() == null)
            {
                return ErrorMsgDefs.NO_EXIST_CLASS_INVITE_CODE;
            }
            regChildrenInfo.setClassId(rsp.getClassId());
            regChildrenInfo.setUserId(rsp.getUserId());
        }
        // 确认小孩可以合法
        UserBaseInfo userBaseInfoChildren = masterDAO.queryUserBaseInfoByUserId(regChildrenInfo.getUserId());
        if (userBaseInfoChildren == null)
        {
            return ErrorMsgDefs.NO_EXIST_STUDENTNOMBER;
        }
        // 修改孩子基本信息
        String mobilePhone = userBaseInfoChildren.getMobilePhone();
        userBaseInfoChildren.setMobilePhone(mobilePhone);
        if (!masterDAO.updateUserBaseInfo(userBaseInfoChildren))
        {
            return ErrorMsgDefs.ADD_USER_BASE_INFO_FAIL;
        }
        // 新增孩子家庭关系
        UserFamilyInfo userFamilyInfoChildren = new UserFamilyInfo();
        UserFamilyInfoId id = new UserFamilyInfoId();
        id.setUserId(userBaseInfoChildren.getUserId());
        id.setFamilyId(familyId);
        userFamilyInfoChildren.setId(id);
        userFamilyInfoChildren.setFamilyRoleTypeId(UserRoleDefs.USER_FAMILY_ROLE_SON);
        if (!masterDAO.updateUserFamilyInfo(userFamilyInfoChildren))
        {
            return ErrorMsgDefs.ADD_USER_FAMILIY_FAIL;
        }
        // 将家长加入班级
        UserParentInfo userParentInfo = new UserParentInfo();
        userParentInfo.setStudentId(userBaseInfoChildren.getUserId());
        userParentInfo.setClassId(regChildrenInfo.getClassId());
        userParentInfo.setCreateTime(BasicUtils.getCurrentTime());
        userParentInfo.setLastUpdateTime(BasicUtils.getCurrentTime());
        userParentInfo.setUserId(parentId);
        userParentInfo.setIsDel(false);
        List<UserParentInfo> listUserParentInfo = masterDAO.queryUserParentInfoByUserIdAndStudentId(parentId, userBaseInfoChildren.getUserId());
        if(listUserParentInfo != null && listUserParentInfo.size() > 0 && listUserParentInfo.get(0) != null)
        {
            userParentInfo.setId(listUserParentInfo.get(0).getId());
        }
        if (!masterDAO.updateUserParentInfo(userParentInfo))
        {
            return ErrorMsgDefs.ADD_STUDENT_CLASS_INFO;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    public ClassBaseInfo getClassBaseInfoFromInviteCode(String inviteCode)
    {
        if (inviteCode == null || inviteCode.equals(""))
        {
            return null;
        }

        List<ClassBaseInfo> listClassBaseInfo = schoolDAO.queryListClassBaseInfoByInviteCode(inviteCode);
        if (listClassBaseInfo != null && listClassBaseInfo.size() > 0)
        {
            for (int i = 0; i < listClassBaseInfo.size(); i++)
            {
                ClassBaseInfo classBaseInfo = listClassBaseInfo.get(i);
                if (null != classBaseInfo && null != classBaseInfo.getIsDel() && classBaseInfo.getIsDel().equals(false) && null != classBaseInfo.getSchoolId())
                {
                    SchoolInfo schoolInfo = schoolDAO.querySchoolInfo(classBaseInfo.getSchoolId());
                    if (null != schoolInfo && null != schoolInfo.getIsDel() && schoolInfo.getIsDel().equals(false))
                    {
                        return classBaseInfo;
                    }
                }
            }
        }
        return null;
    }

    public SchoolInfo getSchoolInfoFromInviteCode(Integer addrCityId, String inviteCode)
    {
        if (addrCityId == null || inviteCode == null || inviteCode.equals(""))
        {
            return null;
        }

        List<SchoolInfo> listSchoolInfo = schoolDAO.queryListSchoolInfoByInviteCode(inviteCode);
        if (listSchoolInfo != null && listSchoolInfo.size() > 0)
        {
            for (int i = 0; i < listSchoolInfo.size(); i++)
            {
                SchoolInfo schoolInfo = listSchoolInfo.get(i);
                if (null != schoolInfo && null != schoolInfo.getIsDel() && schoolInfo.getIsDel().equals(false) && null != schoolInfo.getAddrCountyId() && schoolInfo.getAddrCityId().equals(addrCityId))
                {
                    return schoolInfo;
                }
            }
        }
        return null;
    }

    // web端录入或更新学生
    @Override
    public String updateStudentInfo(StudentSimpleInfo studentSimpleInfo, Integer schoolId)
    {

        // 查找新的班级
        ClassBaseInfo classBaseInfo = schoolDAO.queryClassBaseInfo(schoolId, studentSimpleInfo.getGradeNo(), studentSimpleInfo.getClassNo());
        if (classBaseInfo == null)
        {
            return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
        }
        Long userId = studentSimpleInfo.getUserId();
        UserBaseInfo userBaseInfo = null;
        UserStudentInfo userStudentInfo = new UserStudentInfo();
        Long studentId = studentSimpleInfo.getStudentId();
        List<UserStudentInfo> listUserStudentInfo = masterDAO.queryUserStudentInfoByStudentId(schoolId, studentId);
        // userId为空，为添加学生,生成userBaseInfo
        if (userId == null)
        {
            // 注册操作
            if (listUserStudentInfo == null || listUserStudentInfo.size() == 0)
            {
                userBaseInfo = new UserBaseInfo();
                userBaseInfo.setSex(studentSimpleInfo.getSex());
                userBaseInfo.setMobilePhone(studentSimpleInfo.getMobilePhone());
                int i = 20 - schoolId.toString().length();
                userBaseInfo.setUserName(String.valueOf(String.format("%d%0" + i + "d", schoolId, studentSimpleInfo.getStudentId())));
                userBaseInfo.setRealName(studentSimpleInfo.getRealName());
                userBaseInfo.setRole(2);
                userBaseInfo.setRegFlag(true);
                userBaseInfo.setRegTime(BasicUtils.getCurrentTime());
                userBaseInfo.setUpdateTime(BasicUtils.getCurrentTime());
                if (false == masterDAO.updateUserBaseInfo(userBaseInfo))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;

                }
                userStudentInfo.setClassId(classBaseInfo.getId());
                userStudentInfo.setCreateTime(BasicUtils.getCurrentTime());
                userStudentInfo.setSchoolId(schoolId);
                userStudentInfo.setStudentId(studentId);
                userStudentInfo.setUserId(userBaseInfo.getUserId());
                if (false == masterDAO.updateUserStudentInfo(userStudentInfo))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
                Integer studentNum = classBaseInfo.getStudentNum();
                studentNum += 1;
                classBaseInfo.setStudentNum(studentNum);
                if (!schoolDAO.updateClassBaseInfo(classBaseInfo))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
                Timestamp currentTime = BasicUtils.getCurrentTime();
                CardChildInfo cardChildInfo = new CardChildInfo(userBaseInfo.getUserId(), schoolId, currentTime, currentTime, false);
                if (!masterDAO.updateCardChildInfo(cardChildInfo))
                {
                    return ErrorMsgDefs.ADD_USER_FAMILIY_FAIL;
                }
                // 学校用户已注册，为转班级操作
            }
            else
            {
                if (userId == null)
                {
                    UserStudentInfo userStudentInfo2 = listUserStudentInfo.get(0);
                    userId = userStudentInfo2.getUserId();
                }
                // 转班之前的班级id
                Long classId = null;
                for (UserStudentInfo userStudentInfoSave : listUserStudentInfo)
                {
                    if (userStudentInfoSave.getDelTime() == null)
                    {
                        classId = userStudentInfoSave.getClassId();
                    }
                }
                Integer studentNumSave = null;
                ClassBaseInfo classBaseInfoSave = null;
                if (classId != null)
                {
                    // 查找修改前的班级
                    classBaseInfoSave = schoolDAO.queryClassBaseInfo(classId);

                    if (classBaseInfoSave != null)
                    {
                        studentNumSave = classBaseInfoSave.getStudentNum();
                    }
                }
                else
                {
                    // 新班级人数加一
                    Integer studentNum = classBaseInfo.getStudentNum();
                    studentNum += 1;
                    classBaseInfo.setStudentNum(studentNum);
                    if (!schoolDAO.updateClassBaseInfo(classBaseInfo))
                    {
                        return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                    }
                    userStudentInfo.setSchoolId(schoolId);
                    userStudentInfo.setUserId(userId);
                    userStudentInfo.setClassId(classBaseInfo.getId());
                    userStudentInfo.setStudentId(studentSimpleInfo.getStudentId());
                    userStudentInfo.setCreateTime(BasicUtils.getCurrentTime());
                    if (false == masterDAO.updateUserStudentInfo(userStudentInfo))
                    {
                        return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                    }
                }

                // 该学生已在此班级存在
                if (classBaseInfo.getId().equals(classId))
                {
                    return ErrorMsgDefs.USER_REGISTED;
                }
                // 有转班
                else
                {
                    // 老班级人数减一
                    studentNumSave -= 1;
                    classBaseInfoSave.setStudentNum(studentNumSave);
                    if (!schoolDAO.updateClassBaseInfo(classBaseInfoSave))
                    {
                        return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                    }
                    // 新班级人数加一
                    Integer studentNum = classBaseInfo.getStudentNum();
                    studentNum += 1;
                    classBaseInfo.setStudentNum(studentNum);
                    if (!schoolDAO.updateClassBaseInfo(classBaseInfo))
                    {
                        return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                    }
                    userStudentInfo.setSchoolId(schoolId);
                    userStudentInfo.setUserId(userId);
                    userStudentInfo.setClassId(classBaseInfo.getId());
                    userStudentInfo.setStudentId(studentSimpleInfo.getStudentId());
                    userStudentInfo.setCreateTime(BasicUtils.getCurrentTime());
                    if (false == masterDAO.updateUserStudentInfo(userStudentInfo))
                    {
                        return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                    }
                }
            }
        }
        // 更新操作
        else
        {
            userBaseInfo = masterDAO.queryUserBaseInfoByUserId(userId);
            if (userBaseInfo == null)
            {
                return ErrorMsgDefs.NO_EXIST_USER;
            }
            if(listUserStudentInfo != null && listUserStudentInfo.size() > 0)
            {
                for (UserStudentInfo userStudentInfo2 : listUserStudentInfo)
                {
                    if(!userId.equals(userStudentInfo2.getUserId()))
                    {
                        return ErrorMsgDefs.STUDENT_NUMBER_EXIST;
                    }
                }
            }
            userBaseInfo.setSex(studentSimpleInfo.getSex());
            userBaseInfo.setMobilePhone(studentSimpleInfo.getMobilePhone());
            int i = 20 - schoolId.toString().length();
            userBaseInfo.setUserName(String.valueOf(String.format("%d%0" + i + "d", schoolId, studentSimpleInfo.getStudentId())));
            userBaseInfo.setRealName(studentSimpleInfo.getRealName());
            userBaseInfo.setUpdateTime(BasicUtils.getCurrentTime());
            if (false == masterDAO.updateUserBaseInfo(userBaseInfo))
            {
                return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;

            }
            // 转班之前的班级id
            Long classId = null;
            UserStudentInfo userStudentInfoSave = masterDAO.queryUserStudentInfoByUserId(userId);
            if (userStudentInfoSave.getDelTime() == null)
            {
                classId = userStudentInfoSave.getClassId();
            }
            Integer studentNumSave = null;
            ClassBaseInfo classBaseInfoSave = null;
            // 转班前班级
            if (classId != null)
            {
                // 查找修改前的班级
                classBaseInfoSave = schoolDAO.queryClassBaseInfo(classId);

                if (classBaseInfoSave != null)
                {
                    // 转班前人数
                    studentNumSave = classBaseInfoSave.getStudentNum();
                }
            }
            else
            {
                // 新班级人数加一
                Integer studentNum = classBaseInfo.getStudentNum();
                studentNum += 1;
                classBaseInfo.setStudentNum(studentNum);
                if (!schoolDAO.updateClassBaseInfo(classBaseInfo))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
                userStudentInfo.setSchoolId(schoolId);
                userStudentInfo.setUserId(userId);
                userStudentInfo.setClassId(classBaseInfo.getId());
                userStudentInfo.setStudentId(studentSimpleInfo.getStudentId());
                userStudentInfo.setCreateTime(BasicUtils.getCurrentTime());
                if (false == masterDAO.updateUserStudentInfo(userStudentInfo))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
            }

            // 该学生已在此班级存在
            if (classBaseInfo.getId().equals(classId))
            {
                userStudentInfoSave.setStudentId(studentSimpleInfo.getStudentId());
                if (!masterDAO.updateUserStudentInfo(userStudentInfoSave))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
                return ErrorMsgDefs.OPR_SUCCESS;
            }
            // 有转班
            else
            {
                // 老班级人数减一
                studentNumSave -= 1;
                classBaseInfoSave.setStudentNum(studentNumSave);
                if (!schoolDAO.updateClassBaseInfo(classBaseInfoSave))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
                // 新班级人数加一
                Integer studentNum = classBaseInfo.getStudentNum();
                studentNum += 1;
                classBaseInfo.setStudentNum(studentNum);
                if (!schoolDAO.updateClassBaseInfo(classBaseInfo))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
                if (!masterDAO.delUserStudentInfo(userId))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
                userStudentInfo.setSchoolId(schoolId);
                userStudentInfo.setUserId(userId);
                userStudentInfo.setClassId(classBaseInfo.getId());
                userStudentInfo.setStudentId(studentSimpleInfo.getStudentId());
                userStudentInfo.setCreateTime(BasicUtils.getCurrentTime());
                if (!masterDAO.updateUserStudentInfo(userStudentInfo))
                {
                    return ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL;
                }
            }
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    public String newUser(String realName, String userName, String mobilePhone, String password, Integer role, Boolean sex, Long headPicId, UserBaseInfo userBaseInfo)
    {
        if (mobilePhone != null && !mobilePhone.equals(""))
        {
            UserBaseInfo userBaseInfoSave = masterDAO.queryUserBaseInfoByUserNameAndMobilePhone(userName, mobilePhone);
            if (userBaseInfoSave != null && userBaseInfoSave.getRegFlag().equals(true))
            {
                return ErrorMsgDefs.ALREADY_EXIST_MOBILEPHONE;
            }

            if (userBaseInfo == null)
            {
                userBaseInfo = new UserBaseInfo();
            }
            if (userBaseInfoSave != null)
            {
                userBaseInfo.setUserId(userBaseInfoSave.getUserId());
            }
            userBaseInfo.setRealName(realName);
            userBaseInfo.setUserName(userName);
            userBaseInfo.setMobilePhone(mobilePhone);
            userBaseInfo.setRole(role);
            userBaseInfo.setRegFlag(false);
            userBaseInfo.setSex(sex);
            userBaseInfo.setHeadPicId(headPicId);
            if (userBaseInfo.getSex() == null)
            {
                userBaseInfo.setSex(true);
            }
            userBaseInfo.setRegTime(BasicUtils.getCurrentTime());
            userBaseInfo.setUpdateTime(BasicUtils.getCurrentTime());
            userBaseInfo.setHeadPicId((long) 0);
            if (false == masterDAO.updateUserBaseInfo(userBaseInfo))
            {
                return ErrorMsgDefs.ADD_USER_BASE_INFO_FAIL;
            }
            if (userBaseInfo == null || userBaseInfo.getUserId() == null)
            {
                return ErrorMsgDefs.ADD_USER_BASE_INFO_FAIL;
            }
            UserPasswordInfo userPasswordInfo = new UserPasswordInfo();
            if (password != null)
            {
                userPasswordInfo.setPassword(password);
            }
            userPasswordInfo.setUserId(userBaseInfo.getUserId());
            userPasswordInfo.setUpdateTime(BasicUtils.getCurrentTime());
            if (false == masterDAO.updateUserPasswordInfo(userPasswordInfo))
            {
                return ErrorMsgDefs.ADD_USER_PASSWORD_INFO;
            }
            return ErrorMsgDefs.OPR_SUCCESS;
        }
        return ErrorMsgDefs.REQ_PARAMETER_DECODE_ERROR;
    }

    private RegReqUserBaseInfo regUser(String realName, String userName, String mobilePhone, String password, Integer role, Boolean sex, Long headPicId)
    {
        return regUser(realName, userName, mobilePhone, password, role, sex, headPicId, null);
    }

    private RegReqUserBaseInfo regUser(String realName, String userName, String mobilePhone, String password, Integer role, Boolean sex, Long headPicId, UserBaseInfo userBaseInfo)
    {
        RegReqUserBaseInfo regReqUserBaseInfo = new RegReqUserBaseInfo();
        userBaseInfo = new UserBaseInfo();
        if (mobilePhone != null && !mobilePhone.equals(""))
        {
            UserBaseInfo userBaseInfoSave = masterDAO.queryUserBaseInfoByUserNameAndMobilePhone(userName, mobilePhone);
            if (userBaseInfoSave != null && userBaseInfoSave.getRegFlag().equals(true))
            {
                regReqUserBaseInfo.setResult(ErrorMsgDefs.ALREADY_EXIST_MOBILEPHONE);
                return regReqUserBaseInfo;
            }

            if (!newUser(realName, userName, mobilePhone, password, role, sex, headPicId, userBaseInfo).equals(ErrorMsgDefs.OPR_SUCCESS))
            {
                regReqUserBaseInfo.setResult(ErrorMsgDefs.ADD_USER_BASE_INFO_FAIL);
                return regReqUserBaseInfo;
            }
            userBaseInfo.setRegFlag(true);
            if (false == masterDAO.updateUserBaseInfo(userBaseInfo))
            {
                regReqUserBaseInfo.setResult(ErrorMsgDefs.UPDATE_USER_BASE_INFO_FAIL);
                return regReqUserBaseInfo;
            }
            regReqUserBaseInfo.setResult(ErrorMsgDefs.OPR_SUCCESS);
            regReqUserBaseInfo.setUserBaseInfo(userBaseInfo);
            return regReqUserBaseInfo;
        }
        regReqUserBaseInfo.setResult(ErrorMsgDefs.REQ_PARAMETER_DECODE_ERROR);
        return regReqUserBaseInfo;
    }

    @Override
    public List<Integer> getListSchoolId(LoginUserInfo loginUserInfo, Long studentId)
    {

        List<Integer> listSchoolId = new ArrayList<Integer>();
        Integer userRoleType = loginUserInfo.getUserBaseInfo().getRole();
        if (userRoleType.equals(UserRoleDefs.USER_ROLE_TEACHER))
        {
            List<ViewUserTeacherInfo> listViewUserTeacherInfo = loginUserInfo.getListViewUserTeacherInfo();
            if (listViewUserTeacherInfo != null)
            {
                if (listViewUserTeacherInfo.size() > 0 && listViewUserTeacherInfo.get(0) != null)
                {
                    listSchoolId.add(listViewUserTeacherInfo.get(0).getSchoolId());
                }
            }
        }
        else if (userRoleType.equals(UserRoleDefs.USER_ROLE_PARENT))
        {
            List<FamilyMemberInfo> listFamilyMemberInfo = loginUserInfo.getListFamilyMemberInfo();
            if (listFamilyMemberInfo != null)
            {
                if (listFamilyMemberInfo.size() > 0)
                {
                    for (int i = 0; i < listFamilyMemberInfo.size(); i++)
                    {
                        FamilyMemberInfo familyMemberInfo = listFamilyMemberInfo.get(i);
                        if (familyMemberInfo != null && familyMemberInfo.getViewUserStudentInfo() != null && familyMemberInfo.getViewUserStudentInfo().getSchoolId() != null && familyMemberInfo.getViewUserStudentInfo().getUserId().equals(studentId))
                        {
                            listSchoolId.add(familyMemberInfo.getViewUserStudentInfo().getSchoolId());
                        }
                    }
                }
            }
        }
        return listSchoolId;
    }

    */
/**
     * 获取班级ie列表
     * 
     * @param userId
     * @param studentId
     * @return
     *//*

    @Override
    public List<Long> getListClassId(LoginUserInfo loginUserInfo, Long studentId)
    {
        Long userId = loginUserInfo.getUserBaseInfo().getUserId();
        Integer userRoleType = loginUserInfo.getUserBaseInfo().getRole();
        List<Long> listClassId = new ArrayList<Long>();
        if (userRoleType.equals(UserRoleDefs.USER_ROLE_TEACHER))
        {
            if (UserRoleDefs.USER_ROLE_DIRECTOR.equals(masterDAO.queryTeacherSchoolRoleInfoByUserId(userId).getRoleId()))
            {
                ViewSchoolInfo viewSchoolInfo = loginUserInfo.getViewSchoolInfo();
                if (null != viewSchoolInfo)
                {
                    Integer schoolId = viewSchoolInfo.getId();
                    List<ClassBaseInfo> listClassBaseInfo = schoolDAO.queryListClassBaseInfo(schoolId, null, null);
                    for (ClassBaseInfo classBaseInfo : listClassBaseInfo)
                    {
                        listClassId.add(classBaseInfo.getId());
                    }
                }

            }
            else if (UserRoleDefs.USER_ROLE_PURE_TEACHER.equals(masterDAO.queryTeacherSchoolRoleInfoByUserId(userId).getRoleId()))
            {
                List<ViewUserTeacherInfo> listViewUserTeacherInfo = loginUserInfo.getListViewUserTeacherInfo();
                if (listViewUserTeacherInfo != null)
                {
                    if (listViewUserTeacherInfo.size() == 1 && listViewUserTeacherInfo.get(0) != null)
                    {
                        listClassId.add(listViewUserTeacherInfo.get(0).getClassId());
                    }
                    else if (listViewUserTeacherInfo.size() > 0)
                    {
                        for (int i = 0; i < listViewUserTeacherInfo.size(); i++)
                        {
                            ViewUserTeacherInfo viewUserTeacherInfo = listViewUserTeacherInfo.get(i);
                            if (viewUserTeacherInfo != null && viewUserTeacherInfo.getClassId() != null)
                            {
                                listClassId.add(viewUserTeacherInfo.getClassId());
                            }
                        }
                    }
                }
            }
        }
        else if (userRoleType.equals(UserRoleDefs.USER_ROLE_PARENT))
        {
            List<FamilyMemberInfo> listFamilyMemberInfo = loginUserInfo.getListFamilyMemberInfo();
            if (listFamilyMemberInfo != null)
            {
                if (listFamilyMemberInfo.size() == 1 && listFamilyMemberInfo.get(0) != null)
                {
                    FamilyMemberInfo familyMemberInfo = listFamilyMemberInfo.get(0);
                    if (familyMemberInfo != null && familyMemberInfo.getViewUserStudentInfo() != null && familyMemberInfo.getViewUserStudentInfo().getClassId() != null && familyMemberInfo.getViewUserStudentInfo().getUserId().equals(studentId))
                    {
                        listClassId.add(familyMemberInfo.getViewUserStudentInfo().getClassId());
                    }
                }
                else if (listFamilyMemberInfo.size() > 0)
                {
                    for (int i = 0; i < listFamilyMemberInfo.size(); i++)
                    {
                        FamilyMemberInfo familyMemberInfo = listFamilyMemberInfo.get(i);
                        if (familyMemberInfo != null && familyMemberInfo.getViewUserStudentInfo() != null && familyMemberInfo.getViewUserStudentInfo().getClassId() != null && familyMemberInfo.getViewUserStudentInfo().getUserId().equals(studentId))
                        {
                            listClassId.add(familyMemberInfo.getViewUserStudentInfo().getClassId());
                        }
                    }
                }
            }
        }
        return listClassId;
    }

    @Override
    public ClassContactListRsp queryListUserStudentInfo(Long classId)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        List<ViewUserBaseInfo> listStudentInfo = masterDAO.queryListViewUserBaseInfoByClassId(classId,null);
        classContactListRsp.setListStudent(listStudentInfo);
        return classContactListRsp;
    }

    @Override
    public LoginUserInfo getLoginUserInfo(Long userId)
    {
        if (userId == null)
        {
            return null;
        }

        UserBaseInfo userBaseInfo = masterDAO.queryUserBaseInfoByUserId(userId);
        if (userBaseInfo == null || userBaseInfo.getUserId() == null || userBaseInfo.getRole() == null)
        {
            return null;
        }

        LoginUserInfo loginUserInfo = new LoginUserInfo();
        loginUserInfo.setUserBaseInfo(userBaseInfo);

        if (userBaseInfo.getHeadPicId() != null)
        {
            ViewUploadFileInfo viewuploadFileInfo = fileDAO.queryViewUploadFileInfo(userBaseInfo.getHeadPicId());
            if (viewuploadFileInfo != null)
            {
                loginUserInfo.setUserHeadPicUrl(viewuploadFileInfo.getUrl());
            }
        }

        Integer schoolId = null;
        if (userBaseInfo.getRole().equals(UserRoleDefs.USER_ROLE_TEACHER))
        {
            List<ViewUserTeacherInfo> listViewUserTeacherInfo = masterDAO.queryViewUserTeacherInfoByUserId(userId);
            if (listViewUserTeacherInfo != null && listViewUserTeacherInfo.size() > 0)
            {
                ViewUserTeacherInfo viewUserTeacherInfo = listViewUserTeacherInfo.get(0);
                if (viewUserTeacherInfo != null)
                {
                    schoolId = viewUserTeacherInfo.getSchoolId();
                    loginUserInfo.setListViewUserTeacherInfo(listViewUserTeacherInfo);
                }
            }

            List<SysPrivilegeUser> listSysPrivilegeUser = masterDAO.querySysPrivilegeUserByUserId(userId);
            if (listSysPrivilegeUser != null && listSysPrivilegeUser.size() > 0)
            {
                List<Integer> listPrivilegeId = new ArrayList<Integer>();
                for (int i = 0; i < listSysPrivilegeUser.size(); i++)
                {
                    SysPrivilegeUser sysPrivilegeUser = listSysPrivilegeUser.get(i);
                    if (sysPrivilegeUser != null && sysPrivilegeUser.getPrivilegeId() != null)
                    {
                        listPrivilegeId.add(sysPrivilegeUser.getPrivilegeId());
                    }
                }
                if (listPrivilegeId.size() > 0)
                {
                    loginUserInfo.setListPrivilegeId(listPrivilegeId);
                }
            }

        }
        else if (userBaseInfo.getRole().equals(UserRoleDefs.USER_ROLE_STUDENT))
        {
            ViewUserStudentInfo viewUserStudentInfo = masterDAO.queryViewUserStudentInfoByUserId(userId);
            if (viewUserStudentInfo != null)
            {
                schoolId = viewUserStudentInfo.getSchoolId();
                loginUserInfo.setViewUserStudentInfo(viewUserStudentInfo);
            }
        }

        if (userBaseInfo.getRole().equals(UserRoleDefs.USER_ROLE_STUDENT) || userBaseInfo.getRole().equals(UserRoleDefs.USER_ROLE_PARENT))
        {
            ViewUserFamilyInfo viewUserFamilyInfo = masterDAO.queryViewUserFamilyInfo(userId);
            if (viewUserFamilyInfo != null)
            {
                loginUserInfo.setViewUserFamilyInfo(viewUserFamilyInfo);
                List<ViewUserFamilyInfo> listViewUserFamilyInfo = masterDAO.queryListViewUserFamilyInfo(viewUserFamilyInfo.getFamilyId());
                if (listViewUserFamilyInfo != null && listViewUserFamilyInfo.size() > 1)
                {
                    List<FamilyMemberInfo> listFamilyMemberInfo = new ArrayList<FamilyMemberInfo>();
                    for (int i = 0; i < listViewUserFamilyInfo.size(); i++)
                    {
                        ViewUserFamilyInfo info = listViewUserFamilyInfo.get(i);
                        if (info != null && !info.getUserId().equals(userId))
                        {
                            FamilyMemberInfo familyMemberInfo = getFamilyMemberInfo(info);
                            listFamilyMemberInfo.add(familyMemberInfo);
                        }
                    }
                    loginUserInfo.setListFamilyMemberInfo(listFamilyMemberInfo);
                }
            }
        }
        ViewSchoolInfo viewSchoolInfo = masterDAO.queryViewSchoolInfo(schoolId);
        loginUserInfo.setViewSchoolInfo(viewSchoolInfo);

        if (userBaseInfo.getRole().equals(UserRoleDefs.USER_ROLE_TEACHER))
        {
            if (schoolId == null || viewSchoolInfo == null)
            {
                SchoolInfo schoolInfo = schoolDAO.querySchoolInfoByManageUserId(userBaseInfo.getUserId());
                if (schoolInfo != null)
                {
                    loginUserInfo.setIsManager(true);

                    viewSchoolInfo = masterDAO.queryViewSchoolInfo(schoolInfo.getId());
                    loginUserInfo.setViewSchoolInfo(viewSchoolInfo);
                }

            }
        }
        return loginUserInfo;

    }

    private FamilyMemberInfo getFamilyMemberInfo(ViewUserFamilyInfo viewUserFamilyInfo)
    {
        ViewUserBaseInfo viewUserBaseInfo = masterDAO.queryViewUserBaseInfo(viewUserFamilyInfo.getUserId());
        if (viewUserBaseInfo != null)
        {
            FamilyMemberInfo familyMemberInfo = new FamilyMemberInfo();
            familyMemberInfo.setViewUserFamilyInfo(viewUserFamilyInfo);
            familyMemberInfo.setViewUserBaseInfo(viewUserBaseInfo);
            if (viewUserBaseInfo.getRole() != null && viewUserBaseInfo.getRole().equals(UserRoleDefs.USER_ROLE_STUDENT))
            {
                ViewUserStudentInfo viewUserStudentInfo = masterDAO.queryViewUserStudentInfoByUserId(viewUserFamilyInfo.getUserId());
                familyMemberInfo.setViewUserStudentInfo(viewUserStudentInfo);
                if (viewUserStudentInfo != null && viewUserStudentInfo.getSchoolId() != null)
                {
                    ViewSchoolInfo viewSchoolInfo = masterDAO.queryViewSchoolInfo(viewUserStudentInfo.getSchoolId());
                    familyMemberInfo.setViewSchoolInfo(viewSchoolInfo);
                }
            }
            return familyMemberInfo;
        }
        else
        {
            return null;
        }
    }

    @Override
    public ContactDetailResult getUserDetail(ContactDetailReq reqValue)
    {
        ContactDetailResult contactDetailResult = new ContactDetailResult();
        ViewUserSimpleInfo viewUserSimpleInfo = null;

        Long userId = reqValue.getUserId();

        if (userId != null)
        {
            viewUserSimpleInfo = masterDAO.queryViewUserSimpleInfo(userId);
        }

        if (viewUserSimpleInfo == null)
        {
            contactDetailResult.setResult(ErrorMsgDefs.NO_EXIST_USER);
            return contactDetailResult;
        }

        ContactDetailRsp contactDetailRsp = new ContactDetailRsp();
        contactDetailRsp.setViewUserSimpleInfo(viewUserSimpleInfo);

        if (viewUserSimpleInfo.getRole().equals(UserRoleDefs.USER_ROLE_TEACHER))
        {
            List<ViewUserTeacherInfo> listViewUserTeacherInfo = masterDAO.queryViewUserTeacherInfoByUserId(userId);
            if (listViewUserTeacherInfo != null && listViewUserTeacherInfo.size() > 0)
            {
                ViewUserTeacherInfo viewUserTeacherInfo = listViewUserTeacherInfo.get(0);
                if (viewUserTeacherInfo != null)
                {
                    contactDetailRsp.setListViewUserTeacherInfo(listViewUserTeacherInfo);
                }
            }
        }
        else if (viewUserSimpleInfo.getRole().equals(UserRoleDefs.USER_ROLE_STUDENT))
        {
            ViewUserStudentInfo viewUserStudentInfo = masterDAO.queryViewUserStudentInfoByUserId(userId);
            if (viewUserStudentInfo != null)
            {
                contactDetailRsp.setViewUserStudentInfo(viewUserStudentInfo);
            }
        }
        contactDetailResult.setContactDetailRsp(contactDetailRsp);
        contactDetailResult.setResult(ErrorMsgDefs.OPR_SUCCESS);
        return contactDetailResult;

    }

    @Override
    public List<Long> queryUserParentInfo(Long studentId)
    {
        return masterDAO.queryUserParentInfo(studentId);
    }

    @Override
    public boolean delUserFamilyInfo(Long userId)
    {
        return this.masterDAO.delUserFamilyInfo(userId);
    }

    // 修改接送家长
    @Override
    public UserInfoRsp refreshUserInfo(UserInfoRefreshReq reqValue)
    {
        String lastUpdateTime = reqValue.getLastUpdateTime();
        Integer schoolId = reqValue.getSchoolId();
        UserInfoRsp rsp = new UserInfoRsp();
        List<ViewCardChildInfo> listViewCardChildInfo = masterDAO.queryListViewCardChildInfo(schoolId, lastUpdateTime);
        List<CardFamilyInfo> listCardFamilyInfo = masterDAO.queryListCardFamilyInfo(schoolId, lastUpdateTime);
        List<CardInfo> listCardInfo = masterDAO.queryListCardInfo(schoolId, lastUpdateTime);
        // 设置图片路径
        setlistCardFamilyInfoPicUrl(listCardFamilyInfo);
        rsp.setListViewCardChildInfo(listViewCardChildInfo);
        rsp.setListSimpleCardFamilyInfo(listCardFamilyInfo);

        rsp.setListCardInfo(listCardInfo);
        return rsp;
    }

    // 获取幼儿园孩子和家长考勤信息，第一次安装
    @Override
    public UserInfoRsp getListUserInfo(UserInfoReq reqValue)
    {
        // 请求参数
        String deviceId = reqValue.getDeviceId();
        String registrationId = reqValue.getJpushRegistId();

        if (deviceId == null && registrationId == null)
        {
            return null;
        }
        CardPushInfo cardPushInfo = masterDAO.queryCardPushInfo(deviceId);
        if(cardPushInfo == null)
        {
            return null;
        } 
        Integer schoolId = cardPushInfo.getSchoolId();
        if (schoolId == null)
        {
            return null;
        }
        if (cardPushInfo != null)
        {
            cardPushInfo.setRegistrationId(registrationId);
        }
        
        cardPushInfo.setTime(BasicUtils.getCurrentTime());
        masterDAO.updateCardPushInfo(cardPushInfo);

        // 返回学校的card信息
        UserInfoRsp rsp = new UserInfoRsp();
        rsp.setUpdateTime(BasicUtils.getCurrentDateTimeString_Sql());
        rsp.setSchoolId(schoolId);
        SchoolInfo schoolInfo = schoolDAO.querySchoolInfo(schoolId);
        if (schoolInfo != null)
        {
            String schoolName = schoolInfo.getName();
            rsp.setSchoolName(schoolName);
        }
        List<ViewCardChildInfo> listViewCardChildInfo = masterDAO.queryListViewCardChildInfo(schoolId);
        List<CardFamilyInfo> listCardFamilyInfo = masterDAO.queryListCardFamilyInfo(schoolId);
        List<CardInfo> listCardInfo = masterDAO.queryListCardInfo(schoolId);
        // 设置图片路径
        setlistCardFamilyInfoPicUrl(listCardFamilyInfo);
        rsp.setListViewCardChildInfo(listViewCardChildInfo);
        rsp.setListSimpleCardFamilyInfo(listCardFamilyInfo);

        rsp.setListCardInfo(listCardInfo);
        return rsp;
    }

    private void setlistCardFamilyInfoPicUrl(List<CardFamilyInfo> listCardFamilyInfo)
    {
        if (listCardFamilyInfo != null && listCardFamilyInfo.size() > 0)
        {
            for (CardFamilyInfo cardFamilyInfo : listCardFamilyInfo)
            {

                Long picId = cardFamilyInfo.getPicId();
                ViewUploadFileInfo viewUploadFileInfo = fileDAO.queryViewUploadFileInfo(picId);
                if (viewUploadFileInfo != null)
                {
                    cardFamilyInfo.setPicUrl(viewUploadFileInfo.getUrl());
                }
            }
        }
    }

    @Override
    public ChildFamilyRsp getListChildFamily(ChildFamilyReq reqValue)
    {
        Long studentId = reqValue.getStudentId();
        if (studentId == null)
        {
            return null;
        }
        ChildFamilyRsp rsp = new ChildFamilyRsp();
        List<CardFamilyInfo> listCardFamilyInfo = masterDAO.queryListCardFamilyInfo(studentId);
        if (listCardFamilyInfo != null)
        {
            setlistCardFamilyInfoPicUrl(listCardFamilyInfo);
        }
        rsp.setListCardFamilyInfo(listCardFamilyInfo);
        return rsp;
    }

    @Override
    public ModifyChildFamilyRsp modifyChildFamily(ModifyChildFamilyReq reqValue)
    {
        ModifyChildFamilyRsp rsp = new ModifyChildFamilyRsp();
        Long studentId = reqValue.getStudentId();
        if (studentId == null)
        {
            rsp.setResult(ErrorMsgDefs.REQ_PARAMETER_JSON_ERROR);
            return rsp;

        }
        Integer schoolId;
        UserStudentInfo userStudentInfo = masterDAO.queryUserStudentInfoByUserId(studentId);
        if (userStudentInfo != null)
        {
            schoolId = userStudentInfo.getSchoolId();
            rsp.setSchoolId(userStudentInfo.getSchoolId());
        }
        else
        {
            rsp.setResult(ErrorMsgDefs.NO_EXIST_STUDENT);
            return rsp;
        }
        Timestamp currentTime = BasicUtils.getCurrentTime();
        List<CardFamilyInfo> listCardFamilyInfo = reqValue.getListCardFamilyInfo();
        // 删除历史记录
        List<CardFamilyInfo> listCardFamilyInfoSave = masterDAO.queryListCardFamilyInfo(studentId);
        if (listCardFamilyInfoSave != null)
        {
            if (!masterDAO.delCardFamilyInfo(listCardFamilyInfoSave))
            {
                rsp.setResult(ErrorMsgDefs.DEL_CARDFAMILY_INFO_FAIL);
                return rsp;
            }

        }
        for (CardFamilyInfo cardFamilyInfo : listCardFamilyInfo)
        {
            cardFamilyInfo.setChildId(studentId);
            cardFamilyInfo.setCreateTime(currentTime);
            cardFamilyInfo.setUpdateTime(currentTime);
            cardFamilyInfo.setIsDel(false);
            cardFamilyInfo.setSchoolId(schoolId);
        }
        // 添加修改后家长信息
        if (!masterDAO.updateCardFamilyInfo(listCardFamilyInfo))
        {
            rsp.setResult(ErrorMsgDefs.ADD_CARDFAMILY_INFO_FAIL);
            rsp.setListCardFamilyInfo(null);
            return rsp;
        }
        listCardFamilyInfoSave.addAll(listCardFamilyInfo);
        setlistCardFamilyInfoPicUrl(listCardFamilyInfo);
        rsp.setListCardFamilyInfo(listCardFamilyInfoSave);
        rsp.setResult(ErrorMsgDefs.OPR_SUCCESS);
        return rsp;
    }

    @Override
    public boolean checkMobilePhone(String mobilePhone)
    {
        return masterDAO.checkUserName(mobilePhone);
    }

    @Override
    public String addCard(CardReq cardReq, Integer schoolId)
    {
        Long cardNum = cardReq.getCardNum();
        Long studentId = cardReq.getStudentId();
        if (cardNum == null || studentId == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        Timestamp currentTime = BasicUtils.getCurrentTime();
        // 添加学生的时候加上孩子卡片信息
        */
/*
         * CardChildInfo cardChildInfo = new CardChildInfo(schoolId,
         * currentTime, currentTime, false); if
         * (!masterDAO.updateCardChildInfo(cardChildInfo)) { return
         * ErrorMsgDefs.ADD_CARD_FAIL; }
         *//*

        CardInfo cardInfo = new CardInfo(cardNum, schoolId, studentId, currentTime, currentTime, false);
        if (!masterDAO.updateCardInfo(cardInfo))
        {
            return ErrorMsgDefs.ADD_CARD_FAIL;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    @Override
    public String removeCard(CardReq cardReq)
    {
        Long cardId = cardReq.getCardId();
        if (cardId == null)
        {
            return ErrorMsgDefs.REQ_ERROR_PARAMETER;
        }
        if (!masterDAO.delCardInfo(cardId))
        {
            return ErrorMsgDefs.DEL_CARD_FAIL;
        }
        return ErrorMsgDefs.OPR_SUCCESS;
    }

    @Override
    public List<CardInfo> queryCardInfo(Long userId)
    {
        return masterDAO.queryCardInfo(userId);
    }

    @Override
    public List<CardPushInfo> queryListCardPushInfo(Integer schoolId)
    {
        return this.masterDAO.queryListCardPushInfo(schoolId);
    }

    @Override
    public boolean delUserTolen(Long userId)
    {

        return false;
    }
}
*/
