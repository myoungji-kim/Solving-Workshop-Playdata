package com.service;

import java.util.HashMap;
import java.util.List;

import com.dto.MemberDTO;

public interface MemberService {

	//로그인용 아이디 비번 조회
	public MemberDTO selectByMemberIDandPW(HashMap<String, String> map);
	
}
