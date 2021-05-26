package com.spring.finalproject3.joseungjin.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class PersonDAO implements InterPersonDAO {

		@Resource
		private SqlSessionTemplate sqlsession; // 로컬DB에 연결

		@Override
		public List<PersonVO> PersonView() {
			List<PersonVO> PersonList = sqlsession.selectList("Reading.PersonView");
			return PersonList;
		}

	
}
