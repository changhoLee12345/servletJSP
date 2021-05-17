package com.dev.controller;

import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class FrontController extends HttpServlet {

	String charset = null;
	HashMap<String, Controller> list = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		list = new HashMap<String, Controller>();
		list.put("/memberInsert.do", new MemberInsertController());

	}

}
