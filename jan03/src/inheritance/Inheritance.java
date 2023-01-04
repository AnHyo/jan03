package inheritance;
//상속 : 상위 클래스의 내용을 하위 클래스가 다 가져가서 자신의 것처럼 사용하는 것.

//상위 클래스 / 부모 클래스 /			 / super class
//하위 클래스 / 자식 클래스, 파생 클래스 / sub 	 class
// 모두 같은말

//연결 : class 자식 클래스 extends(확장) 부모 클래스{}
// 중복되는 코드를 줄이기 위해 나왔음

class Animal{
	int age;
	String name;
	
	public Animal(int age, String name) {
		this.age = age; //this는 해당 생성자가 태어나는 순간 바로 적용
		this.name = name;
		System.out.println("동물이 탄생했습니다.");
	}
}

//extends Animal : Animal 클래스를 상속
class Human extends Animal{
	String ssn; //Human만 가지고 있는 주민등록번호

	public Human(int age, String name) {
		super(age, name);  //부모의 생성자 호출
		
		//System.out.println(age + " 살 "+name+"이다.");
		
	}
	public Human(int age, String name, String ssn) {
		super(age, name);  //부모의 생성자 호출
		this.ssn = ssn; //주민등록번호 추가
		
		//System.out.println(age + " 살 "+name+"이다. 주민등록번호는 "+ssn);
	}
	public void myInpo() {
		System.out.println("내 주민등록번호는 " + ssn + "입니다.");
	}
	
	
//	int age;
//	String name;
}

class NewHuman extends Human {
	public NewHuman(int age, String name, String ssn) {
		super(age, name, ssn);
	}
	
	//주민등록번호 앞자리만... 부모거 가져다가 재정의해서 쓰기 (오버라이딩)
	@Override //@ = 어노테이션(오버라이드 됬다는 표시기능) , 내가 내 상황에 맞게 바꿔쓰겠다는 의미
	public void myInpo() {
		//super.myInpo(); 오버라이드 시 필요 없어짐
		System.out.println("내 주민번호는 " + ssn.substring(0,6) + "입니다."); 
											// substring : 글자 잘라서 가져오기
											// 0번에서부터 글자 6개 가져오겠다.
	}
	
	
}


class Dog extends Animal{
public Dog(int age, String name) {
		super(age, name);
		
	}

	//	int age;
//	String name;
	public void sound() {
		System.out.println("Bow Wow");
	}
	
}

class HoundDog extends Dog{

	public HoundDog(int age, String name) {//단일 상속 (지금은 막혀있어서 2개 이상은 상속받지 못함)
		super(age, name);
		
	}
}

class Cat extends Animal{
	public Cat(int age, String name) {
		super(age, name);
	}

	public void sound() {
		System.out.println("Meow");
	}
}

class KoreaShortHair extends Cat{//Cat이 Animal을 상속받았으므로 Animal의 값과 Cat의 값 모두 사용 가능, 
	  							 //Animal을 상속받고 Cat을 상속받는
	public KoreaShortHair(int age, String name) {
		super(age, name);
	}
} 


public class Inheritance {
	
	public static void main(String[] args) {
		Human human = new Human(26,"chi","960212-000011");
		human.age = 10;
		human.name = "3PO";
	
		HoundDog houndDog = new HoundDog(26, "kko");
		//houndDog.sound();
		
		NewHuman human2 = new NewHuman(0, "보노보노", "960212-000011");
		human2.myInpo();
		
		
	}
	

}
