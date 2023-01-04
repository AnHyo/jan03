package com;

import java.util.Scanner;

//스캐너
//랜덤
public class What {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //자바로 들어온다. System = 자바 , 스캐너를 열어서
		System.out.println("숫자를 입력해 주세요.");
		
		int user = sc.nextInt(); //next = 뒤에 붙는형식이 나와 라는 의미 //int를 입력해주고
		System.out.print(user);
		
		//열어놓은 sc객체 닫기, 스캐너를 닫아요 라는 의미
		sc.close();
		
		
	}

}
