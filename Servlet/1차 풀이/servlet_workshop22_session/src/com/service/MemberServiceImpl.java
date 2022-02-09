package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.MemberDAO;
import com.dto.MemberDTO;


public class MemberServiceImpl implements MemberService {
	

	@Override
	public MemberDTO selectByMemberIDandPW(HashMap<String, String> map) {
		MemberDTO dto = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MemberDAO dao = new MemberDAO();
			dto = dao.selectByMemberIDandPW(session, map);
		}finally {
			session.close();
		}
		return dto;
	}



}
