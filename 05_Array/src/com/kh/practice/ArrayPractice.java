package com.kh.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayPractice p = new ArrayPractice();
		// p.method1();
		// p.method2();
		//p.method3();
		//p.method4();
		p.method5();
	}

	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 */
	public void method1() {
		String[] fruit = { "사과", "바나나", "딸기", "키위", "두리안" };

		System.out.println(fruit[1]);
	}

	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된
	 * 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5 배열 0번째 인덱스에 넣을 값 : 4 배열 1번째 인덱스에 넣을 값 : -4 배열 2번째 인덱스에 넣을 값 : 3 배열 3번째
	 * 인덱스에 넣을 값 : -3 배열 4번째 인덱스에 넣을 값 : 2 [4, -4, 3, -3, 2] 2
	 */
	public void method2() {

		int sum = 0;
		int num = 0;
		System.out.print("정수 : ");
		num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ", i);
			arr[i] = sc.nextInt();

			sum += arr[i];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}

	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을
	 * 출력하세요.
	 * 
	 */
	public void method3() {
		String[] arr = { "된장찌개", "김치전", "라면", "떡볶이" };

		String input = "";
		
		boolean send = false;

		System.out.print("메뉴를 적어주세요 : ");
		input = sc.nextLine();

		
		/*for (int i = 0; i < arr.length; i++) {
​
			if (input.equals(arr[i])) {
				send = true;
				break;
			}else {
				continue;
			}
		}*/
		
		for(String i : arr) {
			if(input.equals(i)) {
				send = true;
				break;
			}else continue;
		}
		
		if(send == true) System.out.println("배달 가능");
		else System.out.println("배달 불가능");
		

	}

	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열은 건드리지 않고!
	 * 
	 * 주민등록번호 : 123456-1234567 123456-1******
	 * 
	 */
	public void method4() {
		
		int count = 0;
		String temp = "";
		
		char [] arr_Copy = null;
		
		
		System.out.print("주민등록번호 : \n");
		temp = sc.nextLine();
		
		char[] arr = new char[temp.length()];
		
		
		for(int i = 0; i < temp.length(); i++) {
			
			arr[i] = temp.charAt(i);
		}
		
		
		arr_Copy = arr.clone();
		
		for(char i : arr_Copy) {
			
			if(count > 7)	
				arr_Copy[count] = '*';
			count++;
		}
		
		System.out.println(arr_Copy);
		
		
		
		
	}

	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요.
	 * 
	 * 단어 입력 : programming gnimmargorp
	 * 
	 */
	public void method5() {

		
		String temp = ""; 
		
		
		System.out.print("단어 입력 : ");
		temp = sc.nextLine();
		
		char[] temp_ch = new char[temp.length()];
		
		for(int i = 0;  i < temp.length(); i++) {
			temp_ch[i] = temp.charAt(i);
		}
		
		for(int i = temp.length(); i > 0; i--) {
			System.out.print(temp_ch[i - 1]);
		}


	}
}