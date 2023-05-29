package com.kh.composite;

/*
 * 클래스 간의 관계 : 상속 vs 포함
 * - 상속 관계 : ~ 은 ~ 이다. (is-a 관계)
 * - 포함 관계 : ~은 ~을 가지고 있다. (has-a 관계)
 * - 자바는 단일 상속만 허용
 * - 클래스 간의 관계를 많이 맺을수록 재사용을 높이고 관리하기 쉽다.
 * 
 */

//포함관계를 사용하면 객체지향 설계 원칙을 따르고, 코드의 재사용성과 유연성을 높일 수 있다.
//또한, 객체 간의 관계를 명확하게 표현하고 다형성을 활용하여 코드의 가독성과 확장성을 향상시킬 수 있다.

public class Customer extends Object {  // shift + f2를 누르면 클래스 설명을 볼 수 있다.
	protected String name;			// 고객 이름
	protected String grade;			// 고객 등급
	protected int bonusPoint;		// 보너스 포인트
	protected double bonusRatio;	// 보너스 적립 비율
	
	
	Product product; // 고객이 제품을 가지고 있다.(포함)
	
	public Customer() {
	}
	
	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER"; 			// 기본등급
		//this.bonusPoint = bonusPoint;
		this.bonusRatio = 0.01; 		// 포인트 기본 적립 비율
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public double getBonusRatio() {
		return bonusRatio;
	}
	
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override // <--- 에노테이션! '이 메서드는 재정의된 메서드이다.'라고 컴파일러에 명확히 알려주는 역할
	public boolean equals(Object obj) {
		Customer c = (Customer) obj; // 이건 바로 다음에 배울 '다형성'!
		return this.name == c.name;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	// 보너스 포인트 계산
		return price;
	}
	
	
//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint + ", bonusRatio="
//				+ bonusRatio + "]";
//	}
	
	
}
