<%@ page language="java" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@include file="Header.jsp"%>

<br/><br/><br/><br/><br/><br/>
	<form action="LoginCheck" method="post">
	<table align="center" width="40%">
		<tr bgcolor="black">
			<td colspan="2"><font color="white">Signup Here</font> </td>
		</tr>
		<tr bgcolor="gray">
		<td>Login</td><td><input type="text" name="loginname" required/></td>
		</tr>
		<tr bgcolor="gray">
		<td>Password</td><td><input type="password" name="passwd" required/></td>
		</tr>
		<tr bgcolor="gray">
		<td>Customer Name</td><td><input type="text" name="cname" required/></td>
		</tr>
		<tr bgcolor="gray">
		<td>Gender</td><td><input type="radio" name="gender" value="M"/>Male<input type="radio" name="gender" value="F"/>Female</td>
		</tr>

		<tr bgcolor="gray">
		<td>Address</td><td><textarea name="addr" cols="20" rows="10" required></textarea></td>
		</tr>		

		<tr bgcolor="gray">
		<td>Country</td>
		<td><select name="country">
		<option value="India">India</option>
		<option value="China">China</option>
		<option value="Srilanka">Srilanka</option>
		</select></td>
		</tr>
		
		<tr bgcolor="gray">
		<td colspan="2">
		<input type="submit" value="Login"/><input type="reset" value="Reset"/>
		</td>
		</tr>
	</table>
	</form>

</body>
</html>
