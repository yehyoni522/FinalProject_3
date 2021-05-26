package com.spring.finalproject3.seoyeon.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.finalproject3.seoyeon.model.AdminBoardVO;
import com.spring.finalproject3.seoyeon.service.InterAdminBoardService;


@Component
@Controller
public class AdminBoardController {
	
	private InterAdminBoardService service;
	
	// ============= ***** 관리자 게시판 페이지 ***** ============= //
		@RequestMapping(value="/admin/boardlist.sam")
		public ModelAndView admin_boardList(ModelAndView mav, HttpServletRequest request) {
			/*
			List<AdminBoardVO> boardList = null;

		 	// == 페이징 처리를 안한 검색어가 없는 전체 글목록 보여주기 == //
	    	boardList = service.boardListNoSearch();
	    	
	    	HttpSession session = request.getSession();
	    	session.setAttribute("readCountPermission", "yes");
	    	
	    	mav.addObject("boardList", boardList);*/
	    	mav.setViewName("admin/adminBoard.tiles1");
	    	
	    	return mav;
		}
		
	// ============= ***** 관리자 댓글 페이지 ***** ============= //
		@RequestMapping(value="/admin/commentList.sam")
		public ModelAndView admin_commentList(ModelAndView mav, HttpServletRequest request) {
	
	    	mav.setViewName("admin/adminComment.tiles1");
	    	
	    	return mav;
		}
}
