package test;

import java.util.Scanner;

public class T03_메서드_소수_평가과제물 {
	
	//1. 소수 메서드 선언
	static void fn1(int num) {
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.printf("%d 의 약수 : %d\n", num, i);
				System.out.println(i);
				if(i==1 && num==i) { //약수가 1과 본인 자신의 수일 경우에만 소수
					System.out.printf("%d 는 소수입니다. ",num);
				}
			}
		}
	}

	public static void main(String[] args) {
		// 소수 메서드 만들기 
		// 키 입력으로 정수입력하고
		// 입력된 정수의 소수를 구하는 메서드를 선언(fn1) 구현
		// 리턴값 없는 메서드로 매개변수 1개 사용 선언 => 리턴값 x 매개변수 o 
		
		//2. 메서드 호출 실행
		Scanner sc =new Scanner(System.in);
		System.out.print("정수를 입력하세요! :");
		int num = sc.nextInt();
		fn1(num);

	}

}
