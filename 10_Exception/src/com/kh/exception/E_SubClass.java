package com.kh.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E_SubClass extends E_SuperClass {

	public static void main(String[] args) {

	}
	
//	@Override
//	public void method() {
//		// 오버라이딩 시 throws 작성하지 않아도 됨
//	}
	
	
//	@Override
//	public void method() throws IOException {
//		// 부모 클래스의 메서드와 같은 Exception을 throws 하는 것은 가능
//	}
	
	
	
//	@Override
//	public void method() throws Exception {
//		// 부모 클래스의 메소드보다 더 상위 타입의 Exception을 throws 하는 것은 불가능
//	}
	
	@Override
	public void method() throws FileNotFoundException {
		// 부모 클래스의 메소드보다 더 하위 타입의 Exception을 throws 하는 것은 가능
	}

}
