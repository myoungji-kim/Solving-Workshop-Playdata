package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.tribes.util.Arrays;

import com.dto.Thing;

@WebServlet("/ThingListServlet")
public class ThingListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		HashMap tlist = (HashMap) session.getAttribute("tlist");
		String tname = (String) session.getAttribute("tname");
		String tid = (String) session.getAttribute("tid");
		String tnum = (String) session.getAttribute("tnum");
		String mesg = "";
		
		// null 체크
		mesg += "<table border='1'>";
		mesg += "<tr><th>상품아이디</th><th>상품명</th><th>갯수</th></tr>";
		
		if (tid != null) {
			Set<String> keySet = tlist.keySet();
			for(String key : keySet) {
				mesg += "<tr>";
				mesg += "<td>"+((Thing) tlist.get(key)).getTname()+"</td>";
				mesg += "<td>"+((Thing) tlist.get(key)).getTid()+"</td>";
				mesg += "<td>"+((Thing) tlist.get(key)).getTnum()+"</td>";
				mesg += "</tr>";
			}
		} 
		
		mesg += "</table>";
		mesg += "<br><a href='addThing.html'>등록화면보기</a>";
		mesg += "<br><a href='ThingDeleteAllServlet'>전체상품삭제</a>";
		mesg += "<br><a href='deleteThing.html'>특정상품삭제</a>";
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(mesg);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
