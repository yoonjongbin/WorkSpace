package com.kh.overriding;

import com.kh.overriding.model.Customer;
import com.kh.overriding.model.VIPCustomer;

public class Application {

	public static void main(String[] args) {
		Customer customer1 = new Customer("홍수민");
		Customer customer2 = new Customer("홍수민");
		
		
		
		
		System.out.println(customer1);
		System.out.println(customer2);	// 두 객체가 가르키는 주소값이 다르다.
		
		
		System.out.println(customer1.equals(customer2)); // true
		
		VIPCustomer customer3 = new VIPCustomer("최승환");
		VIPCustomer customer4 = new VIPCustomer("박승환");
		
		System.out.println(customer3.equals(customer4)); // false
		
		System.out.printf("%s님의 등급은 %s 이며, 지불해야 하는 금액은 %d이며, 적립된 포인트는 %d점입니다.\n", 
						customer2.getName(), customer2.getGrade(), customer2.calcPrice(1000), customer2.getBonusPoint());
		System.out.printf("%s님의 등급은 %s 이며, 지불해야 하는 금액은 %d이며, 적립된 포인트는 %d점입니다.\n", 
						customer4.getName(), customer4.getGrade(), customer4.calcPrice(1000), customer4.getBonusPoint());
		
		
	}

}
