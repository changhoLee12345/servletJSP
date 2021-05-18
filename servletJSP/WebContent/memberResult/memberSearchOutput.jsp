<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>검색결과</h3>
	<%
	String result = (String) request.getAttribute("result");
	if (result != null) {
		out.print("<p>" + result + "</p>");
	} else {
	%>
	<h3>${member.id }/${member.name }/${member.passwd }/${member.mail }</h3>
	<%
	}
	%>
	<jsp:forward page="home.jsp"></jsp:forward>
</body>
</html>