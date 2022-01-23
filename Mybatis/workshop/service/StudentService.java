package workshop.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import workshop.dto.Student;

public interface StudentService {
	public List<Student> selectAll();
	public List<Student> selectByStuName(String stuName);
	public List<Student> selectByEntrance(HashMap <String, String> entrances);
	public List<Student> selectByStuNo(ArrayList<String> stuNo);
	public void updateStuAbs(ArrayList<String> stuNo);
	public int capacityChange();
	public List<HashMap<String, String>> gradeSearch(String stuNo);
	public int countAll();
	public List<Student> selectByPage(int contentNum, int pageNum);
}
