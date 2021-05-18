<%@page import="com.dev.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
    <h3>회원정보</h3>
    <%
	List<MemberVO> list = (List<MemberVO>) request.getAttribute("list");

	if (list != null) {
	%>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Mail</th>
            <th>Passwd</th>
        </tr>
        <%
		for (MemberVO mem : list) {
		%>
        <tr>
            <td><%=mem.getId()%></td>
            <td><%=mem.getName()%></td>
            <td><%=mem.getMail()%></td>
            <td><%=mem.getPasswd()%></td>
        </tr>
        <%
		}
		%>
    </table>
    <h3></h3>
    <%
	} else {
	out.print("<h3>등록된 회원정보가 없습니다.</h3>");
	}
	%>
	
	<%@ include file="home.jsp" %>
</body>

</html>