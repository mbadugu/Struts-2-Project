 package com.mtc.action;

import java.util.HashMap;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	private HashMap<String, String> usernamesList = new HashMap<String, String>();
	
	public LoginAction() {
		usernamesList.put("Daddy@mail.com", "mummy");
		usernamesList.put("mummy@mail.com", "Daddy");
		usernamesList.put("pinky@mail.com", "BA");
		usernamesList.put("maggy@mail.com", "vetti Haha");
	}
	
	@Override
	public void validate() {
		if(usernamesList.containsKey(username)){
			if(usernamesList.get(username).equals(password)){
				System.out.println("valid username");
			}else{
				addFieldError("password", "Incorrect Password");
			}
			
		}
		else{
				addFieldError("username", "Invalid Username");
			}
			
		
	}
	
	
	
	
	
	@Override

	public String execute() throws Exception {
		System.out.println("************LoginAction****execute()*************");
		System.out.println("Username: "+username);
				System.out.println("Password: "+password);
				//result name
		return "success";
	}

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
		
	
	
}
