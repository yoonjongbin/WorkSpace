package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 * 산술 연산자
	 * +(더하기)
	 * -(뺄셈)
	 * *(곱하기)
	 * /(나누기)
	 * %(나머지)
	 */
	
	public static void main(String[] args) {
		C_Arithmetic c = new C_Arithmetic();
		//c.method1();
		c.method2();
	}
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 13
		System.out.println("num1 - num2 = " + (num1 - num2)); // 7
		System.out.println("num1 * num2 = " + (num1 * num2)); // 30
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기 했을 때 몫 : 3
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기 했을 때 나머지 : 1
	}
	
	public void method2() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // 16
		int d = c / a; // 2
		int e = c % a; // 4
		int f = e++; // 4
		int g = (--b) + (d--); // 11
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	
		System.out.println("f : " + f);
		System.out.println("i : " + i);
	}
}
