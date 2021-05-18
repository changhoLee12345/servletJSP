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
	<c:choose>
		<c:when test="${result ne null }">
			<p>${result }</p>
		</c:when>
		<c:otherwise>
			<h3>${member.id }/${member.passwd }/${member.name }/${member.mail }</h3>
		</c:otherwise>
	</c:choose>
	<jsp:forward page="home.jsp"></jsp:forward>
</body>
</html>