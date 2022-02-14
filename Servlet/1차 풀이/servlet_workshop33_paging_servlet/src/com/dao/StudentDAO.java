package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.StudentDTO;


public class StudentDAO {
	public int countAll(SqlSession session) {
		int n = session.selectOne("com.config.StudentMapper.countAll");
		return n;
	}
	
	public List<StudentDTO> selectByPage(SqlSession session, int skip, int contentNum) {
		List <StudentDTO> list = session.selectList("com.config.StudentMapper.selectAll", null, new RowBounds(skip, contentNum));
		return list;
	}
}

