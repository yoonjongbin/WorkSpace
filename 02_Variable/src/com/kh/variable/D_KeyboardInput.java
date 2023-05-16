package com.kh.variable;

import java.util.Scanner;

public class D_KeyboardInput {
	/*
	 *  Scanner
	 *  	화면(Cosole)으로부터 데이터를 "입력"받는 클래스
	 *  	
	 *  	1) import java.util.Scanner; 추가
	 *  
	 *  	2) Scanner 클래스 생성
	 *  	   Scanner sc = new Scanner(System.in);
	 *  
	 *  	3) Scanner 클래스 사용
	 *  	   입력 값이 
	 *  		문자열일 때 : sc.next(), - 공백이 있을 경우 공백 이전까지 
	 *  				   sc.nextLine() - 공백 포함 엔터 전까지(권장)
	 *  		정수일 때 : sc.nextInt()
	 *  		실수일 때 : sc.nextFloat(), sc.nextDouble()
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ->");
		String name = sc.next();
		sc.nextLine();
		
		System.out.print("당신의 거주지는 어디입니까? ->");
		String addr = sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까? ->");
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇 cm입니까? ->");
		float height = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("당신의 성별은 무엇입니까? (남/여) ->");
		String line = sc.nextLine();
		char gender = line.charAt(0); // 첫글자만 저장
		
		System.out.println("당신의 이름은 " + name + "이고 거주지는 " + addr + "이며, " + "나이는" +
							age +"살, 키는 " + height + ", 성별은 " + gender + " 입니다.");
		
		
		//printf로 출력
		System.out.printf("당신의 이름은 %s 이고 거주지는 %s이며, 나이는 %d살, 키는 %.2fcm,"
							+ " 성별은 %c 입니다.", name, addr, age, height, gender);
	}
	

}
