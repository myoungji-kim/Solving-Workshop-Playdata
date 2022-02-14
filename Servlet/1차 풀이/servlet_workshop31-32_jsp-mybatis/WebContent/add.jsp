<%@page import="com.service.EmpServiceImpl"%>
<%@page import="com.service.EmpService"%>
<%@page import="com.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	String ename = request.getParameter("ename");
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	int mgr = Integer.parseInt(request.getParameter("mgr")); 
	String hiredate = request.getParameter("hiredate");
	int sal = Integer.parseInt(request.getParameter("sal"));
	String job = request.getParameter("job");
	
	EmpDTO dto = new EmpDTO(empno, ename, sal, hiredate, deptno, job, mgr);
	EmpService service = new EmpServiceImpl();
	int num = service.insert(dto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입 성공 메시지 보여주는 페이지</h2>
<% if(num==1) { %>
	회원가입 성공 <br>
	<a href='list.jsp'>목록보기</a>
<% } else { %>
	회원가입 실패<br>
	<a href='member.jsp'>다시 등록하기</a>
<% } %>
</body>
</html>