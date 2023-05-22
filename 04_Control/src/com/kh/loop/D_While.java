package com.kh.loop;

import java.util.Scanner;

public class D_While {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * while(조건식){
	 * 		... 실행코드 ...
	 * }
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		D_While d = new D_While();
		//d.method1();
		//d.method2();
		//d.method3();
		//d.method4();
		d.method5();
	}
	
	
	public void method1() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
	}
	
	/*
	 * break문
	 *  
	 *  switch, 반복문이 실행을 중지하고 빠져나갈 때 사용
	 *  
	 *  반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다.
	 */
	
	
	public void method2() {
		//for문 무한루프
		
		for(int i = 1; i <= 5;) {
			System.out.println(i);
			i++;
		}
		
		for(int i = 1; ;) {
			
			if(i <= 5)
				System.out.println(i);
			else
				break;
			i++;
		}
	}
	
	public void method3() {
		// while문 무한루프
		
		int input = 0;
		while(true) {
			System.out.print("숫자 입력 > ");
			input = sc.nextInt();
			System.out.println(input);
			
		}
	}
	
	public void method4() {
		/*
		 * do-while문
		 * 
		 * [표현법]
		 * 
		 * do{
		 * 		.. 실행코드 ..
		 * 
		 * } while(조건식);
		 * 
		 * 무조건 한번은 실행된다.
		 * 
		 */
		
		int num = 1;
		
		
		while(num == 0) {
			System.out.println("while 문");
		}
		
		
		do {
			System.out.println("do-while 문");
		} while(num == 0);
	}
	
	public void method5() {
		// 반복문 + 조건문
		/*
		 * 숫자 맞히기 게임
		 * 
		 * 1과 100 사이의 값을 입력해서 임의로 지정한(Random) 값을 맞히면 게임 끝!
		 * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력!
		 * (예 : 57)
		 * 
		 * 1과 100 사이의 값 입력 > 35
		 * 더 큰 수를 입력하세요.
		 * 
		 * 1과 100 사이의 값 입력 > 70
		 * 더 작은 수를 입력하세요.
		 * 
		 * 1과 100 사이의 값 입력 > 57
		 * 3번 만에 맞췄습니다.
		 * 
		 */
		
		int random = (int)(Math.random() * 100) + 1;
		int input = 0;
		int try_C = 1;
			
		while(true) {
			try_C++;
			
			System.out.println("1과 100 사이의 값 입력 > ");
			input = sc.nextInt();
			
			if( input > random) {
				System.out.println("더 작은 수를 입력하세요.");
				continue;
			} else if( input < random) {
				System.out.println("더 큰 수를 입력하세요.");
				continue;
			} else {
				System.out.printf("%d번 만에 맞췄습니다.", try_C);
				break;
				
			}
				
			
		}
	}
}
