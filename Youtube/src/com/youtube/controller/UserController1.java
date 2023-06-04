package com.youtube.controller;

import com.youtube.model.User;

public class UserController1 {
	User user = null;
	
	public boolean login(String id, String pw) {
		if(user != null && user.getId().equals(id) && user.getPw().equals(pw));
		return true;
	}

	
	public void signUp(User user) {
		this.user = user;
		
//		return false;
	}

	
	public User viewProfile(User user) {
		
		if(login(this.user.getId(), this.user.getPw())) {
			return this.user = user;
		}
		
		return user;
	}

	
	public void updateProfile(User user) {
		this.user = user;
//		return null;
	}

	
	public void deleteId(String id) {
		if(user.getId().equals(id)) {
			user = null;
		}
//		return false;
	}
}
