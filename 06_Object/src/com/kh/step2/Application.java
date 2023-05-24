package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {
		// 클래스 변수는 인스턴스 생성 없이 호출가능!
		
		System.out.println(Card.width);
		System.out.println(Card.height + "\n");
		
		
		Card card = new Card(); 
		card.kind = "Heart";
		card.num = 7;
		
		// 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
		card.width = 50;
		card.height = 80;
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.num = 3;
		
		card2.width = 70;
		card2.height = 90;
		
		
		
		System.out.printf("첫번째 카드는 %s %s이며, 크기는 %d X %d 입니다.\n", card.kind, card.num, card.width, card.height);
		System.out.printf("두번째 카드는 %s %s이며, 크기는 %d X %d 입니다.\n", card2.kind, card2.num, card2.width, card2.height);
		
	}

}
