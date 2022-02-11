package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentDAO {

	private int totalCount(SqlSession session) {
		return session.selectOne("com.config.StudentMapper.totalCount");
	}
	
	// curPage는 현재 페이지 번호( 처음에는 기본이 1 )
	public PageDTO selectAllStudent(SqlSession session, int curPage) {
		
		int totalCount = totalCount(session);
		int perPage = 3;  //페이지당 보여줄 갯수
		int offset = (curPage-1)*perPage;
		List<StudentDTO> list = 
				session.selectList("com.config.StudentMapper.selectAllStudent",
						null, new RowBounds(offset, perPage));
		
		//4가지 정보를 한꺼번에 저장하여 관리 => Hashmap, 일반클래스(PageDTO)
		PageDTO pageDTO = new PageDTO();
		pageDTO.setTotalCount(totalCount);
		pageDTO.setCurPage(curPage);
		pageDTO.setPerPage(perPage);
		pageDTO.setList(list);
		
		return pageDTO;
	}
	
}
