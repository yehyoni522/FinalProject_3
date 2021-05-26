package com.spring.finalproject3.joseungjin.service;

import java.util.List;
import java.util.Map;

import com.spring.finalproject3.joseungjin.model.PersonVO;
import com.spring.finalproject3.joseungjin.model.StudentVO;

public interface InterMemberService {

	List<PersonVO> PersonView();///테스트

	StudentVO getLoginStudent(Map<String, String> paraMap);
	
	

}
