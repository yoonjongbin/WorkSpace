package com.kh.loop;

import java.util.Scanner;

public class A__For {
	
	Scanner sc = new Scanner(System.in);
	/*
	 * for문
	 * 
	 * [표기법]
	 * 
	 * 주어진 횟수만큰 코드를 반복 실행하는 구문
	 * 
	 * 초기식은 반복문이 수행 될 때 단 한번만 실행되는 구문으로 반복문 안에서 
	 * 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * 
	 * 조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문을 빠져나간다.
	 * 
	 * 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로,
	 * 주로 초기식에 제시한 변수를 가지고 증감연산자를 사용한다.
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		A__For a = new A__For();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		//a.method5();
		//a.method6();
		//a.method7();
		//a.method8();
		//a.method9();
		//a.method10();
		//a.method11();
		//a.method12();
		//a.method13();
		//a.method14();
		a.method15();
	}
	
	public void method1() {
		// 1~5 출력
		
		
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		for(int i = 1 ; i <= 5; i++) {
			System.out.println(i);
		}
	
	}
	
	public void method2() {
		// 5~1 출력
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	
	// 1~10 까지 사이의 홀수 출력
	public void method3() {
		
		/*for(int i = 1; i <= 10; i++) {
			if(i % 2 !=0) System.out.println(i);
			else continue;
		}
		*/
		
		for(int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		
	}
	
	/*
	 * continue문
	 * 
	 * 
	 * continue문은 반복문 안에서 사용
	 * 
	 * 반복문 안에서 continue문을 만나게 되면 "현재 구문"을 종료
	 * 
	 * 반복문을 벗어나는 건 아님! 다음 반복을 계속 수행
	 * 
	 */
	
	
	
	
	// 1~10 사이의 짝수만 출력
	public void method4() {
		
		for(int i = 0; i <= 10; i++) {
			
			if(i % 2 != 0) continue;
			System.out.println(i);
		}
		
	}
	
	
	// 1 ~ 10까지의 합계
	public void method5() {
		
		int sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.printf("합계 : %d", sum);
	}
	
	
	// 1부터 사용자가 입력한 수까지의 합계
	public void method6() {
		int max_Num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요 : ");
		max_Num = sc.nextInt();
		
		for(int i = 0; i <= max_Num; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합계는 %d 입니다.", max_Num, sum);
	}
	
	
	// 1부터 랜덤값까지의 합계
	
	public void method7() {
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출해서
		 * 매번 다른 랜덤값을 얻어 낼 수 있음!
		 * 0.0 <= random < 1.0
		 * 
		 */
		
		double random = Math.random() * 100; //  0 <= random < 99
		
		//System.out.println((int)random + 1); //  1 <= random < 100
		
		int random_Num = (int)random;
		int sum = 0;
		
		for(int i = 0; i <= random_Num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	/*
	 * h
	 * e
	 * l
	 * l
	 * o 
	 * 
	 */
	
	
	
	public void method8() {
		String str = "";
		
		System.out.println("문자를 입력하세요 :");
		str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.printf("%s\n", str.charAt(i));
		}
	}
	
	
	// 사용자한테 입력받은 문자열 출력
	public void method9() {
		String str = "";
		
		for(int i = 1; ; i++) {
			System.out.println("문자를 입력하세요 :");
			str = sc.nextLine();
			
			System.out.printf("%d 번째 입력은 \"%s\" 입니다. \n", i, str);
			continue;
		}
		
		
	}
	
	
	/*
	 * 2 X 1 = 2
	 * 2 X 2 = 4
	 * ...
	 * 2 X 9 = 18
	 * 
	 * 
	 */
	// 구구단 - 2단 출력
	public void method10() {
		int num  = 0;
		
		System.out.println("몇 단을 할지 입력해주세요 : ");
		num = sc.nextInt();
		
		
		
		
		/*for(int i = 1; i < 10; i++) {
			if(num < 2 || num > 9) {
				System.out.println("잘못 입력하셨습니다. 2 ~ 9 까지의 숫자만 입력하세요.");
				break;
			}
			
			int result = num * i;
			System.out.printf("%d X %d = %d \n", num, i, result);
		}*/
		
		
		if(num < 2 || num > 9) {
			System.out.println("잘못 입력하셨습니다. 2 ~ 9 까지의 숫자만 입력하세요.");
			
		} else {
			for(int i = 1; i < 10; i++) {
		
			int result = num * i;
			System.out.printf("%d X %d = %d \n", num, i, result);
			
			}
		  }
	}
	
	// 2 ~ 9단 출력
	public void method11() {
		for(int num = 2; num < 10; num++) {
			System.out.printf("-----%d단----- \n", num);
			for(int dan = 1; dan < 10; dan++) {
				
				int result = num * dan;
				System.out.printf("%d X %d = %d \n", num, dan, result);
				
			}
		}
	}
	
	/*
	 *  *****
	 * 	*****
	 * 	*****
	 * 	*****
	 */
	
	
	public void method12() {
		
		String  input;
		
		System.out.println("채우고 싶은 기호를 쓰세요.");
		input = sc.nextLine();
		char ch = input.charAt(0);
		
		System.out.println("채우고 싶은 기호를 쓰세요.");
		input = sc.nextLine();
		
		System.out.println("채우고 싶은 기호를 쓰세요.");
		input = sc.nextLine();
		
		for(int i = 0; i < 4; i++) {
			System.out.println();
			for(int j = 0; j < 5; j++)
				System.out.print(ch);
		}
	}
	
	
	public void method13() {
		for(int i = 1; i < 5; i++) {
			System.out.println();
			for(int j = 1; j < 5; j++)
				if(i == j) 
					System.out.print(i);
				else System.out.print('*');
		}
	}
	
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public void method14() {
		for(int i = 1; i < 6; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if(i==j) System.out.println();
			}
		}
	}
	
	/*
	 *       *
	 *      **
	 *     ***
	 *    ****
	 */
	
	
	public void method15() {
			for(int i = 1; i < 5; i++) {
			System.out.println("");
				for(int j = 5; j >= 1; j--) {
					
					if(j > i) System.out.print(" ");
					else System.out.print("*");
					
				}
			}
	}
}
