package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mesg = "";
		
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		mesg += "정상적으로 로그아웃<br>";
		mesg += "<a href='loginForm.html'>로그인화면</a>";
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(mesg);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
