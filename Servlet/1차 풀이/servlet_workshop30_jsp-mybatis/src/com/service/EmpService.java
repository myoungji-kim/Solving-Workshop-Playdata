package com.service;

import java.util.List;

import com.dto.EmpDTO;

/*
 * 역할 : CRUD 할 수 있는 추상 메서드 정의
*/

public interface EmpService {
	// Select
	public List<EmpDTO> selectAll();
/*	public EmpDTO selectByDeptno (int deptno);
	public int insert(EmpDTO dto);
	public int delete(int deptno);
	public int update(EmpDTO dto);
	
	// 트랙잭션 처리 실습 메서드
	public int tx(); */
}
