package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;

@WebServlet("/EmpInsertServlet")
public class EmpInsertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청 처리
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String deptno = request.getParameter("deptno");
		String mgr = request.getParameter("mgr"); 
		String date = request.getParameter("date");
		String sal = request.getParameter("sal");
		String job = request.getParameter("job");
		
		System.out.println(empno+"\t"+ename+"\t"+sal+"\t"+date+"\t"+deptno+"\t"+job+"\t"+mgr);
		EmpDTO dto = new EmpDTO(Integer.parseInt(empno), ename, Integer.parseInt(sal), date, Integer.parseInt(deptno), job, Integer.parseInt(mgr));
		
		EmpService service = new EmpServiceImpl();
		int num = service.insert(dto);
		
		// 응답 처리
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		if(num==1) {
			out.println("저장성공");
			out.println("<a href='EmpListServlet'>목록보기</a>");
		}
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
