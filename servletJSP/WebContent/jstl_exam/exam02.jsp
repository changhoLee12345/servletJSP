<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.edu.beans.BookBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	BookBean book = new BookBean();
%>

<c:set target="<%=book %>" property="title" value="The Secret" />
<%=book.getTitle()%><br>
<h3><c:out value="${b.title }" /></h3>

<c:set var="b" value="<%=book %>" />
<c:set target="${b }" property="author" value="Byrne, Rhoda" />
<c:out value="${b.author }" /><br>
"${b.author }"