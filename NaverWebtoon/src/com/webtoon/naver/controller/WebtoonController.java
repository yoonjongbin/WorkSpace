package com.webtoon.naver.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.webtoon.naver.model.Webtoon;

public class WebtoonController {

	Scanner sc = new Scanner(System.in);

	// Webtoon toon = new Webtoon();

	Map<String, Webtoon> toonList = new HashMap<>();
	Map<Webtoon, Integer> toonsEpi = new HashMap<>();
	Map<Integer, String> toonValue = new HashMap<>();

	public void setWebtoon() {
		toonList.put("월", new Webtoon("약한영웅", "약한영웅", 0, 0, LocalDate.of(2020, 10, 23)));
		toonList.put("화", new Webtoon("나 혼자만 레벨업", "나 혼자만 레벨업", 0, 0, LocalDate.of(2020, 3, 16)));
		toonList.put("수", new Webtoon("김부장", "김부장", 0, 0, LocalDate.of(2022, 7, 27)));
		toonList.put("목", new Webtoon("궤짝", "궤짝", 0, 0, LocalDate.of(2021, 8, 5)));
		toonList.put("금", new Webtoon("스위트홈", "스위트홈", 0, 0, LocalDate.of(2017, 12, 16)));
		toonList.put("토", new Webtoon("후레자식", "후레자식", 0, 0, LocalDate.of(2015, 6, 5)));
		toonList.put("일", new Webtoon("놓지마정신줄", "놓지마정신줄", 0, 0, LocalDate.of(2014, 7, 26)));

		LocalDate today = LocalDate.now();
		System.out.println(today);

		Set<String> keys = toonList.keySet();

		for (String key : keys) {

			long days = ChronoUnit.DAYS.between(toonList.get(key).getStartDate(), today);
			int epi = (int) days / 7;

			System.out.println(epi);

			toonsEpi.put(toonList.get(key), epi);

		}

	}

	public void selectToon(String key) { // 만화선택
		// 사용자가 요일을 선택하면 해당 요일에 연재하는 만화 표시 및 episode() 호출
		System.out.println(toonList.get(key).getToonName() + "\n\n\n");

		if (toonsEpi.containsKey(toonList.get(key))) {
			episode(toonsEpi.get(toonList.get(key)), toonList.get(key));
		}

	}

	public void toonValue() { // 만화 내용
		// episode()으로부터 호출 받아서 내용 화면에 출력

	}

	public void episode(int epi, Webtoon toon) { // 화수

		// selectToon()으로부터 호출 받아서 에피소드 화면에 출력
		int j = 1;
		String[] episode = new String[epi];

		for (int i = 0; i < episode.length; i++) {
			episode[i] = toon.getToonName() + j + "화";
			System.out.println(episode[i]);

			toonValue.put(j, toon.getToonValue() + (j++) + "화 내용");

		}

		try {
			System.out.printf("에피소드를 선택하세요(1-%d) : ", epi);
			int choose = Integer.parseInt(sc.nextLine());

			if (!(choose * 0 != 0) && choose > 0 && choose <= epi)
				System.out.println(toonValue.get(choose));
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				episode(epi, toon);
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			episode(epi, toon);
		}

	}
}
