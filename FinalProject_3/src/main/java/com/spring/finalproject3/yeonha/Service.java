package com.spring.finalproject3.yeonha;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



public class Service implements InterBoardService {

	@Autowired
	private InterBoardDAO dao;
	
	// 페이징 처리를 안한 검색어가 없는 전체 글목록 보여주기
	@Override
	public List<BoardVO> boardListNoSearch(String categoryno) {
		
		List<BoardVO> boardListNoSearch = dao.boardListNoSearch(categoryno);
		return boardListNoSearch;
	}

}
