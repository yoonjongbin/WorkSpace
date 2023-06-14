package com.kh.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * Date
 * - java.util 패키지에 속한 날짜와 시간을 다룰 목적으로 만들어진 클래스(JDK 1.0)
 * - Date의 메서드는 대부분 deprecated(비권장) 되어 있지만 여전히 사용
 */


public class A_Date {

	public static void main(String[] args) {
		A_Date a = new A_Date();
//		a.method1();
//		a.method2();
//		a.method3();
		a.practice();
		
		
	}
	
	public void method1() {
		// 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 객체 생성
		
		Date today = new Date();
		System.out.println(today);
		
		// 1970.1.1.00시 -> 한국 표준 시간(KST)으로 출력될 땐, 그리니치 평균시(GMT) 보다 +9 증가된 시간을 표시
		Date when = new Date(6);
		System.out.println(when);
		
		System.out.println();
		
		// Deprecated 된 기능들
		System.out.println("getYear : " + (today.getYear() + 1900) + "년");
		System.out.println("getMonth : " + (today.getMonth() + 1) + "월");
		System.out.println("getDate : " + today.getDate() + "일");
		System.out.println("getHours : " + today.getHours() + "시");
		System.out.println("getMinutes : " + today.getMinutes() + "분");
		System.out.println("getSeconds : " + today.getSeconds() + "초");
		
		System.out.println();
		
		
		
		/*
		 * SimpleDateFormat 클래스 : 날짜 데이터를 원하는 형태로 출력할 수 있도록
		 * 
		 * - y : 년도
		 * - M : 월
		 * - D : 년의 몇 번째 일
		 * - d : 월의 몇 번쨰 일
		 * - E : 요일
		 * - a : 오전/오후
		 * - H : 시간(0~23)
		 * - h : 시간(1-12)
		 * - m : 분
		 * - s : 초
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		// 2023년 6월 13일 (화) 오후 2시 21분 10초
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (EEEE) aa hh시 mm분 ss초");
		String formatDate2 = sdf.format(today);
		System.out.println(formatDate2);
		
	}
	
	
	/*
	 * Calender
	 * 
	 * - Date 클래스를 개선한 추상 클래스 (JDK 1.1)
	 * - 여전히 단점이 존재
	 */
	
	
	public void method2() {
//		Calendar cal = new Calendar(); // 추상 클래스는 객체 생성 X
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		today = new GregorianCalendar(); // 태국은 BuddhistCalendar
		System.out.println(today);
		
		
		System.out.println();
		
		System.out.println("YEAR : " + today.get(Calendar.YEAR) + "년");
		System.out.println("MONTH : " + today.get(Calendar.MONTH) + "월");
		System.out.println("DATE : " + today.get(Calendar.DATE) + "일");
		System.out.println("HOUR : " + today.get(Calendar.HOUR) + "시"); // 0-11
		System.out.println("HOUR_OF_DAY : " + today.get(Calendar.HOUR_OF_DAY) + "시"); // 0-23
		System.out.println("MINUTE : " + today.get(Calendar.MINUTE) + "분");
		System.out.println("SECOND : " + today.get(Calendar.SECOND) + "초");
		
		System.out.println();
		
		// 날짜 지정
		
		Calendar date = Calendar.getInstance();
		date.set(2023, Calendar.MAY, 15);
		System.out.println(date);
		System.out.println(date.getTime().toString());
		
		long timeInMillis = date.getTimeInMillis();
		System.out.println("1000분에 1초 :" + timeInMillis);
		
		long second = timeInMillis/1000;
		long minute = second/60;
		long hour = minute/60;
		long day = hour/24;
		long year = day/365;
		
		System.out.println("초 : " + second);
		System.out.println("분 : " + minute);
		System.out.println("시 : " + hour);
		System.out.println("일 : " + day);
		System.out.println("년 : " + year);
		
		
		System.out.println();
		
		
		
		//SimpleDateFormat 클래스 사용!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(date.getTime());
		
		System.out.println(formatDate);
	}
	
	
	// Date와 Calendar 간의 변환
	public void method3() {
		// 1. Calendar -> Date
		
		Calendar cal = Calendar.getInstance();
		Date d =new Date(cal.getTimeInMillis());
		System.out.println(d);
		
		
		// 2. Date -> Calendar
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		System.out.println(cal2.getTime().toString());
	}
	
	
	// 자신이 태어난 날을 yyyy/MM/dd 형태로 입력받아 해당 날짜가 무슨 요일인지, 지금까지 며칠이 지났는지 계산
	// 입력된 형식이 잘돗된 경우 다시 입력받기
	public void practice() {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date result = null;
		
		while(true) {
			System.out.print("날짜를 yyyy/MM/dd 형태로 작성 :");
			String data = sc.nextLine();
			
			try {
				result = sdf.parse(data);
				break;
			}catch(ParseException e) {}	// ParseException거 생기면 메소드를 다시 실행함
		}
		
		Calendar inputDate = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		inputDate.setTime(result);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd은 E요일 입니다.");
		System.out.println(sdf2.format(result));
		
		long day = (today.getTimeInMillis() - inputDate.getTimeInMillis()) / (1000*60*60*24);
		System.out.println("태어난 날부터 지금까지 " + day + "일 지났습니다.");
//		
//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//			
//			Calendar today = Calendar.getInstance();
//			Calendar date = Calendar.getInstance();
//			
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("태어난 날짜를 입력하세요. : ");
//			String birth = sc.nextLine();
//			
//			String[] birthArr = birth.split("/");
//			if(birthArr.length == 3) {
//				date.set((Integer.parseInt(birthArr[0])),(Integer.parseInt(birthArr[1])), (Integer.parseInt(birthArr[2])));
//				long timeInMillis = date.getTimeInMillis();
//				
//				
//				
//				long second = (today.getTimeInMillis()- date.getTimeInMillis()) / 1000;
//				long minute = second/60;
//				long hour = minute/60;
//				long day = hour/24;
//				long year = day/365;
//				
//				
//				String dayOfWeek = "";
//				switch(date.get(Calendar.DAY_OF_WEEK)) {
//				case 1:
//					dayOfWeek = "일요일";
//					break;
//				case 2:
//					dayOfWeek = "월요일";
//					break;
//				case 3:
//					dayOfWeek = "화요일";
//					break;
//				case 4:
//					dayOfWeek = "수요일";
//					break;
//				case 5:
//					dayOfWeek = "목요일";
//					break;
//				case 6:
//					dayOfWeek = "금요일";
//					break;
//				case 7:
//					dayOfWeek = "토요일";
//					break;
//				}
//				System.out.println("태어난 요일은 " + dayOfWeek + "이고, 태어난지" + day + "일 지났습니다.");
//				
//		
//				System.out.println(year);
//				
//			}
//				
//			else {
//				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
//				practice();
//			}
//		}catch(Exception e) {
//			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
//			practice();
//		}
//		
//		
//		
//		
//
//		
//		
	}

}
