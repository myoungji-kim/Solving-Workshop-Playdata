package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.dto.StudentDTO;
import com.service.StudentService;
import com.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentListServlet
 */
@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String curPage = request.getParameter("curPage");
		if(curPage==null) {
			curPage = "1";
		}
		StudentService service  = new StudentServiceImpl();
		PageDTO pageDTO = service.selectAllStudent(Integer.parseInt(curPage));
		
		int perPage = pageDTO.getPerPage();
		int totalCount = pageDTO.getTotalCount();
		List<StudentDTO> list = pageDTO.getList();
		
		//페이지 번호 출력하기 위한 변수
		int totalPage = totalCount/perPage; 
		if(totalCount%perPage !=0) totalPage++; // Math.ceil(3.3) ==> 4.0 사용
		
		
		//응답처리
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String mesg = "<table border='1'>";
		     mesg +="<tr>";
		     mesg +="<td>학번</td>";
		     mesg +="<td>이름</td>";
		     mesg +="<td>주민번호</td>";
		     mesg +="<td>주소</td>";
		     mesg +="<td>입학년도</td>";
		     mesg +="<td>휴학여부</td>";
		     mesg +="</tr>";
		for (StudentDTO stu : list) {
			  mesg +="<tr>";
			     mesg +="<td>"+stu.getStuNo()+"</td>";
			     mesg +="<td>"+stu.getStuName()+"</td>";
			     mesg +="<td>"+stu.getStuSsn()+"</td>";
			     mesg +="<td>"+stu.getStuAddress()+"</td>";
			     mesg +="<td>"+stu.getEntDate()+"</td>";
			     mesg +="<td>"+stu.getAbsYn()+"</td>";
			     mesg +="</tr>";
		}
		 mesg += "</table>";
		 out.print(mesg);
		 
		 //페이지 번호 출력하기
		 for(int i=1; i<=totalPage; i++) {
			if(i==Integer.parseInt(curPage)) {
				 out.print(i+"&nbsp;&nbsp;&nbsp;");
			}else {
				out.print("<a href='StudentListServlet?curPage="+i+"'>"+i+"</a>&nbsp;&nbsp;&nbsp;");
			}
		 }
		     
		out.print("</body></html>");
	}//end doGet


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
