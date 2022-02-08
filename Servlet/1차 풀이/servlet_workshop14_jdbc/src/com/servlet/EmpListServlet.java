package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 목록
		EmpService service = new EmpServiceImpl();
		List<EmpDTO> list = service.selectAll();
		for (EmpDTO empDTO : list) {
			System.out.println(empDTO);
		}
		
		// 응답처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<table border=\"1\">");
		out.print("<tr><th>학번</th><th>학과번호</th><th>이름</th><th>주민번호</th><th>주소</th><th>입학년도</th><th>휴학여부</th></tr>");
		for (EmpDTO empDTO : list) {
			String student_no = empDTO.getStudent_no();
			String department_no = empDTO.getDepartment_no();
			String student_name = empDTO.getStudent_name();
			String student_ssn = empDTO.getStudent_ssn();
			String student_address = empDTO.getStudent_address();
			String entrance_date = empDTO.getEntrance_date();
			String absence_yn = empDTO.getAbsence_yn();
			
			out.println("<tr><th>"+student_no+"</th><th>"+department_no+"</th><th>"+student_name+"</th><th>"+student_ssn+"</th><th>"+student_address+"</th><th>"+entrance_date+"</th><th>"+absence_yn+"</th></tr>");
		}
		out.print("</table>"); 
	//	out.print("<a href='deptForm.html'>등록화면</a>");
		out.print("</body></html>"); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
