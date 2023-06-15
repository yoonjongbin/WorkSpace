package com.webtoon.naver;


import java.util.Scanner;
import com.webtoon.naver.controller.UserController;
import com.webtoon.naver.controller.WebtoonController;
import com.webtoon.naver.model.User;


public class Run {
	User userInfo = null;

	static Scanner sc = new Scanner(System.in);

	static UserController uc = new UserController();
	static WebtoonController wtc = new WebtoonController();

	public static void main(String[] args) {

		Run run = new Run();

		run.mainMenu();

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
					userInfo = null;
					mainMenu();
					break;
				default:
					throw new Exception();
				}

		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			toonMenu();
		}
	}

	public void selectToon() {

		
			wtc.setWebtoon();
			System.out.print("요일을 입력해주세요.(월~일) : ");
			String day = sc.nextLine();
			
			if (!wtc.selectToon(day)) {
				System.out.println("\"월 ~ 일\" 방식으로 입력해주세요.");
				selectToon();
			}
			
			toonMenu();
		

	}

	public void memberMenu() {
		try {
			
				System.out.println("++++++ 회원 메뉴 ++++++");
				System.out.println("====== 회원정보 ======");
				System.out.printf("이름 : %s \n아이디 : %s \n비번 : %s \n휴대폰 번호 : %s\n",  userInfo.getName(), 
						  userInfo.getId(), userInfo.getPw(), userInfo.getPhoneNum());
				System.out.println("===================");
				System.out.println("1. 비밀번호 수정");
				System.out.println("2. 이름 수정");
				System.out.println("3. 전화번호 수정");
				System.out.println("4. 로그아웃");
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
					userInfo = null;
					mainMenu();
					break;
				default:
					throw new Exception();
				}

			
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			memberMenu();
		}

	}

	public void changePassword() {

		System.out.print("비밀번호 확인 : ");
		String pw = sc.nextLine();

		if (uc.userChecked(pw, userInfo)) {// 로그인 한 아이디의 비번과 입력 된 비번 비교해서 true면 비밀번호 변경
			System.out.println("현재 비밀번호 : " + userInfo.getPw());

			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();

			uc.changePw(newPw, userInfo);
			System.out.println("비밀번호 변경 완료");
		} else {	// false면 다시 입력
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			changePassword();
		}

	}

	public void changeName() {

		System.out.print("비밀번호 확인 : ");
		String pw = sc.nextLine();

		if (uc.userChecked(pw, userInfo)) {// 로그인 한 아이디의 비번과 입력 된 비번 비교해서 true면 이름 변경
			System.out.println("현재 이름 : " + userInfo.getName());

			System.out.print("새로운이름 : ");
			String newName = sc.nextLine();

			uc.changeName(pw, newName);
			System.out.println("이름 변경 완료");
		} else {	// false면 다시 입력
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			changeName();
		}

	}

	public void changePhoneNum() {
		System.out.print("비밀번호 확인 : ");
		String pw = sc.nextLine();

		if (uc.userChecked(pw, userInfo)) {// 로그인 한 아이디의 비번과 입력 된 비번 비교해서 true면 전화번호 변경
			System.out.println("현재 전화번호 : " + userInfo.getPhoneNum());

			System.out.print("새로운 전화번호 : ");
			String newPhoneNum = sc.nextLine();

			uc.changePhone(pw, newPhoneNum);
			System.out.println("전화번호 변경 완료");
		} else {	// false면 다시 입력
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			changePhoneNum();
		}
	}

}
