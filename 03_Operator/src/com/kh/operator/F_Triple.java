package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
	
	/*
	 * 삼항 연산자
	 * [표현법] 조건식 ? 식1 : 식2;
	 * 
	 * 		조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * 		조건식의 결과는 true 이면 식1, false 이면 식2를 수행
	 */

	public static void main(String[] args) {
		F_Triple f = new F_Triple();
		//f.method1();
		//f.practice1();
		f.prectice2();
	}
	
	
	public void method1() {
		
		int num = 0;
		String result = "";
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 값 입력 : ");
		num = sc.nextInt();
		
		// 입력받은 정수가 양수인지 음수인지 판단
		
		result = (num > 0) ? "양수이다." : "음수이다.";
		System.out.println(result);
		
		// 양수이다, 음수이다, 0이다.
		result = (num != 0)?  (num > 0)? "양수이다." : "음수이다." : "0이다.";
	}
	
	/*
	 * 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서 두 정수의 곱셈 결과가 100보다 큰경우
	 * "결과가 100 이상이다." false면 "결과가 100 이하다." 출력
	 * 
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요. >");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = num1 * num2;
		
		String f_Result = (result > 100)? "결과가 100 초과이다." : "결과가 100 이하다.";
		System.out.println(f_Result);
	}
	
	
	/*
	 * 문제2
	 * 
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력된 문자가 대문자이면 "알파벳이 대문자이다." 아닌 경우 "알파벳이 대문자가 아니다." 출력
	 */
	
	public void prectice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요. > ");
		char ch = sc.nextLine().charAt(0);
		int castCh = ch;
		
		String result = (castCh >= 'A') && (castCh <= 'Z')? "알파벳이 대문자입니다." : "알파벳ㅇ 대문자가 아닙니다.";
		System.out.println(result);
	}
}
