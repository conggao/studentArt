/*
package com.gk.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.gk.dao.MasterDAO;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.entity.admin.AdminUserCookie;
import com.entity.admin.AdminUserInfo;
import com.entity.bus.BusLinesInfo;
import com.entity.bus.SchoolBusInfo;
import com.entity.feedback.FeedBackInfo;
import com.entity.food.FoodBaseInfo;
import com.entity.manage.school.QueryPrivilegeCondition;
import com.entity.master.CardChildInfo;
import com.entity.master.CardFamilyInfo;
import com.entity.master.CardInfo;
import com.entity.master.CardPushInfo;
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
import com.entity.master.UserLoginRecord;
import com.entity.master.UserOprRecord;
import com.entity.master.UserParentInfo;
import com.entity.master.UserPasswordInfo;
import com.entity.master.UserPushInfo;
import com.entity.master.UserStudentInfo;
import com.entity.master.UserTeacherInfo;
import com.entity.master.UserToken;
import com.entity.master.ViewCardChildInfo;
import com.entity.master.ViewClassBaseInfo;
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
import com.entity.master.cache.CacheUserInfo;
import com.entity.upgrade.ViewUpgradeInfo;
import com.entity.user.protocol.ClassContactListRsp;
import com.entity.user.protocol.ClassContactListRsp.ParentInfo;
import com.utils.BasicUtils;
import com.utils.TimeCalculateUtils;
import com.utils.defs.cache.MasterDataDefs;

public class MasterDAOImpl extends HibernateDaoSupport implements MasterDAO
{

    @Override
    public List<UserTeacherInfo> queryUserTeacherInfoByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserTeacherInfo> list = ht.find(String.format("from UserTeacherInfo where userId = %d and delTime is null", userId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delUserTeacherInfoByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserTeacherInfo> list = ht.find(String.format("from UserTeacherInfo where userId = %d and delTime is null", userId));
            if (list != null && list.size() > 0)
            {
                for (UserTeacherInfo userTeacherInfo : list)
                {
                    userTeacherInfo.setDelTime(BasicUtils.getCurrentTime());
                    ht.update(userTeacherInfo);
                }
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delUserStudentInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserStudentInfo> list = ht.find(String.format("from UserStudentInfo where userId = %d and delTime is null", userId));
            if (list != null && list.size() > 0)
            {
                UserStudentInfo userStudentInfo = list.get(0);
                userStudentInfo.setDelTime(BasicUtils.getCurrentTime());
                ht.update(userStudentInfo);
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    @Override
    public ViewUserTeacherInfo queryViewUserTeacherInfo(Long id)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserTeacherInfo> list = ht.find(String.format("from ViewUserTeacherInfo where id = %d", id));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SmsVerificationCode querySmsVerificationCode(Long userId, Integer type)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SmsVerificationCode> list = ht.find(String.format("from SmsVerificationCode where userId = %d and type = %d", userId, type));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SmsVerificationCode querySmsVerificationCode(String mobilePhone, Integer type)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SmsVerificationCode> list = ht.find(String.format("from SmsVerificationCode where mobilePhone = '%s' and type = %d", mobilePhone, type));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateSmsVerificationCode(SmsVerificationCode info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateTeacherSchoolRoleInfo(TeacherSchoolRoleInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    private List<UserBaseInfo> querListUserBaseInfo(String where)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserBaseInfo> list = ht.find(String.format("from UserBaseInfo where %s", where));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private UserBaseInfo queryOneUserBaseInfo(String where)
    {
        List<UserBaseInfo> list = querListUserBaseInfo(where);
        if (list != null && list.size() == 1)
        {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Long> queryUserParentInfo(Long studentId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<Long> list = ht.find(String.format("select userId from UserParentInfo where studentId = '%d'", studentId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private List<UserPasswordInfo> querListUserPasswordInfo(String where)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserPasswordInfo> list = ht.find(String.format("from UserPasswordInfo where %s", where));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private UserPasswordInfo queryOneUserPasswordInfo(String where)
    {
        List<UserPasswordInfo> list = querListUserPasswordInfo(where);
        if (list != null && list.size() == 1)
        {
            return list.get(0);
        }
        return null;
    }

    public UserPasswordInfo queryUserPasswordInfoByUserId(Long userId)
    {
        String where = String.format("userId = %d", userId);
        UserPasswordInfo UserPasswordInfo = queryOneUserPasswordInfo(where);
        return UserPasswordInfo;
    }

    @Override
    public UserBaseInfo queryUserBaseInfoByUserId(Long userId)
    {
        String where = String.format("userId = %d", userId);
        UserBaseInfo userBaseInfo = queryOneUserBaseInfo(where);
        return userBaseInfo;
    }

    @Override
    public boolean updateUserBaseInfo(UserBaseInfo userBaseInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(userBaseInfo);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public UserPasswordInfo queryUserPasswordInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserPasswordInfo> list = ht.find(String.format("from UserPasswordInfo where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUserPasswordInfo(UserPasswordInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public UserToken queryUserToken(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserToken> list = ht.find(String.format("from UserToken where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUserToken(UserToken info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delUserTolen(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserToken> list = ht.find(String.format("from UserToken where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                ht.deleteAll(list);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public UserCookie queryUserCookie(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserCookie> list = ht.find(String.format("from UserCookie where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUserCookie(UserCookie info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public UserLoginRecord queryLatelyUserLoginRecordByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserLoginRecord> list = ht.find(String.format("from UserLoginRecord where userId = %d order by id desc", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addUserLoginRecord(UserLoginRecord info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.save(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<UserOprRecord> queryUserOprRecordByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserOprRecord> list = ht.find(String.format("from UserOprRecord where userId = %d order by id desc", userId));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addUserOprRecord(UserOprRecord info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.save(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public UserBaseInfo queryUserBaseInfo(String where)
    {
        return queryOneUserBaseInfo(where);
    }

    @Override
    public UserBaseInfo queryUserBaseInfoByUserName(String userName)
    {
        String where = String.format("userName = '%s'", userName);
        UserBaseInfo userBaseInfo = queryOneUserBaseInfo(where);
        return userBaseInfo;
    }

    @Override
    public UserBaseInfo queryUserBaseInfoByUserNameAndMobilePhone(String userName, String mobilePhone)
    {
        String where = String.format("userName = '%s' and mobilePhone = '%s'", userName, mobilePhone);
        UserBaseInfo userBaseInfo = queryOneUserBaseInfo(where);
        return userBaseInfo;
    }

    @Override
    public boolean isExistMobilePhoneAlreadReg(String mobilePhone)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserBaseInfo> list = ht.find(String.format("from UserBaseInfo where userName = '%s' and  mobilePhone = '%s' and regFlag = '1'", mobilePhone, mobilePhone));
            if (list != null && list.size() > 0)
            {
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<UserBaseInfo> queryListUserBaseInfo(Integer schoolId)
    {
        String where = String.format("schoolId = '%d'  and isAdmin = '0'", schoolId);
        List<UserBaseInfo> list = querListUserBaseInfo(where);
        return list;
    }

    @Override
    public List<UserBaseInfo> queryListUserBaseInfo()
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserBaseInfo> list = ht.find("from UserBaseInfo where userId  not in (select userId from UserImInfo ) and role<> 2");
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delUserBaseInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserBaseInfo> list = ht.find(String.format("from UserBaseInfo where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                ht.deleteAll(list);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delUserPasswordInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserPasswordInfo> list = ht.find(String.format("from UserPasswordInfo where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                ht.deleteAll(list);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    private String formatLongListToSqlIn(List<Long> listIds)
    {
        String strIds = "";
        if (listIds != null && listIds.size() > 0)
        {
            for (int i = 0; i < listIds.size(); i++)
            {
                Long id = listIds.get(i);
                if (id != null)
                {
                    if (!strIds.equals(""))
                    {
                        strIds += ", ";
                    }
                    strIds += "'" + id.toString() + "'";
                }
            }
        }
        return strIds;
    }

    private String formatIntegerListToSqlIn(List<Integer> listIds)
    {
        String strIds = "";
        if (listIds != null && listIds.size() > 0)
        {
            for (int i = 0; i < listIds.size(); i++)
            {
                Integer id = listIds.get(i);
                if (id != null)
                {
                    if (!strIds.equals(""))
                    {
                        strIds += ", ";
                    }
                    strIds += "'" + id.toString() + "'";
                }
            }
        }
        return strIds;
    }

    private String formatStringListToSqlIn(List<String> listIds)
    {
        String strIds = "";
        if (listIds != null && listIds.size() > 0)
        {
            for (int i = 0; i < listIds.size(); i++)
            {
                String id = listIds.get(i);
                if (id != null)
                {
                    if (!strIds.equals(""))
                    {
                        strIds += ", ";
                    }
                    strIds += "'" + id.toString() + "'";
                }
            }
        }
        return strIds;
    }

    @Override
    public ViewUserStudentInfo queryViewUserStudentInfoByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserStudentInfo> list = ht.find(String.format("from ViewUserStudentInfo where userId = %d and delTime is null", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewUserStudentInfo> queryViewUserStudentInfoBySchoolId(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserStudentInfo> list = ht.find(String.format("from ViewUserStudentInfo where schoolId = %d and delTime is null", schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public UserStudentInfo queryUserStudentInfoByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserStudentInfo> list = ht.find(String.format("from UserStudentInfo where userId = %d and delTime is null", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<UserStudentInfo> queryListUserStudentInfoByClassId(Long classId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserStudentInfo> list = ht.find(String.format("from UserStudentInfo where classId = %d", classId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public UserStudentInfo queryUserStudentInfo(Long classId, Long studentId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserStudentInfo> list = ht.find(String.format("from UserStudentInfo where classId = '%d' and studentId = '%d'", classId, studentId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUserStudentInfo(UserStudentInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            ViewUserBaseInfo viewUserBaseInfo = queryViewUserBaseInfo(info.getUserId());
            if (viewUserBaseInfo != null)
            {
                updateCacheClassUserInfo(viewUserBaseInfo, info.getClassId());
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<ViewUserTeacherInfo> queryViewUserTeacherInfoByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserTeacherInfo> list = ht.find(String.format("from ViewUserTeacherInfo where userId = %d and delTime is null", userId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUserTeacherInfo(UserTeacherInfo userTeacherInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(userTeacherInfo);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delUserTeacherInfo(Long id)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserTeacherInfo> list = ht.find(String.format("from UserTeacherInfo where id = %d", id));
            if (list != null && list.size() == 1)
            {
                UserTeacherInfo userTeacherInfo = list.get(0);
                userTeacherInfo.setDelTime(BasicUtils.getCurrentTime());
                ht.update(userTeacherInfo);
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUserTeacherInfo(List<UserTeacherInfo> list)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdateAll(list);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String strSql_userId = String.format("select distinct(userId) from UserTeacherInfo where classId = '%d'", classId);
            String strSql = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '1' ", strSql_userId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(strSql);
            classContactListRsp.setListTeacher(list);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String createTime = TimeCalculateUtils.getNowTime() + " 00:00:00";
            String studentIdHql = String.format("from UserStudentInfo where classId = '%d' and createTime <= '%s' and delTime is null", classId,createTime);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserStudentInfo> list = ht.find(studentIdHql);
            List<ParentInfo> listParent = new ArrayList<>();
            
            for (UserStudentInfo userStudentInfo : list)
            {
                String userParentInfoHql = String.format("from UserParentInfo where studentId = %d", userStudentInfo.getUserId());
                List<UserParentInfo> listUserParentInfo = ht.find(userParentInfoHql);
                for (UserParentInfo userParentInfo : listUserParentInfo)
                {
                    ParentInfo parentInfo = new ParentInfo();
                    ViewUserFamilyInfo viewUserFamilyInfo = queryViewUserFamilyInfo(userParentInfo.getUserId());
                    parentInfo.setRoleName(viewUserFamilyInfo.getFamilyRoleTypeName());
                    UserBaseInfo userBaseInfo = queryUserBaseInfoByUserId(userStudentInfo.getUserId());
                    parentInfo.setStudentName(userBaseInfo.getRealName());
                    ViewUserSimpleInfo viewUserSimpleInfo = queryViewUserSimpleInfo(userParentInfo.getUserId());
                    parentInfo.setViewUserSimpleInfo(viewUserSimpleInfo);
                    listParent.add(parentInfo);
                }
            }
            classContactListRsp.setListParent(listParent);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String strSql_userId = String.format("select distinct(userId) from UserStudentInfo where classId = '%d'", classId);
            String strSql = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '2'", strSql_userId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(strSql);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForTeacher(Long classId, String timeStart, String timeLastUpdate)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String strSql_userId = String.format("select distinct(userId) from UserTeacherInfo where isDel = 0 and classId = '%d' '%s'", classId, queryListForUpdate(timeStart, timeLastUpdate));
            String strSql_delUserId = String.format("select distinct(userId) from UserTeacherInfo where isDel = 1 and classId = '%d' '%s'", classId, queryListForUpdate(timeStart, timeLastUpdate));
            String strSql = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '1' '%s'", strSql_userId, queryUserListForUpdate(timeStart, timeLastUpdate));
            String strSqlDel = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '1' ", strSql_delUserId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> listTeacher = ht.find(strSql);
            List<ViewUserSimpleInfo> listDelTeacher = ht.find(strSqlDel);
            classContactListRsp.setListTeacher(listTeacher);
            classContactListRsp.setListDelTeacher(listDelTeacher);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForParent(Long classId, String timeStart, String timeLastUpdate)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String strSql_userId = String.format("select distinct(userId) from UserParentInfo where isDel = 0 and classId = '%d' '%s'", classId, queryListForUpdate(timeStart, timeLastUpdate));
            String strSql_delUserId = String.format("select distinct(userId) from UserParentInfo where isDel = 1 and classId = '%d' '%s'", classId, queryListForUpdate(timeStart, timeLastUpdate));
            String strSql = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '3' '%s'", strSql_userId, queryUserListForUpdate(timeStart, timeLastUpdate));
            String strDelSql = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '3' ", strSql_delUserId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(strSql);
            List<ViewUserSimpleInfo> delList = ht.find(strDelSql);
            //classContactListRsp.setListParent(list);
            classContactListRsp.setListDelParent(delList);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoBySchoolIdForTeacher(Integer schoolId, String timeStart, String timeLastUpdate)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String strSqlUserId = String.format("select userId from ViewUserTeacherInfoBase where delTime is null and schoolId = '%d' '%s'", schoolId, queryListForUpdate(timeStart, timeLastUpdate));
            String strSqlDelUserId = String.format("select userId from ViewUserTeacherInfoBase where delTime is not null and schoolId = '%d' '%s'", schoolId, queryListForUpdate(timeStart, timeLastUpdate));
            String strSql = String.format("from ViewUserSimpleInfo where userId in (%s) '%s' and role = '1'", strSqlUserId, queryUserListForUpdate(timeStart, timeLastUpdate));
            String strDelSql = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '1'", strSqlDelUserId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(strSql);
            List<ViewUserSimpleInfo> delList = ht.find(strDelSql);
            classContactListRsp.setListTeacher(list);
            classContactListRsp.setListDelTeacher(delList);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoByClassIdForStudent(Long classId, String timeStart, String timeLastUpdate)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String strSql_userId = String.format(" select distinct(userId) from UserStudentInfo where classId = '%d'", classId);
            String strSql = String.format("from ViewUserSimpleInfo where userId in (%s) and role = '2' '%s'", strSql_userId, queryUserListForUpdate(timeStart, timeLastUpdate));
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(strSql);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ClassContactListRsp queryListViewUserSimpleInfoBySchoolIdForTeacher(Integer schoolId)
    {
        ClassContactListRsp classContactListRsp = new ClassContactListRsp();
        try
        {
            String strSqlUserId = String.format("select userId from ViewUserTeacherInfoBase where schoolId = '%d' and delTime is null", schoolId);
            String strSql = String.format("from ViewUserSimpleInfo where userId in (%s)", strSqlUserId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(strSql);
            classContactListRsp.setListTeacher(list);
            return classContactListRsp;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    // 普通更新语句
    private String queryListForUpdate(String timeStart, String timeLastUpdate)
    {
        return String.format("and ((createTime > '%s') or (createTime >= '%s' and createTime <= '%s' and lastUpdateTime > '%s'))", timeLastUpdate, timeStart, timeLastUpdate, timeLastUpdate);
    }

    private String queryUserListForUpdate(String timeStart, String timeLastUpdate)
    {
        return String.format("or ((regTime > '%s') or (regTime >= '%s' and regTime <= '%s' and lastUpdateTime > '%s'))", timeLastUpdate, timeStart, timeLastUpdate, timeLastUpdate);
    }

    @Override
    public ViewSchoolInfo queryViewSchoolInfo(Integer id)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewSchoolInfo> list = ht.find(String.format("from ViewSchoolInfo where id = %d", id));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewUserSimpleInfo queryViewUserSimpleInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(String.format("from ViewUserSimpleInfo where userId = %d", userId));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewUserBaseInfo queryViewUserBaseInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserBaseInfo> list = ht.find(String.format("from ViewUserBaseInfo where userId = %d", userId));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public UserPushInfo queryUserPushInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserPushInfo> list = ht.find(String.format("from UserPushInfo where userId = %d", userId));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUserPushInfo(UserPushInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserPushInfo> list = ht.find(String.format("from UserPushInfo where registrationId = '%s'", info.getRegistrationId()));
            if (list != null && list.size() > 0)
            {
                for (UserPushInfo userPushInfo : list)
                {
                    userPushInfo.setRegistrationId("");
                    ht.saveOrUpdate(userPushInfo);
                }
            }
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delUserPushInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserPushInfo> list = ht.find(String.format("from UserPushInfo where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                ht.deleteAll(list);
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ViewUserSimpleInfo queryViewUserSimpleInfoByImAccount(String imAccount)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(String.format("from ViewUserSimpleInfo where imAccount = '%s'", imAccount));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer queryClassStudentNum(Long classId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<Integer> list = ht.find(String.format("select count(userId) from UserStudentInfo where classId = %d", classId));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewUserFamilyInfo queryViewUserFamilyInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserFamilyInfo> list = ht.find(String.format("from ViewUserFamilyInfo where userId = %d", userId));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewUserFamilyInfo> queryListViewUserFamilyInfo(Long familyId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserFamilyInfo> list = ht.find(String.format("from ViewUserFamilyInfo where familyId = %d", familyId));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<UserBaseInfo> queryUserBaseInfoListByRegistrationId(String registrationId)
    {
        try
        {
            List<UserBaseInfo> list = new ArrayList<>();
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserPushInfo> userPushList = ht.find(String.format("from UserPushInfo where registrationId='%s'", registrationId));
            for (UserPushInfo info : userPushList)
            {
                List<UserBaseInfo> userBaseList = ht.find(String.format("from UserBaseInfo where userId=%d", info.getUserId()));
                if (userBaseList != null && userBaseList.size() > 0)
                {
                    list.add(userBaseList.get(0));
                }
            }
            if (list != null && list.size() > 0)
                return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewUpgradeInfo queryLatelyViewUpgradeInfo(Integer osId, String swName)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUpgradeInfo> list = ht.find(String.format("from ViewUpgradeInfo where osId = %d and swName = '%s'", osId, swName));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewUserSimpleInfo queryViewUserSimpleInfoByUserName(String name)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserSimpleInfo> list = ht.find(String.format("from ViewUserSimpleInfo where userName = '%s'", name));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public FamilyInfo queryFamilyInfo(Long id)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<FamilyInfo> list = ht.find(String.format("from FamilyInfo where id = %d", id));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateFamilyInfo(FamilyInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public UserFamilyInfo queryUserFamilyInfo(Long userId, Long familyId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserFamilyInfo> list = ht.find(String.format("from UserFamilyInfo where userId = '%d' and familyId ='%d' ", userId, familyId));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateUserFamilyInfo(UserFamilyInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<SysIdDesc> querySysIdDesc()
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SysIdDesc> list = ht.find(String.format("from SysIdDesc"));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<SysPrivilegeDesc> querySysPrivilegeDescBySysId(Integer sysId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SysPrivilegeDesc> list = ht.find(String.format("from SysPrivilegeDesc where sysId = %d", sysId));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<SysPrivilegeDesc> querySysPrivilegeDesc()
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SysPrivilegeDesc> list = ht.find(String.format("from SysPrivilegeDesc"));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewSysPrivilegeDesc> queryViewSysPrivilegeDesc()
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewSysPrivilegeDesc> list = ht.find(String.format("from ViewSysPrivilegeDesc"));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<SysPrivilegeUser> querySysPrivilegeUserByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SysPrivilegeUser> list = ht.find(String.format("from SysPrivilegeUser where userId = %d", userId));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<SysPrivilegeUser> querySysPrivilegeUserBySchoolId(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SysPrivilegeUser> list = ht.find(String.format("from SysPrivilegeUser where schoolId = %d", schoolId));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewSysPrivilegeUser> queryViewSysPrivilegeUserByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewSysPrivilegeUser> list = ht.find(String.format("from ViewSysPrivilegeUser where userId = %d", userId));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewSysPrivilegeUser> queryViewSysPrivilegeUserBySchoolId(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewSysPrivilegeUser> list = ht.find(String.format("from ViewSysPrivilegeUser where schoolId = %d", schoolId));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewSysPrivilegeUser> queryViewSysPrivilegeUser(QueryPrivilegeCondition queryPrivilegeCondition)
    {
        try
        {
            if (queryPrivilegeCondition == null)
            {
                return null;
            }
            if (queryPrivilegeCondition.getSchoolId() == null)
            {
                return null;
            }
            String where = String.format("where schoolId = %d", queryPrivilegeCondition.getSchoolId());

            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewSysPrivilegeUser> list = ht.find(String.format("from ViewSysPrivilegeUser %s", where));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addSysPrivilege(Integer schoolId, Long userId, Integer privilegeId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SysPrivilegeUser> list = ht.find(String.format("from SysPrivilegeUser where userId = %d and privilegeId = %d", userId, privilegeId));
            if (list != null && list.size() > 0)
            {
                return true;
            }
            else
            {
                SysPrivilegeUser sysPrivilegeUser = new SysPrivilegeUser();
                sysPrivilegeUser.setUserId(userId);
                sysPrivilegeUser.setPrivilegeId(privilegeId);
                sysPrivilegeUser.setSchoolId(schoolId);
                ht.save(sysPrivilegeUser);
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delSysPrivilege(Long userId, Integer privilegeId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SysPrivilegeUser> list = ht.find(String.format("from SysPrivilegeUser where userId = %d and privilegeId = %d", userId, privilegeId));
            if (list != null && list.size() > 0)
            {
                ht.deleteAll(list);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<TeacherSchoolRoleType> queryTeacherSchoolRoleType()
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<TeacherSchoolRoleType> list = ht.find(String.format("from TeacherSchoolRoleType"));
            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public TeacherSchoolRoleInfo queryTeacherSchoolRoleInfoByUserId(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<TeacherSchoolRoleInfo> list = ht.find(String.format("from TeacherSchoolRoleInfo where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewSelfInfo> queryViewStudentBaseInfoByStudentId(Long id)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewSelfInfo> list = ht.find(String.format("from ViewSelfInfo where id = '%d'", id));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public HealthBaseInfo queryHealthBaseInfo(Long userId, String time)
    {

        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<HealthBaseInfo> list = ht.find(String.format("from HealthBaseInfo where userId = '%d' and createTime = '%s'", userId, time));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<HealthBaseInfo> queryListHealthBaseInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<HealthBaseInfo> list = ht.find(String.format("from HealthBaseInfo where userId = '%d' ", userId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FoodBaseInfo> queryListFoodBaseInfo(Long classId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<FoodBaseInfo> list = ht.find(String.format("from FoodBaseInfo where classId = '%d' ", classId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FoodBaseInfo> queryListFoodBaseInfo(Long classId, String time)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<FoodBaseInfo> list = ht.find(String.format("from FoodBaseInfo where classId = '%d' and createTime='%s' ", classId, time));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    */
