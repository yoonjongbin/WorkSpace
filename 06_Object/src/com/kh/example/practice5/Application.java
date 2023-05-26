package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;
import com.kh.example.practice5.model.Employee;

public class Application {
	static Scanner sc = new Scanner(System.in);
	//Employee viewEmployee = new Employee();
	EmployeeController employeeController = new EmployeeController();
	
	public static void main(String[] args) {
		
		boolean viewMenu = true;
		
		Application app = new Application();
		
		
		
		//System.out.println("입력된 값: " + app.employeeMenu());
		
		for(int i = 0; viewMenu == true; i++) {
			switch(app.employeeMenu()) {
			case 1 :
				app.insertEmp();
				break;
			case 2 :
				app.updateEmp();
				break;
			case 3 :
				app.printEmp();
				break;
			case 9 :
				viewMenu = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default : 
				System.out.println("1, 2, 3, 9 중 하나의 숫자만 입력하세요.\n");
				break;
			}
		}
		
		
		
		
	}
	
	public int employeeMenu(){// 메인메뉴 출력
		
		for(int i = 1; i <= 9; i++) {
			switch(i) {
				case 1 :
					System.out.println(i + ". 사원 정보 추가");
					break;
				case 2 :
					System.out.println(i + ". 사원 정보 수정");
					break;
				case 3 :
					System.out.println(i + ". 사원 정보 출력");
					break;
				case 9 :
					System.out.println(i + ". 프로그램 종료\n");
					break;
				
			}
			
		}
		
		System.out.print("메뉴 번호를 누르세요 : ");
		int choose_Menu = Integer.parseInt(sc.nextLine());
		
		return choose_Menu;
	}
	
	public void insertEmp() {// 저장할 데이터 사용자로부터 받음
		boolean active = true;
		//EmployeeController employeeController = new EmployeeController();
		
		System.out.print("사원번호 : ");
		int empNum = Integer.parseInt(sc.nextLine());
		//employeeController.add(sc.nextLine());
		System.out.print("사원이름 : ");
		
		String name = sc.nextLine();
		System.out.print("사원성별 : ");
		
		char gender = sc.nextLine().charAt(0);
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		for(int i = 0; active == true; i++) {
			System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
			char yesNo = sc.nextLine().charAt(0);
			
			
			if(yesNo == 'n') employeeController.add(empNum, name, gender, phone);
			else if(yesNo == 'y') {
				
				System.out.print("사원 부서 : ");
				String dept = sc.nextLine();
				
				System.out.print("사원 연봉 : ");
				int salary = Integer.parseInt(sc.nextLine());
				
				System.out.print("보너스 율 : ");
				double bonus = sc.nextDouble();
				sc.nextLine();
				
				employeeController.add(empNum, name, gender, phone, dept, salary, bonus);
			} else {
				System.out.println("\'y\' 또는 \'n\' 중 하나만 입력하세요.\n");
				
				continue;
			}
			
			if(yesNo == 'n' || yesNo == 'y') break;
		}
		
		
		
		
	}
	
	public void updateEmp() {// 수정할 데이터 사용자로부터 받음
		
		System.out.println("사원의 어떤 정보를 수정하시겠습니가?");
		for(int i = 1; i <= 9; i++) {
			switch(i) {
				case 1 :
					System.out.println(i + ". 전화번호");
					
					break;
				case 2 :
					System.out.println(i + ". 사원연봉");
					
					break;
				case 3 :
					System.out.println(i + ". 보너스 율");
					
					break;
				case 9 :
					System.out.println(i + ". 돌아가기");
					
					break;
				
			}
			
		}
		
		System.out.print("메뉴 번호를 누르세요 : ");
		int choose_Menu = Integer.parseInt(sc.nextLine());
		
		switch(choose_Menu) {
		case 1 :
			System.out.print("전화번호 수정 : ");
			String phone = sc.nextLine();
			employeeController.modify(phone);
			
			break;
		case 2 :
			System.out.print("사원 연봉 수정 : ");
			int salary = Integer.parseInt(sc.nextLine());
			employeeController.modify(salary);
			
			break;
		case 3 :
			System.out.print("보너스 율 수정 : ");
			double bonus = sc.nextDouble();
			sc.nextLine();
			employeeController.modify(bonus);
			
			break;
		case 9 :
			break;
		
	}
	}
	
	public void printEmp() {// 데이터 출력
		//System.out.println(employeeController.info());
		
		Employee viewEmployee = employeeController.info();
		System.out.println(viewEmployee);
	}

}
