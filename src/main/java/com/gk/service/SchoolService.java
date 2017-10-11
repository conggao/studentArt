package com.gk.service;

import com.gk.entity.master.ClassBaseInfo;
import com.gk.entity.master.CourseInfo;
import com.gk.entity.master.GradeInfo;
import com.gk.entity.master.SchoolInfo;

import java.util.List;

public interface SchoolService
{
    ClassBaseInfo queryClassBaseInfo(Long id);

    ClassBaseInfo queryClassBaseInfo(Integer schoolId, Integer gradeNo, String classNo);

    //List<ClassBaseInfo> queryListClassBaseInfo(Integer schoolId, Integer gradeNo, PageSelectInfo pageSelectInfo);

    List<ClassBaseInfo> queryListClassBaseInfoByInviteCode(String inviteCode);

    //List<ViewClassBaseInfo> queryListViewClassBaseInfo(Integer schoolId, Integer gradeNo, String classNo, PageSelectInfo pageSelectInfo);

    boolean updateClassBaseInfo(ClassBaseInfo info);

    boolean delClassBaseInfo(Long id);

    List<String> queryListClassNo(Integer schoolId, Integer gradeNo);
    
    List<ClassBaseInfo> queryListClassBaseInfo(Integer schoolId, Integer gradeNo);

    List<SchoolInfo> queryListSchoolInfoByCountyId(Integer countyId);

    GradeInfo queryGradeInfoById(Integer id);

    List<GradeInfo> queryListGradeInfoBySchoolId(Integer schoolId);

    List<CourseInfo> queryListCourseInfo();

    List<GradeInfo> queryListGradeInfo();
    
    boolean         updateGradeInfo(GradeInfo gradeInfo, Integer schoolId);
    
    boolean         delGradeInfo(Integer id);

    // 学校管理
    //List<SchoolInfo> queryListSchoolInfo(QueryAdminSchoolCondition condition, PageSelectInfo pageSelectInfo);

    List<SchoolInfo> queryListSchoolInfoByInviteCode(String inviteCode);

    List<SchoolInfo> queryListSchoolInfoByInviteCodeAndCity(String inviteCode, Integer cityId);

    SchoolInfo querySchoolInfo(Integer id);

    boolean updateSchoolInfo(SchoolInfo info);

    boolean delSchoolInfo(Integer id);

    SchoolInfo querySchoolInfoByManageUserId(Long manageUserId);

   
}