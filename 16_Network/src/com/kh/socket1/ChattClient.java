package com.kh.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 */


public class ChattClient {

	public static void main(String[] args) {
		// 키보드로 입력받은 데이터를 읽어서 서버로 출력
		
		
		// 클라이언트 측 로직
		
		try {
			// 1. 소켓 생성
			
			Socket s = new Socket("127.0.0.1", 60000);
			System.out.println("Client Socket Creating...");
			
			
			// 2. 스트림
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			
			String line = "";
			while((line = br.readLine()) != null) {
				pw.println(line);
			}
		} catch (IOException e) {
			System.out.println("서버와의 연결을 실패했습니다.");
		}
	}

}
