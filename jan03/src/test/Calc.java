package test;

import java.util.Arrays;

public class Calc {
	
	
	public int add(int num, int num2) {
		//System.out.println(num + num2);
		int result = num + num2;
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		int result = calc.add(10,30);
		System.out.println(result);
		
		String result1 = calc.print("홍길동");
		System.out.println(result1);
		
		//int arr = calc.makeArrey(4,8);
		System.out.println(Arrays.toString(calc.makeArrey(4,8)));
		//Arrays.toString = 배열을 문자형태로 변경해줌 (1차원 배열만)
		
	}
	//문제, 파라미터 int 타입 두개를 받습니다.
	//앞 숫자는 시작 숫자, 뒷 숫자는 끝 숫자입니다.
	//for문을 돌려 값을 배열에 저장해서 리턴해주세요.
	//예) (4,8) --> 4,5,6,7,8
	
	public int[] makeArrey(int one ,int tow) {
		int[] arr = new int[(tow-one)+1]; //배열크기
		for(int i = one, index =0; i <= tow;i++ ) { //index는 후행증감을 위한 것.
			arr[index++] = i; // i의 값을 for문을 돌면서 대입함 i의 0번자리 -> i의 1번자리
		}
		return arr;
	}
	
	
	
	

	String print(String name) {
		return "입력하신 이름은" + name + "입니다.";
	}
	
	
}
