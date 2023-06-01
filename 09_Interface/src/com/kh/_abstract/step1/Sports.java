package com.kh._abstract.step1;

public abstract class Sports {
	
	protected int numOfPlayer;	// 참여하는 사람의 수

	
	
	public Sports() {
	}

	public Sports(int numOfPlayer) {
		this.numOfPlayer = numOfPlayer;
	}
	
	
	/*
	 * 추상메서드
	 * 
	 * - 중괄호 {} 가 구현되지 않은 상태
	 * - 미완성된 추상 메서드가 있다는 이야기는 이 클래스 또한 미완성 상태
	 * - 즉, 해당 클래스로 객체를 생성할 수 없다.
	 * - 자식 클래스에서 무조건 재정의! 재정의 하지 않으면 에러가 생김
	 */
	
	public abstract void rule(); // 추상 메서드가 있을라면 클래스가 추상클래스여야 한다.
	
	
}
