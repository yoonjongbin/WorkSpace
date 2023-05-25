package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

	public static void main(String[] args) {
		
		String kind;
		String name;
		String flavor;
		
		int numOf;
		int price;
		
		Scanner sc = new Scanner(System.in);
		
		//Snack s = new Snack();
		
		SnackController scr = new SnackController();
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		kind = sc.nextLine();
		//s.setKind(kind);
		//s.setKind(sc.nextLine());
		
		System.out.print("이름 : ");
		name = sc.nextLine();
//		s.setName(name);
		//s.setName(sc.nextLine());
		
		System.out.print("맛 : ");
		flavor = sc.nextLine();
//		s.setFlavor(flavor);
		//s.setFlavor(sc.nextLine());
		
		System.out.print("개수 : ");
		numOf = Integer.parseInt(sc.nextLine());
//		s.setNumOf(numOf);
		//s.setNumOf(Integer.parseInt(sc.nextLine()));
		
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
//		s.setPrice(price);
		//s.setPrice(Integer.parseInt(sc.nextLine()));
		
		Snack s =new Snack(kind, name, flavor, numOf, price);
		//scr.saveData(s);
		
		if(scr.saveData(s)) {
			System.out.println("저장 완료되었습니다");
			System.out.println(scr.confirmData());
		}
		
		System.out.println("저장완료 했습니다.");
		
		//System.out.printf("%s(%s - %s) %d개 %d원\n", s.getKind(), s.getName(), s.getFlavor(), s.getNumOf(), s.getPrice());
		//System.out.println(scr.confirmData());
		
		
	}

}
