package com.service;

import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;

public interface StudentService {

	public PageDTO selectAllStudent( int curPage);
		
}
