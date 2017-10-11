/*
package com.gk.service;

import java.util.List;

import com.dao.SchoolDAO;
import com.dao.SchoolDAOImpl;
import com.entity.condition.PageSelectInfo;
import com.entity.master.ClassBaseInfo;
import com.entity.master.ViewClassBaseInfo;
import com.entity.schoolbase.CourseInfo;
import com.entity.schoolbase.GradeInfo;
import com.entity.schoolbase.QueryAdminSchoolCondition;
import com.entity.schoolbase.SchoolInfo;

public class SchoolServiceImpl implements SchoolService
{

    private SchoolDAO schoolDAO;

    public void setSchoolDAO(SchoolDAOImpl schoolDAO)
    {
        this.schoolDAO = schoolDAO;
    }

    @Override
    public ClassBaseInfo queryClassBaseInfo(Long id)
    {
        return this.schoolDAO.queryClassBaseInfo(id);
    }

    @Override
    public ClassBaseInfo queryClassBaseInfo(Integer schoolId, Integer gradeNo, String classNo)
    {
        return this.schoolDAO.queryClassBaseInfo(schoolId, gradeNo, classNo);
    }

    @Override
    public List<ClassBaseInfo> queryListClassBaseInfo(Integer schoolId, Integer gradeNo, PageSelectInfo pageSelectInfo)
    {
        return this.schoolDAO.queryListClassBaseInfo(schoolId, gradeNo, pageSelectInfo);
    }

    @Override
    public List<ClassBaseInfo> queryListClassBaseInfoByInviteCode(String inviteCode)
    {
        return this.schoolDAO.queryListClassBaseInfoByInviteCode(inviteCode);
    }

    @Override
    public List<ViewClassBaseInfo> queryListViewClassBaseInfo(Integer schoolId, Integer gradeNo, String classNo, PageSelectInfo pageSelectInfo)
    {
        return this.schoolDAO.queryListViewClassBaseInfo(schoolId, gradeNo, classNo, pageSelectInfo);
    }

    @Override
    public boolean updateClassBaseInfo(ClassBaseInfo info)
    {
        return this.schoolDAO.updateClassBaseInfo(info);
    }

    @Override
    public boolean delClassBaseInfo(Long id)
    {
        return this.schoolDAO.delClassBaseInfo(id);
    }

    @Override
    public List<SchoolInfo> queryListSchoolInfo(QueryAdminSchoolCondition condition, PageSelectInfo pageSelectInfo)
    {
        return this.schoolDAO.queryListSchoolInfo(condition, pageSelectInfo);
    }

    @Override
    public boolean updateSchoolInfo(SchoolInfo info)
    {
        return this.schoolDAO.updateSchoolInfo(info);
    }

    @Override
    public boolean delSchoolInfo(Integer id)
    {
        return this.schoolDAO.delSchoolInfo(id);
    }

    @Override
    public SchoolInfo querySchoolInfo(Integer id)
    {
        return this.schoolDAO.querySchoolInfo(id);
    }

    @Override
    public List<SchoolInfo> queryListSchoolInfoByInviteCode(String inviteCode)
    {
        return this.schoolDAO.queryListSchoolInfoByInviteCode(inviteCode);
    }

    @Override
    public List<SchoolInfo> queryListSchoolInfoByInviteCodeAndCity(String inviteCode, Integer cityId)
    {
        return this.schoolDAO.queryListSchoolInfoByInviteCodeAndCity(inviteCode, cityId);
    }

    @Override
    public SchoolInfo querySchoolInfoByManageUserId(Long manageUserId)
    {
        return this.schoolDAO.querySchoolInfoByManageUserId(manageUserId);
    }

    @Override
    public List<SchoolInfo> queryListSchoolInfoByCountyId(Integer countyId)
    {
        return this.schoolDAO.queryListSchoolInfoByCountyId(countyId);
    }

    @Override
    public GradeInfo queryGradeInfoById(Integer id)
    {
        return this.schoolDAO.queryGradeInfoById(id);
    }

    @Override
    public List<GradeInfo> queryListGradeInfoBySchoolId(Integer schoolId)
    {
        return this.schoolDAO.queryListGradeInfoBySchoolId(schoolId);
    }

    @Override
    public boolean updateGradeInfo(GradeInfo gradeInfo, Integer schoolId)
    {
        if (gradeInfo.getName() != null && !gradeInfo.getName().equals(""))
        {
            GradeInfo info = new GradeInfo();
            if (gradeInfo.getSchoolId() != null)
            {
                info.setSchoolId(gradeInfo.getSchoolId());
            }
            else
            {
                info.setSchoolId(schoolId);
            }
            info.setName(gradeInfo.getName());
            if (gradeInfo.getId() != null)
            {
                info.setId(gradeInfo.getId());
            }
            this.schoolDAO.updateGradeInfo(info);
            return true;
        }
        return false;
    }

    @Override
    public boolean delGradeInfo(Integer id)
    {
        return this.schoolDAO.delGradeInfo(id);
    }

    @Override
    public List<CourseInfo> queryListCourseInfo()
    {
        return this.schoolDAO.queryListCourseInfo();
    }

    @Override
    public List<GradeInfo> queryListGradeInfo()
    {
        return this.schoolDAO.queryListGradeInfo();
    }

    @Override
    public List<String> queryListClassNo(Integer schoolId, Integer gradeNo)
    {
        return this.schoolDAO.queryListClassNo(schoolId, gradeNo);
    }
    
    @Override
    public List<ClassBaseInfo> queryListClassBaseInfo(Integer schoolId, Integer gradeNo)
    {
        return this.schoolDAO.queryListClassBaseInfo(schoolId, gradeNo);
    }

}
*/
