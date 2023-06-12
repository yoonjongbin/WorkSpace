package com.webtoon.naver.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Webtoon {
	//private String title;// = {"약한영웅", "나 혼자만 레벨업", "김부장", "궤짝","스위트홈", "후레자식", "놓지마정신줄"};
	//private String day; //= {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
	private String toonName;	// 만화이름
	private String toonValue; 	// 만화내용
	private int viewCount;		// 조회수
	private int good;			// 추천수
	private LocalDate startDate;
	
	public Webtoon() {}

	public Webtoon(String toonName, String toonValue, int viewCount, int good, LocalDate startDate) {
		super();
		this.toonName = toonName;
		this.toonValue = toonValue;
		this.viewCount = viewCount;
		this.good = good;
		this.startDate = startDate;
	}

	public String getToonName() {
		return toonName;
	}

	public void setToonName(String toonName) {
		this.toonName = toonName;
	}

	public String getToonValue() {
		return toonValue;
	}

	public void setToonValue(String toonValue) {
		this.toonValue = toonValue;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Webtoon [toonName=" + toonName + ", toonValue=" + toonValue + ", viewCount=" + viewCount + ", good="
				+ good + ", startDate=" + startDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(good, startDate, toonName, toonValue, viewCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Webtoon other = (Webtoon) obj;
		return good == other.good && Objects.equals(startDate, other.startDate)
				&& Objects.equals(toonName, other.toonName) && Objects.equals(toonValue, other.toonValue)
				&& viewCount == other.viewCount;
	}

	

	

	
	
	
	//private ArrayList title = new ArrayList();
	//private ArrayList day = new ArrayList();
	
	//Scanner sc = new Scanner(System.in);
	
	//int dayCount = (int)(Math.random() * 100) + 1;

	


}
