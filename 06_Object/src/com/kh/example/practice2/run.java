package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class run {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		
//		System.out.println("원의 둘레 : " + c1.printCircum());
//		System.out.println("원의 넓이 : " + c1.printCircum());
//		c1.incrementRadius();
//		System.out.println("원의 둘레1 : " + c1.printCircum());
//		System.out.println("원의 둘레2 : " + c1.printCircum());
		
		
		
		for(int i = 1; i < 3; i++) {
			//System.out.printf("원의 둘레%d : %.2f\n", i, c1.printCircum());
			//System.out.printf("원의 넓이%d : %.2f\n", i, c1.printCircum());
			System.out.println(2 * c1.radius * Circle.PI); // public static을 안붙히면 PI변수를 사용 못함??
			System.out.println(c1.radius * c1.radius * Circle.PI);
			
			c1.incrementRadius();
		}
		
	}

}
