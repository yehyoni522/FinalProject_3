package com.spring.finalproject3.seoyeon.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Component
@Controller
public class AdminBoardController {
	
	// ============= ***** 관리자 게시판 페이지 ***** ============= //
		@RequestMapping(value="/admin/boardlist.sam")
		public ModelAndView admin_boardList(ModelAndView mav, HttpServletRequest request) {

	    	mav.setViewName("admin/adminBoard.tiles1");
	    	
	    	return mav;
		}
		
	// ============= ***** 관리자 게시판 페이지 ***** ============= //
		@RequestMapping(value="/admin/commentList.sam")
		public ModelAndView admin_commentList(ModelAndView mav, HttpServletRequest request) {
	
	    	mav.setViewName("admin/adminComment.tiles1");
	    	
	    	return mav;
		}
}
