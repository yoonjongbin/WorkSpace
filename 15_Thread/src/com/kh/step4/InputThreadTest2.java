package com.kh.step4;

public class InputThreadTest2 {
	
	boolean inputCheck = false;
	
	public static void main(String[] args) {
		InputThreadTest2 process = new InputThreadTest2();
		
		Thread t1 = new Thread(new CountingThread(process));
		Thread t2 = new Thread(new InputThread(process));
		
		t1.start();
		t2.start();
		
		
	}

}
