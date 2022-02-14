<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.service.EmpServiceImpl"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	EmpService service = new EmpServiceImpl();
	List<EmpDTO> list = service.selectAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>사원번호</th>
		<th>사원이름</th>
		<th>월급</th>
		<th>입사일</th>
		<th>부서번호</th>
	</tr>
<% for(EmpDTO empDTO : list){ %>
	<tr>
		<td><%= empDTO.getEmpno() %></td>
		<td><%= empDTO.getEname() %></td>
		<td><%= empDTO.getSal() %></td>
		<td><%= empDTO.getHiredate() %></td>
		<td><%= empDTO.getDeptno() %></td>
	</tr>
<% } %>
</table>
</body>
</html>