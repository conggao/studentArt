package com.gk.entity.common.protocol;




public class QueryColumnListReq implements java.io.Serializable 
{
	private Integer stageId;
	private Integer textbookVersionId;
	private Integer courseId;
	private Integer GradeId;
	
	public Integer getStageId() {
		return stageId;
	}
	public void setStageId(Integer stageId) {
		this.stageId = stageId;
	}
	public Integer getTextbookVersionId() {
		return textbookVersionId;
	}
	public void setTextbookVersionId(Integer textbookVersionId) {
		this.textbookVersionId = textbookVersionId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getGradeId() {
		return GradeId;
	}
	public void setGradeId(Integer gradeId) {
		GradeId = gradeId;
	}
	
	

}