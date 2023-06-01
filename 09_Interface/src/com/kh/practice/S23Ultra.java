package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen {
	String name = "S23 Ultra";
	String brand = "Samsung";
	
	public S23Ultra() {
	}

	public void printInfo() {
		System.out.printf("%s는 %s에서 만들어졌고, 제원은 다음과 같다.\n", name, brand);
		System.out.println(makeCall());
		System.out.println(takeCall());
		System.out.println(picture());
		System.out.println("팬 탑재 여부 : " +pen());
	}

	@Override
	public void printInfo(String name, String brand) {
		
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
		String camera = "2억 화소 카메라";
		return camera;
	}

	@Override
	public boolean pen() {
		return true;
	}

	
	
	
}
