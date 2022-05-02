package com.dev;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletParam")
public class ServletParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletParam() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		BufferedReader br = request.getReader();
		while (true) {
			String buf = br.readLine();
			if (buf == null)
				break;
			System.out.println(buf);
		}
		br.close();
	}

}
