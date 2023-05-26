package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Application {

	public static void main(String[] args) {
		// ------------------------- 화면 ---------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("스낵류를 입력하세요.");
		
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("갯수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		
		// ---------------------------------------------------------
		
		// 데이터를 서버한테 요청하는 곳
		
		SnackController snackCotrol = new SnackController();
		Snack viewSnack = new Snack(kind, name, flavor, numOf, price);
		snackCotrol.saveData(viewSnack); // ctrl + 클릭(메소드)하면 해당 이름을 가진 메소드가 있는 위치를 보여줌
		
		
		// ---------------------------------------------------------
		
		// 서버한테 데이터 결과를 받아서 다시 화면으로 들어오는 곳
		
		System.out.println("저장완료 되었습니다.");
		System.out.println(snackCotrol.confirmData());
	}

}
