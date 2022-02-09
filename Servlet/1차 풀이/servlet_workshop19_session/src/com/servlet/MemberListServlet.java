package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션 얻기
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("name");
		String age = (String) session.getAttribute("age");
		String address = (String) session.getAttribute("address");
		String mesg = "";
		
		// null 체크
		if (username != null) {
			mesg += "세션에 등록된 정보:"+username+" "+age+" "+address;
			mesg += "<br><a href='member.html'>회원등록화면</a>";
		} else {
			mesg += "세션에 등록된 정보 없음";
			mesg += "<br><a href='member.html'>회원등록화면</a>";
		}
		
		// 응답처리
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(mesg);
		out.print("</body></html>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
