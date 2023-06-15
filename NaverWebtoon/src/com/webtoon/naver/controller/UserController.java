package com.webtoon.naver.controller;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.webtoon.naver.Impl.UserControllerImpl;
import com.webtoon.naver.model.User;

public class UserController implements UserControllerImpl {
	
	HashMap<String, User> user_HM = new HashMap<>();	// 회원정보 추출용
	HashSet<User> userSet = new HashSet<User>();		// 회원정보 저장용
	
	User u = new User();
	
	
	


	@Override
	public boolean signUp(String signId, String signPw, User user) { // 회원가입
		if(!user_HM.containsKey(signId)) {
			user_HM.put(signId, user);
			userSet.add(user);
			return true;
		}
			
			
		return false;
	}
	
	@Override
	public User login(String id, String pw) { // 로그인
		
		if(user_HM.containsKey(id) && user_HM.get(id).getPw().equals(pw)) 
			return user_HM.get(id);
		
			
		return null;
	}
	

	@Override
	public void changePw(String newPw, User user) { // 비번변경
			// hashSet의 인덱스 값
		String id = user.getId();
		String pw = user.getPw();
		
		if(user_HM.containsKey(id) && user_HM.get(id).getPw().equals(pw)) {
			user_HM.get(id).setPw(newPw);
			User u1 = user_HM.get(id);
			userSet.add(u1);
			
		}
		
	}
		
	

	@Override
	public void changeName(String pw, String newName) { // 닉네임 변경
		Set<String> keys = user_HM.keySet();
		
		for(String key : keys) {
			if(user_HM.get(key).getPw().equals(pw)) {
				user_HM.get(key).setName(newName);
				User u1 = user_HM.get(key);
				userSet.add(u1);
				
			}
				
		}
	}

	@Override
	public void changePhone(String pw, String newPhone) { // 번호변경
		Set<String> keys = user_HM.keySet();
		
		for(String key : keys) {
			if(user_HM.get(key).getPw().equals(pw)) {
				user_HM.get(key).setPhoneNum(newPhone);
				User u1 = user_HM.get(key);
				userSet.add(u1);
				
			}
				
		}
	}
	
	public boolean userChecked(String pw, User user) { // 비밀번호 확인
		if(user.getPw().equals(pw))
			return true;
		
		return false;
	}

	
	public HashMap<String, User> printUser() {
		return user_HM;
	}
	
	
}
