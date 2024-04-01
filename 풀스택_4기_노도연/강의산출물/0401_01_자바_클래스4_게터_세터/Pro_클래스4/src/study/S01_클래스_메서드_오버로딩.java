package study;

/*
	# 평균값 오버로딩
	Tester 클래스 객체를 생성하고 
	getAverage() 메서드를 호출해서 
	매개값을 콘솔 화면에 출력하고자 한다.
 
	getAverage()의 매개값은 정수 2, 3, 4개씩 값을 줄 수 있고
	리턴타입은 실수이다.
	
	Test 클래스에서 getAverage() 메서드를 선언하고 
	코드를 실행 하시오.
	
	출력예시] ==> 점수는 자유롭게 구현
	매개변수 2개인 경우
	2과목 평균: 87.5
	3과목 평균: 70.53
	4과목 평균: 95.48
 */
// 클래스 위치 Tester
class Tester{

	
	double getAverage(int a, int b) {
		return (double)(a+b) /2;
	}
	double getAverage(int a, int b,int c) {
		return (double)(a+b+c) /3;
	}
	double getAverage(int a, int b,int c, int d) {
		return (double)(a+b+c+d) /4;
	}
	

}


public class S01_클래스_메서드_오버로딩 {

	public static void main(String[] args) {
		
		Tester tester = new Tester(); // 기본 객체 생성
		
		System.out.println();
		//1. 매개값 2개
		System.out.printf("2과목 평균 : %6.2f \n",tester.getAverage(97, 81));
		//2. 매개값 3개
		System.out.printf("3과목 평균 : %6.2f \n",tester.getAverage(97, 81, 94));
		//3. 매개값 4개
		System.out.printf("4과목 평균 : %6.2f \n",tester.getAverage(97, 81, 88,98));
		System.out.println();
		
		// 소수점 포함해서 총 몇자리인지!! 
		// 소수점 포함해서 총 6자리니깐 %6.2f 

	}

}
