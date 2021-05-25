package com.spring.finalproject3.yeonha;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardControllar {
	

	@Autowired   // Type에 따라 알아서 Bean 을 주입해준다.
	private InterBoardService service;
	
	// 글 목록보기	
	/*@RequestMapping(value="/list.sam")
	public ModelAndView list(ModelAndView mav, HttpServletRequest request) {
		
		String categoryno = request.getParameter("categoryno");
		
		List<BoardVO> boardList = null;
		
		boardList = service.boardListNoSearch(categoryno);
		
		HttpSession session = request.getSession();
		session.setAttribute("readCountPermission", "yes");
		
		mav.addObject("boardList", boardList);
		mav.setViewName("board/list.tiles1");
		
		return mav;
	}*/

	// 글 쓰기
	@RequestMapping(value="/add.sam")
	public ModelAndView requiredLogin_add(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
				
		mav.setViewName("board/add.tiles1");		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
}
