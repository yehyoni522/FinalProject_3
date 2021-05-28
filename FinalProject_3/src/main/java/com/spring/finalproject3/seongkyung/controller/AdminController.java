package com.spring.finalproject3.seongkyung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping(value="/adminhome.sam")
	public ModelAndView adminhome(ModelAndView mav) {
		
<<<<<<< HEAD:FinalProject_3/src/main/java/com/spring/finalproject3/seongkyung/controller/AdminController.java
		mav.setViewName("admin/adminmembers.tiles2");
		
		return mav;
	}
	
	@RequestMapping(value="/adminmemberstudent.sam")
	public ModelAndView adminmemberstudent(ModelAndView mav) {
		
		mav.setViewName("admin/adminmemberstudent.tiles2");
		
		return mav;
	}	
=======
		mav.setViewName("admin/adminhome.tiles1");
		
		return mav;
	}
>>>>>>> parent of 3d01289... Merge branch 'main' of https://github.com/yehyoni522/FinalProject_3.git into main:FinalProject_3/src/main/java/com/spring/finalproject3/seongkyung/controller/finalproject3_seongkyung.java

}
