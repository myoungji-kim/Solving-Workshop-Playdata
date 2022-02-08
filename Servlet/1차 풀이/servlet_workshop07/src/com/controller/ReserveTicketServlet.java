package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReserveTicketServlet")
public class ReserveTicketServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 처리
		String birth = request.getParameter("birth");
		String ticket = request.getParameter("ticket");
		int age = getAge(birth);
		String grade = getGrade(age);
		int fee = getFee(ticket, grade);
		
		// 응답 처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("입력한 생년월일: "+birth+", 선택한 티켓: "+ticket+"<br>");
		out.print("나이: "+age+"세, 등급: "+grade+", 할인 적용 금액: "+fee+"원");
		out.print("</body></html>");
	
	}

	private int getFee(String ticket, String grade) {
		int ticketFee = Integer.parseInt(ticket);
		int finalFee = 0;
		
		if (grade.equals("경로우대자")) {
			finalFee = (int) (ticketFee - (ticketFee*0.5));
		} else if (grade.equals("성인")) {
			finalFee = (int) (ticketFee - (ticketFee*0.1));
		} else if (grade.equals("미성년자")) {
			finalFee = (int) (ticketFee - (ticketFee*0.4));
		} else if (grade.equals("X")) {
			finalFee = ticketFee;
		}
		return finalFee;
	}

	private String getGrade(int age) {
		String grade = "X";
		if (age >= 60) {
			grade = "경로우대자";
		} else if (age >= 19) {
			grade = "성인";
		} else if (age <= 9) {
			grade = "미성년자";
		}
		return grade;
	}

	private int getAge(String birth) {
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int birthYear = Integer.parseInt(birth.split("/")[0]);
		
		return year - birthYear;
	}


}