/**
     * 查询{@link ViewTeacherStudentInfo} 缓存{@link MasterDataDefs
     * teacherStudentMap}
     *//*

    @Override
    public List<ViewTeacherStudentInfo> queryListViewTeacherStudentInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewTeacherStudentInfo> list = ht.find(String.format("from ViewTeacherStudentInfo where studentId = '%d'", userId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewSelfInfo queryViewStudentBaseInfo(Long userId)
    {
        try
        {
            String maxTime = String.format("select distinct(max(inTime)) from ViewSelfInfo where id = '%d'", userId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewSelfInfo> list = ht.find(String.format("from ViewSelfInfo where id = '%d' and inTime = (%s)", userId, maxTime));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId, String foodTime)
    {
        try
        {
            foodTime = foodTime + " 00:00:00";
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewFoodBaseInfo> list = ht.find(String.format("from ViewFoodBaseInfo where id = '%d' and foodTime = '%s'", classId, foodTime));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewFoodBaseInfo> queryListViewFoodBaseInfo(Long classId, String startTime, String endTime)
    {
        try
        {
            startTime = startTime + " 00:00:00";
            endTime = endTime + " 00:00:00";
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewFoodBaseInfo> list = ht.find(String.format("from ViewFoodBaseInfo where id = '%d' and foodTime >= '%s' and foodTime < '%s'", classId, startTime, endTime));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewUserBaseInfo> queryListViewUserBaseInfoByClassId(Long classId,String createDay)
    {
        try
        {
            if(createDay == null || createDay.equals(""))
            {
                createDay = TimeCalculateUtils.getNowTime();
            }
            String createTime = createDay + " 00:00:00";
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewUserBaseInfo> list = ht.find(String.format("from ViewUserBaseInfo where userId in (select userId from UserStudentInfo where classId = '%d' and createTime <= '%s' and delTime is null) order by realName asc ", classId,createTime));
            if (list != null && list.size() > 0)
            {
                for (ViewUserBaseInfo info : list)
                {
                    updateCacheClassUserInfo(info, classId);
                }
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public CacheUserInfo updateCacheClassUserInfo(ViewUserBaseInfo viewUserBaseInfo, Long classId)
    {
        ViewClassBaseInfo viewClassBaseInfo = queryViewClassBaseInfo(classId);
        if (viewClassBaseInfo != null)
        {
            return updateCacheClassUserInfo(classId, viewUserBaseInfo.getUserId(), viewUserBaseInfo.getMobilePhone(), viewUserBaseInfo.getUserName(), viewUserBaseInfo.getRealName(), viewUserBaseInfo.getHeadUrl(), viewClassBaseInfo.getClassNo(),
                    viewClassBaseInfo.getGradeName());
        }
        return null;
    }

    // 更新CacheClassUserInfo缓存
    private CacheUserInfo updateCacheClassUserInfo(Long classId, Long userId, String mobilePhone, String userName, String realName, String headUrl, String classNo, String gradeName)
    {
        List<CacheUserInfo> userList = MasterDataDefs.classStudentMap.get(classId);
        CacheUserInfo cacheUserInfo = new CacheUserInfo();
        cacheUserInfo.setUserId(userId);
        cacheUserInfo.setMobilePhone(mobilePhone);
        cacheUserInfo.setUserName(userName);
        cacheUserInfo.setRealName(realName);
        cacheUserInfo.setHeadUrl(headUrl);
        cacheUserInfo.setClassNo(classNo);
        cacheUserInfo.setGradeName(gradeName);
        if (userList == null)
        {
            userList = new ArrayList<>();
        }
        userList.add(cacheUserInfo);
        MasterDataDefs.classStudentMap.put(classId, userList);
        return cacheUserInfo;
    }

    @Override
    public Integer queryListIOTotalInfo(Long studentId, String startTime, String endTime, Boolean isUnusual)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            String sql = null;
            if ((startTime == null || startTime.equals("")) && (endTime == null || endTime.equals("")))
            {
                sql = String.format("select Count(*) from IoBaseInfo where userId = '%d'", studentId);
            }
            else
            {
                sql = String.format("select Count(*) from IoBaseInfo where  ioDay >= '%s' and ioDay <= '%s'", startTime, endTime);
                sql = sql + String.format(" and userId = '%d' ", studentId);
                if (isUnusual != null)
                {
                    if (isUnusual)
                    {
                        sql = sql + String.format(" and disease is not null");
                    }
                }
            }
            List<Integer> listTotaolCount = ht.find(sql);
            if (listTotaolCount != null && listTotaolCount.size() > 0)
            {
                return listTotaolCount.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addHealthBaseInfo(HealthBaseInfo healthBaseInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.save(healthBaseInfo);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ViewFoodBaseInfo queryViewFoodBaseInfo(Long classId)
    {
        try
        {
            String foodTime = String.format("select distinct(max(foodTime)) from ViewFoodBaseInfo where id = '%d'", classId);
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewFoodBaseInfo> list = ht.find(String.format("from ViewFoodBaseInfo where id = '%d' and foodTime = (%s)", classId, foodTime));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FoodBaseInfo> queryUserFoodInfo(Integer schoolId, String foodTime)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<FoodBaseInfo> list = ht.find(String.format("select distinct new FoodBaseInfo(fbi.type,fbi.food) from FoodBaseInfo fbi where schoolId = '%d' and foodTime = '%s'", schoolId, foodTime));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private Integer queryUserSchoolInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<Integer> listSchoolId = ht.find(String.format("select distinct(schoolId) from ViewUserStudentInfo where userId = '%d'", userId));
            if (listSchoolId != null && listSchoolId.size() > 0)
            {
                return listSchoolId.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delUserFamilyInfo(UserFamilyInfo userFamilyInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.delete(userFamilyInfo);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delUserFamilyInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserFamilyInfo> listUserFamilyInfo = ht.find("from UserFamilyInfo where userId=%d", userId);
            if (listUserFamilyInfo != null && listUserFamilyInfo.size() > 0)
            {
                ht.delete(listUserFamilyInfo.get(0));
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUserParentInfo(UserParentInfo userParentInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(userParentInfo);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delUserParentInfo(Long userId, Long classId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserParentInfo> list = ht.find(String.format("from UserParentInfo where userId = %d and classId = %d", userId, classId));
            if (list != null && list.size() > 0)
            {
                ht.deleteAll(list);
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<BusLinesInfo> queryListBusLinesInfo(Long busId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<BusLinesInfo> list = ht.find(String.format("from BusLinesInfo where busId = '%d'  order by id", busId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delBusLinesInfoByBusLineId(Long busLineId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<BusLinesInfo> list = ht.find(String.format("from BusLinesInfo where id = '%d'", busLineId));
            if (list != null && list.size() > 0)
            {
                BusLinesInfo info = list.get(0);
                ht.delete(info);
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delBusLinesInfoByBusId(Long busId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<BusLinesInfo> list = ht.find(String.format("from BusLinesInfo where busId = '%d'", busId));
            if (list != null && list.size() > 0)
            {
                for (BusLinesInfo info : list)
                {
                    ht.delete(info);
                }
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateBusLinesInfo(List<BusLinesInfo> list)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdateAll(list);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<SchoolBusInfo> queryListSchoolBusInfo(Long id)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SchoolBusInfo> list = ht.find(String.format("from SchoolBusInfo where id = '%d'", id));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<SchoolBusInfo> queryListSchoolBusInfoBySchoolId(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SchoolBusInfo> list = ht.find(String.format("from SchoolBusInfo where schoolId = '%d' order by id desc", schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delSchoolBusInfo(Long busId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<SchoolBusInfo> list = ht.find(String.format("from SchoolBusInfo where id = '%d'", busId));
            if (list != null && list.size() > 0)
            {
                SchoolBusInfo info = list.get(0);
                ht.delete(info);
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateSchoolBusInfo(SchoolBusInfo list)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(list);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateFeedBackInfo(FeedBackInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateAdminUserInfo(AdminUserInfo info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public AdminUserCookie queryAdminUserCookie(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<AdminUserCookie> list = ht.find(String.format("from AdminUserCookie where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public AdminUserInfo queryAdminUserInfoByUserName(String userName)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<AdminUserInfo> list = ht.find(String.format("from AdminUserInfo where userName = '%s'", userName));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateAdminUserCookie(AdminUserCookie info)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdate(info);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public AdminUserInfo queryAdminUserInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<AdminUserInfo> list = ht.find(String.format("from AdminUserInfo where userId = %d", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ViewClassBaseInfo queryViewClassBaseInfo(Long classId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewClassBaseInfo> list = ht.find(String.format("from ViewClassBaseInfo where id = '%d'", classId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<UserStudentInfo> queryUserStudentInfoByStudentId(Integer schoolId, Long studentId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserStudentInfo> list = ht.find(String.format("from UserStudentInfo where schoolId = %d and studentId= %d and delTime is null", schoolId, studentId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewCardChildInfo> queryListViewCardChildInfo(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewCardChildInfo> list = ht.find(String.format("from ViewCardChildInfo where schoolId = %d and isDel = 0", schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CardFamilyInfo> queryListCardFamilyInfo(Long childId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardFamilyInfo> list = ht.find(String.format("from CardFamilyInfo where childId = %d and isDel = 0", childId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ViewCardChildInfo> queryListViewCardChildInfo(Integer schoolId, String lastUpdateTime)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            // 在上次更新时间之后更新或者插入
            List<ViewCardChildInfo> list = ht.find(String.format("from ViewCardChildInfo where updateTime > '%s' or createTime > '%s' and schoolId = %d", lastUpdateTime, lastUpdateTime, schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CardFamilyInfo> queryListCardFamilyInfo(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            // 在上次更新时间之后更新或者插入
            List<CardFamilyInfo> list = ht.find(String.format("from CardFamilyInfo where schoolId = %d and isDel = 0", schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CardFamilyInfo> queryListCardFamilyInfo(Integer schoolId, String lastUpdateTime)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardFamilyInfo> list = ht.find(String.format("from CardFamilyInfo where updateTime > '%s' or createTime > '%s' and schoolId = %d", lastUpdateTime, lastUpdateTime, schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public CardFamilyInfo queryCardFamilyInfo(Long childId, String roleName)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardFamilyInfo> list = ht.find(String.format("from CardFamilyInfo where childId = %d and roleName = '%s'", childId, roleName));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CardInfo> queryListCardInfo(Integer schoolId, String lastUpdateTime)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardInfo> list = ht.find(String.format("from CardInfo where updateTime > '%s' or createTime > '%s' and schoolId = %d", lastUpdateTime, lastUpdateTime, schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    */
