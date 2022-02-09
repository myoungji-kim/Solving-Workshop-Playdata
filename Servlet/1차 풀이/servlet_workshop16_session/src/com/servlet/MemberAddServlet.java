package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String mesg = "";
		
		// 원래는 DB 연동인데 여기 문제에선 생략
		
		// 세션 얻기
		HttpSession session = request.getSession();
		
		// 데이터 저장
		session.setAttribute("name", username);
		
		mesg += "세션에 이름 저장 성공";
		mesg += "<a href='MemberListServlet'>세션정보보기</a>";
		
		// 응답 처리
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(mesg);
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
