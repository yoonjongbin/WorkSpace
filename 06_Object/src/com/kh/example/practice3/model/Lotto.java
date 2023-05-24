package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {
	
	int[] lotto = new int[5];
	
	public String information() {
		
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) { 
					i--;
					break;
				}
			}

		}
//		for(int i = 0; i < lotto.length; i++) {
//			random = (int)(Math.random() * 45) + 1;
//			lotto[i] = random;
//			for(int j = 0; j <= i; j++) {
//				if(lotto[j] == lotto[i]) {
//					if(i > 0) 
//						i--;
//					
//					continue;
//				} else lotto[i] = random;;
//			}
//			
//		}
		
		
		return Arrays.toString(lotto);
	}
}
