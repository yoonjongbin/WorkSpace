package com.kh._abstract.step1;

public class FootBall extends Sports{

	
	public FootBall() {
	}

	public FootBall(int numOfPlayer) {
		super(numOfPlayer);
		
	}

	
	
	@Override
	public void rule() {
		System.out.println("FootBall의 선수의 수는" + this.numOfPlayer + "명, 손이 아닌 발로 공을 차야한다.");
	}

}
