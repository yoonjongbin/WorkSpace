package com.webtoon.naver;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import com.webtoon.naver.controller.UserController;
import com.webtoon.naver.model.User;
import com.webtoon.naver.model.Webtoon;

public class Run {

	public static void main(String[] args) {
		User user = new User();
		Webtoon wt = new Webtoon();
		
		//wt.selectToon();
		UserController us = new UserController();
		
		HashMap<String, User> hMap = us.printUser();
		
		Date today = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.
		
		int date = today.getDay();
		String dayOfWeek = "";
		
		Date localTime = new Date(2020, 10, 25);
		
		int compare = today.compareTo(localTime);
		
		System.out.println(compare);
		
		
		switch(date) {
		case 1:
			dayOfWeek = "Mon";
			break;
		case 2:
			dayOfWeek = "Tue";
			break;
		case 3:
			dayOfWeek = "Wed";
			break;
		case 4:
			dayOfWeek = "Thur";
			break;
		case 5:
			dayOfWeek = "Fri";
			break;
		case 6:
			dayOfWeek = "Sat";
			break;
		case 7:
			dayOfWeek = "Sun";
			break;
		default :
			System.out.println("1 ~ 7 까지의 범위를 벗어남");
			break;
			
		}
		
		System.out.println(dayOfWeek);
	}

}
