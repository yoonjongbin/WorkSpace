package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	public static void main(String[] args) {
		
		
		
		OperatorPractice o = new OperatorPractice();
		//o.method1();
		//o.method2();
		//o.method3();
		//o.method4();
		//o.method5();
		o.method6();
	}
	
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 : > ");
		int people = sc.nextInt();
		
		System.out.println("연필 개수 > ");
		int pen = sc.nextInt();
		
		int sep = pen / people;
		int after_Sep = pen % people;
		
		System.out.println("1인당 연필 개수 : " + sep);
		System.out.println("남은 연필 개수 : " + after_Sep);
		
	}
	
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수를 입력해주세요. > ");
		int d_Use_Ten = sc.nextInt();
		
		int result = d_Use_Ten -(d_Use_Ten % 100);
		System.out.println(result);
		
	}
	
	
	public void method3() {
		
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력3 : ");
		int num3 = sc.nextInt();
		
		result = (num1 == num2) && (num2 == num3) && (num1 == num3);
		System.out.println(result);
		
		
	}
	
	
	public void method4() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num1 = sc.nextInt();
		
		String result = (num1 % 2 ==0) ? "짝수다" : "홀수다";
		System.out.println(result);
		
	}
	
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요. : ");
		int age = sc.nextInt();
		
		String result = (age <= 13)? "어린이" : ((age > 13) && (age <= 19))? "청소년" : "성인"; 
		System.out.println(result);
	}
	
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사과의 개수 : ");
		int apple_Count = sc.nextInt();
		
		System.out.println("바구니 크기 : ");
		int basket_Max = sc.nextInt();
		
		int apple_Sep = (apple_Count / basket_Max);
		
		int need_Bask = ((apple_Count % basket_Max) != 0)? ++apple_Sep : apple_Sep;
		
		
		System.out.println("필요한 바구니의 수 : " + apple_Sep);
		
	}
}
