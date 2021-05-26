package com.spring.finalproject3.joseungjin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.finalproject3.joseungjin.model.PersonVO;
import com.spring.finalproject3.joseungjin.model.StudentVO;
import com.spring.finalproject3.joseungjin.service.InterMemberService;
@Controller
public class finalproject3_seungjin {
	
	@Autowired   // Type에 따라 알아서 Bean 을 주입해준다.
	private InterMemberService service;
	
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
	
// === #41. 로그인 처리하기 === // 
	@RequestMapping(value="/loginEnd.sam", method= {RequestMethod.POST})
	public ModelAndView loginEnd(ModelAndView mav, HttpServletRequest request) {
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		Map<String,String> paraMap = new HashMap<>();
		paraMap.put("userid", userid);
		paraMap.put("pwd", pwd);
		
		StudentVO loginuser = service.getLoginStudent(paraMap);
		
		if(loginuser == null) { // 로그인 실패시
			
			String message = "아이디 또는 암호가 틀립니다.";
			String loc = "javascript:history.back()";
			
			mav.addObject("message", message);
			mav.addObject("loc", loc);
			
			mav.setViewName("msg");
			//  /WEB-INF/views/msg.jsp 파일을 생성한다.
		}
		
		else { // 아이디와 암호가 존재하는 경우
			
			HttpSession session = request.getSession();
			// 메모리에 생성되어져 있는 session을 불러오는 것이다.
			
			session.setAttribute("loginuser", loginuser);
			// session(세션)에 로그인 되어진 사용자 정보인 loginuser 을 키이름을 "loginuser" 으로 저장시켜두는 것이다.
			mav.setViewName("redirect:/index.sam");
					
		}
	
		return mav;
	}
}