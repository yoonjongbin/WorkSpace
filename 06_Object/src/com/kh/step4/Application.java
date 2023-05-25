package com.kh.step4;

import com.kh.step4.model.Car;

public class Application {

	public static void main(String[] args) {
		Car c = new Car();
		
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 4;
		
		Car c1 = new Car("white", "auto", 4);
		Car c2 = new Car("black", "manual");
		
		 System.out.println(c1);
		 System.out.println(c2);
	}

}
