package com.webtoon.naver.model;

import java.util.Scanner;

public class Webtoon {
	public String[] title = {"약한영웅", "나혼자만 레벨업", "김부장", "궤짝","스위트홈", "후레자식", "놓지마정신줄"};
	public String[] day = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
	
	Scanner sc = new Scanner(System.in);
	
	public int view_C = 0;
	
	public void selectToon() {
		System.out.print(" 약한영웅, 나혼자만 레벨업, 김부장, 궤짝,스위트홈, 후레자식, 놓지마정신줄 중 보고 싶은 웹툰을 적어주세요 : ");
		String toonName = sc.nextLine();
		
		for(int i = 0; i < title.length; i++) {
			if(toonName == title[i]) {
				title[i]
			}
		}
	}

}
