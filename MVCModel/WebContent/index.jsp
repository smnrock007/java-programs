<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<form action="LoginController" method="post">
<table align="center">
	<tr bgcolor="black">
		<td colspan="2"> <center><font color="white" size="4">Sign In Here</font> </center></td>
	</tr>
	<tr>
		<td>User Name</td><td><input type="text" name="username"/></td>
	</tr>
	<tr>
		<td>Password</td><td><input type="password" name="passwd"/></td>
	</tr>
	<tr>
		<td colspan="2"><center><input type="submit" value="SUBMIT"/></center></td>
	</tr>
	
</table>
</form>

</body>
</html>