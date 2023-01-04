package apple;

public class AppleMain {

	public static void main(String[] args) {
		
		//인스턴스 만들어주세요.
		AppleSeller seller1 = new AppleSeller();//이건 생성자
		AppleBuyer buyer = new AppleBuyer();//이건 생성자
		
		buyer.buyApple(seller1,3000); //seller1객체명 맞춰주세요.
	
		seller1.tellSeller();
		buyer.tellBuyer();
		

	}

}
