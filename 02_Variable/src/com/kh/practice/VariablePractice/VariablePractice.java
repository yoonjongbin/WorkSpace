package com.kh.practice.VariablePractice;

import java.util.Scanner;

public class VariablePractice {
	public static void main(String[] args) {
		
		
		VariablePractice c = new VariablePractice();
		
		//c.method1();
		//c.method2();
		//c.method3();
		c.method4();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 ->");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ->");
		int b = sc.nextInt();
		
		int sum = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		
		System.out.printf("입력 받은 수들의 합은 %d, 차는 %d, 곱은 %d, 몫은 %d 입니다.", 
				 			sum, sub, mult, div);
	} 
	
	public void method2() {
		
		int adult_Price = 10000;
		int teen_Price = 7000;
		int ad_sum = 10000 * 2;
		int te_sum = 7000 * 3;
		
		System.out.println("성인 2명 : " + (ad_sum));
		System.out.println("청소년 3명 : " + (te_sum));
		System.out.println("총 금액 : " + (ad_sum + te_sum));
	}
	
	public void method3() {
		int x = 5;
		int y = 7;
		int z = 9;
		int a;
		
		a = x;
		x = y;
		y = z;
		z = a;
		
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String com = sc.nextLine();
		char firstCh = com.charAt(0);
		char secondCh = com.charAt(7);
		
		System.out.println("첫번째 문자 : " + firstCh);
		System.out.println("마지막 문자 : " + secondCh);
	}
	
	

}
