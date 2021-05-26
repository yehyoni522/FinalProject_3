package com.spring.finalproject3.seoyeon.model;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

public class AdminBoardDAO implements InterAdminBoardDAO {

	@Resource
	private SqlSessionTemplate sqlsession;
	
	@Override
	public List<AdminBoardVO> boardListNoSearch() {
		List<AdminBoardVO> boardList = sqlsession.selectList("adminBoard.boardListNoSearch");
		return boardList;
	}

}
