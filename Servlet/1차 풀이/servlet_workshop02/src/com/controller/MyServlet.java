package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 처리
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		
		// 응답 처리
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body><table border='1'>");
		out.print("<tr><th>이름</th><th>나이</th><th>주소</th></tr><tr>");
		out.print("<td>"+name+"</td>");
		out.print("<td>"+age+"</td>");
		out.print("<td>"+address+"</td>");
		out.print("</tr>");
		out.print("</table></body></html>");
	
	}

}
