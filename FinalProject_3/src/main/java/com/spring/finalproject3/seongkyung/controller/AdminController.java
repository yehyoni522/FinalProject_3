package com.spring.finalproject3.seongkyung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping(value="/adminmembers.sam")
	public ModelAndView adminmembers(ModelAndView mav) {
		
		mav.setViewName("admin/adminmembers.tiles2");
		
		return mav;
	}
	
	@RequestMapping(value="/adminmemberstudent.sam")
	public ModelAndView adminmemberstudent(ModelAndView mav) {
		
		mav.setViewName("admin/adminmemberstudent.tiles2");
		
		return mav;
	}	

}
