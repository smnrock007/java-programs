<%@ page language="java" contentType="text/html;" import="java.sql.*"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>

<h3>Declaration Scriplet</h3>
<%!
	Connection conn;
	Statement stmt;
	ResultSet rs;
%>
<h3>Scriplet</h3>
<%	out.println("This is the Scriplet");
%>

<h3>Expression Scriplet</h3>

100+293= <%=(100+293)%>

</body>
</html>