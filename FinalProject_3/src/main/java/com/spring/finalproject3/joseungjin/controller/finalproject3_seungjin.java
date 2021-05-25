package com.spring.finalproject3.joseungjin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class finalproject3_seungjin {
	//메인페이지 요청
	@RequestMapping(value="/index.sam")
	public ModelAndView main(ModelAndView mav) {
		
		mav.setViewName("main/index.tiles1");
		// /WEB-INF/views/tiles1/main/index.jsp 파일을 생성한다.
		
		return mav;
	}
	
	//로그인 페이지 요청
	@RequestMapping(value="/login.sam",method= {RequestMethod.GET})
	public ModelAndView login(ModelAndView mav) {
		
		mav.setViewName("login/loginform.tiles2");
		// /WEB-INF/views/tiles2/login/loginform.jsp 파일을 생성한다.
		
		return mav;
	}
}
