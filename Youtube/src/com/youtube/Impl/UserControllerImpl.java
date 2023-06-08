package com.youtube.Impl;

import com.youtube.model.User;

public interface UserControllerImpl {
	/*
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 * 
	 * 
	 */
	
	
	// 로그인
	public boolean login();
	
	
	// 회원가입
	public boolean signUp();
	
	// 프로필 보기
	public User viewProfile();
	
	
	// 프로필 수정
	public User updateProfile();
	
	
	// 계정 삭제
	public boolean deleteId();
}
