package workshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import workshop.dto.Student;

public class StudentDAO {
	public List <Student> selectAll(SqlSession session){
		List <Student> list = session.selectList("workshop.config.StudentMapper.selectAll");
		return list;
	}
	
	public List<Student> selectByStuName(SqlSession session, String stuName){
		List <Student> list = session.selectList("workshop.config.StudentMapper.selectByStuName", stuName);
		return list;
	}
	
	
	public List<Student> selectByEntrance(SqlSession session, HashMap <String, String> entrances){
		List<Student> list = session.selectList("workshop.config.StudentMapper.selectByEntrance", entrances);
		return list;
	} // end selectByEntrance
	
	public List<Student> selectByStuNo (SqlSession session, ArrayList<String> stuNo){
		List<Student> list = session.selectList("workshop.config.StudentMapper.selectByStuNo", stuNo);
		return list;
	} // end selectByStuNo
	
	public void updateStuAbs (SqlSession session, ArrayList<String> stuNo) {
		session.update("workshop.config.StudentMapper.updateStuAbs", stuNo);
	} // end update

	public int capacityChange(SqlSession session) {
		int n = session.update("workshop.config.StudentMapper.capacityChange");
		return n;
	}
	
	public List<HashMap<String, String>> gradeSearch(SqlSession session, String stuNo){
		List<HashMap<String, String>> list = session.selectList("workshop.config.StudentMapper.gradeSearch", stuNo);
		return list;
	}
	
	// 8번
	public int countAll(SqlSession session) {
		int n = session.selectOne("workshop.config.StudentMapper.countAll");
		return n;
	}

	public List<Student> selectByPage(SqlSession session, int skip, int contentNum) {
		List <Student> list = session.selectList("workshop.config.StudentMapper.selectAll", null, new RowBounds(skip, contentNum));
//		session.selectList("exam3.EmpMapper.selectAllPage", null, new RowBounds(2, 3));
		return list;
	}
}
