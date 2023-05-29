package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.*;

public class Application {
	
	static private Scanner sc = new Scanner(System.in);
	private CircleController cc =new CircleController();
	private RectangleController rc = new RectangleController();
	
	
	public static void main(String[] args) {
		Application app = new Application();
		
		app.mainMenu();
		
		//System.out.println(app.mainMenu());

		
	}
	
	public void mainMenu() {
		boolean active = true;
		
		while(active) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int choose = Integer.parseInt(sc.nextLine());
			switch(choose) {
			case 1 : 
				circleMenu();
				break;
			case 2 : 
				rectangleMenu();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				active = false;
				break;
			default :
				System.out.println("다시입력해주세요.");
				break;
			}
		}
		
		
		
		
		
		
	}
	
	public void circleMenu() {
		
		
		
		System.out.println("===== 원메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 : ");
		int choose = Integer.parseInt(sc.nextLine());
		
		switch(choose) {
		case 1 : 
			calcCircum();
			break;
		case 2 : 
			calcCircleArea();
			break;
		case 9 : 
			System.out.println("메인메뉴로 돌아갑니다.");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}
	
	public void rectangleMenu() {
		
		
		
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 : ");
		int choose = Integer.parseInt(sc.nextLine());
		
		switch(choose) {
		case 1 : 
			calcPerimeter();
			break;
		case 2 : 
			RectArea();
			break;
		case 9 : 
			System.out.println("메인메뉴로 돌아갑니다.");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}
	
	public void calcCircum() {
		
	
		System.out.print("x좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		
		
		System.out.print("x좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcPerimeter(x, y, width, height));
	}
	
	public void RectArea() {
		System.out.print("x좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcArea(x, y, width, height));
	}

}
