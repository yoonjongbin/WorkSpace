package com.kh.array;

public class D_String {
	/*
	 * 문자열 : 문자의 배열, 여러 개의 문자가 배열을 이룬 것이 문자열
	 * 자바에서는 문자는 작은 따옴표('), 문자열은 큰 따옴표(")를 사용하여 나타낼 수 있음
	 * 
	 * String.charAt(int index)
	 * 		인덱스에 있느 문자를 char 형식으로 반환
	 * 			
	 */
	
	public static void main(String[] args) {
		D_String d = new D_String();
		d.method1();
	}
	
	
	public void method1() {
		char[] arr = "Hello, World!".toCharArray();
		
		for(char c : arr) {
			System.out.println(c);
		}
		
		/*
		 * ArrayIndexOutOfBoundsException
		 * 	배열의 인덱스 범위를 벗어나서 발생하는 에러
		 * 
		 * 
		 * 해결책 : 조건식 수정(i < 배열의 길이, i <= 배열이 길이 - 1)
		 * 
		 * 
		 */
	}
