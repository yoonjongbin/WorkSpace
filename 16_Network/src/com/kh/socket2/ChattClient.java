package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChattClient {

	public static void main(String[] args) {
		// 키보드로 입력받은 데이터를 읽어서 서버로 보낸다.
		// 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력한다.
		
		try {
			InetAddress ip = InetAddress.getLocalHost();
			
			// 1. 소켓 생성
			
			Socket s = new Socket(ip.getHostAddress(), 60000);
			System.out.println("Client Socket Creating...");
			
			
			// 2. 스트림
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			
			
			//String line = "";
//			while((line = br.readLine()) != null) {
//				pw.println(line);
//				if((line = br2.readLine()) != null){
//					System.out.println("서버로부터 돌아온 값 : " + line);
//				}
//			}
			
			while(true) {
				String line = br.readLine();
				pw.println(line);
				
				System.out.println("내가 보낸 메세지 : " + br2.readLine());
			}
		} catch (IOException e) {
			System.out.println("서버와의 연결을 실패했습니다.");
		}
		
		
		
		
	}

}
