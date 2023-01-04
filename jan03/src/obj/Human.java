package obj;
//자바 파일명과 동일하기 때문에 public이 붙음
public class Human {

		//필드 : 값(정보를)을 저장할 변수
		public int age; //접근지정자 붙이기
		public String name; //접근지정자 안붙임. 비어있는 상태
		//생성자 : 인스턴스를 생성하는 코드, 객체를 생성
		//메소드 : 기능, 펑션과 동일한 개념
		
		Animal ani;
		
		public void show() {
			ani = new Animal();
			//ani.setName("홍길동");
			//System.out.println(ani.getName());
		}
		
}

// DTO에서 많이 사용
// private 의 값을 저장, 호출할때 필요한 메소드 getter, setter (값을 수정, 값을 가져옴)	 (우회접속)
//퍼블릭 안붙은 경우 = default : 같은 패키지 안에서 볼 수 있음
class Animal {
	//private : Animal class안에서만 사용 가능 , 패키지 단위보다 훨씬 작음 , 값변경을 못하게 할때(잠궈버릴때) 사용
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// 빠른 경로 : Source > Generate Getter and Setters.. > select all > 완료 하면 자동으로 불러와짐
	
	//내부의 비밀스러운 동작을 위해서 못 보게 할때.
/*	private void sleep() {
		System.out.println("비밀스럽게 잡니다.");
	}
	
	public String getName() { //getter : 값을 리턴
		return name;
	}
	
	public void setName(String name) { // setter : 값 저장
		this.name = name;
	}
*/
	
}
