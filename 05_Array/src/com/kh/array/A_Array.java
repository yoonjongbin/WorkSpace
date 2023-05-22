package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음
	 * 		"같은 자료형의 값"으로만 담을 수 있음
	 * 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김
	 * (인덱스는 0부터 시작)
	 * 
	 * 1. 배열의 선언
	 * 
	 * [표현법]
	 * 
	 * 자료형[] 배열명;
	 * 자료형 배열명[];
	 * 
	 * 2. 배열의 초기화
	 * 
	 * [표현법]
	 * 
	 * 배열명 = new 자료형[배열 크기];
	 * 
	 * 3. 배열의 선언과 초기화를 동시에 진행
	 * 
	 * [표현법]
	 * 
	 * 자료형[] 배열명 = new 자료형[배열 크기];
	 * 자료형 배열명[] = new 자료형[배열 크기];
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		A_Array a = new A_Array();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		//a.method5();	
		//a.method6();	
		//a.method7();	
		//a.method8();	
		a.method9();	
		}
	
	public void method1() {
		
		int[] score = new int[5]; // [5] 배열의 크기를 지정하지 않으면 에러가 생김
		
		/*
		 * 기본 지료형 : 스택 메모리에 생성된 공간에 실제 변수값을 저장하는 반면
		 * 참조 자료형 : 실제 데이터 값은 힙 메모리에 저장하고,
		 * 			스택 메모리의 변수 공간에는 실제 변수값이 저장된 힙 메모리의 주소값 저장
		 */
		
		//System.out.println(score); // [I@3d012ddd
		
		/*
		 * 배열을 생성하고 초기화 해주지 않아도 문제없이 출력이 됨
		 * 
		 * JVM이 지정한 기본값으로 배열이 초기화 됨
		 * (정수형 : 0, 실수형 : 0.0, 문자형 : \u0000, 논리형 : false, 참조형 : null)
		 * 
		 */
		// 초기화
		score[0] = 100;
		score[1] = 90;
		score[2] = 70;
		score[3] = 60;
		score[4] = 50;
		
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
	}
	
	public void method2() {
		int[] score = new int[] {100, 90, 80, 70, 60};
		
		int[] score2;
		//score2 = {100, 90, 80, 70, 60}; // 이건 안됨
		
		// 반복문을 사용해서
		
		// 문자열.length(), 배열.length <- 주의!!
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
	
	
	public void method3() {
		// 반복문을 이용한 초기화
		
		int[] score = new int[5];
		int num = 100;
		
		
		for(int i = 0; i < score.length; i++) {
			score[i] = num;
			
			num -= 10;
		}
		
		
		/*
		 * 향상된 for 문(for-each)
		 * 
		 * 
		 * 자바 5부터 배열 및 컬렉션 클래스를 좀 더 쉽게 처리할 목적으로 제공
		 * 
		 * 증감식을 사용하지 않고 배열 및 컬렉션의 요소 개수만큼 반복하여 for문을 종료
		 */
		
		for(int s : score) {
			System.out.println(s);
		}
		
	}
	
	public void method4() {
		/*
		 * 3명의 키를 입력받아 배열에 저장하고 3명의 키의 평균값을 구하시오.
		 */
		
		
		
		int person_C = 0;
		
		
		double sum = 0;
		double avg = 0;
		
		System.out.print("몇 명을 입력하실건가요 : ");
		person_C =sc.nextInt();
		
		double[] arr = new double[person_C];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 사람의 키를 입력하세요 : ", i+1);
			arr[i] =sc.nextDouble();
			
			sum += arr[i]; 
		}
		
		avg = sum / arr.length;
		
		System.out.printf("%d명의 키 평균값은 %.2f 입니다.", arr.length, avg);
		
	}
	
	public void method5() {
		// 배열의 복사
		
		// 1. 얕은 복사 : 배열의 주소만 복사
		
		int[] num = {1, 2, 3, 4, 5};
		int[] low_Copy = num;
		
		//System.out.println(num); // 	 [I@7f63425a
		//System.out.println(low_Copy); // [I@7f63425a 두 배열의 주소값이 같음
		
		//System.out.println(Arrays.toString(num)); //[1, 2, 3, 4, 5]
		//System.out.println(Arrays.toString(low_Copy)); //[1, 2, 3, 4, 5]
		
		low_Copy[1] = 20;
		
		//System.out.println(Arrays.toString(num));  // [1, 20, 3, 4, 5]
		//System.out.println(Arrays.toString(low_Copy)); // [1, 20, 3, 4, 5] 두 배열의 값이 같이 바뀜
		
		System.out.println(Arrays.toString(num) == Arrays.toString(low_Copy)); // false
		
		System.out.println(num.hashCode()); // 2137211482 객체를 식별할 하나의 정수 값
		System.out.println(low_Copy.hashCode()); // 2137211482 두 배열의 코드가 같음
		System.out.println(num.hashCode() == low_Copy.hashCode()); // true
	}
	
	
	
	public void method6() {
		// 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 내부의 값들도 함께 복사
		// for 문을 이용한 깊은 복사
		
		
		int[] num = {1, 2, 3, 4, 5};
		int[] deep_Copy = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			deep_Copy[i] = num[i];
		}
		
		deep_Copy[1] = 20;
		
		System.out.println(Arrays.toString(num)); 		// [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(deep_Copy)); // [1, 20, 3, 4, 5] 두 배열이 따로 바뀐다.
		
		System.out.println(num.hashCode()); 	  // 2137211482
		System.out.println(deep_Copy.hashCode()); // 920011586 두 배열의 코드가 다르다.
		
	}
	
	
	public void method7() {
		/*
		 *  System 클래스에서 제공하는 arraycopy() 메소드를 이용한 깊은 복사
		 *  
		 *  [표현법]
		 *  
		 *  System.arraycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 복사 시작 인덱스, 복사할 길이);
		 * 
		 */
		
		int [] num = {1, 2, 3, 4, 5};
		int[] deep_Copy = new int[5];
		
		System.arraycopy(num, 0, deep_Copy, 0, num.length);
		
		deep_Copy[2] = 30;

		System.out.println(Arrays.toString(num));  // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(deep_Copy)); // [1, 2, 30, 4, 5] 두 배열이 따로 바뀐다.
		
		System.out.println(num.hashCode()); 	  // 2137211482
		System.out.println(deep_Copy.hashCode()); // 920011586 두 배열의 코드가 다르다.
	}
	
	
	public void method8() {
		/*
		 *  Arrays 클래스에서 제공하는 copyOf() 메소드를 이용한 깊은 복사
		 *  
		 *  [표현법]
		 *  
		 *  Arrays.copyOf(원본 배열, 복사본 배열길이);
		 */
		
		int[] num = {1, 2, 3, 4, 5};
		int[] deep_Copy = null;
		
		//System.out.println(copy.length); // NullPointerException
		
		deep_Copy = Arrays.copyOf(num, num.length);
		
		deep_Copy[3] = 10;
		
		System.out.println(Arrays.toString(num));  // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(deep_Copy)); // [1, 2, 3, 10, 5] 두 배열이 따로 바뀐다.
		
		System.out.println(num.hashCode()); 	  // 2137211482
		System.out.println(deep_Copy.hashCode()); // 920011586 두 배열의 코드가 다르다.
	}
	
	public void method9() {
		// 배열의 clone() 메소드를 이용한 깊은 복사
		
		int[] num = {1, 2, 3, 4, 5};
		int[] deep_Copy = null;
		
		deep_Copy = num.clone();
		
		deep_Copy[3] = 10;
		
		System.out.println(Arrays.toString(num));  // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(deep_Copy)); // [1, 2, 3, 10, 5] 두 배열이 따로 바뀐다.
		
		System.out.println(num.hashCode()); 	  // 2137211482
		System.out.println(deep_Copy.hashCode()); // 920011586 두 배열의 코드가 다르다.
	}
}
