package com.spring.finalproject3.seoyeon.service;

import java.util.List;

import com.spring.finalproject3.seoyeon.model.AdminBoardVO;

public interface InterAdminBoardService {

	// === 페이징 처리를 안한 검색어가 없는 전체 글목록 보여주기 === //
	List<AdminBoardVO> boardListNoSearch();

}
