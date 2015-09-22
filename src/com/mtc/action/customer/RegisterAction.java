package com.mtc.action.customer;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vo.Register;

public class RegisterAction extends ActionSupport implements ModelDriven<Register>{
	
	private Register register=new Register();
	@Override
	public Register getModel() {
		System.out.println("************ Customer module : RegisterAction :getModel()********");
		return register;
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("************ Customer module : RegisterAction :execute ()********");
		System.out.println("Username:"+register.getUserName());
		return "success";
	}

	
	
}
