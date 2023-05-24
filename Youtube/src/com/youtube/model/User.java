package com.youtube.model;

public class User {
	public String id;
	public String pw;
	public String email;
	public String phone;
	public String nickname;
	public char gender;
	
	
	// 로그인
	
	public boolean login() {
		return false;
	}
	
	
	// 회원가입
	
	public boolean signUp() {
		return false;
	}
	
	
	// 프로필 보기
	
	public User viewProfile() {
		return null;
	}
	
	
	// 프로필 수정
	
	public User updateProfile() {
		return null;
	}
	
	
	// 계정 삭제
	
	public boolean deleteId() {
		return false;
	}
	
}
