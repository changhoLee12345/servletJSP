<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${initParam }<br>
	${initParam["file-upload"] }<br>
	${initParam.contextConfig }<br>
	${initParam.contextConfigLocation }<br>
	
	${pageContext }<br>
	${pageScope }<br>
	${requestScope }<br>
	${sessionScope }<br>
	${applicationScope }<br>
	${cookie }<br>
	${header }<br>
	${headerValues }<br>
	${param }<br>
	${paramValues }<br>
	
</body>
</html>