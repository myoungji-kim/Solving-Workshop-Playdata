package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mesg = "";
		
		HttpSession session = request.getSession();
		
		MemberDTO dto = (MemberDTO) session.getAttribute("info");
		
		mesg += "이름: "+dto.getUsername()+"<br>";
		mesg += "주소: "+dto.getAddress()+"<br>";
		mesg += "이메일: "+dto.getEmail()+"<br>";
		mesg += "<a href='LogoutServlet'>로그아웃</a>";
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(mesg);
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
