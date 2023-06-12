package com.webtoon.naver.model;

import java.util.Objects;

public class User {
	private String id;
	private String pw;
	private String phoneNum;
	private String email;
	private String name;
	private String nickName;
	
	private int cash;
	private int cookies;
	private char gender;
	
	
	public User() {
	}


	public User(String id, String pw, String phoneNum, String email, String name, String nickName, int cash, int cookies, char gender) {
		this.id = id;
		this.pw = pw;
		this.phoneNum = phoneNum;
		this.email = email;
		this.name = name;
		this.nickName = nickName;
		
		this.cash = cash;
		this.cookies = cookies;
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


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public int getCash() {
		return cash;
	}


	public void setCash(int cash) {
		this.cash = cash;
	}


	public int getCookies() {
		return cookies;
	}


	public void setCookies(int cookies) {
		this.cookies = cookies;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", phoneNum=" + phoneNum + ", email=" + email + ", name=" + name
				+ ", nickName=" + nickName + ", cash=" + cash + ", cookies=" + cookies + ", gender=" + gender + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cash, cookies, email, gender, id, name, nickName, phoneNum, pw);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return cash == other.cash && cookies == other.cookies && Objects.equals(email, other.email)
				&& gender == other.gender && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(nickName, other.nickName) && Objects.equals(phoneNum, other.phoneNum)
				&& Objects.equals(pw, other.pw);
	}


	


	
	
	
	
}


