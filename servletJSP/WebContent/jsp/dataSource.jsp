<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// JNDI 서버 객체 생성	
	InitialContext ic = new InitialContext();
	// 룩업
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	// Connection
	Connection conn = ds.getConnection();

	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from employees");

	while (rs.next()) {
		out.print("<br>" + rs.getString("first_name") + ", " + rs.getString("last_name"));
	}
	rs.close();
	stmt.close();
	conn.close();
	%>
</body>
</html>