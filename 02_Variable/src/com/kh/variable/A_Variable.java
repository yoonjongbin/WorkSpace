package com.kh.variable;

public class A_Variable {
	/*
	 *  변수(Variable)란?
	 *   하나의 값을 저장하는 "공간"
	 */
	public static void main(String[] args) {
		// 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
		A_Variable V = new A_Variable();
		
		// 생성한 클래스로 메소드 실행(호출)
		V.printValue();
		
	}
	
	
	public void printValue() {
		
		// 변수를 사용 X
		System.out.println(10 * 2 * 3.141592); // 원의 둘레 = 반지름 X 2 X 3.14
		System.out.println(10 * 10 * 3.141592); // 원의 넓이 = 반지름 X 반지름 X 3.14
		
		
		System.out.println("------------------------");
		
		
		//변수를 사용하면
		int r = 10;
		double pi = 3.141592;
		
		System.out.println(r * 2 * pi);
		System.out.println(r * r * pi);
	}
	
	public void variable() {
		/*
		 * 변수의 선언
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 *  자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당 받을지에 대한 정보이다.
		 *  
		 *  변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용한다.
		 *  
		 *  변수 초기화
		 *  
		 * [표현법] 변수명 = 값(리터럴);
		 *  
		 *  변수에 처음으로 값을 저장하는 것
		 *  
		 *  '='는 오른쪽 데이터를 왼쪽의 변수에 대입(저장)하는 연산자이다.
		 *  
		 *  
		 *  
		 */
		 
		// 기본 자료형(Primitive type)
		// 실제 값이 들어감
		// 논리형 : 1byte
		boolean isTrue;
		isTrue = true;
		
		boolean isFalse = false;
		//isFalse = 1; // 에러 발생(자료형이 맞지않음)
		
		// 문자형 : 2byte
		char ch = 'a';
		//ch = 'ab'; // 에러 발생(char는 한글자만 저장 가능)
		
		// 정수형
		byte bNum; // 1byte(8bit) : -128 ~ 127
		short sNum; // 2byte
		int iNum; // 4byte
		long lNum; // 8byte
		
		//bNum = 128; // 에러 발생 --> 오버플로우(OverFlow) 범위 벗어남
		lNum = 9223372936854L; // 숫자 뒤에 L 또는 l을 입력해야 한다.
		
		// 실수형
		float fNum; // 4byte
		double dNum; // 8byte
		
		fNum = 3.14F; // 숫자 뒤에 F 또는 f를 입력해야 한다.
		dNum = 3.14;
		
		// 참조 자료형 : 4byte, 기본형을 제외한 나머지(클래스, Class)
		// 주소값이 저장
		String name = "이한주";
		
		// 변수의 명명 규칙
		// 1) 대소문자 구분된다.
		int num;
		int NUM;
		int Num;
		//String num; // 자료형이 달라도 변수명이 같으면 에러 발생
		
		// 2) 숫자로 시작하면 안 된다.
		//int  1age;
		int a53adfsw;
		
		// 3) 특수 문자는 '_', '$'만 사용이 가능하다.
		int _age;
		int a_g_e;
		int age$;
		//int %age;
		
		// 4) 예약어(Reserved word)를 사용하면 안 된다.
		//int public;
		//int void;
		//int int;
		
		// 5) (권장사항) 낙타표기법 (카멜케이스)
		//		첫글자는 항상 소문자
		//		여러 단어가 올 때는 각 단어의 첫 글자를 대문자
		//int maxnumber; //X
		//int max_number; //X
		int maxNumber; // O
	}
	
	public void constant() {
		/*
		 * 상수
		 * 
		 * [표현법] final 자료형 변수명;
		 * 
		 * 	변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
		 * 	
		 * 	초기화 이후에는 값을 변경불가
		 */
		
		int age;
		age = 20;
		age = 25;
		
		
		final int AGE;
		AGE = 20;
		//AGE = 30; // 에러 발생(상수이므로 값 변경불가)
		
		
		// var는 모든 자료형이 들어간다.
		var age2 = "홍수민";
		var age3 = 20;
		var age4 = true;
		
		
	}
}
