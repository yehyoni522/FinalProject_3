package com.spring.finalproject3.joseungjin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class finalproject3_seungjin {
	
	@RequestMapping(value="/index.sam")
	public String test_test1() {
		
		return "home";
	//  /WEB-INF/views/sample/test1.jsp
	}
}
