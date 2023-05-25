package com.kh.step5;

import com.kh.step5.model.Book;

public class Application2 {

	public static void main(String[] args) {
		Book b1 = Book.getInstance();
		Book b2 = Book.getInstance();
		
		b1.setTitle("자바");
		System.out.println(b2.getTitle()); // b1 인스턴스로 setTitle() 썼지만 b2 인스턴스의 getTitle()했을때 출력도 바뀐다.
	}

}
