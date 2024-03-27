package study;

public class S02_메서드_매개변수 {

	public static void main(String[] args) {
		// 매개변수(Parameter 파라미터)
		// 메서드 호출
		int num1 = 50; 
		int num2 = 20;
		
		// 매개변수 1개
		int plus = fn1(num1); // 결과 <= 메서드(매개변수); 매개변수 있는 메서드 호출 실행
		System.out.println(plus); 
		// 50
		
		// 매개 변수 2개 (전달인자 2개 아규먼트) 받는 측에서는 매개변수, 보내는 측에서는 전달인자 (아규먼트)
		int result = fn2(num1,num2); // 결과 <= 메서드(매개변수); 매개변수 있는 메서드 호출 실행
		System.out.println(result); 
		// 70
	}
	//매개변수 1개 메서드
	//메서드 선언 => 메인 메서드 밖에다가 한다.
	//매개변수를 이용한 메서드 선언과 실행
	//리턴값 있는 메서드 선언
	static int fn1(int num1) { // 매개변수값 타입 int 정수 => 만약에 틀리면 형변환 필요 ==> 자바는 자료형 꼭 들어감.
		return num1; //리턴 타입은 int 정수형 
	}
	
	//매개변수 2개 메서드
	static int fn2(int num1, int num2) { // 매개변수값 2개 타입 정수(int)
		return num1 + num2 ; //리턴 타입은 int 정수형 = > 2개의 값이 연산이 되서 나온다. => 정수 + 정수 
	}


}
