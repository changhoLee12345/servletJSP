<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>example17.jsp</title>
</head>
<body>
	<jsp:useBean id="bean" class="com.edu.beans.BookBean"></jsp:useBean>
	<jsp:getProperty property="author" name="bean" /><br>

	<jsp:setProperty property="author" value="Hong" name="bean" />
	<jsp:setProperty property="title" value="Hong fly~~" name="bean" />
	<jsp:setProperty property="publisher" name="bean" value="h&pCompany" />

	<jsp:setProperty property="author" name="bean" param="a" />
	<jsp:setProperty property="title" name="bean" param="b" />
	<jsp:setProperty property="publisher" name="bean" param="c" />

	<jsp:setProperty property="*" name="bean" />

	<jsp:getProperty property="author" name="bean" /><br>
	<jsp:getProperty property="title" name="bean" /><br>
	<jsp:getProperty property="publisher" name="bean" /><br>

</body>
</html>