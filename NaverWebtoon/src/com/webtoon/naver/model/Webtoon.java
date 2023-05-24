package com.webtoon.naver.model;

import java.util.Arrays;
import java.util.Scanner;

public class Webtoon {
	public String[] title = {"약한영웅", "나혼자만 레벨업", "김부장", "궤짝","스위트홈", "후레자식", "놓지마정신줄"};
	public String[] day = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
	
	Scanner sc = new Scanner(System.in);
	
	int dayCount = (int)(Math.random() * 100) + 1;
	
	
	
	public void selectToon() {
		System.out.printf("%s 중 보고 싶은 웹툰을 적어주세요 : ", Arrays.toString(title));
		String toonName = sc.nextLine();
		
		for(int i = 0; i < title.length; i++) {
			if(toonName .equals(title[i])) {
				episode();
			}
		}
	}
	
	public void toon() {
		
		
	}
	
	public void episode() {
		
		int select_E;
		int i;
		int episode_C = dayCount / 7;
		
		//int episodeCount1 = dayCount % 7;
		
		String[] episodeHave = new String[episode_C];
		int[] view_C = new int[episode_C];
		
		
		
		for(i = 0; i < episodeHave.length; i++) {
			episodeHave[i] = (i + 1) + "화";
			System.out.println(episodeHave[i]);
			
			
		}
		
		System.out.print("에피소드 선택: ");
		select_E = sc.nextInt();
		
		if(select_E > episodeHave.length)
			System.out.println(episodeHave.length + "보다 작은 수를 입력하세요.");
		if(select_E == i) {
			System.out.println(i + "화 내용입니다.");
			view_C[i-1] += 1;
			System.out.println(Arrays.toString(view_C));
		}
			
		
		
		
		
		
	}

}
