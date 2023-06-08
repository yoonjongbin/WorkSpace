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
	public boolean signUp(String signId, String signPw, User user) {
		if(!user_HM.containsKey(signId)) {
			user_HM.put(signId, user);
			userSet.add(user);
			return true;
		}
			
			
		return false;
	}
	
	@Override
	public String login(String id, String pw) {
		
		if(user_HM.containsKey(id) && user_HM.get(id).getPw().equals(pw)) 
			return user_HM.get(id).getName();
		
			
		return null;
	}
	

	@Override
	public boolean changePw(String id, String oldPw, String newPw) {
			// hashSet의 인덱스 값
		
		if(user_HM.containsKey(id) && user_HM.get(id).getPw().equals(oldPw)) {
			user_HM.get(id).setPw(newPw);
			int index = 0;
			for(User user : userSet) {
				if(userSet.contains(oldPw))
					userSet
				index++;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean changeNickname(String pw, String newName) {
		Set<String> keys = user_HM.keySet();
		
		for(String key : keys) {
			if(user_HM.get(key).getPw().equals(pw)) {
				user_HM.get(key).setNickName(newName);
				return true;
			}
				
		}
		//user_HM.containsValue(oldName).
		return false;
	}

	@Override
	public boolean changePhone(String pw, String newPhone) {
		Set<String> keys = user_HM.keySet();
		
		for(String key : keys) {
			if(user_HM.get(key).getPw().equals(pw)) {
				user_HM.get(key).setPhoneNum(newPhone);
				return true;
			}
				
		}
		return false;
	}
}
