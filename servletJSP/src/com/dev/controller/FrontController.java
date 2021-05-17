package com.dev.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	String charset = null;
	HashMap<String, Controller> list = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		list = new HashMap<String, Controller>();
		list.put("/memberDelete.do", new MemberDeleteController());
		list.put("/memberInsert.do", new MemberInsertController());
		list.put("/memberList.do", new MemberListController());
		list.put("/memberSearch.do", new MemberSearchController());
		list.put("/memberUpdate.do", new MemberUpdateController());

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding(charset);

		String url = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = url.substring(contextPath.length());
		Controller subControl = list.get(path);
		subControl.execute(req, resp);

	}

}