package com.kh._interface.step2;

public class Advanced implements Player {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프가능");
	}

	@Override
	public void turn() {
		System.out.println("방향전환 불가");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 중급자 레벨 =====");
	}

}
