package test;

import java.util.Scanner;

public class T01_사칙연산_계산기_메서드응용 {
	
	
	// 메서드 4개 
	// 더하기 add
	static int add (int num1, int num2) {
		return num1+num2;
	}
	
	// 빼기 sub
	static int sub (int num1, int num2) {
		return num1-num2;
	}
	
	// 곱하기 mul
	static int mul (int num1, int num2) {
		return num1*num2;
	}
	
	// 나누기 div 소수 2자리까지 출력
	static double div (int num1, int num2) {
		return (double)num1/num2;
	}

	public static void main(String[] args) {
		// 메서드 이름 => 
		// 더하기 add, 빼기 sub, 곱하기 mul, 나누기 div
		//		정수1 num1 
		//		정수2 num2
		// 메뉴 선택 1, 2, 3, 4
		// 리턴값, 매개변수 있는 메서드 
		// 실수 값 출력은 소수 2자리까지
		
		/*
		정수1 입력 : 29  매개변수 전달
		정수2 입력 : 12  매개변수 전달
		--------------------
		두 수의 연산 선택
		--------------------
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		--------------------
		연산을 선택하시오 : 2
		
		결과 
		17
		*/
		int num1;
		int num2;
		int menu;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		System.out.println("------------");
		System.out.println("두 수의 연산 선택");
		System.out.println("------------");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("------------");
		
		System.out.print("연산을 선택하시오. :");
		menu = sc.nextInt();
		
		if(menu==1) { // 더하기 메소드 호출
			
				System.out.println(add(num1,num2));
		
		}
		else if(menu==2) { //뺴기
	
				System.out.println(sub(num1,num2));

		}
		else if(menu==3) { //곱하기

				System.out.println(mul(num1,num2));

		}
		else if(menu==4) { //나누기

				System.out.printf("%.2f\n", div(num1,num2));

		}
		else {
			System.out.println("1~4번 정수 중 입력해주세요.");
		}
		

	}// 메인메서드 끝

}//클래스 끝
//클래스 이름은 파스칼케이스 (첫글자 대문자)
//아래와 같은 것을 모듈형이라고 표현하기도 한다. 앞으로는 클래스를 가져다가 사용할 예정
class Babo { //클래스  // 클래스의 구성요소 '필드'와 '생성자','메서드' 이렇게 3가지가 대표적이다.
	//클래스 내부 변수 == '필드' => 클래스에서 사용하는 변수 
	//접근할 수 있느냐 없느냐에 따라서 나뉜다.
	private int cnt = 0; // 필드 => 변수 
	public int cnt2 = 0; // 필드 => 변수
	
	
	Babo babo = new Babo(); // 클래스의 인스턴스(객체1) = new 생성자()
	Babo moon = new Babo(); // 클래스의 인스턴스(객체2) = new 생성자()
	Babo jong = new Babo(); // 클래스의 인스턴스(객체3) = new 생성자()
	
	//호출해서 쓸 수 있는 메소드 선언
	static int fn1(int num) { //메서드 => 함수
		return num;
	}
}

//class Just{
//	
//}
//	Just just = new Just();

//앞으로는 클래스를 외부에서 아래와 같이 사용될 것이다.
//ex)클래스 이름.변수 
//ex)클래스 이름.메서드
