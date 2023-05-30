package com.baekjoon.practice;

import java.util.Scanner;

public class practic_01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] num = new int[30];
		int[] temp = new int[28];
		
		for(int i = 1; i <= num.length; i++) {
			num[i] = i++;
		}
		
		
		
		for(int i = 0; i < temp.length; i++) {

			System.out.print("제출(번호) : ");
			int send = Integer.parseInt(sc.nextLine());
			for(int j = 0; j < i; j++) {
				if(i == 0) break;
				else if(temp[j] == send) {
					System.out.println("중복되었습니다.");
					
					System.out.print("제출(번호) : ");
					send = Integer.parseInt(sc.nextLine());
				}
					
				
			}
			
			
			temp[i] = send;
		}
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				if(num[i] == temp[j])
					num[i] = 0;
			}
			//if(num[i] == temp[j]) continue;
			//else System.out.println();
		}
		
		for(int i : num) {
			if(i != 0)
				System.out.println(i);
		}
	}

}
