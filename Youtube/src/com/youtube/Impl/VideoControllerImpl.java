package com.youtube.Impl;

import com.youtube.model.Video;

public interface VideoControllerImpl {
	
	//Create (생성): 데이터베이스에 새로운 데이터를 만들거나 추가합니다.
	//Read (읽기): 데이터베이스에서 데이터를 조회하고 읽습니다.
	//Update (갱신): 데이터베이스에 저장된 데이터를 업데이트하거나 수정합니다.
	//Delete (삭제): 데이터베이스에서 데이터를 삭제합니다.
		
	
	public Video videoUpload(); // 영상 업로드
	public Video[] videoList(); // 영상 목록
	public Video viewVideo(); // 영상 1개 보기
	public Video updateVideo(); // 동영상 수정
	public boolean deleteVideio(); // 동영상 삭제
}
