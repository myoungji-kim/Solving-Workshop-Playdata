package com.service;

import java.util.List;

import com.dto.StudentDTO;

public interface StudentService {
	public int countAll();
	public List<StudentDTO> selectByPage(int contentNum, int pageNum);
}
