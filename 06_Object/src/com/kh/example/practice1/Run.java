package com.kh.example.practice1;

import java.util.Scanner;

import com.kh.example.practice1.model.Member;

public class Run {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		Member member = new Member();
		
		
		System.out.print("수정하고 싶은 이름을 적으시오 : ");
		name = sc.nextLine();
		
		member.changeName(name);
		member.print();
		
	}

}
