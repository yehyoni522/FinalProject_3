package com.spring.finalproject3.joseungjin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class finalproject3_seungjin {
	
	@RequestMapping(value="/index.sam")
	public String test_test1() {
		
		return "home";
	//  /WEB-INF/views/sample/test1.jsp
	}
}
