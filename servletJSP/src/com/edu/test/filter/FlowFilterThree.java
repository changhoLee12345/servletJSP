package com.edu.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "timer", urlPatterns = "/third")
public class FlowFilterThree implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("doFilter() 호출 전 ...... three");

		long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		long endTime = System.currentTimeMillis();
		long exeTime = endTime - startTime;
		System.out.println("running time: " + exeTime + " ms");

		System.out.println("doFilter() 호출 후 ...... three");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출 ...... three");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init() 호출 ...... three");
	}

}
