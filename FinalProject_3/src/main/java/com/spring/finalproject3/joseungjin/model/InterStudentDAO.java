package com.spring.finalproject3.joseungjin.model;

import java.util.Map;

public interface InterStudentDAO {
	//학생 로그인 처리
	StudentVO getLoginStudent(Map<String, String> paraMap);

}
