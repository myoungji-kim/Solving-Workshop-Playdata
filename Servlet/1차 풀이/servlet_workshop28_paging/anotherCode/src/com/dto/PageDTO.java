package com.dto;

import java.util.List;

public class PageDTO {

	int curPage;   //현재페이지 번호
	int perPage =3;  //페이지당 보여줄 갯수
	int totalCount;  //전체레코드 갯수
	List<StudentDTO> list;  // 화면에 보여줄 데이터
	
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<StudentDTO> getList() {
		return list;
	}
	public void setList(List<StudentDTO> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "PageDTO [curPage=" + curPage + ", perPage=" + perPage + ", totalCount=" + totalCount + ", list=" + list
				+ "]";
	}
	
	
	
}
