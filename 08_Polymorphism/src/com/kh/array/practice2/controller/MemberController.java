package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	private Member[] mArr = new Member[3];
	
	
	public int count = 0;
	
	public void insertMember(String id, String name, String pw, String email, char gender, int  age) {
		mArr[count].setId(id);
		mArr[count].setName(name);
		mArr[count].setPw(pw);
		mArr[count].setEmail(email);
		mArr[count].setGender(gender);
		mArr[count].setAge(age);
		count++;
		
	}
	
	public void insertMember(Member m) {
		// 객체 배열에 객체 하나씩 추가한다고 생각
		// count 를 인덱스라고 생각
		// score[0] = 100;
		// stuArr[0] = newStudent("김길동", "자바", 100);
		
		//this.m[count] = m;
		//count++;
		
		//mArr[count++] = new Member(m.getId(), m.getName(), m.getPw(), m.getEmail(), m.getGender(), m.getAge());
		mArr[count++] = m;
	}
	
	public boolean updateMember(String id, String name, String pw, String email) {
		// checkId 활용 <-- index
		// 추가처럼 수정도 같은 방식, 해당 인덱스 값에 넣은 방식
		// setter 활용
		int index = this.checkId(id);
		if(index != 1) {
			mArr[index].setName(name);
			mArr[index].setPw(pw);
			mArr[index].setEmail(email);
			return true;
		}
		
		return false;
	}
	
	public int checkId(String id) {
		for(int i = 0; i < mArr.length; i++) {
			
			if(mArr[i] != null && mArr[i].getId().equals(id))  // null을 먼저 체크해야함!
				return i;
			
		}
		
		return -1;
	}
	
	public Member[] printAll() {
		
		return mArr;
	}
}
