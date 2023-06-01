package com.baekjoon.practice3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int repeat = sc.nextInt();
		
		int[][] located = new int[repeat][2];
		int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0, AXIS = 0;
		
		for(int i = 0; i < repeat; i++) {
			int inputX = sc.nextInt();
			int inputY = sc.nextInt();
			
			for(int j = 0; j < located[i].length; j++) {
				
				if(j == 0) {
					
					located[i][j] = inputX;
					located[i][j+1] = inputY;
					
					if(located[i][j] > 0 && located[i][j+1] > 0) Q1++;
					else if(located[i][j] < 0 && located[i][j+1] > 0) Q2++;
					else if(located[i][j] < 0 && located[i][j+1] < 0) Q3++;
					else if(located[i][j] > 0 && located[i][j+1] < 0) Q4++;
					else AXIS++;
					
				}
				
			}
			
		}
		
		System.out.printf("Q1: %d\n" + "Q2: %d\n" + "Q3: %d\n" + "Q4: %d\n" + "AXIS: %d\n", Q1, Q2, Q3, Q4, AXIS);

	}

}
