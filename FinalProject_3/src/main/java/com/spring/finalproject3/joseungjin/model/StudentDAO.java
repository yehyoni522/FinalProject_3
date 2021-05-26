package com.spring.finalproject3.joseungjin.model;

import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class StudentDAO implements InterStudentDAO {
	
	@Resource
	private SqlSessionTemplate sqlsession; 
	@Override
	public StudentVO getLoginStudent(Map<String, String> paraMap) {
		StudentVO  loginuser = sqlsession.selectOne("member.getLoginStudent", paraMap);
		return loginuser;
	}

}
