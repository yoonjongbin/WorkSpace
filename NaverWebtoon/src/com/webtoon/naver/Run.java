package com.webtoon.naver;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import com.webtoon.naver.controller.UserController;
import com.webtoon.naver.controller.WebtoonController;
import com.webtoon.naver.model.User;
import com.webtoon.naver.model.Webtoon;

public class Run {
	User userInfo = null;

	static Scanner sc = new Scanner(System.in);

	static UserController uc = new UserController();
	static WebtoonController wtc = new WebtoonController();

	public static void main(String[] args) {

		Run run = new Run();

		run.mainMenu();

//		wtc.setWebtoon();
//
//		System.out.print("요일을 선택하세요(월~일) : ");
//		wtc.selectToon(sc.nextLine());

	}

	public void mainMenu() {
		try {
			System.out.println("===== Naver Webtoon =====");

			boolean check = true;

			while (check) {
				System.out.println("++++++ 메인 메뉴 ++++++");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 입력 : ");
				switch (Integer.parseInt(sc.nextLine())) {
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
				default:
					throw new Exception();
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			mainMenu();
		}
	}

	public void signUp() {

		/*
		 * 회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은 Member 객체에 담고 id와 객체는
		 * MemberController(mc)의 joinMembership()로 보냄
		 * 
		 * 받은 결과에 따라 true면 "성공적으로 회원가입 완료하였습니다." false면 "중복된 아이디입니다. 다시 입력해주세요." 출력
		 * 
		 */
		boolean result = false;

		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("전화번호 : ");
		String phoneNum = sc.nextLine();

		result = uc.signUp(id, password, new User(id, password, name, phoneNum));
		if (result)
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			signUp();
		}

	}

	public void login() {

		String userName = "";

		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		userInfo = uc.login(id, password);

		userName = userInfo.getName();

		if (userName != null) {
			System.out.println(userName + "님, 환영합니다!");
			toonMenu();
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			login();
		}

	}

	public void toonMenu() {
		try {
			boolean check = true;

			while (check) {
				System.out.println("++++++ 로그인 상태 ++++++");
				System.out.println("1. 만화보기");
				System.out.println("2. 회원메뉴");
				System.out.println("3. 로그아웃");
				System.out.print("메뉴 번호 입력 : ");

				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					selectToon();
					break;
				case 2:
					memberMenu();
					break;
				case 3:
					check = false;
					break;
				default:
					throw new Exception();
				}

			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			toonMenu();
		}
	}

	public void selectToon() {
//		try {
//			boolean check = true;
//			
//			while(check) {
//				System.out.print("요일을 입력해주세요.(월~일) : ");
//				String day = sc.nextLine();
//				if(wtc.selectToon(day)) {
//					wtc.selectToon(day);
//					check = false;
//				}
//					
//				else {
//					throw new Exception();
//				}
//			}
//			
//		}catch(Exception e) {
//			System.out.println("잘못 입력하셨습니다.");
//			selectToon();
//		}
		try {
			wtc.setWebtoon();
			System.out.print("요일을 입력해주세요.(월~일) : ");
			String day = sc.nextLine();
			
			if (!wtc.selectToon(day)) throw new Exception();
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
			selectToon();
		}

	}

	public void memberMenu() {
		try {
			boolean check = true;
			while (check) {
				System.out.println("++++++ 회원 메뉴 ++++++");
				System.out.println("1. 비밀번호 수정");
				System.out.println("2. 이름 수정");
				System.out.println("3. 전화번호 수정");
				System.out.println("5. 로그아웃");
				System.out.print("메뉴 번호 입력 : ");

				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					changePassword();
					break;
				case 2:
					changeName();
					break;
				case 3:
					changePhoneNum();
					break;
				case 4:
					check = false;
					break;
				default:
					throw new Exception();
				}

			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			memberMenu();
		}

	}

	public void changePassword() {

		System.out.print("비밀번호 확인 : ");
		String pw = sc.nextLine();

		if (uc.userChecked(pw, userInfo)) {
			System.out.println("현재 비밀번호 : " + userInfo.getPw());

			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();

			uc.changePw(newPw, userInfo);
			System.out.println("비밀번호 변경 완료");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			changePassword();
		}

	}

	public void changeName() {

		System.out.print("비밀번호 확인 : ");
		String pw = sc.nextLine();

		if (uc.userChecked(pw, userInfo)) {
			System.out.println("현재 이름 : " + userInfo.getName());

			System.out.print("새로운이름 : ");
			String newName = sc.nextLine();

			uc.changeName(pw, newName);
			System.out.println("이름 변경 완료");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			changeName();
		}

	}

	public void changePhoneNum() {
		System.out.print("비밀번호 확인 : ");
		String pw = sc.nextLine();

		if (uc.userChecked(pw, userInfo)) {
			System.out.println("현재 전화번호 : " + userInfo.getPhoneNum());

			System.out.print("새로운 전화번호 : ");
			String newPhoneNum = sc.nextLine();

			uc.changeName(pw, newPhoneNum);
			System.out.println("전화번호 변경 완료");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			changePhoneNum();
		}
	}

}
