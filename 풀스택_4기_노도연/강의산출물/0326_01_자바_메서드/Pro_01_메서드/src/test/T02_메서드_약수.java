package test;

import java.util.Scanner;

public class T02_메서드_약수 {
	
	// 1. 메서드 선언 
	static void fn1(int num) {
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.printf("%d 의 약수 : %d\n",num,i);
			}
		}
	}
	
	public static void main(String[] args) {
		// 키 입력으로 정수 입력하고
		// 입력된 정수의 약수를 구하는 메서드를 선언(fn1) 구현 
		// 리턴값 없는 메서드로 매개변수 1개 사용 선언 =>   리턴값 x 매개변수 o (정수) 
		// 2. 메서드 호출 실행
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력해주세요: ");
		int num = sc.nextInt();
		fn1(num);

	}

}
