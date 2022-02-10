package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.StudentDTO;
import com.service.StudentService;
import com.service.StudentServiceImpl;

@WebServlet("/PagingServlet")
public class PagingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentServiceImpl();
		
		int contentNum = 3;
		int pageNum = 1;
		int allContentNum = service.countAll();
		int allPage = (int) Math.ceil (allContentNum / contentNum);
		
		if (request.getParameter("no") != null) {
			pageNum = Integer.parseInt(request.getParameter("no"));
		}
		int pageBegin = getPageBegin(pageNum, 10, allPage);
		int pageEnd = getPageEnd(pageBegin, 10, allPage);
		String mesg = "";
		
		
		List<StudentDTO> list = service.selectByPage(contentNum, pageNum);
		
		mesg += "<tr><th>학번</th><th>이름</th><th>주민번호</th><th>주소</th><th>입학년도</th><th>휴학여부</th></tr>";
		for (StudentDTO dto : list) {
			mesg += "<tr>";
			mesg += "<td>"+dto.getStudent_no()+"</td>";
			mesg += "<td>"+dto.getStudent_name()+"</td>";
			mesg += "<td>"+dto.getStudent_ssn()+"</td>";
			mesg += "<td>"+dto.getStudent_address()+"</td>";
			mesg += "<td>"+dto.getEntrance_date()+"</td>";
			mesg += "<td>"+dto.getAbsence_yn()+"</td>";
			mesg += "</tr>";
		}

		mesg += "<tr>";
		mesg += "<td>";
		if (pageBegin != 1) {
			mesg += "<a href='PagingServlet?no="+(pageBegin-1)+"'>이전</a>";
		}
		mesg += "</td>";
		mesg += "<td colspan='4' style='text-align: center'>";
		for (int i=pageBegin; i <= pageEnd; i++) {
			mesg += "<a href='PagingServlet?no="+i+"'>"+i+"</a> \t";
		}
		mesg += "</td>";
		mesg += "<td>";
		if (pageEnd != allPage) {
			mesg += "<a href='PagingServlet?no="+(pageEnd+1)+"'>다음</a>";
		}
		mesg += "</td>";
		mesg += "</tr>";
		
		PrintWriter out = response.getWriter();
		out.print("<html><body><table border='1'>");
		out.print(mesg);
		out.print("</table></body></html>");
	}

	// 블럭 페이지 시작 번호
	private int getPageBegin(int pageNum, int blockNum, int allPage) {
		int pg_value = (int) Math.ceil(pageNum / blockNum);
		if (pageNum % blockNum != 0) pg_value++;
		int pageBegin = (blockNum*(pg_value-1))+1;
		return pageBegin;
	}
	
	// 블럭 페이지 끝 번호
	private int getPageEnd(int pageBegin, int blockNum, int allPage) {
		int pageEnd = pageBegin + blockNum - 1;
		if (pageEnd >= allPage) pageEnd = allPage;
		return pageEnd;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
