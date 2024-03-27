package test;

import java.util.Scanner;

public class T01_알고리즘_소수 {

	public static void main(String[] args) {
		// 알고리즘 소수 키 입력으로 1~ num까지 
		
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 정수까지의 소수 출력하기");
		System.out.println("정수를 입력하세요.");
		num = sc.nextInt();
		boolean a =true;
		for(int i=1; i<=num; i++) {
			a = true;
			if(i ==1 ) a= false;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					a = false;
				}
			}
			if( a== true) {
				System.out.printf("%d ", i);
			}
		}

	}

}