/**
     * 接送家长 孩子信息
     *//*

    @Override
    public ViewCardChildInfo queryViewCardChildInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<ViewCardChildInfo> list = ht.find(String.format("from ViewCardChildInfo where userId = '%d'", userId));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delCardFamilyInfo(List<CardFamilyInfo> listCardFamilyInfoSave)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            for (CardFamilyInfo cardFamilyInfo : listCardFamilyInfoSave)
            {
                cardFamilyInfo.setIsDel(true);
            }
            ht.saveOrUpdateAll(listCardFamilyInfoSave);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCardFamilyInfo(List<CardFamilyInfo> listCardFamilyInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            ht.saveOrUpdateAll(listCardFamilyInfo);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean checkUserName(String mobilePhone)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserBaseInfo> list = ht.find(String.format("from UserBaseInfo where userName = %s ", mobilePhone));
            if (list == null || list.size() == 0)
            {
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public CardFamilyInfo queryCardFamilyInfo(Long id)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardFamilyInfo> list = ht.find(String.format("from CardFamilyInfo where id = %d", id));
            if (list != null && list.size() > 0)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateCardPushInfo(CardPushInfo cardPushInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            if (cardPushInfo != null)
            {
                ht.saveOrUpdate(cardPushInfo);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean updateCardChildInfo(CardChildInfo cardChildInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            if (cardChildInfo != null)
            {
                ht.saveOrUpdate(cardChildInfo);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean updateCardInfo(CardInfo cardInfo)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            if (cardInfo != null)
            {
                ht.saveOrUpdate(cardInfo);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public CardPushInfo queryCardPushInfo( String deviceId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardPushInfo> list = ht.find(String.format("from CardPushInfo where deviceId = '%s'", deviceId));
            if (list != null && list.size() == 1)
            {
                return list.get(0);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CardInfo> queryListCardInfo(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardInfo> list = ht.find(String.format("from CardInfo where schoolId = %d and isDel = 0",schoolId));
            if (list != null)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delCardInfo(Long cardId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardInfo> list = ht.find(String.format("from CardInfo where id = %d", cardId));
            if (list != null && list.size() > 0)
            {
                for (CardInfo cardInfo : list)
                {
                    cardInfo.setIsDel(true);
                    cardInfo.setUpdateTime(BasicUtils.getCurrentTime());
                    ht.save(cardInfo);
                }
                
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<CardInfo> queryCardInfo(Long userId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardInfo> list = ht.find(String.format("from CardInfo where childId = %d and isDel = 0", userId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateFamilyRoleType(FamilyRoleType familyRoleType)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            if (familyRoleType != null)
            {
                ht.saveOrUpdate(familyRoleType);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<CardPushInfo> queryListCardPushInfo(Integer schoolId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<CardPushInfo> list = ht.find(String.format("from CardPushInfo where schoolId = '%d'", schoolId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<UserParentInfo> queryUserParentInfoByUserIdAndStudentId(Long userId, Long studentId)
    {
        try
        {
            HibernateTemplate ht = this.getHibernateTemplate();
            List<UserParentInfo> list = ht.find(String.format("from UserParentInfo where userId = '%d' and studentId = '%d'", userId,studentId));
            if (list != null && list.size() > 0)
            {
                return list;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }



   
}
*/
