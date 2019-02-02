package com.model;

public class LoginCredential {
	
String username;
String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean loginCheck() 
{
	 if(password.equals("55555")){  
	        return true;  
	    }  
	
	return false;
}


}
