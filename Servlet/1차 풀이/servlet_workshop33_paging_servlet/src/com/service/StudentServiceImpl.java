package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.StudentDAO;
import com.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
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
	public List<StudentDTO> selectByPage(int contentNum, int pageNum) {
		List <StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			StudentDAO dao = new StudentDAO();
			int skip = (pageNum-1)*contentNum;
			list = dao.selectByPage(session, skip, contentNum);
		} finally {
			session.close();
		}
		return list;
	}
}
