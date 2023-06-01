package com.kh._interface;

import com.kh._interface.step1.Bus;
import com.kh._interface.step1.Taxi;
import com.kh._interface.step1.Vehicle;

import com.kh._interface.step2.Advanced;
import com.kh._interface.step2.Beginner;
import com.kh._interface.step2.Player;
import com.kh._interface.step2.Super;
import com.kh._interface.step3.Audio;
import com.kh._interface.step3.Television;

/*
 * 인터페이스(interface)
 * 
 * [표현법]
 * 
 * [접근제어자] interface 인터페이스명 {...}
 * 
 * - 인터페이스는 개발 코드와 객체가 서로 통신하는 접점역할
 * - 인터페이스에서 필드는 무조건 상수 필드
 * - 인터페이스에서 메서드는 무조건 추상 메서드
 * - 객체가 구현해야 하는 기능이 있을 때 인터페이스에 
 * 	 추상 메서드를 추가해서 객체가 기능을 구현하도록 만듦
 * - 인터페이스를 구현하려면 implements 키워드를 사용해서 구현
 * - 인터페이스는 다중 상속(구현)이 가능하다.
 * - 추상 클래스와 다르게 좀 더 강한 규칙성, 강제성을 가지는 것이 인터페이스
 * 
 * * extends 와 implements
 * 
 * - 클래스 간에 상속 관계일 때 : 자식 클래스명 extends 부모 클래스명
 * - 클래스와 인터페이스의 구현 관계일 때 : 구현 클래스명 implements 인터페이스명, 인터페이스명, 인터페이스명, ...
 * - 인터페이스 간에 상속 관계일 때 :자식 인터페이스명 extends 인터페이스명, 인터페이스명, ...
 * 
 * 
 * 추상 클래스 : 미완성 설계도
 * 인터페이스 : 기본 설계도
 */

public class Application {

	public static void main(String[] args) {
		//Vehicle v =new Vehicle(); // <-- 인터페이스도 객체생성 불가
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		
		bus.run();
		taxi.run();
		
		System.out.println();
		
		
		Player[] players = {new Beginner(), new Advanced(), new Super()};
		
		for(Player p : players) {
			p.showLevelMessage();
			p.run();
			p.jump();
			p.turn();
		}
		
		System.out.println();
		
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(-1);
		tv.turnOff();
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(20);
		audio.turnOff();
	}

}
