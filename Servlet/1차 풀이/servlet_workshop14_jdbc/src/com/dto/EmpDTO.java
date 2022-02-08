package com.dto;

// dept 테이블의 하나릐 레코드 저장
// 변수 명은 컬럼 명과 동일하게 작성하자!
public class EmpDTO {
	private String student_no;
	private String department_no;
	private String student_name;
	private String student_ssn;
	private String student_address;
	private String entrance_date;
	private String absence_yn;
	
	public EmpDTO() {
	}

	public EmpDTO(String student_no, String department_no, String student_name, String student_ssn, String student_address, String entrance_date, String absence_yn) {
		super();
		this.student_no = student_no;
		this.department_no = department_no;
		this.student_name = student_name;
		this.student_ssn = student_ssn;
		this.student_address = student_address;
		this.entrance_date = entrance_date;
		this.absence_yn = absence_yn;
	}

	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}

	public String getDepartment_no() {
		return department_no;
	}

	public void setDepartment_no(String department_no) {
		this.department_no = department_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_ssn() {
		return student_ssn;
	}

	public void setStudent_ssn(String student_ssn) {
		this.student_ssn = student_ssn;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getEntrance_date() {
		return entrance_date;
	}

	public void setEntrance_date(String entrance_date) {
		this.entrance_date = entrance_date;
	}

	public String getAbsence_yn() {
		return absence_yn;
	}

	public void setAbsence_yn(String absence_yn) {
		this.absence_yn = absence_yn;
	}

	@Override
	public String toString() {
		return "EmpDTO [student_no=" + student_no + ", department_no=" + department_no + ", student_name="
				+ student_name + ", student_ssn=" + student_ssn + ", student_address=" + student_address
				+ ", entrance_date=" + entrance_date + ", absence_yn=" + absence_yn + "]";
	}

}
