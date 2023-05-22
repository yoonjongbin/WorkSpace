package com.kh.array;

import java.util.Arrays;

public class B_Dimension {
	/*
	 * 다차원 배열 : '[]'의 개수가 차원의 수를 의미
	 * 
	 *  2차원 배열 선언
	 *  
	 *  
	 *  [표현법]
	 *  
	 *  자료형[][] 배열명;
	 *  자로형 배열명[][];
	 *  자료형[] 배열명[];
	 *  
	 *  
	 *  
	 *  2차원 배열의 생성
	 *  
	 *  
	 *  [표현법]
	 *  
	 *  배열명 = new 자료형[행 크기][열 크기];
	 *  
	 *  
	 *  2차원 배열의 선언과 초기화를 동시에 진행
	 *  
	 *  
	 *  [표현법]
	 *  
	 *  자료형[][] 배열명 = new 자료형[행 크기][열 크기];
	 *  자료형 배열명[][] = new 자료형[행 크기][열 크기];
	 *  자료형[] 배열명[] = new 자료형[행 크기][열 크기];
	 *  
	 *  
	 *  2차원 배열의 선언과 초기화
	 *  
	 *  배열 변수와 인덱스를 이용해 초기화
	 *  	배열명[0][0] = 값;
	 *  	배열명[0][1] = 값;
	 *  	배열명[1][0] = 값;
	 */
	
	
	public static void main(String[] args) {
		B_Dimension b = new B_Dimension();
		//b.method1();
		//b.method2();
		//b.method3();
		//b.method4();
		b.method5();
		//b.method6();
		//b.method7();
		//b.method8();
		//b.method9();
	}
	
	public void method1() {
		// 선언과 동시에 초기화
		
		int sum = 0;
		
		int[][] arr = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14 ,15}};
		
		/*
		 * [1, 2, 3, 4, 5]
		 * [6, 7, 8, 9, 10]
		 * [11, 12 ,13, 14 ,15]
		 * 
		 */
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		
		}
		
		System.out.println(sum);
	}
	
	public void method2() {
		/*
		 * 1
		 * 2
		 * 3
		 * ...
		 * 
		 * 14
		 * 15
		 */
		
		
		int[][] arr = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14 ,15}};
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}
	
	public void method3() {
		// 중첩 반복문을 이용한 초기화
		int[][] arr = new int[3][5];
		
		
		int value = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		//System.out.println(Arrays.toString(arr));
		
		for(int[] i : arr) {
			for(int j : i) {
				System.out.println(j);
			}
		}
		
	}
	
	public void method4() {
		 //가변 배열 : 다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정
		
		int[][] arr = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}};
		
		
		for(int[] i : arr) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}
	
	public void method5() {
		/*
		 * [Java, Oracle, JDBC]
		 * [HTML, CSS, JavaScript, jQuary]
		 * [Servlet, JSP, MyBatis]
		 * [Spring, React]
		 */
		
		String[][] arr = {{"Java", "Oracle", "JDBC"}, {"HTML", "CSS", "JavaScript", "jQuary"}, 
							{"Servlet", "JSP", "MyBatis"}, {"Spring", "React"}};
		
		/*for( int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}*/
		
		for(String[] i : arr) {
			System.out.println(Arrays.toString(i));
		}
		
		
		
	}
}
