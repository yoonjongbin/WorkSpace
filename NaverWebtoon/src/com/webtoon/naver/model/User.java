package com.webtoon.naver.model;

import java.util.Objects;

public class User {
	private String id;
	private String pw;
	private String name;
	private String phoneNum;
	
	
	public User() {
	}


	public User(String id, String pw, String name, String phoneNum) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phoneNum = phoneNum;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", phoneNum=" + phoneNum + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, phoneNum, pw);
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
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNum, other.phoneNum) && Objects.equals(pw, other.pw);
	}

	

	


	
}


