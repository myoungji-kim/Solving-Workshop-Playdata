package com.dto;

public class StudentDTO {
	
	private String stuNo;
	private String departNo;
	private String stuName;
	private String stuSsn;
	private String stuAddress;
	private String entDate;
	private char absYn;
	private String coachProfessorNo;
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDTO(String stuNo, String departNo, String stuName, String stuSsn, String stuAddress, String entDate,
			char absYn, String coachProfessorNo) {
		super();
		this.stuNo = stuNo;
		this.departNo = departNo;
		this.stuName = stuName;
		this.stuSsn = stuSsn;
		this.stuAddress = stuAddress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getDepartNo() {
		return departNo;
	}
	public void setDepartNo(String departNo) {
		this.departNo = departNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSsn() {
		return stuSsn;
	}
	public void setStuSsn(String stuSsn) {
		this.stuSsn = stuSsn;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getEntDate() {
		return entDate;
	}
	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}
	public char getAbsYn() {
		return absYn;
	}
	public void setAbsYn(char absYn) {
		this.absYn = absYn;
	}
	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}
	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}
	@Override
	public String toString() {
		return "StudentDTO [stuNo=" + stuNo + ", departNo=" + departNo + ", stuName=" + stuName + ", stuSsn=" + stuSsn
				+ ", stuAddress=" + stuAddress + ", entDate=" + entDate + ", absYn=" + absYn + ", coachProfessorNo="
				+ coachProfessorNo + "]";
	}
	
	
	

}
