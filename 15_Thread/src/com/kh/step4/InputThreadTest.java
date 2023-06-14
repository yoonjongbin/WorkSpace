package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {
		
		
		CountDown cd = new CountDown();

		Thread tcd = new Thread(cd);

		tcd.start();
		
//		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
//		System.out.println("입력하신 숫자는 " + input + "입니다.");

		// 2. 카운팅 작업

		for (int i = 10; i > 0; i--) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

			System.out.println(i);
			if(cd.getNum(i)) {
				System.out.println("입력하신 숫자 도달하였습니다.");
				break;
			} else if(i == 1){
				System.out.println("숫자를 입력하지 않았습니다.");
				System.exit(0);
			}
		}

		
		
	}

}
