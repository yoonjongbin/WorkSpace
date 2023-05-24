package com.kh.step3.model;

public class Calculator {
	/*
	 * 메서드(mothod)
	 * 	- 작업을 수행하기 위한 명령문의 집합
	 * 	- 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
	 * 	- 단, 입력받은 값이 없을 수 있고, 결과를 돌려주지 않을 수도 있다.
	 * 	- 하나의 메서드는 한 가지 기능만 수행하도록 작성하는 것을 권고
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메서드이름 (타입 변수명, 타입 변수명, ...) {
	 * 		// 메소드 호출 시 수행 될 코드
	 * 		return;
	 * 
	 * }
	 * 
	 * return 문
	 * 	- 메서드에서 return문을 만나면 종료
	 * 	- 반환값이 없는(void) 경우 return문만 사용!
	 *  - 반환값이 있는 경우 return은 뒤에 반환값을 지정해야 함
	 * 
	 */
	
	public int a;
	public int b;
	
	// 최대값을 구하는 메서드
	public int max() {

		if (a > b) return a;
		return b;
		
	}
	
	/*
	 * 1. 인스턴스 메서드
	 * - 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
	 * - 인스턴스 변수나 인스턴스 메서드와 관련된 작업을 하는 메서드
	 * 
	 * 2. 클래스 메서드(static 메서드)
	 * - 객체 생성 없이 '클래스이름.메서드이름()'으로 호출
	 * - 인스턴스 변수나 인스턴스 메서드와 관련 없는 작업을 하는 메서드
	 * 
	 */
	
	public int add() {
		// 더하기
		//int sum = a + b;
		return a + b;
	}
	
	
	public int substract() {
		// 빼기
		//int sub = a - b;
		return a - b;
	}
	
	public static int multiply(int a, int b) { // static 메서드는 인스턴스를 쓰지 못한다. -> 매개변수를 받아야 함 
		// 곱하기
		
		
		//int mul = a * b;
		return a * b;
	}
	
	public static String divide(int a, int b) {
		// 나누기 -> 형태 : 몫 1, 나머지는 3
		
		//int div = a / b;
		//int remai = a % b;
		return "몫 " + a / b + ", 나머지는 " + a % b;
	}
	
	public int remainder(int a, int b) {
		return a % b;
	}
	
	public int factorial(int a) {
		/*
		 * 팩토리얼
		 * 1! = 1
		 * 2! = 2 x 1 = 2
		 * 3! = 3 x 2 x 1 = 6
		 * 
		 * 
		 * 재귀 함수(Recursion Function)
		 * - 메서드 내에서 자기자신을 반복적으로 호출
		 * - 반목문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
		 * - 이해하기 쉽고 간결한 코드 작성이 가능
		 */
		
		int fac = 1;
		
		if(a != 1) {
			fac = a * factorial(a-1);
		}
		
		/*for(int i = a; i > 0 ; i--) {
			fac *= i;
		}*/
		
		return fac;
	}
}
