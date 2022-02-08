package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.EmpDTO;

// DAO 패턴
/*
 * 역할  => DB 연동
 * : SQL문 작성
 * : PreparedStatement 생성
 * : ResultSet rs = pstmt.executeQuery()
 * : 결과 데이터를 DeptMain에서 출력하도록
 * : 결과 데이터를 List<DeptDTO> 형식으로 만들어서 반환
*/
public class EmpDAO {
	public List <EmpDTO> selectAll(Connection con){
		// 누적용
		List <EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select empno as 사원번호, ename, sal, TO_CHAR(hiredate, 'YYYY/MM/DD') as hiredate, deptno from emp";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt("사원번호");
				String ename = rs.getNString("ename");
				int sal = rs.getInt("sal"); 
				String hiredate = rs.getNString("hiredate");
				int deptno = rs.getInt("deptno");
				
				EmpDTO dto = new EmpDTO(empno, ename, sal, hiredate, deptno);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null)rs.close();
				if (pstmt!=null)pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	} // END selectAll 메서드
	
	
	// 부서 번호로 검색
/*	public EmpDTO selectByDeptno(Connection con, int deptno) {
		EmpDTO dto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select deptno as 부서번호, "
				+ "dname, loc "
				+ "from dept where deptno=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String dname = rs.getNString("dname");
				String loc = rs.getNString(3); 
				
				dto = new EmpDTO(deptno, dname, loc);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null)rs.close();
				if (pstmt!=null)pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	} */ // end selectByDeptno
	
	// 저장
/*	public int insert(Connection con, EmpDTO dto) {
		int num = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "insert into dept (deptno, dname, loc) values (?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null)rs.close();
				if (pstmt!=null)pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	} */ // end insert

	// 삭제
/*	public int delete(Connection con, int deptno) {
		int num = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "delete from dept where deptno = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null)rs.close();
				if (pstmt!=null)pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	} */ // end delete
	
	// 수정
/*	public int update(Connection con, EmpDTO dto) {
		int num = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "update dept set dname=?, loc=? where deptno=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, dto.getDeptno());
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null)rs.close();
				if (pstmt!=null)pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	} */ // end update
		
	// 저장2
/*	public int insert2(Connection con, EmpDTO dto) throws SQLException {
		int num = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "insert into dept (deptno, dname, loc) values (?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			num = pstmt.executeUpdate();
		} finally {
			try {
				if (rs!=null)rs.close();
				if (pstmt!=null)pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	} */ // end insert

	// 삭제2
/*	public int delete2(Connection con, int deptno) throws SQLException {
		int num = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "delet from dept where deptno = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			num = pstmt.executeUpdate();
		} finally {
			try {
				if (rs!=null)rs.close();
				if (pstmt!=null)pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	} */ // end delete

}
	



