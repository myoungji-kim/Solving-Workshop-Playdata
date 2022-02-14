package com.dto;

public class PageDTO {
	int contentNum; // 한 페이지 당 보여줄 게시글 수
	int pageNum; 	// 현재 페이지
	int blockNum;  // 한 블럭 당 보여줄 페이지 수
	int allContentNum; // 전체 게시글 수
	int allPage;  // 전체 페이지 수
	int pageBegin; // 블럭 페이지 시작 번호
	int pageEnd;  // 블럭 페이지 끝 번호
	
	public PageDTO(int contentNum, int pageNum, int blockNum, int allContentNum) {
		this.contentNum = contentNum;
		this.pageNum = pageNum;
		this.blockNum = blockNum;
		this.allContentNum = allContentNum;
		this.allPage = (int) Math.ceil (allContentNum / contentNum);
		this.pageBegin = getPageBegin(pageNum, blockNum, allPage);
		this.pageEnd = getPageEnd(pageBegin, blockNum, allPage);
	}
	
	// 블럭 페이지 시작 번호
	private int getPageBegin(int pageNum, int blockNum, int allPage) {
		int pg_value = (int) Math.ceil(pageNum / blockNum);
		if (pageNum % blockNum != 0) pg_value++;
		int pageBegin = (blockNum*(pg_value-1))+1;
		return pageBegin;
	}
	
	// 블럭 페이지 끝 번호
	private int getPageEnd(int pageBegin, int blockNum, int allPage) {
		int pageEnd = pageBegin + blockNum - 1;
		if (pageEnd >= allPage) pageEnd = allPage;
		return pageEnd;
	}

	public int getContentNum() {
		return contentNum;
	}

	public void setContentNum(int contentNum) {
		this.contentNum = contentNum;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getBlockNum() {
		return blockNum;
	}

	public void setBlockNum(int blockNum) {
		this.blockNum = blockNum;
	}

	public int getAllContentNum() {
		return allContentNum;
	}

	public void setAllContentNum(int allContentNum) {
		this.allContentNum = allContentNum;
	}

	public int getAllPage() {
		return allPage;
	}

	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}

	public int getPageBegin() {
		return pageBegin;
	}

	public void setPageBegin(int pageBegin) {
		this.pageBegin = pageBegin;
	}

	public int getPageEnd() {
		return pageEnd;
	}

	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}
}
