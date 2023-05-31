package com.kh.practice.controller;


import com.kh.practice.model.AniBook;
import com.kh.practice.model.Book;
import com.kh.practice.model.CookBook;
import com.kh.practice.model.Member;

public class LibraryController {
	private Member member = null;
	private Book[] bookList = new Book[4];
	
	{
		bookList[0] = new CookBook("김대석 셰프의 집밥 레시피", true);
		bookList[1] = new CookBook("에브리데이 베이글", false);
		bookList[2] = new AniBook("원피스 105", 19);
		bookList[3] = new AniBook("최애의 아이 10", 15);
		
	}
	
	// 멤버 생성자 이용해서 멤버 정보 추가
	public void insertMember(String name, int age) {
		member = new Member(name, age);
	}
	
	public Member myInfo() {
		return member;
	}
	
	// 매개변수로 받은 키워드가 포함된 제목을 가진 책 1권 반환
	public Book searchBook(String keyword) {
		for(int i = 0; i < bookList.length; i++) {
			if(bookList[i].getTitle().equals(keyword)) {
				return bookList[i];
			}
		}
		
		return null;
	}
	
	
	public Book[] viewBooks() {
		return bookList;
	}
	
	
	/*
	 * 대여할 책의 인덱스를 매개변수로 받아서 조건에 따라 처리
	 * - 만화책(AniBook)인 경우 나이 제한
	 * - 요리책(CookBook)인 경우 쿠폰이 있을때
	 * 
	 */
	
	public boolean rentBook(int index) {
		//int cookCoupon = 0;
		
		if(bookList[index] instanceof CookBook) {
			CookBook cookbook = (CookBook)bookList[index];
			if(cookbook.isCoupon()) {
				//cookCoupon++;
				//member.setCookCoupon(cookCoupon);
				member.setCookCoupon(member.getCookCoupon() + 1);
			}
				
			member.setBook(bookList[index]);
			
			
			return true;
			
		} else if(bookList[index] instanceof AniBook) {
			AniBook ani = (AniBook)bookList[index];
			
			member.setBook(bookList[index]);
			if(member.getAge() < ani.getAccessAge()) {
				System.out.println(ani.getAccessAge() +"세 이상만 대여할 수 있습니다.");
				return false;
			}else return true;
		}
		return false;
	}
}
