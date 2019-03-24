package com.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	
public class LoginController{
	
	@RequestMapping("/login")
	public ModelAndView doPost(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		/*
		  String passw=req.getParameter("pass");
		EncrytPwd paw= new EncrytPwd();
		String pass = null;
		try {
			pass = paw.encrypt(passw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		LoginDto1 logindto=new LoginDto1();
	    logindto.setUsername(uname);
	    logindto.setPassword(pass);
	    LoginDao1 ob=new LoginDao1();  
		if(ob.validatelogin(logindto)){
			
			mv.setViewName("success.jsp");
			mv.addObject("name",uname);
			return mv;
		}
		else
			mv.setViewName("unsuccess.jsp");
		
		return mv;
	}

}
