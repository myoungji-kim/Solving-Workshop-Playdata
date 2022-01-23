package workshop.dto;

// DTO 역할 ==> TB_STUDENT 레코드 저장
public class Student {
	private String stuNo;
	private String departNo;
	private String stuName;
	private String stuSsn;
	private String stuAdress;
	private String entDate;
	private String absYn;
	private String coachProfessorNo;
	
	public Student(String stuNo, String departNo, String stuName, String stuSsn, String stuAdress, String entDate,
			String absYn, String coachProfessorNo) {
		this.stuNo = stuNo;
		this.departNo = departNo;
		this.stuName = stuName;
		this.stuSsn = stuSsn;
		this.stuAdress = stuAdress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
	}
	
	public Student(String stuNo, String stuName, String stuSsn, String stuAdress, 
			String entDate, String absYn) {
		this.stuNo = stuNo;
		this.departNo = departNo;
		this.stuName = stuName;
		this.stuSsn = stuSsn;
		this.stuAdress = stuAdress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
	}

	public Student(String stuNo) {
		this.stuNo = stuNo;
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

	public String getStuAdress() {
		return stuAdress;
	}

	public void setStuAdress(String stuAdress) {
		this.stuAdress = stuAdress;
	}

	public String getEntDate() {
		return entDate;
	}

	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}

	public String getAbsYn() {
		return absYn;
	}

	public void setAbsYn(String absYn) {
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
		return stuNo + "  " + stuName + "   " + stuSsn + "    " + stuAdress + "    " + entDate + "   " + absYn;
	}
	
	
}
