package com.login;




public class LoginService1 {
	
	public  boolean check(LoginDto1 logindto)
	{
		LoginDao1 logindao=new LoginDao1();
		boolean flag=logindao.validatelogin(logindto);
		return flag;
	}
}
