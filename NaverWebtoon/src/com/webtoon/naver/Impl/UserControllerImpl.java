package com.webtoon.naver.Impl;

import com.webtoon.naver.model.User;

public interface UserControllerImpl {
	
	
	boolean signUp(String signId, String signPw, User user);
	User login(String id, String pw);
	void changePw(String newPw, User user);
	void changeName(String pw, String newName);
	void changePhone(String pw, String newPhone);
	
}
