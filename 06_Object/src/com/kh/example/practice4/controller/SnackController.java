package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

public class SnackController { // 기능을 담는다(메서드), 컨트롤러, controller
	
	
	// 멤버변수 -> 보통 모델로 만들어 놓은 클래스
	Snack s = new Snack();
	
	// 생성자
	public SnackController() {}
	
	// 메서드
	// 데이터를 setter를 이용해 저장하고 저장되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack viewSnack) {
		
		// s은 controller에서 만든 임시 데이터 창고
		// viewSnack은 Application에서 데이터를 담은 임시 데이터 창고
		
		String kind = viewSnack.getKind();
		s.setKind(kind);
		
		// == s.setKind(viewSnack.getKind());
		
		s.setName(viewSnack.getName());
		s.setFlavor(viewSnack.getFlavor());
		s.setNumOf(viewSnack.getNumOf());
		s.setPrice(viewSnack.getPrice());
		
		return true;
	}
	
	
	// controller에 저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		return s; // == this.s;
	}
	
}
