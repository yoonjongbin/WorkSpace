package com.kh._interface.step2;

public class Beginner implements Player {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	
	@Override
	public void jump() {
		System.out.println("점프불가");
	}

	
	@Override
	public void turn() {
		System.out.println("방향전환 불가");
	}

	
	@Override
	public void showLevelMessage() {
		System.out.println("===== 초보자 레벨 =====");
	}

}
