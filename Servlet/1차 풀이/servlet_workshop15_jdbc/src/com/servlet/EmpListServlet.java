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
		out.print("<tr><th>사원번호</th><th>사원이름</th><th>월급</th><th>입사일</th><th>부서번호</th></tr>");
		for (EmpDTO empDTO : list) {
			int empno = empDTO.getEmpno();
			String ename = empDTO.getEname();
			int sal = empDTO.getSal();
			String hiredate = empDTO.getHiredate();
			int deptno = empDTO.getDeptno();
			out.println("<tr><th>"+empno+"</th><th>"+ename+"</th><th>"+sal+"</th><th>"+hiredate+"</th><th>"+deptno+"</th></tr>");
		}
		out.print("</table>");
		out.print("<a href='member.html'>회원가입화면</a>");
		out.print("</body></html>"); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
