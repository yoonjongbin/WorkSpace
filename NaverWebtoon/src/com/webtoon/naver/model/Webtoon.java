package com.webtoon.naver.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Webtoon {
	//private String[] title = {"약한영웅", "나 혼자만 레벨업", "김부장", "궤짝","스위트홈", "후레자식", "놓지마정신줄"};
	//private String[] day = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
	private String toonName;	// 만화이름
	private String toonValue; 	// 만화내용
	private int viewCount;		// 조회수
	private int good;			// 추천수
	
	
	
	private ArrayList title = new ArrayList();
	private ArrayList day = new ArrayList();
	
	Scanner sc = new Scanner(System.in);
	
	int dayCount = (int)(Math.random() * 100) + 1;

	public Webtoon() {
	}

	public Webtoon(String[] title, String[] day, Scanner sc, int dayCount) {
		this.title = title;
		this.day = day;
		this.sc = sc;
		this.dayCount = dayCount;
	}

	public String[] getTitle() {
		return title;
	}

	public void setTitle(String[] title) {
		this.title = title;
	}

	public String[] getDay() {
		return day;
	}

	public void setDay(String[] day) {
		this.day = day;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getDayCount() {
		return dayCount;
	}

	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	@Override
	public String toString() {
		return "Webtoon [title=" + Arrays.toString(title) + ", day=" + Arrays.toString(day) + ", sc=" + sc
				+ ", dayCount=" + dayCount + "]";
	}
	
	
	


}
