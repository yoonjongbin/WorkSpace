package com.kh.step5;

public class SharedMemoryTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		User2 user2 = new User2();
		
		user1.setCaculator(cal);
		user2.setCaculator(cal);
		
		user1.start();
		user2.start();
	}

}
