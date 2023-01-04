package apple;

public class AppleBuyer {
//필드
	//가지고 있는 돈
	int buyerMoney = 5000;
	//사과의 수
	int appleCount; //인스턴스가 생성되면 기본값을 가져갑니다. int = 0이 초기값
	//정수 0, 실수 0.0, char 0, boolean false, R타입 null
	
	
//메소드
	//사과를 사는 행동
	//P타입 뿐만 아니라 R타입도 사용 가능
	public void buyApple(AppleSeller seller, int money) {//AppleSeller 들어올 거라고 미리 적어둔 것
		// int count = 없어도 아래처럼 저장가능
		appleCount += seller.saleApple(money);
		buyerMoney -= money;
	}
	//내 정보를 말하는 행동
	public void tellBuyer() {
		System.out.println("구매한 사과는 " + appleCount + " 개 입니다.");
		System.out.println("남은 돈은 "+ buyerMoney + " 원 입니다.");
	}
	
	
}
