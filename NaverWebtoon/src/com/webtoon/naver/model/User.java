package com.webtoon.naver.model;

public class User {
	public String id;
	public String pw;
	public String phoneNum;
	public String email;
	
	public int cookies;
	public char gender;
	
	public void signUp(String signId, String signPw) {
		id = signId;
		pw = signPw;
	}
	
	public void login(String id, String pw) {
		
	}
	
}


