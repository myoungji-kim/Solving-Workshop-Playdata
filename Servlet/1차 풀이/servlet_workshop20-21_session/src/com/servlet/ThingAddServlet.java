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

import com.dto.Thing;

@WebServlet("/ThingAddServlet")
public class ThingAddServlet extends HttpServlet {
	
	HashMap<String, Thing> thingList = new HashMap<String, Thing>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 처리
		String tname = request.getParameter("tname");
		String tid = request.getParameter("tid");
		String tnum = request.getParameter("tnum");
		String mesg = "";
		
		// 세션  얻기
		HttpSession session = request.getSession();
		
		// 키값 체크해서 있으면 tnum 업데이트
		if (thingList.containsKey(tid)) {
			int temp = thingList.get(tid).getTnum();
			thingList.get(tid).setTnum(temp+Integer.parseInt(tnum));
			tid = String.valueOf(thingList.get(tid).getTnum());
		} else {
			// 데이터 저장(2)
			Thing thingDTO = new Thing(tname, tid, Integer.parseInt(tnum));
			thingList.put(tid, thingDTO);
		}
		
		// 데이터 저장
		session.setAttribute("tlist", thingList);
		session.setAttribute("tname", tname);
		session.setAttribute("tid", tid);
		session.setAttribute("tnum", tnum);
		
		// 메시지 저장
		mesg += "<h2>상품등록성공</h2>";
		mesg += "<a href='addThing.html'>등록화면보기</a><br>";
		mesg += "<a href='ThingListServlet'>상품목록보기</a><br>";
		
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
