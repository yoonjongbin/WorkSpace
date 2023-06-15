package com.webtoon.naver;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.kh.practice4.model.Member;
import com.webtoon.naver.controller.UserController;
import com.webtoon.naver.controller.WebtoonController;
import com.webtoon.naver.model.User;
import com.webtoon.naver.model.Webtoon;

public class Run {
	static Scanner sc = new Scanner(System.in);
	
	static UserController uc = new UserController();
	static WebtoonController wtc = new WebtoonController();
	
	public static void main(String[] args) {
		
		
		
		
		UserController uc = new UserController();
		WebtoonController wtc = new WebtoonController();
		
		wtc.setWebtoon();
		
		
		System.out.print("요일을 선택하세요(월~일) : ");
		wtc.selectToon(sc.nextLine());

	}
	
	
	public void mainMenu() {
		try {
			System.out.println("===== KH 사이트 =====");
			
			boolean check = true;
			
			while(check) {
				System.out.println("****** 메인 메뉴 ******");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 입력 : ");
				switch(Integer.parseInt(sc.nextLine())) {
				case 1:
					signUp();
					break;
				case 2:
					login();
					break;
				case 9:
					check = false;
					System.out.println("프로그램 종료");
					break;
				default :
					throw new Exception();
				}
			}
		} catch(Exception e){
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			mainMenu();
		}
	}
	
	
public void signUp() {
		
		/*
		 * 회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은 Member 객체에 담고
		 * id와 객체는 MemberController(mc)의 joinMembership()로 보냄
		 * 
		 * 받은 결과에 따라 true면 "성공적으로 회원가입 완료하였습니다."
		 * false면 "중복된 아이디입니다. 다시 입력해주세요." 출력
		 * 
		 * */
		boolean result = false;
		
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		result = uc.signUp(id, password, new User(id, password, name));
		if(result)
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			signUp();
		}
		
		
	}
	
	public void login() {
		
		/*
		 * 아이디와 비밀번호를 사용자에게 받아 mc의 login() 메서드로 넘겨 줌
		 * 반환 값 있으면 "OOO님, 환영합니다!" 출력 후 로그인 된 화면으로(memberMenu())
		 * 없으면 "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요." 출력
		 * */
		String result = "";
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		result = uc.login(id, password);
		
		if(result != null) {
			System.out.println(result + "님, 환영합니다!");
			memberMenu();
		}
		else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			login();
		}
		
		
	}
	
	
	public void memberMenu() {
		try {
			boolean check = true;
			while(check) {
				System.out.println("****** 회원 메뉴 ******");
				System.out.println("1. 비밀번호 바꾸기");
				System.out.println("2. 이름 바꾸기");
				System.out.println("3. 로그아웃");
				System.out.print("메뉴 번호 입력 : ");
				
				switch(Integer.parseInt(sc.nextLine())) {
				case 1:
					changePassword();
					break;
				case 2:
					changeName();
					break;
				case 3:
					check = false;
					break;
				default :
					throw new Exception();
				}
				
				
			}
		} catch(Exception e){
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			memberMenu();
		}
		
		
	}
	
	public void changePassword() {
		
		/*
		 * 아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 changePassword()로 보냄
		 * 받은 결과 값이 true면 "비밀번호 변경에 성공했습니다."
		 * false면 "비밀번호 변경에 실패했습니다. 다시 입력해주세요." 출력
		 * */
		boolean result = false;
		
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("현재 비밀번호 : ");
		String oldPw = sc.nextLine();
		
		System.out.print("새로운 비밀번호 : ");
		String newPw = sc.nextLine();
		
		result = uc.changePw(id, oldPw, newPw);
		
		if(result) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		}
		else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			changePassword();
		}

	}
	
	public void changeName() {
		
		/*
		 * 아이디와 비밀번호를 받아 mc의 login()으로 넘겨 현재 저장되어 있는 이름을 받고
		 * 사용자에게 현재 저장되어 있는 이름을 출력하여 보여줌
		 * 변경할 이름을 받아 mc의 changeName()로 id와 함께 넘기고
		 * "이름 변경에 성공하였습니다." 출력
		 * 만약 login()로부터 저장되어 있는 이름을 받지 못 했다면
		 * "이름 변경에 실패했습니다. 다시 입력해주세요" 출력
		 * */
		String memberName = "";
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		memberName = uc.login(id, password);
		if(memberName != null) {
			System.out.println("현재 이름 : " + memberName);
			System.out.print("변경할 이름 : ");
			String name = sc.nextLine();
			
			uc.changeName(id, name);
			
			System.out.println("이름 변경에 성공하였습니다.");
		}
		else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			changeName();
		}
		
	
	}

}
