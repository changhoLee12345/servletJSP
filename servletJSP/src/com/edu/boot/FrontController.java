package com.edu.boot;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.boot.common.Service;
import com.edu.boot.service.LoginService;

public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private HashMap<String, Service> map = new HashMap<>();

	@Override
	public void init(ServletConfig config) throws ServletException {

		map.put("/login.do", new LoginService());
		map.put("/main.do", new MainService());
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String contextPath = request.getContextPath();
		String uri = request.getRequestURI();
		String path = uri.substring(contextPath.length());

		Service service = map.get(path);
		String viewPage = service.run(request, response);

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}
