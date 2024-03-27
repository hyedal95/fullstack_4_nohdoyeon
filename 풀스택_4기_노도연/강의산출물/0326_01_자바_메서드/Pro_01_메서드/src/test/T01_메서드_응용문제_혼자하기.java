package test;

import java.util.Scanner;

public class T01_메서드_응용문제_혼자하기 {
	//1. 메서드 선언
	static void fn1(int num) {
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d. 리턴값 없는 메서드 실행\n", i+1);
		}
	}

	public static void main(String[] args) {
		// 문제1]
		// - 메서드이름은 fn1(int 정수형 전달)
		// - 리턴값 없는 메서드를 호출 실행
		// - 키보드 입력값을 변수로 입력 매개변수로 전달 3(정수) 값 만큼 반복 출력 for문 
		// - 출력은 문자열 자유 예시] 
		// " 1. 리턴값 없는 메서드 실행"
		// " 2. 리턴값 없는 메서드 실행"
		// " 3. 리턴값 없는 메서드 실행"
		
		// 2.호출실행
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수를 입력해주세요 : ");
		int num = sc.nextInt();
		fn1(num);

	}

}
