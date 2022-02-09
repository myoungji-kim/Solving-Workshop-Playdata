package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

public class MemberDAO {
	public MemberDTO selectByMemberIDandPW(SqlSession session, HashMap<String, String> map) {
		MemberDTO dto = session.selectOne("com.config.MemberMapper.selectByMemberIDandPW", map);
		return dto;
	}

}
