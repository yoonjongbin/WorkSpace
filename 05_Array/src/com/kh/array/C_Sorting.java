package com.kh.array;

import java.util.Arrays;
import java.util.Collections;

public class C_Sorting {
	public static void main(String[] args) {
		C_Sorting c = new C_Sorting();
		//c.method1();
		//c.method2();
		//c.method3();
		//c.method4();
		//c.method5();
		c.method6();
		//c.method7();
		
		}
	

	
	public void method1() {
		
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		
		// 1. 오름차순 정렬 (작은숫자부터 큰 숫자로 정렬)
		Arrays.sort(arr); // DualPivotQuicksort
		System.out.println(Arrays.toString(arr));
		
		
		// 2. 내림차순 정렬
		int[] copy = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			copy[(arr.length - 1) - i] = arr[i];
		}
		
		System.out.println(Arrays.toString(copy));
	}
	
	
	
	
	public void method2() {
		String [] arr = { "사과", "orange", "배", "banana", "Lemon"};
		
		// 오름차순 정렬(영문 대문자 - 소문자 - 한글 순으로 정렬)
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 정렬
		
		Arrays.sort(arr, Collections.reverseOrder());
	}
	
	
	
	public void method3() {
		
		// 최대값과 최소값 구하기
		
		int[] score = {79, 88, 91, 44, 100, 55, 95};
		
		Arrays.sort(score);
		
		Arrays.sort(score);
		System.out.println("최대값 :" + score[score.length - 1]);
		System.out.println("최소값 : " + score[0]);
		
	}
	
	
	public void method4() {
		
		
		/*
		 * 선택정렬(selection sort)
		 * 	
		 * 	가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고,
		 * 	그다음 작은 데이터를 선택해 앞에서 두 번째 데이터와 바꾸는 과정을 반복
		 * 
		 * 	배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		 * 
		 *  데이터 양이 적을 때 좋음, 하지만 100개 이상의 자료에서는 급격한 속도저하
		 * 
		 * 	7, 5, 9, 0, 3, 1, 6, 2, 4, 8
		 * 
		 * 	0, 5, 9, 7, 3, 1, 6, 2, 4, 8
		 * 
		 * 	0, 1, 9, 7 ,3, 5, 6, 2, 4, 8
		 * 
		 * 	0, 1, 2, 7, 3, 5, 6, 9, 4, 8
		 * 
		 * 	....
		 * 
		 * 	0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		 */
		
		
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		// 비교주제 비교대상
		// i = 0 j = 1~9
		// i = 1 j = 2~9
		// i = 2 j = 3~9
		//...
		
		
		// 1. 비교주체
		for(int i = 0; i < arr.length; i++) {
            // 2. 비교대상
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;				
			}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	public void method5() {
		/* 삽입정렬(insertion sort)
		 * 
		 * 	동작 원리는 직관적, 선택 정렬에 비해서는 구현 난이도가 높음
		 * 	필요할 때만 위치를 바꾸므로 '데이터가 거의 정렬되어 있을때' 효율적
		 * 
		 * 
		 * 	7, 5, 9, 0, 3, 1, 6, 2, 4, 8 
		 * 	5, 7, 9, 0, 3, 1, 6, 2, 4, 8
		 * 	0, 5, 7, 9, 3, 1, 6, 2, 4, 8
		 * 
		*/
		
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		// 비교주체		비교대상
		// i = 0		x
		// i = 1		j = 0
		// i = 2		j = 0~1
		// i = 3		j = 0~2
		// i = 4		j = 0~3
		
		
		//1. 비교주체
		for(int i = 1; i < arr.length; i++) {
			//2. 비교대상
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public void method6() {
		/*
		 * 버블정렬(bubble sort)
		 * 
		 * 	인저한 두 수를 비교해서 큰 수를 뒤로 보내는 것이 특징
		 * 
		 * 	구현이 쉽다는 장점이 있지만, 다른정렬에 비해 정렬 속도가 느리며
		 * 	역순으로 정렬할 때 가장 느린 속도를 가짐
		 * 
		 * 	7, 5, 9, 0, 3, 1, 6, 2, 4, 8
		 * 	5, 7, 0, 3, 1, 6, 2, 4, 8, 9
		 * 	5, 0, 3, 1, 6, 2, 4, 7, 8 ,9
		 */
		
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int i = arr.length-1; i >= 0; i--) {
			
			for(int j = 0; j < arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
