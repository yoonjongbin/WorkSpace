package com.baekjoon.practice2;

import java.util.Scanner;

public class Practice_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("바이트 크기 : ");
		int size = Integer.parseInt(sc.nextLine());
		
		
		if(size % 4 != 0)
			size += 4;
		
		for(int i = 0; i < size/4; i++) {
			System.out.print("long ");
			
		}
		
		System.out.print("int");*/
		
		
		int repeatCount = Integer.parseInt(sc.nextLine());
		String[] str = new String[repeatCount];
		int[] scoreResult = new int[repeatCount];
		
		for(int i = 0; i < repeatCount; i++) {
			
			int score = 0;
			int temp = 0;
			str[i] = sc.nextLine();
			
			for(int j = 0; j < str[i].length(); j++) {
				
				
						
				if(j > 0) {
					
					if(str[i].charAt(j-1) == 'O' && str[i].charAt(j-1)  == str[i].charAt(j)) {
						
						temp++;
						score += temp + 1;
	
					} else if(str[i].charAt(j) == 'O') {
						score += 1;
					}
					else temp = 0;
					
					
				} else {
					if(str[i].charAt(j) == 'O')
						score += 1;
				}
				
				
			}
				/*if(str[i].charAt(j) == 'O') {
					score++;
				}*/
				scoreResult[i] = score;
				
		}
			
			
			
		
		
		for(int result : scoreResult) {
			System.out.println(result);
		}
		
		
		
	}

}
