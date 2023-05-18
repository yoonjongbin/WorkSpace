package com.kh.condition;

import java.util.Scanner;

public class A_If {
	Scanner sc = new Scanner(System.in); // 인스턴스 변수(전역변수)
	
	
	
	
	
	
	
	public static void main(String[] args) {
		A_If a = new A_If();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		//a.method5();
		//a.method6();
		//a.practice1();
		a.practice2();
	}
	
	
	/*
	 * if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 * 		.. 조건식이 참(true)일 때, 실행할 코드 ..
	 * 
	 * 		조건식에서는 보통 비교, 논리 연산자를 사용한다.
	 * }
	 * 
	 */
	
	public void method1() {
		int score = 0; // 지역변수
		
		System.out.println("시험 점수를 입력하세요. : ");
		score = sc.nextInt();
		
		// 60점 이상이어야 합격
		
		if(score >= 60) { // 의사코드 (슈도코드, pseudocode)
			System.out.println("시험 통과");
		}
		if(score < 60) {
			System.out.println("과락");
		}
		
		
	}
	
	/*
	 * if-else문
	 * 
	 * [표현법]
	 * 
	 * if(조건식){
	 * 		... 조건식이 참(true)일 때 실행할 코드 ...
	 * } else {
	 * 		... 조건식이 거짓(false)일 때 실행할 코드 ...
	 * }
	 */
	
	
	public void method2() {
		
		int score = 0;
		
		System.out.println("시험 점수를 입력하세요. : ");
		score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 삼항연산자
		
		String outPut = (score >= 60)? "합격" : "불합격";
		System.out.println(outPut);
	}
	
	public void method3() {
		String name = "";
		
		System.out.println("이름을 입력해주세요. : ");
		name = sc.nextLine();
		
		// 김미경
		
		//System.out.println("김미경" == name); // false 논리연산자는 기본 자료형들만 가능하기 때문에 주소값으로 인식해 false가 나온다.
		
		//System.out.println("김미경".equals(name)); // true, String 클래스의 equals() 메소드
		
		//System.out.println("김미경".charAt(0)); // String 클래스 인덱스 메소드
		
		// 본인이면 "본인이다.", 본인이 아니라면 "본인이 아니다."
		if(name.equals("김미경")) {
			System.out.println("본인이다.");
		} else {
			System.out.println("본인이 아니다.");
		}
	}
	
	
	public void method4() {
		int num = 0;
		
		System.out.print("숫자 입력 > ");
		num = sc.nextInt();
		
		// 0 보다 크면 "양수", 그게 아니면 "음수", 0일 땐 "0입니다."
		
		if( num > 0 ) {
			System.out.println("양수");
		} else {
			
			if( num == 0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("음수");
			}
			
		}
		
	}
	
	
	/*
	 * if-else if-else문
	 * 
	 * [표현법]
	 * 
	 * if(조건식1) {
	 * 		.. 조건식1 참(true)일 때 실행할 코드 ..
	 * 	} else if(조건식2) {
	 * 		.. 조건식2가 참(true)일 때 실행할 코드 ..
	 * } else {
	 * 		.. 조건식1, 2 둘다 거짓(false)일 때 실행할 코드 ..
	 * }
	 * 
	 * else if 수는 제한이 없다.
	 * else는 생략이 가능하다.
	 * 
	 * 
	 */
	
	public void method5() {
		int num = 0;
		
		System.out.print("숫자 입력 > ");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0 이다.");
		}
	}

	
	/*
	 * 사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력
	 * 
	 * 		90점 이상음 A등급
	 * 		90점 미만 80점 이상은 B등급
	 * 		80점 미만 70점 이상은 C등급
	 * 		70점 미만 60점 이상은 D등급
	 * 		60점 미만은 F 등급 
	 */
	
	public void method6() {
		int score = 0;
		
		System.out.println("점수를 입력하세요. : ");
		score = sc.nextInt();
		
		/*	첫번째 코드
		  if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score <80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}*/
		
		char grade = '\u0000';
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
		
	}
	
	/*
	 * 세 정수를 입력했을 때 짝수만 출력
	 * 
	 * 		num1 입력 > 3
	 * 		num2 입력 > 4
	 * 		num3 입력 > 6
	 * 
	 * 		4
	 * 		6
	 */
	
	
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("num1 : ");
		num1 = sc.nextInt();
		System.out.println("num2 : ");
		num2 = sc.nextInt();
		System.out.println("num3 : ");
		num3 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println(num1);
		}
		if(num2 % 2 == 0) {
			System.out.println(num2);
		}
		if(num3 % 2 == 0) {
			System.out.println(num3);
		}
		
	}
	
	/*
	 * 정수 1개를 입력했을 때, 음(minus), 양(plus), 0(zero) / 짝(even), 홀(odd) 출력
	 * 
	 * 정수 입력 > -3
	 * minus
	 * odd
	 * 
	 */
	
	public void practice2() {
		int num = 0;
		
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양(plus)");
			
			if(num % 2 == 0) {
				System.out.println("짝(even)");
			} else System.out.println("홀(odd)");
		} else if(num == 0) {
			System.out.println("0(zero)");
		} else if(num <0) {
			System.out.println("음(minus)");
			
			if(num % 2 == 0) {
				System.out.println("짝(even)");
			} else System.out.println("홀(odd)");
		}
	}
}
