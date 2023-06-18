package com.kh.practice1;

public class Star {

	public static void main(String[] args) {
		
		int star = 1;
		
		
//		for(int i = 5; i >= 0; i--) {
//			for(int j = 0; j < i; j++)
//				System.out.print(" ");
//			for(int k = 0; k < 5-i; k++)
//				System.out.print("*");
//			
//			System.out.println();
//		}
		
		
		for(int i = 5; i >= 0; i--) {
			int a = i;
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int k = 0; k < 5-(a-2); k++)
				System.out.print("*");
			
			System.out.println();
		}

			
		
	}	
			
}


  