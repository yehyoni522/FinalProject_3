package com.spring.finalproject3.yehyeon.service;

import java.util.List;

import com.spring.finalproject3.yehyeon.model.RroomNumVO;

public interface InterReadingService {

	List<RroomNumVO> readingRoomView(); // 열람실의 고유번호와 이름을 불러온다.

}
