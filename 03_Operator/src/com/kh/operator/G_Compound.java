package com.kh.operator;

public class G_Compound {
	
	/*
	 * 복합 대입 연산자
	 * 		산술연산자와 대입연산자가 결합되어있는 형태
	 * 		연산처리 속도가 빨라지므로 사용하는걸 권장
	 * 
	 * 		+=, -=, *=, /=, %=
	 * 
	 * 		ex) a = a+3; => a += 3;
	 */
	
	public static void main(String[] args) {
		int num = 12;
		String str = "Hello";
		
		num += 3; // num = num + 3;
		System.out.println(num); //15
		
		num -= 5; // num = num - 5;
		System.out.println(num); // 10
		
		num *= 6; // num = num * 6;
		System.out.println(num); // 60
		
		num /= 3; // num = num / 3;
		System.out.println(num); // 20
		
		num %= 3; // num = num % 3;
		System.out.println(num); // 2
		
		str += ", World!!"; // str = str +", World!";
		System.out.println(str); // Hello, World!
	}
}
