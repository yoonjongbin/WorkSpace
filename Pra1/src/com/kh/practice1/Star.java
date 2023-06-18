package com.kh.practice1;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(sc.nextLine());
		
		
		
		for(int i = 1; i < size+1; i++) {
			
			for(int j = 0; j < size-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int i = size-1; i > 0 ; i--) {
			
			for(int j = 0; j < size-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (2*i)-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
	}	
			
}


  