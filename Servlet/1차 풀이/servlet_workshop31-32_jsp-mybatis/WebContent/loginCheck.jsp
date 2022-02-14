<%@page import="java.util.List"%>
<%@page import="com.service.EmpServiceImpl"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<% 
		EmpService service = new EmpServiceImpl();
		List<Integer> empnos = service.selectAllEmpno();
		
		String id = request.getParameter("no");
		String result = "사용 가능";
		int check = 0;
		for (int i : empnos) {
			if (Integer.toString(i).equals(id)) {
				result = "사용 불가";
				break;
			}
		}
	%>
	<%= result %>
