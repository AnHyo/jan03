package com;

public class Random01 {
	public static void main(String[] args) {
		
		double d = Math.random(); // 기본 더블로 설정
		//System.out.println(d); //0.0~1.0사이의 숫자가 랜덤으로 출력 (0.306434268225664)
		
		for(int i = 0; i < 10; i++) {
			double a =( Math.random() * 10) + 1; // 0 ~9 -> +1 -> 1~9(+1을 해주는 것은 0을 출력되지 않게 하기 위함)
			//System.out.println(a);
		}
		
		for(int i = 0; i < 10; i++) {
			double b =( Math.random() * 100) + 1; // 0 ~99 -> +1 -> 1 ~99 (+1을 해주는 것은 0을 출력되지 않게 하기 위함)
			//System.out.println(b);
		}
		
		for(int i = 0; i < 10; i++) {
			int c = (int)( Math.random() * 100) + 1;  //기본 double로 지정되어 있기 때문에 int로 변환 해주어야 한다.
			System.out.println(c);
		}
		
		
		
	}
}
