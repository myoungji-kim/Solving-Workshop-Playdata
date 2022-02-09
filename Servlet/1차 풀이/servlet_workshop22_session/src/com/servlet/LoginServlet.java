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

import com.dto.MemberDTO;
import com.service.MemberService;
import com.service.MemberServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String mesg = "";
		
		HttpSession session = request.getSession();
		HashMap<String, String> temp = new HashMap<String, String>();
		temp.put("userid", userid);
		temp.put("passwd", passwd);
		
		MemberService service = new MemberServiceImpl();
		MemberDTO dto = service.selectByMemberIDandPW(temp);
		
		// 아이디 비밀번호 확인
		if(dto == null) {
			mesg += "아이디와 비밀번호를 확인하세요";
			mesg += "<a href='loginForm.html'>로그인 화면</a>";
		} else {
			mesg += "환영합니다"+dto.getUsername()+"<br>";
			mesg += "<a href='LogoutServlet'>로그아웃</a><br>";
			mesg += "<a href='InfoServlet'>회원정보보기</a>";
			
			// 세션 등록
			session.setAttribute("info", dto);
			session.setAttribute("userid", userid);
			session.setAttribute("passwd", passwd);
		}
		
		// html 출력
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(mesg);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
