package com.kh.step1.model;


public class Tv{
	
	
	
	// 속성(property) : 멤버변수(member variable), 특성(attribute), 필드(field) 
	
	public boolean power; // 전원상태(on/off)
	public int channel = 50; // 채널
	
	// 기능(function) : 함수, 메소드(method)
	
	public void power() {	// TV를 켜거나 끄는 기능
		 power = !power;
	}
	
	public void channelUp() {	// TV의 채널을 높이는 기능
		++channel;
	}
	public void channelDown() {	// TV의 채널을 낮추는 기능
		--channel;
	}
}
