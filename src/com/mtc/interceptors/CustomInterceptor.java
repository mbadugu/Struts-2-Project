package com.mtc.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CustomInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("*********CustomInterceptor: pre-request processing *************");
		String result = actionInvocation.invoke();
		System.out.println("*********CustomInterceptor: post-request processing *************");
		return result;
	}

}
