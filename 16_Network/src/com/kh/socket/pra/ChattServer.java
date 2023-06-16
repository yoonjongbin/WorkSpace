package com.kh.socket.pra;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ChattServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(60000);
			System.out.println("서버가 연결되었습니다.");
			
			
 			while(true) {
 				Socket socket = serverSocket.accept();
 				ClientThread ct = new ClientThread(socket);			//ClientThread클래스 인스턴스화 + 소켓넣기
 				Thread cliThread = new Thread(ct);					//쓰레드 생성 ct클래스 정보 넣기
 				cliThread.start();
 				
 			}
			
 			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}