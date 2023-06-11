package com.webtoon.naver.Impl;

import com.webtoon.naver.model.User;

public interface UserControllerImpl {
	
	
	boolean signUp(String signId, String signPw, User user);
	String login(String id, String pw);
	boolean changePw(String id, String oldPw, String newPw);
	boolean changeNickname(String pw, String newName);
	boolean changePhone(String pw, String newPhone);
	
	boolean chargeCash(int input, User user);
	
	void chargeCookie(int input, User user);
}
