package com.youtube.model;

public class User {
	private String id;
	private String pw;
	private String email;
	private String phone;
	private String nickname;
	private char gender;
	
	Video video; // 유저가 비디오를 가지고 있다. (포함)
	
	
	public User() {
	}


	public User(String id, String pw, String email, String phone, String nickname, char gender) {
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.phone = phone;
		this.nickname = nickname;
		this.gender = gender;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", email=" + email + ", phone=" + phone + ", nickname=" + nickname
				+ ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
}
