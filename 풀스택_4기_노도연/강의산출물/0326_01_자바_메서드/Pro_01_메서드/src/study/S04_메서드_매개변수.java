package study;

public class S04_메서드_매개변수 {

	public static void main(String[] args) { //리턴값 없는 메인메소드
		// 매개변수 서로 다른 자료형 2개 문자열, 정수
		// 리턴값 없는 메서드 =>void
		// 1. 메서드 호출 실행
		msg("이순신", 39);
		msg("김유신", 42);
		msg("이성계", 38);

	}
	// 2. 메서드 선언
	static void msg(String name, int age) { //이름은 문자타입 나이는 정수타입
			System.out.printf("이름: %s , 나이 : %d\n", name, age);
	}
}
