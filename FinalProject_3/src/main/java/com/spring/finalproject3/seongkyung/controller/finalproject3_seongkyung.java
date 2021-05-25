package com.spring.finalproject3.seongkyung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class finalproject3_seongkyung {
	
	@RequestMapping(value="/adminhome.sam")
	public ModelAndView adminhome(ModelAndView mav) {
		
		mav.setViewName("admin/adminhome.tiles1");
		
		return mav;
	}

}
