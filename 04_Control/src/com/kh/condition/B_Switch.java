package com.kh.condition;

import java.util.Scanner;

public class B_Switch {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 
	 * switch문
	 * 
	 * [표현법]
	 * 
	 * switch(조건식) {
	 * 		case 값1:
	 * 			... 조건식의 결과가 값 1과 같을 경우 실행코드 ...
	 * 			break;
	 * 		case 값2:
	 * 			... 조건식의 결과가 값 2과 같을 경우 실행코드 ...
	 * 
	 * 		case 값3:
	 * 			... 조건식의 결과가 값 3과 같을 경우 실행코드 ...
	 * 			break;
	 * 		default:
	 * 			... 조건식의 결과가 일치하는 case문이 없을 때 실행코드 ...
	 * }
	 * 
	 * 	case문의 수는 제한이 없다.
	 * 	조건식 결가는 정수, 문자, 문자열 이어야 한다.
	 * 	조건문을 빠져나오려면 break가 필요하다.
	 * 	default문은 생략 가능하다.
	 * 
	 */
	
	public static void main(String[] args) {
		B_Switch b = new B_Switch();
		//b.method1();
		//b.practice1();
		b.practice2();
	}
	
	public void method1() {
		/*
		 * 숫자 입력받아
		 * 1일 경우 "빨간색"
		 * 2일 경우 "파란색"
		 * 3일 경우 "초록색"
		 */
		
		String color = "";
		
		int num = 0;
		
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		
		/*if(num == 1) {
			System.out.println("빨간색");
		} else if(num == 2) {
			System.out.println("파란색");
		} else if(num == 3) {
			System.out.println("초록색");
		} else System.out.println("1 ~ 3 까지의 숫자만 입력하세요.");
		
		
		if(num == 1) {
			color = "빨간색";
		} else if(num == 2) {
			color = "파란색";
		} else if(num == 3) {
			color = "초록색";
		} else color = "1 ~ 3 까지의 숫자만 입력하세요.";
		
		System.out.println(color);
		*/
		
		switch(num) {
			case 1:
				System.out.println("빨간색");
				break;
			case 2:
				System.out.println("빨간색");
				break;
			case 3:
				System.out.println("초록색");
				break;
			default :
				System.out.println("1 ~ 3 까지의 숫자만 입력하세요.");
		}
		
		
				
	}
	
	/*
	 * 등급별 권한
	 * 
	 * 1 : 관리권한, 글쓰기권한, 읽기권한
	 * 2 : 글쓰기권한, 읽기권한
	 * 3 : 읽기권한
	 * 
	 */
	
	
	
	public void practice1() {
		int level = 0;
		
		String num_Print = "";
		
		System.out.println("등급 :");
		level = sc.nextInt();
		
		/*switch(level) {
			case 1 :
				num_Print = "관리권한, 글쓰기권한, 읽기권한";
				break;
			case 2 :
				num_Print = "글쓰기권한, 읽기권한";
				break;
			case 3 :
				num_Print = "읽기권한";
				break;
			default :
				num_Print = "1 ~ 3 까지의 숫자만 입력하세요.";
		
			
		}
		System.out.println(num_Print);
		*/
		
		switch(level) {
		case 1 : System.out.println("관리권한");
		case 2 : System.out.println("글쓰기권한");
		case 3 : System.out.println("읽기권한");
	
		}
	}
	
	/*
	 * 월을 입력했을 때 계절을 출력
	 * 
	 * 3, 4, 5 : 봄
	 * 6, 7, 8 : 여름
	 * 9, 10, 11 : 가을
	 * 12, 1, 2 : 겨울
	 * 
	 * 월 > 5
	 * 봄
	 * 
	 * 
	 * 월 > 11
	 * 가을
	 */
	
	
	
	public void practice2() {
		int month = 0;
		String season = "";
		
		System.out.println("월 > ");
		month = sc.nextInt();
		
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				season = "봄";
				break;
			case 6 :
			case 7 :
			case 8 :
				season = "여름";
				break;
			case 9 :
			case 10 :
			case 11 :
				season = "가을";
				break;
			case 12 :
			case 1 :
			case 2 :
				season = "겨울";
				break;
			default :
				System.out.println("1 ~ 12사이의 숫자만 입력하세요.");
		}
		System.out.println(season);
	}
}
