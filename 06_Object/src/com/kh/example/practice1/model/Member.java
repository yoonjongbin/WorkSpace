package com.kh.example.practice1.model;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	
	public String memberId;
	public String memberPwd;
	public String memberName;
	
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public void changeName(String name) {
		memberName = name;
	}
	public void changeMemberId() {
		System.out.print("수정하고 싶은 아아디을 적으시오 : ");
		memberId = sc.nextLine();
	}
	public void changePwd() {
		System.out.print("수정하고 싶은 패스워드을 적으시오 : ");
		memberPwd = sc.nextLine();
	}
	
	
	
	
	public void changeAge() {
		System.out.print("나이 : ");
		age = sc.nextInt();
	}
	
	//public void changeGender() {
	//	System.out.print("수정하고 싶은 이름을 적으시오 : ");
		//gender = sc.nextLine();
	//}
	public void changePhone() {
		System.out.print("수정하고 싶은 이름을 적으시오 : ");
		memberName = sc.nextLine();
	}
	public void changeEmail() {
		System.out.print("수정하고 싶은 이름을 적으시오 : ");
		memberName = sc.nextLine();
	}
	
	
	public void print() {
		System.out.printf("수정하신 이름은 %s 입니다.", memberName);
	}
}