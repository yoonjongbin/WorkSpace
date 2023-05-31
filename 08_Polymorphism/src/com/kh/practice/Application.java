package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.Book;

public class Application {
	
	
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();
	}
	
	
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		lc.insertMember(name, age);
		
		boolean check = true;
		
		while(check) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 검색하기");
			System.out.println("3. 도서 대여하기");
			System.out.println("4. 프로그램 종료");
			
			System.out.print("메뉴 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
				case 1 :
					System.out.println(lc.myInfo());
					break;
				case 2 :
					this.searchBook();
					break;
				case 3 :
					this.rentBook();
					break;
				case 4 :
					check = false;
					break;
				default :
					System.out.println("1~4 사이의 숫자만 입력하세요.");
					break;
				
			}
			
		}
		
	}
	
	// 검색할 책(LibraryController의 searchBook 메서드 이용)
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		System.out.println(lc.searchBook(sc.nextLine()));
	}
	
	
	
	// 빌릴 책 관련 (LibraryController의 rentBook 메서드 사용)
	public void rentBook() {
		int i = 0;
		
		for(Book b : lc.viewBooks()) {
			System.out.println(i++ + "번 도서 : " + b);
		}
		System.out.print("\n메뉴번호 : ");
		
		if(lc.rentBook(Integer.parseInt(sc.nextLine()))) {
			System.out.println("성공적으로 대여되었습니다.");
		} else {
			System.out.println("대여 실패");
		}
//		for(int i = 0; i < lc.viewBooks().length; i++) {
//
//			System.out.println(i + "번 도서 : " + Arrays.toString(lc.viewBooks()));
//		}
	}

}
