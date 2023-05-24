package com.kh.step3;

import java.util.Scanner;

import com.kh.step3.model.Calculator;

public class Application {
	
	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("첫 번째 정수의 입력하세요 : ");
		//a = sc.nextInt();
		
		//System.out.print("두 번째 정수의 입력하세요 : ");
		//b = sc.nextInt();
		
		/*
		 * 변수 호출 방법
		 * 	- 참조변수.변수이름;
		 * 
		 * 메서드 호출 방법
		 *  - 참조변수.메서드이름();			//매개변수가 없는 경우
		 *  - 참조변수.메서드이름(값1, 값2); 	// 매개변수가 있는 경우
		 * 
		 */
		
		
		Calculator cal = new Calculator();
		
		//System.out.printf("두 수의 최댓값은 %d 입니다.\n", cal.max(a, b));
		
		//System.out.printf("두 수의 최댓값은 %d 입니다.\n", Calculator.max(a, b));
		
		cal.a = 10;
		cal.b = 7;
		System.out.println("최대값 : " + cal.max());
		
		System.out.println("더하기 : " + cal.add());
		System.out.println("빼기 : " + cal.substract());
		System.out.println("매개변수 a, b 곱하기 : " + Calculator.multiply(cal.a, cal.b));
		System.out.println("매개변수 a, b 나눈 몫과 나머지 : " + Calculator.divide(cal.a, cal.b));
		
		System.out.print("팩토리얼을 몇까지 할지 적으세요 : ");
		c = sc.nextInt();
		
		System.out.printf("%d를 팩토리얼 한 결과 : %d", c, cal.factorial(c));
		
	}
	
	
	

}
