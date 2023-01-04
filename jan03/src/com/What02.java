package com;

import java.io.IOException;

public class What02 {
	public static void main(String[] args) throws IOException {
		
		//다른 입력방법 : System.in.read()
		
		//System.in.read();
		System.out.println("한글자를 입력해주세요.");
		int user = System.in.read();
		System.out.println(user);
		System.in.read(); //엔터키 처리
		System.in.read();
		
		
		System.out.println("두번째 숫자를 입력하세요.");
		int sec = System.in.read(); // \n \r 엔터도 이렇게 인식
		System.out.println(sec);
		System.in.read(); //엔터키 처리
		System.in.read();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int th = System.in.read();
		System.out.println(th);
		
	}

}
