package com.kh.step4;

import javax.swing.JOptionPane;

public class CountDown implements Runnable {
	
	private String input = "0";
	
	@Override
	public void run() {
		
		// 1. 데이터 입력

		input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
		System.out.println("입력하신 숫자는 " + input + "입니다.");
		
		

	}

	public boolean getNum(int input) {
		if(Integer.parseInt(this.input) == input)
			return true;
		
		return false;
	}

}
