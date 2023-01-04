package com;

import java.util.Random;

public class Randome02 {
	public static void main(String[] args) {
	
		Random r = new Random();
		
		for(int i =0; i <100; i++) {
			int user = r.nextInt(10); // 0~99
			System.out.println(user);
		}
		
		
		
	}
}
