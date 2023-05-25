package com.kh.step4.model;

public class Car {
	/*
	 * 접근제한자(access modifier)
	 * 
	 * - 클래스, 멤버변수, 생성자, 메서드로 사용되며, 외부로부터 접근을 제한한다.
	 * - private : 같은 클래스 내에서만 접근이 가능하다.
	 * - default : 같은 패키지 내에서만 접근이 가능하다.
	 * - protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
	 * - public : 접근 제한이 전혀 없다.
	 * 
	 * 
	 * 접근제한자를 사용하는 이유
	 * 
	 * - 외부로부터 데이터를 보호하기 위해서 사용한다.
	 * - 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서 사용한다.
	 * 
	 */
	
	private String color; 	// 색상
	private String gearType; // auto(자동), manual(수동)
	private int door;		// 문의 개수
	
	/*
	 *  생성자
	 *  
	 *  - 인스턴스가 생성될 때 마다 호출되는 '인스턴스 초기화 메서드'
	 *  - 인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용한다.
	 *  
	 *  
	 *  [표현법]
	 *  
	 *  클래스명(타입 변수명, 타입 변수명, ...){
	 *  	
	 *  	// 인스턴스 생성시 수행될 코드
	 *  	// 주로 인스턴스 변수의 초기화 코드 작성
	 *  	
	 *  }
	 *  
	 *  생성자 작성시 주의점
	 *  
	 *  - 반드시 생성자명은 클래스명과 동일(대/소문자 구분)
	 *  - 반환형이 존재하지 않음 --> 만약 반환형으로 쓰게되면 일반 메서드로 인식한다.
	 */
	
	
	
	public Car() {
		/*
		 * 기본 생성자(default constructor)
		 * 
		 * - 매개변수가 없는 생성자
		 * - 클래스에 생성자가 하나도 없으면 컴파일러가 기본 생성자 추가
		 * - 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않음
		 */
	}
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	
	public Car(String color, String gearType, int door) {
		/*
		 * this : 인스턴스 자신을 카리키는 참조변수.
		 * 			인스턴스의 주소가 저장되어있음
		 * 			모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
		 */
		
		
//		this.color  = color;
//		this.gearType = gearType;
		this(color, gearType);
		this.door = door;
		//this(color, gearType);	// 매개변수의 순서를 맞춰야함
		
	}
	
	public String toString() {
		return "색상" + color + ", 변속기" + gearType + ", 문의 개수 : " + door;
	}
	
	
	
	/*
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드를
	 * 			매개변수의 자료형과 갯수, 순서가 다르게 작성되어야 한다. 
	 * 
	 */
	
	void test() {}
	//void test() {}
	void test(int a) {}
	void test(int a, String s) {}
	void test(String s, int a) {}
	void test(int a, int b) {}
	//void test(int c, int d) {} // 매개변수의 자료형의 갯수와 순서가 다르게 작성되어야 한다.
	
	void test(String a) {}
	
}
