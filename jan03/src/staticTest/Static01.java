package staticTest;
//static 키워드
/*
 * static은 정적이라는 의미가 있습니다.
 * 자바에서는 동적과 정적이라는 개념으로 구분합니다.
 * 정적은 클래스가 로드되는 시점을 이야기 하고
 * 동적은 로드된 클래스가 실행된 이후를 이야기합니다.
 * 
 * 이 중 객체는 동적 데이터라고 해서 프로그램이 실행된 이후에 발생되는
 * 대표적인 형태입니다.
 * 
 * 정적 멤버 : 인스턴스를 만들지 않고 사용할 수 있는 멤버
 * 			   모든 객체를 통틀어서 하나만 생성되고 모든 객체가
 * 			   그것을 공유합니다.
 * 			   클래스명.멤버명으로 호출합니다.
 * 			   클래스에 의지합니다.
 * 
 * 인스턴스 멤버 : 인스턴스 생성시 가지게 되는 자신의 변수
 * 				   별도의 기억공간을 가지고 객체마다 각각 다른 값을 가짐
 * 				   인스턴스명.멤버명으로 호출합니다. 
 * 
 */
public class Static01 {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	
	public static void main(String[] args) {
		//Static01.add(12,12); //공통적인 요소만 static 사용하여 공유
		add(12,12); //같은 클래스라면 클래스명 제거 가능
//		Calc calc = new calc;
		Calc.add(12, 12); // static 붙어서 객체 생성 안하고도 공유 가능, (속한)클래스명.메소드명(), 정적인 요소
	//	Calc.div(12, 4); 객체 생성 후 사용 가능, 공유 불가하기 때문
		Calc.num = 10; //static 붙은거라 클래스로 호출하여 바로 사용 가능
		
	}

}

class Calc{
	public int number;
	static int num;
	
	
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
		num = num1 + num2; //static 붙은 변수 호출, static붙은 메소드는 static붙은 변수명 호출 가능하다.\
		// number = num1 + num2;// static은 non-static호출 불가
		// div(10,200); //안됨, 객체 생성 후 호출 가능, 로드하는 시기가 다르기 때문
	}
	public void div(int num1 , int num2) {
		System.out.println(num1 / num2);
		num = num1 + num2; //non-static이 static호출 가능
		number = num1 + num2;//non-static이 non-static호출 가능 
		add(10,50); //static 부를 수 있음
	}
	
}

/* 주의사항
 * 객체가 생성되지 않은 상태에서 호출되는 메소드입니다.
 * 객체 안에서만 존재하는 인스턴스 변수들을 사용할 수 없습니다.
 * 정적 변수와 지역변수만 사용가능합니다.
 * 
 * 정적 메소드에서 인스턴스 메소드를 호출하면 에러가 납니다.
 * 인스턴스 메소드도 객체가 생성되어야만 사용할 수 있기 때문입니다.
 * 
 * 정적 메소드에서 정적 메소드를 호출하는 것은 가능합니다.
 * 정적 메소드는 this키워드를 사용할 수 없습니다.
 * 				 :this키워드는 인스턴스가 사용합니다. //this는 내꺼 super는 부모거
 * 				 :this 인스턴스가 발동된 후 사용가능
 * 
 * 정적 메소드는 정적 메소드를 호출할 수 있습니다.
 * 
 * final붙은 상수는 수정불가인데?
 * 객체를 만들지 않고 사용하면 좋습니다. 그래서 static을 붙입니다.
 * 
 */








