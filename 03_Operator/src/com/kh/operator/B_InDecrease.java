package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감 연산자
	 * 
	 * [표현법] (증감 연산자) 값; 또는 값 (증감 연산자)
	 * 
	 * 		증감 연산자는 피연산자의 값을 1 증가시키거나 1 감소시키는 연산자
	 * 
	 * 		++ : 피연산자의 값을 1 증가시키는 연산자
	 * 		-- : 피연산자의 값을 1 감소시키는 연산자
	 * 
	 * 		(증감 연산자)값 : 전위 연산으로 먼저 증감 연산을 수행하고 다른 연산 수행
	 * 		값(증감 연산자) : 후위 연산으로 먼저 다른 연산을 수행하고 증감 연산을 수행
	 */
	
	public static void main(String[] args) {
		B_InDecrease b = new B_InDecrease();
		//b.method1();
		b.method2();
	}
	
	public void method1() {
		int num = 10;
		
		// 전위 연산자
		System.out.println("전위 연산자 적용 전 : " + num); // 10
		System.out.println("1회 수행 후 : " + ++num); // 11
		System.out.println("2회 수행 후 : " + ++num); // 12
		System.out.println("전위 연산자 적용 후 : " + num); // 12
		
		// 후위 연산자
		System.out.println("후위 연산자 적용 전 : " + num); // 12
		System.out.println("1회 수행 후 : " + num++); // 12
		System.out.println("2회 수행 후 : " + num++); // 13
		System.out.println("후위 연산자 적용 후 : " + num); // 14
	}

	public void method2() {
		int num = 20;
		int result = num++ * 3;
		
		
		System.out.println("num : "+ num);
		System.out.println("result : " + result);
		
		int num1= 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1++); // 10, num1 == 11
		System.out.println((++num1) + (num2++)); // 32, num1 == 12, num2 == 21
	
		System.out.println((num1++) + (--num2) + (--num3)); // 61, num1 == 13, num2 == 20, num3 == 29 
	}
}
