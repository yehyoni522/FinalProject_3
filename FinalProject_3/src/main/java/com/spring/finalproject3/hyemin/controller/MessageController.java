package com.spring.finalproject3.hyemin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	@RequestMapping(value="/inbox.sam")
	public ModelAndView inbox(ModelAndView mav) {
		
		mav.setViewName("message/inbox.tiles1");
		// /WEB-INF/views/tiles1/message/inbox.jsp 파일을 생성한다.
		
		return mav;
	}
	
	@RequestMapping(value="/write.sam")
	public ModelAndView write(ModelAndView mav) {
		
		mav.setViewName("message/write.tiles1");
		// /WEB-INF/views/tiles1/message/write.jsp 파일을 생성한다.
		
		return mav;
	}
	

	  @RequestMapping(value="/userFind.sam") 
	  public String userFind() {
	 
		  return "tiles1/message/userFind";
		  
	 }
	 
}
