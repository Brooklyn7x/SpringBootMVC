package com.springbootmvc.controller;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springbootmvc.entity.country;
import com.springbootmvc.entity.faceuser;
import com.springbootmvc.service.FacebookServiceInterface;


@Controller
public class FacebookController {
	
	@Autowired
	private FacebookServiceInterface fs;
	

	@RequestMapping("signup")
	public ModelAndView registerClient(HttpServletRequest request, @RequestParam("name") String name ,@RequestParam("email") String email,@RequestParam("password") String password ){
	
	
		
		faceuser fu = new faceuser();
		fu.setName(name);
		fu.setEmail(email);
		fu.setPassword(password);
		
		String ss =fs.createuser(fu);
		
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",name );
		mv.addObject("email",email );
		mv.addObject("password",password);
		
		mv.setViewName("index.jsp");
		return mv;
		

	}

	@RequestMapping("login")
	public ModelAndView loginClient(HttpServletRequest request, HttpServletResponse response,@RequestParam("email") String email,@RequestParam("password") String password ){
	
	
		
		faceuser fu = new faceuser();
		
		fu.setEmail(email);
		fu.setPassword(password);
		
		boolean ss =fs.loginuser(fu);
		if(ss) {
			
			HttpSession ss1=request.getSession(true); 
			ss1.setAttribute("userid",email);
			
			
			ModelAndView mv = new ModelAndView();
			
			mv.addObject("result",ss );
			
			mv.setViewName("userhomepage.jsp");
			return mv;
		} else {
			
		
		}
		return null;

	}
	@RequestMapping("loadcountry")
	public ModelAndView loadcountry(){
	
	
		List<country>  i = fs.loadcountry();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("result",i );
		
		mv.setViewName("loadcountry.jsp");
		return mv;
		

	}
	
	@RequestMapping("checkemail")
	public ModelAndView checkemail(HttpServletRequest request, @RequestParam("emailvalue") String email) {

	    faceuser fu = new faceuser();
	    fu.setEmail(email);

	    boolean email1 = fs.checkemail(fu);

	    String str="";
	    if (email1) {
	        str = "<font color=red>Email already taken. Please choose another email ID.</font>";
	    } else {
	        str = "<font color=green>Valid Email</font>";
	    }

	    ModelAndView mv = new ModelAndView();
	    mv.addObject("result", str);
	    mv.setViewName("checkemail.jsp");
	    return mv;
	}
	
	@RequestMapping("loadcapchta")
	public ModelAndView loadcatchta() {

		int i = (int)((Math.random())*10);
	    ModelAndView mv = new ModelAndView();
	    mv.addObject("result", i);
	    mv.setViewName("capchta.jsp");
	    return mv;
	}
	
	@RequestMapping("viewprofile")
	public ModelAndView viewprofile(HttpServletRequest request, HttpServletResponse response) {
		HttpSession ss = request.getSession(true);
		Object oo = ss.getAttribute("userid");
		String email = oo.toString();
		
		
		
	    ModelAndView mv = new ModelAndView();
	    mv.addObject("result", email);
	    mv.setViewName("viewprofile.jsp");
	    return mv;
	}
	@RequestMapping("viewallprofile")
	public ModelAndView viewallprofile(HttpServletRequest request, HttpServletResponse response) {
		
		List<faceuser>  i = fs.viewalluser();
	
		
	    ModelAndView mv = new ModelAndView();
	    mv.addObject("result", i);
	    mv.setViewName("viewallprofile.jsp");
	    return mv;
	}
	/*@RequestMapping("editprofile")
	public ModelAndView editprofile(HttpServletRequest request, HttpServletResponse response,@RequestParam("name") String name,@RequestParam("password") String password) {
		HttpSession ss = request.getSession(true);
		Object oo = ss.getAttribute("userid");
		String email = oo.toString();
		
		
		faceuser fu = new faceuser();
		fu.setName(name);
		fu.setPassword(password);
		
		
		int check = fs.editprofile(fu);
		
		ModelAndView mv = new ModelAndView();
	    mv.addObject("result", check);
	    mv.setViewName("edit.html");
	    return mv;
	}*/
	

}
