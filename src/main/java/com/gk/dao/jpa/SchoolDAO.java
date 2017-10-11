/*
package com.gk.dao.jpa;

import com.gk.entity.condition.PageSelectInfo;
import com.gk.entity.master.*;
import com.gk.entity.schoolbase.CourseInfo;
import com.gk.entity.schoolbase.GradeInfo;
import com.gk.entity.schoolbase.QueryAdminSchoolCondition;
import com.gk.entity.schoolbase.SchoolInfo;

import java.util.List;

public interface SchoolDAO
{
    ClassBaseInfo queryClassBaseInfo(Long id);
    ClassBaseInfo                  queryClassBaseInfo(Integer schoolId, Integer gradeNo, String classNo);
    List<ClassBaseInfo>            queryListClassBaseInfo(Integer schoolId, Integer gradeNo, PageSelectInfo pageSelectInfo);
    List<ClassBaseInfo>            queryListClassBaseInfoByInviteCode(String inviteCode);
    List<ViewClassBaseInfo>        queryListViewClassBaseInfo(Integer schoolId, Integer gradeNo, String classNo, PageSelectInfo pageSelectInfo);
    boolean                        updateClassBaseInfo(ClassBaseInfo info);
    boolean                        delClassBaseInfo(Long id);
    List<String>                   queryListClassNo(Integer schoolId, Integer gradeNo);
    List<ClassBaseInfo>            queryListClassBaseInfo(Integer schoolId, Integer gradeNo);

    List<ViewUserTeacherInfo>      queryListViewUserTeacherInfo(QueryTeacherCondition condition, PageSelectInfo pageSelectInfo);
    UserTeacherInfo queryUserTeacherInfo(Long classId, Integer courseId);

    List<ViewUserStudentInfo>      queryListViewUserStudentInfo(QueryStudentCondition condition, PageSelectInfo pageSelectInfo);

    // 学校管理
    List<SchoolInfo>               queryListSchoolInfo(QueryAdminSchoolCondition condition, PageSelectInfo pageSelectInfo);
    List<SchoolInfo>               queryListSchoolInfoByInviteCode(String inviteCode);
    List<SchoolInfo>               queryListSchoolInfoByInviteCodeAndCity(String inviteCode, Integer cityId);
    SchoolInfo                     querySchoolInfo(Integer id);
    boolean                        updateSchoolInfo(SchoolInfo info);
    boolean                        delSchoolInfo(Integer id);
    
    SchoolInfo                     querySchoolInfoByManageUserId(Long manageUserId);
 
	
	ViewClassBaseInfo               queryViewClassBaseInfo(Long classId);

    List<SchoolInfo> queryListSchoolInfoByCountyId(Integer countyId);
    
    List<CourseInfo> queryListCourseInfo();

    GradeInfo queryGradeInfoById(Integer id);

    List<GradeInfo> queryListGradeInfoBySchoolId(Integer schoolId);

    List<GradeInfo> queryListGradeInfo();
    
    boolean         updateGradeInfo(GradeInfo gradeInfo);
    
    boolean         delGradeInfo(Integer id);

}*/
