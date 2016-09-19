package com.niit.example.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	

	@RequestMapping("/")
	public ModelAndView gethomePage() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/screen")
	public ModelAndView getscreenPage() {
		ModelAndView mv = new ModelAndView("screen");
		return mv;
	}
	@RequestMapping("/sc")
	public ModelAndView sc() {
		ModelAndView mv = new ModelAndView("sc");
		return mv;
	}
	@RequestMapping("/nnnn")
	public ModelAndView nnnn() {
		ModelAndView mv = new ModelAndView("nnnn");
		return mv;
	}
	
	
	

	
}
