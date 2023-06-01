package com.kh.practice;

public class IPhone14Pro extends SmartPhone implements Pen{
	String name = "iPhone 14 Pro";
	String brand = "Apple";
	

	public IPhone14Pro() {
	}


	public void printInfo() {
		System.out.printf("%s는 %s에서 만들어졌고, 제원은 다음과 같다.\n", name, brand);
		System.out.println(makeCall());
		System.out.println(takeCall());
		System.out.println(picture());
		System.out.println("팬 탑재 여부 : " + pen());
		
	}
	
	@Override
	public void printInfo(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}
	
	@Override
	public boolean pen() {
		return false;
	}


	@Override
	public String makeCall() {
		String calling = "번호를 누르고 통화버튼을 누름";
		return calling;
	}


	@Override
	public String takeCall() {
		String receiveCall = "수신 버튼을 누름";
		return receiveCall;
	}


	@Override
	public String picture() {
		String camera = "4800만 화소 카메라";
		return camera;
	}


	
	
	
	
}
