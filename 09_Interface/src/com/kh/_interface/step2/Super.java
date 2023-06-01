package com.kh._interface.step2;

public class Super implements Player {

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("방향전환을 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 고급자 레벨 =====");
	}

}
