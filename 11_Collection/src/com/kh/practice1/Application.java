package com.kh.practice1;

import java.util.Scanner;

import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	
	MusicController mc = new MusicController();
	
	public static void main(String[] args) {
		
		Application app = new Application();
		app.mainMenu();
		
	}
	
	
	public void mainMenu() {
		boolean active = true;
		
		while(active) {
			System.out.println("===== 메인메뉴=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			
			System.out.print("메인메뉴 : ");
			try {
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice) {
				case 1 : 
					addList();
					break;
				case 2 : 
					addAtZero();
					break;
				case 3 : 
					printAll();
					break;
				case 4 : 
					searchMusic();
					break;
				case 5 : 
					removeMusic();
					break;
				case 6 : 
					setMusic();
					break;
				case 7 : 
					ascTitle();
					break;
				case 8 : 
					descArtist();
					break;
				case 9 : 
					System.out.println("프로그램을 종료합니다.");
					active = false;
					break;
				default : 
					System.out.println("잘못된 입력입니다.");
					break;
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		
		System.out.print("곡 이름 입력 : ");
		String musicName = sc.nextLine();
		
		System.out.print("가수 이름 입력 : ");
		String artist = sc.nextLine();
		
		Music music = new Music(musicName, artist);
		if(mc.addList(music))
			System.out.println("추가 성공");
		else
			System.out.println("추가 실패");
		
	}
	
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		
		System.out.print("곡 이름 입력 : ");
		String musicName = sc.nextLine();
		
		System.out.print("가수 이름 입력 : ");
		String artist = sc.nextLine();
		
		Music music = new Music(musicName, artist);
		
		if(mc.addAtZero(music)) 
			System.out.println("추가 성공");
		else
			System.out.println("추가 실패");
	}
	
	
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		
		System.out.print("곡 이름 입력 : ");
		String musicName = sc.nextLine();
		
		Music music = mc.searchMusic(musicName);
		
		if(music != null)
			System.out.println(music + "를(을) 검색하였습니다.");
		else System.out.println("검색한 곡이 없습니다.");
		
		
	}
	
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		
		System.out.print("곡 이름 입력 : ");
		String musicName = sc.nextLine();
		
		Music music = mc.removeMusic(musicName);
		
		if(music != null)
			System.out.println(music + "을 삭제하였습니다.");
		else System.out.println("검색한 곡이 없습니다.");
	}
	
	
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		
		System.out.print("검색할 곡 명 : ");
		String musicName = sc.nextLine();
		
		System.out.print("수정할 곡 명 : ");
		String editMusic = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String editArtist = sc.nextLine();
		
		Music music = new Music(editMusic, editArtist);
		
		
		
		Music setMusic = mc.setMusic(musicName, music);
		
		if(setMusic != null)
			System.out.println(setMusic + "을 수정하였습니다.");
		else System.out.println("수정할 곡이 없습니다.");
		
		
		
		
	}
	
	
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		
		for(Music music : mc.ascTitle()) {
			System.out.println(music);
		}
	}
	
	
	public void descArtist() {
		System.out.println("****** 곡 명 내림차순 정렬 ******");
		
		for(Music music : mc.descArtist()) {
			System.out.println(music);
		}
	}

}
