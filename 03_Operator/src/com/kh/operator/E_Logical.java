package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * 논리 연산자
	 * 		두개의 논리값을 연산해주는 연산자
	 * 		논리연산한 결과마저도 논리값임
	 * 
	 * 논리값 &&(and) 논리값 : 모든 논리값이 true 일 때만 true 반환
	 * 논리값 ||(or) 논리값 : 하나의 논리값이 true 여도 true 반환
	 * 
	 */
	
	public static void main(String[] args) {
		E_Logical e = new E_Logical();
		//e.method1(); // 주석 처리 할 때 : ctrl + /
		//e.method2();
		e.method3();
	}
	
	public void method1() {
		int num = 0;
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 정수 값이 1 부터 100 사이의 값인지 확인
		System.out.println("임의의 정수를 입력해주세요 : ");
		num = sc.nextInt();
		
		// 1 <= num <= 100
		
		result = (num >= 1) && (num <= 100);
		System.out.println("result는 1과 100 사이의 숫자가?? : " + result);
	}
	
	public void method2() {
		
		//Short Cut Evaluation
		int num = 10;
		boolean result = false;
		
		// && 연산자를 기준으로 앞에서 이미 false가 나오면 뒤의 연산은 수행하지 않는다.
		
		result = (num < 5) && (++num > 0);
		
		System.out.println(result); // false
		System.out.println(num); // 10
	
		// || 연산자를 기준으로 앞에서 이미 true가 나오면 뒤의 연산은 수행하지 않는다.
		result = (num < 20) || (++num > 0);
		
		System.out.println(result); //true
		System.out.println(num); //10
		
		// 논리 연산자는 로그인 기능에 많이 사용된다.
	}
	
	/*
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 'A' ~ 'Z' 까지가 코드값으로 65 ~ 90까지의 숫자로 나열
	 * 
	 */
	
	public void method3() {
		
		//char aB;
		String aB;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요 : ");
		aB = sc.nextLine();
		//aB = nextLine().charAt(0);
		char castToCh = aB.charAt(0);
		int aB_Code = (int)castToCh;
		
		System.out.println("입력한 숫자는 대문자입니까? : " + ((aB_Code >= 'A') && (aB_Code <= 'Z')));
	}
}
