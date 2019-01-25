<%@ page language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="Header.jsp" %>
<html>
<body>
<form action="LoginCheck" method="post">
<table align="center">
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