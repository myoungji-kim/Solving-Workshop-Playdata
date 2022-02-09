package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThingDeleteServlet")
public class ThingDeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tid = request.getParameter("tid");
		String mesg = "";
		
		HttpSession session = request.getSession();
		HashMap tlist = (HashMap) session.getAttribute("tlist");
		
		session.removeAttribute(tid);
		tlist.remove(tid);
		
		mesg += "<h2>"+tid+" 상품 삭제 성공 </h2>";
		mesg += "<a href='addThing.html'>등록화면보기</a><br>";
		mesg += "<a href='ThingListServlet'>상품목록보기</a><br>";
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(mesg);
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
