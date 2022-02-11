package com.service;

import org.apache.ibatis.session.SqlSession;

import com.dao.StudentDAO;
import com.dto.PageDTO;

public class StudentServiceImpl implements StudentService {

	@Override
	public PageDTO selectAllStudent(int curPage) {
		PageDTO pageDTO = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			StudentDAO dao = new StudentDAO();
			pageDTO = dao.selectAllStudent(session, curPage);
			
		}finally {
			session.close();
		}
		
		return pageDTO;
	}

}
