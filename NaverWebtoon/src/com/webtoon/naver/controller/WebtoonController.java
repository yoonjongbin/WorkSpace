package com.webtoon.naver.controller;

import java.util.Arrays;

import com.webtoon.naver.model.Webtoon;

public class WebtoonController {
	
	Webtoon toon = new Webtoon();
	
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
