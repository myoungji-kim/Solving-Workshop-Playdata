package com.dto;

// dept 테이블의 하나릐 레코드 저장
// 변수 명은 컬럼 명과 동일하게 작성하자!
public class EmpDTO {
	private int empno;
	private String ename;
	private int sal;
	private String hiredate;
	private int deptno;
	private int mgr;
	private String job;
	
	public EmpDTO() {
	}

	public EmpDTO(int empno, String ename, int sal, String hiredate, int deptno, String job, int mgr) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.hiredate = hiredate;
		this.deptno = deptno;
		this.job = job;
		this.mgr = mgr;
	}
	
	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", hiredate=" + hiredate + ", deptno="
				+ deptno + "]";
	}

}
