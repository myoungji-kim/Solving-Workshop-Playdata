<%@page import="com.dto.PageDTO"%>
<%@page import="com.dto.StudentDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.service.StudentServiceImpl"%>
<%@page import="com.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	StudentService service = new StudentServiceImpl();
	
	int contentNum = 3; // 한 페이지 당 보여줄 게시글 수
	int pageNum = 1; 	// 현재 페이지
	int blockNum = 10;  // 한 블럭 당 보여줄 페이지 수
	if (request.getParameter("no") != null) pageNum = Integer.parseInt(request.getParameter("no"));
	int allContentNum = service.countAll();
	
	PageDTO pg = new PageDTO(contentNum, pageNum, blockNum, allContentNum);
	
	List<StudentDTO> list = service.selectByPage(contentNum, pageNum);
	
%>

<h2> 서블릿 워크샵 33번. 페이징 + JSP</h2>
<table border="1">
	<tr>
		<th>학번</th>
		<th>이름</th>
		<th>주민번호</th>
		<th>주소</th>
		<th>입학년도</th>
		<th>휴학여부</th>
	</tr>
	<% for (StudentDTO dto : list) { %>
		<tr>	
			<td><%= dto.getStudent_no() %></td>
			<td><%= dto.getStudent_name() %></td>
			<td><%= dto.getStudent_ssn() %></td>
			<td><%= dto.getStudent_address() %></td>
			<td><%= dto.getEntrance_date() %></td>
			<td><%= dto.getAbsence_yn() %></td>
		</tr>
	<% } %>
	
	<tr>
		<td>
			<% if (pg.getPageBegin() != 1) { %>
				<a href="PagingServlet?no=<%= pg.getPageBegin()-1 %>">이전</a>
			<% } %>
		</td>
		<td colspan='4' style='text-align: center'>
			<% for (int i=pg.getPageBegin(); i <= pg.getPageEnd(); i++) { %>
				<% if (i==pageNum) { %>
					<a> <%= i %> </a>
				<% } else { %>
					<a href='PagingServlet?no=<%= i %>'> <%= i %></a>
				<% } %>
			<% } %>
		</td>
		<td>
			<% if (pg.getPageEnd() != pg.getAllPage()) { %>
				<a href="PagingServlet?no=<%= pg.getPageEnd()+1 %>">다음</a>
			<% } %>
		</td>
	</tr>
</table>

</body>
</html>