package constructor;

public class Constructor02 {
	public static void main(String[] args) {
	Cacl calc = new Cacl();
	calc.add(3, 3);
		
	}
	
	
}

class Cacl{
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	public void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	// 바퀴를 두번 만들지 마라 = 이미 만들어져 있는것을 활용하고, 굳이 일일이 만들지 마라
	
	
}
