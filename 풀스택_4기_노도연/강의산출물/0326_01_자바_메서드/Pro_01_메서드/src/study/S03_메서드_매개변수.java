package study;

public class S03_메서드_매개변수 {

	public static void main(String[] args) {
		// 리턴값, 매개변수값의 자료형이 다른 경우 메서드
		// 매개변수 3개 정수형으로 전달
		// 리턴값 실수형으로 출력 
		// 1. 함수 호출 실행
		double result = avg(80,90,95); // 매개변수는 정수형 결과는 실수형
		System.out.println(result);
		//88.33333333333333


	}
	// 2. 메서드 선언 기본은 스택틱
	static double avg(int 점수1, int 점수2, int 점수3) {
		int sum = 점수1 + 점수2 + 점수3;
//		return sum/3.0; // 둘 중에 하나를 실수형으로 만들어주면 실수형 평균값 리턴됨.
		return (double)sum/3; // 실수형 평균값 리턴 (강제형변환할 경우)
		
	}

}
