package apple;
//사과장수
public class AppleSeller {
//필요한 정보는?
	//사과 수
	int appleCount = 100; //카멜
	//사과 가격
	final int APPLE_PRICE = 1000; //고정가격(상수처리) final : 절대 수정 불가
	//가지고 있는 돈
	int sellerMoney = 0;
	
	
//필요한 메소드는?
	//사과 파는 행동 
	// int는 int의 형태로 값을 받겠다는 의미.
	// (int money)는 나중에 saleApple를 호출할 때 int형태의 값을
	// 받아서 출력한다는 의미
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		//sellerMoney = sellerMoney + money;
		sellerMoney += money; //위와 동일
		//appleCount = appleCount - num;
		appleCount -= num;
		return num; //결과값을 되돌려줍니다.
	}
	
	//자신의 정보 말하는 행동
	// void : 해당 매소드를 출력하고 끝, 결과값을 안 돌려줌
	public void tellSeller() {
		System.out.println("남은 사과는 " + appleCount + "개 입니다.");
		System.out.println("수익은 " + sellerMoney + "원 입니다.");
	}

}
