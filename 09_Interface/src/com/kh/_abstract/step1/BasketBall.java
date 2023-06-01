package com.kh._abstract.step1;

public  class BasketBall extends Sports {

	
	public BasketBall() {
	}

	public BasketBall(int numOfPlayer) {
		super(numOfPlayer);
		
	}
	
	
	@Override
	public void rule() { // 자식 클래스는 무조건 부모의 추상 메서드를 가지고 있어야한다.
		System.out.println("BasketBall의 선수의 수는 " + this.numOfPlayer + "명, 공을 던져서 링에 넣어야 한다.");
	}

}
