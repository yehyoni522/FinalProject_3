package com.spring.finalproject3.yeonha;

import java.util.List;
import java.util.Map;

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

	// 게시판 글쓰기
	@RequestMapping(value="/add.sam")
	public ModelAndView requiredLogin_add(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
				
		mav.setViewName("board/add.tiles1");		
		return mav;
	}
	
	// 게시판 글쓰기완료, 게시글 등록
	@RequestMapping(value="/addEnd.action", method= {RequestMethod.POST})
	public ModelAndView addEnd(ModelAndView mav, BoardVO boardvo) { // <== After Advice 미적용				
		int n = service.add(boardvo); // <== 파일첨부가 없는 글쓰기 
		
		if(n==1) {
			mav.setViewName("redirect:/list.action");
		    //   list.action 페이지로 redirect(페이지이동)해라는 말이다.
		}		
		else {
			mav.setViewName("board/error/add_error.tiles1");
			//   /WEB-INF/views/tiles1/board/error/add_error.jsp 파일을 생성한다.
		}	
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
}