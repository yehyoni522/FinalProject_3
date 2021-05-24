package com.spring.finalproject3.joseungjin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class finalproject3_seungjin {
	
	@RequestMapping(value="/index.sam")
	public ModelAndView login(ModelAndView mav) {
		
		mav.setViewName("main/index.tiles1");
		// /WEB-INF/views/tiles1/login/loginform.jsp 파일을 생성한다.
		
		return mav;
	}
}
