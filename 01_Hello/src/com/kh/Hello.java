
//패키지(package)
// 폴더를 만들어서 파일을저장하고 관리하듯이 패키지를 만들어 클래스를 저장하고 관리한다.
// 패키지는 클래스를 유일하게 만들어주는 식별자 역할을 한다.
// 모든 클래스는 하나의 패키지에 속하며, 패키지가 선언되지 않은 클래스는 자동적으로 이름 없는 패키지(default)에 속하게 된다.

package com.kh;

//클래스(class)
// 자바에서 모든 코드는 반드시 클래스 안에 존재해야 하며
// 서로 관련된 코드들을 그룹으로 나누어 별도의 클래스를 구성한다.
// 클래스들이 모여 하나의 Java 프로그램을 구성한다.


public class Hello {// 클래스명은 클래스 파일명과 동일해야한다.
	
	// 메소드(method)
	// 클래스의 기능(동작)에 해당하는 구현 부분이다.
	// 해당 메소드 호출 시 메소드의 블럭({})에 해당하는 부분을 실행한다.
	
	// 실행 메소드(main 메소드) : 자바 프로그램 실행 시 java.exe에 의해 가장 먼저 호출된다.
	// 모든 클래스가 main 메소드를 가지고 있어야 하는 것은 아니지만 하나의 Java 애플리케이션에는 main 메소드를 포함한 클래스가 반드시 하나는 있어야 한다.
	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			if( i % 2 != 0)
				continue;
			System.out.println("Hello world" + i);
		}
	}

}


// 네이밍 규칙
// 패키지 명 : 소문자로 작성, 회사들 간에 패키지가 서로 중복되지 않도록 회사의 도메인 이름으로 패키지를 만든다.
// 클래스 명 : 대문자로 시작, 여러 개의 단어가 있을 때는 단어 앞자리마다 대문자로 표기
// 메소드 명 : 소문자로 시작, 여러 개의 단어가 있을 때는 단어 앞자리마다 대문자 표기

// 자바의 특징
// 객체지향 프로그램(Object-Oriented Programing, OOP) 언어이다.
// 자동으로 메모리를 관리한다.(Garbage Collecton)
// 운영체제에 독립적이다.(JVM, Java Virtual Machine)
// 네트워크와 분산처리를 지원한다. (Java API)
// 멀티 스레드를 지원한다. (Java API)
// 동적 로딩을 지원한다.

// JDK > JRE > JVM
// JDK(Java Development Kit) : 자바 개발 도구 = JRE + 실행파일(bin / javac.exe, java.exe 등)

// JRE(Java Runtime Environment) : 자바 실행 환경 = JVM + Java API(lib/src.zip)

// JVM(Java Virtual Machine) : 자바 가상 머신

// 자바 프로그램 실행 단계
//  확장자가 .java인 소스파일을 작성한다.
//  작성된 소스파일을 자바 컴파일러(javac.exe)로 컴파일하여 확장자가 .class인 바이트코드(기계어)로 번역한다.
//  번역된 바이트코드(기계어)를 JVM의 자바 인터프리터(java.exe)를 이용해 실행한다.