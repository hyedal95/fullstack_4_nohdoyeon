package test;

import java.util.Scanner;

public class T02_메서드응용_소수 {
	// 1.소수 메서드 선언
	static boolean prime(int num) {
		boolean value =true;
		if(num ==1) {
			value =false;
		}
		else {
			for(int i=2; i<num; i++) {
				if(num % i ==0) {
					value =false;
				}
			}
		}
		return value;
	}
	public static void main(String[] args) {
		// 2. 메서드 출력
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력");
		num = sc.nextInt();
		
		System.out.println();
		System.out.println("소수 출력");
		for(int i=1; i<=num; i++) {
			if(prime(i)==true) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();

	}

}
