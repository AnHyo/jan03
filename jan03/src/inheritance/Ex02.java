package inheritance;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
//	컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
//	사용자는 이 숫자를 맞추어야 합니다.
//	입력한 숫자보다 정답이 크면 → "UP" 출력,
//	입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
//	정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int i, j, go = 0, dom = 0;
		for (i = 0; i < 1; i++) { // 랜덤 숫자 출력
			dom = r.nextInt(100) + 1;
			System.out.println(dom);
		}
		System.out.println("1~100숫자중 하나를 입력해 주세요.");
		for (j = 0; go != dom; j++) { // 입력한 숫자와, 랜덤 숫자가 같지 않을경우 실행
			go = sc.nextInt(); // 숫자 입력
			if (go > dom) {
				System.out.println("UP");
				System.out.println("더 작은수를 입력해 주세요");
			} else if (go < dom) {
				System.out.println("DOWN");
				System.out.println("더 큰수를 입력해 주세요");
			}
		}
		if (go == dom) { // 입력한 숫자와, 랜덤 숫자가 같을 경우 실행
			System.out.println("정답입니다.");
			System.out.println("정답 숫자는" + dom + "이고 " + j + " 번만에 맞추셨습니다.");
		}

		sc.close(); // 스캐너 닫아줌
	}

}
