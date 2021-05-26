package com.spring.finalproject3.seoyeon.model;

import java.util.List;

public interface InterAdminBoardDAO {

	// === 페이징 처리를 안한 검색어가 없는 전체 글목록 보여주기 === //
	List<AdminBoardVO> boardListNoSearch();

}
