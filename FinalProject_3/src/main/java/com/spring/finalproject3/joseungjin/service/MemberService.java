package com.spring.finalproject3.joseungjin.service;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.finalproject3.joseungjin.model.InterPersonDAO;
import com.spring.finalproject3.joseungjin.model.InterStudentDAO;
import com.spring.finalproject3.joseungjin.model.PersonVO;
import com.spring.finalproject3.joseungjin.model.StudentVO;


@Component
@Service
public class MemberService implements InterMemberService {

	@Autowired
	private InterStudentDAO studao;


	@Override
	public StudentVO getLoginStudent(Map<String, String> paraMap) {
		StudentVO loginuser = studao.getLoginStudent(paraMap);
	
		return loginuser;
	}


	@Override
	public List<PersonVO> PersonView() {
		// TODO Auto-generated method stub
		return null;
	};
	
	
	


}
