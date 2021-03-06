package com.niit.indu.controller;


import com.niit.indu.model.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.indu.model.SignupModel;
import com.niit.indu.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public ModelAndView getHomePage() {

	
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signup() {
        //us.insertSignupModel(sm);
		
		return new ModelAndView("signup","command",new SignupModel());
	}
	@RequestMapping("/addcustomer")
		public ModelAndView addCustomer(@ModelAttribute("SignupModel") SignupModel sm ) {
		System.out.println("in add customer");
            us.insertSignupModel(sm);
			
			ModelAndView mv=new ModelAndView("signup","command",new SignupModel());
			return mv;
		}

		


	@RequestMapping("/login")
	public ModelAndView login() {

		
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/customercare")
	public ModelAndView customercare() {

		
		ModelAndView mv=new ModelAndView("customercare");
		return mv;
	}
}
