package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 처리
		String name = request.getParameter("name");
		String gender = getGender(request.getParameter("num"));
		String[] hobbies = request.getParameterValues("hobbies");
		String marry = request.getParameter("marry");
		
		// 응답 처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("이름은 " +name+"<br>");
		out.print("성별은 " +gender+"<br>");
		out.print("취미는 " +Arrays.toString(hobbies)+"<br>");
		out.print("결혼 상태는 " +marry+"입니다<br>");
		out.print("</body></html>");
	}

	private String getGender(String p) {
		String x = (p.split("-")[1]).substring(0, 1);
		String y = "";

		if (x.equals("1")) y = "남자";
		else if (x.equals("2")) y = "여자";
		
		return y;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
