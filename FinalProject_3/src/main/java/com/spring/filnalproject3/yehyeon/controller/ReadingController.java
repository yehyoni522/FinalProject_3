package com.spring.filnalproject3.yehyeon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReadingController {

	@RequestMapping(value="/reading/index.sam")
	public ModelAndView readingRoomView(ModelAndView mav) {
		
		mav.setViewName("reading/index.tiles1");
		
		return mav;
	}
	
}
