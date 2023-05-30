package com.kh.array.practice2;


import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;
import com.kh.array.practice2.model.Member;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static MemberController mc = new MemberController();
	static Member m  = new Member();
	
	
	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();
	}
	
	public void mainMenu() {
		boolean check = true;
		while(check) {
			if(mc.count < 3) {
				
				System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
				System.out.printf("현재 등록된 회원수는 %d명 입니다.\n", mc.count);
				
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 정보 수정");
				System.out.println("3. 전체 회원 정보 출력");
				System.out.println("9. 끝내기");
				
				System.out.println("메뉴 번호 : ");
				int input = Integer.parseInt(sc.nextLine());
				
				switch(input) {
				case 1 :
					this.insertMember();
					break;
				case 2 :
					this.updateMember();
					break;
				case 3 :
					this.printAll();
					break;
				case 9 : 
					check = false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				
				System.out.println("2. 회원 정보 수정");
				System.out.println("3. 전체 회원 정보 출력");
				System.out.println("9. 끝내기");
				
				System.out.println("메뉴 번호 : ");
				int input = Integer.parseInt(sc.nextLine());
				
				switch(input) {
				case 2 :
					this.updateMember();
					break;
				case 3 :
					this.printAll();
					break;
				case 9 : 
					check = false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
			}
		}
		
		
	}
	
	public void insertMember() {
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		if(mc.checkId(id) != -1) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			this.insertMember();
		}else {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			
			System.out.println("비밀번호 : ");
			String pw = sc.nextLine();
			
			System.out.println("이메일 : ");
			String email = sc.nextLine();
			
			System.out.println("성별(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.println("나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			
			Member m = new Member(id, name, pw, email, gender, age);
			mc.insertMember(m);
		}
		
		
		
		// 1번 매개변수로 넘김
		// mc.insertMember(id, name ,pw, email, gender, age);
		
		// 2번 - 생성자로 값 임시 저장해서 넘김
		// setter로 값을 임시 저장해서 넘김
		
	}
	
	public void updateMember() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		if(mc.checkId(id) == -1) {
			System.out.println("회원 정보가 없습니다.");
			return;
		}
			
		
		System.out.println("수정할 이름 : ");
		String name = sc.nextLine();
		
		System.out.println("수정할 이메일 : ");
		String email = sc.nextLine();
		
		System.out.println("수정할 비밀번호 : ");
		String pw = sc.nextLine();
		
		mc.updateMember(id, name, pw, email);
	}
	
	public void printAll() {
		Member[] m = mc.printAll();
		
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		
		
		/*for(Member i : m) {
			if(m!=null)System.out.println(i);
		}*/
	}

}
