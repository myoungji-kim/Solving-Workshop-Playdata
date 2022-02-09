package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/EncodingFilter")
public class EncodingFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 요청필터 작업영역 시작
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); // 위치 신경쓰기!
		
		// 요청필터 작업영역 끝
		chain.doFilter(request, response);
		
		// 응답필터 작업영역시작
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
