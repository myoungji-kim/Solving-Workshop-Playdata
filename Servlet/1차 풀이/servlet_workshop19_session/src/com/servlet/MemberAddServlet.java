package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Member;

@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {
	
	HashMap<String, Member> userList = new HashMap<String, Member>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String mesg = "";
		
		// 원래는 DB 연동인데 여기 문제에선 생략
		
		if (userList.containsKey(username)) {
			mesg += "<h2>중복 데이터로 인한 학생 저장 실패</h2>";
			mesg += "<a href='member.html'>학생저장화면</a>";
		} else {
			// 세션 얻기
			HttpSession session = request.getSession();
			
			// 데이터 저장
			session.setAttribute("name", username);
			session.setAttribute("age", age);
			session.setAttribute("address", address);
			
			// 정보 따로 저장
			Member userDTO = new Member(username, age, address);
			userList.put(username, userDTO);
			
			mesg += "<h3>세션에 이름/나이/주소 저장 성공</h3>";
			mesg += "<a href='MemberListServlet'>세션정보보기</a>";
		}
		System.out.println(userList.toString());
		
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
