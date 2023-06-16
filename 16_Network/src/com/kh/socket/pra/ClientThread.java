package com.kh.socket.pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientThread implements Runnable {

	Socket socket; // usb 및 김치통
	BufferedReader br; // 김치 읽는용
	PrintWriter pw; // 김치 보내기

	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>()); // 리스트 전체를 동기화

	
	@Override
	public void run() {

		sendAllUser();
	}

	
	public ClientThread() {
	}

	
	
	public ClientThread(Socket socket) {
		this.socket = socket;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 김치통에 있는 김치 읽기
			pw = new PrintWriter(socket.getOutputStream()); // 김치통에 있는 김치 읽은 다음에 포장
			
			list.add(pw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public void sendAllUser() {
		pw.println("쎾쓰");
		String message = null;
		String input = null;
		
		
		String login = socket.getInetAddress() + "님 환영합니다.";
		pw.println(login);
		
		while (br != null) {
			try {
				input = br.readLine();
				message = "[" + socket.getInetAddress() + "] 가 보낸 메세지 : " + input;
				
				for (PrintWriter line : list) {
					line.println(message);
					line.flush();
				}
				
			} catch (IOException e) {
				message = socket.getInetAddress() + "님이 나갔습니다.";
			}
			
			
		}
		
		
		
		
		

//		while (true) {
//			for (PrintWriter line : list) {
//				pw.println(message);
//				pw.flush();
//			}
//		}
	}
}