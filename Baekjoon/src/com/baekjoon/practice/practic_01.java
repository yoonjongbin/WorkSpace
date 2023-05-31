package com.baekjoon.practice;

import java.util.Arrays;
import java.util.Scanner;

public class practic_01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] num = new int[30];
		int[] sort = new int[2];
		int count = 0;
		
		
		for(int i = 1; i <= num.length; i++) {
			
			num[i-1] = i;
			
		}
		
		for(int i = 0; i < 28; i++) {
			
			int num1 = Integer.parseInt(sc.nextLine());
			
			for(int j = 0; j < num.length; j++) {
				
				if(num1 == num[j]) num[j] = 0;
							
			}
			
		}
		
		
		for(int i : num) {
			
			if(i != 0) {
				
				sort[count] = i;
				count++;
				
			}
		}
		
		Arrays.sort(sort);
		
		for(int i : sort) {
			
			System.out.println(i);
			
		}
		
	}

}
//int[] temp = new int[28];
/*
for(int i = 0; i < temp.length; i++) {

	System.out.print("제출(번호) : ");
	int send = Integer.parseInt(sc.nextLine());
	if(send > 0 && send < 31) {
		for(int j = 0; j < i; j++) {
			
			if(temp[j] == send) {
				
				System.out.println("중복되었습니다.");
				j = 0;
				System.out.print("제출(번호) : ");
				send = Integer.parseInt(sc.nextLine());
				
			} 
			
		}
		
		temp[i] = send;
		
	}else {
		System.out.println("1부터 30사이의 숫자만 입력하세요.");
		if(i > 0)
			i--;
	}
	
	
	
	
}

for(int i  = 0; i < num.length; i++) {
	for(int j = 0; j < temp.length; j++) {
		if(num[i] == temp[j])
			num[i] = 0;
	}
	

}


for(int i : num) {
	
	if(i != 0) {
		System.out.println(i);
	}
}


int[] sort = new int[2];
int count = 0;
for(int i : num) {
	
	if(i != 0) {
		sort[count] = i;
		count++;
	}
}
Arrays.sort(sort);

for(int i : sort) {
	System.out.println(i);
}
*/
