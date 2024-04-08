package study;

// 1. 인터페이스 A 선언 (생략 안한 버전)
interface A{
	static final double pi= 3.14; //생략시 자동으로 public static final 로 인식(상수값)
	public abstract void getData(); //생략시 자동으로 public abstract(추상메서드)
}

// 2. 인터페이스 B 선언 (생략한 버전)
interface B{
	int b=50;		//생략시 자동으로 public static final 로 인식(상수값)
	void getData(); //생략시 자동으로 public abstract(추상메서드)
}

// 3. 클래스 C 선언 인터페이스 A구현 (임플리먼트 implements)
class C implements A{
	@Override
	public void getData() {
		System.out.println("클래스 C에서 인터페이스 A 구현");
		System.out.printf("pi :%.2f\n",A.pi); // 인터페이스이름.멤버변수(상수) => 인터페이스이름 생략 가능
		
	}
}

// 4. 클래스 D 선언 인터페이스 B구현 (임플리먼트 implements)
class D implements B{
	@Override
	public void getData() {
		System.out.println("클래스 D에서 인터페이스 B 구현");
		System.out.printf("b :%d\n",B.b); // 인터페이스이름.멤버변수(상수) => 인터페이스이름 생략 가능
		
	}
}

// 5. 메인메서드 객체 생성하여 실행한다.

public class S02_클래스_상속_인터페이스 {

	public static void main(String[] args) {
		C c =new C();
		c.getData();
		
		D d = new D();
		d.getData();

	}

}
