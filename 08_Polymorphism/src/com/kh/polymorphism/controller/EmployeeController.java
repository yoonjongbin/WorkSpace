package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	
	
	
	// Employee 객체배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmployeeByName(Employee[] ea, String name) {
		
		//Employee emp = null;
		
		for(int i = 0; i < ea.length; i++) {
			if(ea[i].getName().equals(name)) {
				//emp = ea[i];
				return ea[i]; // i는 객체
			}
		}
		//return emp;
		return null;
	
	}
	
	// 연봉 계산 : engineer인 경우 보너스가 있음!
	public int getAnnualSalary(Employee e) {
		// instanceof 연산자 : 현재 참조변수가 실제로 어떤 클래스형의 객체의 주소를 참조하고 있는지 확인 할 떄 사용
		int anualSalary = e.getSalary() * 12; 
		if(e instanceof Engineer) {
			Engineer eng = (Engineer)e; // 부모 -> 자식 : 강제 형 변환
			
			anualSalary += eng.getBonus();
			
			return anualSalary;
		}
		
		return anualSalary;
		
	}
	
	
	//전체 연봉 총 합계
	public int getTotalCoast(Employee[] ea) {
		
		int total = 0;
		for(int i = 0; i < ea.length; i++) {
			total += getAnnualSalary(ea[i]); // 위에서 정의한 getAnnualSalary() 메소드 사용
		}
		
		return total;
	}
}
