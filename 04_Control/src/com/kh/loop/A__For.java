package com.kh.loop;


public class A__For {
	
	/*
	 * for문
	 * 
	 * [표기법]
	 * 
	 * 주어진 횟수만큰 코드를 반복 실행하는 구문
	 * 
	 * 초기식은 반복문이 수행 될 때 단 한번만 실행되는 구문으로 반복문 안에서 
	 * 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * 
	 * 조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문을 빠져나간다.
	 * 
	 * 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로,
	 * 주로 초기식에 제시한 변수를 가지고 증감연산자를 사용한다.
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		A__For a = new A__For();
		//a.method1();
		//a.method2();
		//a.method3();
		a.method4();
	}
	
	public void method1() {
		// 1~5 출력
		
		
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		for(int i = 1 ; i <= 5; i++) {
			System.out.println(i);
		}
	
	}
	
	public void method2() {
		// 5~1 출력
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	
	// 1~10 까지 사이의 홀수 출력
	public void method3() {
		
		/*for(int i = 1; i <= 10; i++) {
			if(i % 2 !=0) System.out.println(i);
			else continue;
		}
		*/
		
		for(int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		
	}
	
	public void method4() {
		
		
		
	}
}
