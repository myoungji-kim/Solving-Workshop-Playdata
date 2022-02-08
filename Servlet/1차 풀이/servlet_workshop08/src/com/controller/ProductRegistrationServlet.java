package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Product;

@WebServlet("/ProductRegistrationServlet")
public class ProductRegistrationServlet extends HttpServlet {
	
	ArrayList<Product> products = new ArrayList<Product>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 처리
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int num = Integer.parseInt(request.getParameter("num"));
		
		// 정보 추가 저장하기
		Product p = new Product(name, id, num);
		
		int cnt = 0;
		for (Product i : products) {
			if (i.getId().equals(id)) {
            	cnt++;
            	System.out.println("Case 2");
    			String tempID = p.getId();
            	int beforeNum = i.getNum();
            	int afterNum = beforeNum + p.getNum();
            	i.setNum(afterNum);
            }
		}
		
		if (cnt == 0) {
        	products.add(p);
		} 
		cnt = 0;
		
		// 응답 처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<table border=\"1\">");
		out.print("<tr><th>상품명</th><th>상품아이디</th><th>수량</th></tr>");
		for (Product i : products) {
			out.print("<tr><td>"+i.getName()+"</td>"
					+ "<td>"+i.getId()+"</td>"
							+ "<td>"+i.getNum()+"</td></tr>");
		};
		out.print("</table>");
		out.print("<a href=\"javascript:history.back()\">상품 입력하기</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
