package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

/*
 * 역할 
 * : DeptService의 추상 메서드 재정의해서 CRUD 작업 처리
 * : DB 연동 시 필요한 Connection까지 해결
 * 
 * 반드시 개별적인 CRUD 메서드 안에서 Connection을 맺고 Close 해야 함
 * (로컬 변수로 처리해야 된다.)
 * : DeptDAO에 Connection(con)을 전달해줌
 */

public class EmpServiceImpl implements EmpService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";

	public EmpServiceImpl() {
		try {
			Class.forName( driver ); // "oracle.jdbc.driver.OracleDriver"의 객체를 생성하는 작업

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	} // END 생성자

	@Override
	public List<EmpDTO> selectAll() {
		List <EmpDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			EmpDAO dao = new EmpDAO();
			list = dao.selectAll(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

/*	@Override
	public EmpDTO selectByDeptno (int deptno) {
		EmpDTO dto = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			EmpDAO dao = new EmpDAO();
			dto = dao.selectByDeptno(con, deptno);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	} */ // END selectByDeptno 메서드

	@Override
	public int insert (EmpDTO dto) {
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			EmpDAO dao = new EmpDAO();
			num = dao.insert(con, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}  // END insert

/*		@Override
	public int delete (int deptno) {
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			EmpDAO dao = new EmpDAO();
			num = dao.delete(con, deptno);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	} */ // END delete

/*		@Override
	public int update (EmpDTO dto) {
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			EmpDAO dao = new EmpDAO();
			num = dao.update(con, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	} */ // END update

/*		@Override
	public int tx() {
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			EmpDAO dao = new EmpDAO();
			////////트랜잭션 처리//////////////////////////////
			con.setAutoCommit(false);
			// insert
			num = dao.insert2(con, new EmpDTO(6, "aa", "aa"));
			// delete
			num = dao.delete2(con, 2);
			con.commit();
			//////////////////////////////////////////////
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("tx 작업 실패로 인해 모든 작업이 rollback 됨.");
			//		e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	} */ //end tx

} // END 클래스