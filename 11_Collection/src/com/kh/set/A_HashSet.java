package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.model.Person;

public class A_HashSet {

	/*
	 * Set의 특징
	 * - 중복 없음
	 * - 순서 없음
	 * 
	 * HashSet
	 * - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
	 * 
	 */
	
	public static void main(String[] args) {
		
		A_HashSet a = new A_HashSet();
//		a.method1();
		a.method2();
		
	}
	
	
	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set);					// 중복된 배열을 제거한 후 출력
		System.out.println(set.size());				// 중복을 제외한 크기 출력
		System.out.println(set.contains("마동석"));	// 마동석이 배열에 있는지 체크
		
		set.remove("아오키 무네타카");					// 아오키 무네타카 원소 삭제
		System.out.println(set);
		
		set.clear();								// 배열 전체 삭제
		System.out.println("비었는지? " + set.isEmpty());
		System.out.println(set);
		
	}
	
	public void method2() {
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		
		/*
		 * 객체의 주소값을 가지고 비교하기 때문에 모두 다른 객체로 인식해서 중복 제거되지 않음
		 * --> Person 클래스에서 hashCode(), equals() 메서드 재정의
		 */
		
		System.out.println(set);
		System.out.println(set.size());
		
		/*
		 * Iterator
		 * - 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
		 * - iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		 * 
		 */
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {					// 읽어 올 요소가 있는지 확인 (hasNext() 반환 타입이 boolean)
			System.out.println(it.next());		// Person.. 다음 요소를 읽어옴(객체를 하나씩 가져오는 메소드)
		}
		
	}

}
