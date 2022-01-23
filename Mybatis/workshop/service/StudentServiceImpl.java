package workshop.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import workshop.dao.StudentDAO;
import workshop.dto.Student;

public class StudentServiceImpl implements StudentService {

	// 1번
	@Override
	public List<Student> selectAll() {
		List <Student> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			StudentDAO dao = new StudentDAO();
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}
	
	// 2번
	@Override
	public List<Student> selectByStuName(String stuName) {
		List<Student> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			StudentDAO dao = new StudentDAO();
			list = dao.selectByStuName(session, stuName);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<Student> selectByEntrance(HashMap<String, String> entrances) {
		List<Student> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			StudentDAO dao = new StudentDAO();
			list = dao.selectByEntrance(session, entrances);
		} finally {
			session.close();
		}
		return list;
	}

	// 4번
	@Override
	public List<Student> selectByStuNo(ArrayList<String> stuNo) {
		List<Student> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			StudentDAO dao = new StudentDAO();
			list = dao.selectByStuNo(session, stuNo);
		} finally {
			session.close();
		}
		return list;
	}

	// 5번
	@Override
	public void updateStuAbs(ArrayList<String> stuNo) {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			StudentDAO dao = new StudentDAO();
			dao.updateStuAbs(session, stuNo);
			session.commit();
		} finally {
			session.close();
		}
	}

	// 6번
	@Override
	public int capacityChange() {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			StudentDAO dao = new StudentDAO();
			num = dao.capacityChange(session);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}

	// 7번
	@Override
	public List<HashMap<String, String>> gradeSearch(String stuNo) {
		List<HashMap<String, String>> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			StudentDAO dao = new StudentDAO();
			list = dao.gradeSearch(session, stuNo);
		} finally {
			session.close();
		}
		return list;
	}

	// 8번
	@Override
	public int countAll() {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			StudentDAO dao = new StudentDAO();
			n = dao.countAll(session);
		} finally {
			session.close();
		}
		return n;
	}
	
	@Override
	public List<Student> selectByPage(int contentNum, int pageNum) {
		List <Student> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			StudentDAO dao = new StudentDAO();
			int skip = pageNum*contentNum;
			list = dao.selectByPage(session, skip ,contentNum);
		} finally {
			session.close();
		}
		return list;
	}
	
	
	
}
