<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.edu.beans.BookBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	ArrayList<BookBean> bookList = new ArrayList<>();
	bookList.add(new BookBean("The Secret", "Byrne Rhoda", "Atria Books"));
	bookList.add(new BookBean("The Last Lecture", "Randy Paush", "hyperion"));
	
	String[] bookCode = { "소설", "역사", "인문", "정치", "미술", "종교", "여행", "과학", "만화", "건강" };
%>
<hr>
<c:set var="code" value="<%=bookCode %>" />
<c:forEach var="item" items="${code }">
  <c:out value="${item }" />
</c:forEach>
<br>
<c:forEach var="i" begin="2" end="9">
  <c:forEach var="j" begin="1" end="9">
  	${i } * ${j } = ${i*j }<br>
  </c:forEach>
  <br>
</c:forEach>
<hr>
<c:forEach var="k" begin="1" end="10" step="2">
  ${k }
</c:forEach>
<br>
<c:forTokens items="소설/역사/인문/정치/미술/종교/여행/과학/만화/건강" delims="/" var="token" >
  ${token }
</c:forTokens>

