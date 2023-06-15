package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL(Uniform Resource Locator)
 * 
 * - 인터넷에 존재하는 서버들의 자원에 접근할 수 있는 주소
 * 
 * https://www.youtube.com/result?search_query=여행
 * 
 * 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링(#은 붙을수도 안붙을수도 있음)
 * 
 * - 프로토콜 : 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신규약 (https)
 * - 호스트명 : 자원을 제공하는 서버의 이름 (www.youtube.com)
 * - 포트번호 : 통신에 사용되는 서버의 포트번호 (443)
 * - 경로명 : 접근 하려는 자원이 저장된 서버상의 위치 (results)
 * - 쿼리(Query) : ? 이후에 부분 (search_query=여행)
 * 
 * 
 */

public class URLTest {

	public static void main(String[] args) {

		URLTest u = new URLTest();
//		u.method1();
		u.method2();
	}

	public void method1() {
		try {

			URL url = new URL("https://www.youtube.com/result?search_query=여행");

			System.out.println("url.getProtocol() : " + url.getProtocol());
			System.out.println("url.getHost() : " + url.getHost());
			System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
			System.out.println("url.getFile() : " + url.getFile());
			System.out.println("url.getPath() : " + url.getPath());
			System.out.println("url.getQuery() : " + url.getQuery());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void method2() {
		BufferedReader input = null;
		try {
			URL url = new URL("https://iei.or.kr");
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = "";
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
