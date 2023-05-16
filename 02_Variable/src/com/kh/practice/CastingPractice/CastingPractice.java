package com.kh.practice.CastingPractice;

import java.util.Scanner;

public class CastingPractice {
	public static void main(String[] args) {
		CastingPractice casting = new CastingPractice();
		//casting.method1();
		casting.method2();
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 : ");
		String uni = sc.nextLine();
		char code = uni.charAt(0);
		int Casting = (int)code;
		
		System.out.println("A unicode : " + Casting);
		System.out.println("B unicode : " + (Casting + 1));
		
	}
	
	public void method2() {
		
		int total;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		total = kor + eng + math;
		avg = (float)(kor + eng + math) / 3;
		
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f", avg);
		
	}
}
