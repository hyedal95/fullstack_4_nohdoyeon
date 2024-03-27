package study;

import java.util.Scanner;

public class S01_메서드응용_소수 {
	
	// 1. 소수 메서드 선언
	static boolean prime(int num){
		boolean value = true; // 모든 소수 true 정해주고, 판별 true 이면 소수 false 소수아니다.
		if(num ==1) { //1이면 출력하지 않는다.
			value = false;
		}
		else{
			for(int i=2; i<num; i++) { // < 미만 쓰는 이유 자신의 수는 제외시킴
				if(num % i ==0) { // true면 소수고 false면 소수가 아니다.
					value = false;
				}
			}
		}
		return value; //소수면 출력한다.
	}
	

	public static void main(String[] args) {
		// 문제] 알고리즘 : 
		// 소수	=> 1과 자신만을 약수(나누어서 0으로 떨어지는 수)로 가지는 수
		// 		=> 1과 자신외에 약수가 존재하면 소수가 아니다. false로 판별
		// 예] 1 ~ 10까지 소수만 출력하라
		//		1과 10을 제외한 수를 나누어 나머지가 0이면 소수가 아니다.
		// 		2 3 4 5 6 7 8 9 분모
		// 		단, 메서드를 이용 문제를 해결하라. 
		// 1단계] 메서드 없이 반복문, 조건을 이용 소수를 구하라.
		// 2단계] 메서드 이용 소수(prime)를 출력하라.
		//		 리턴값이 있는 메서드

		// 2. 메서드 호출 => 반복문 이용
		System.out.println("");
		System.out.println("소수 출력");
//		System.out.println("소수 결과 논리값");
//		System.out.println(prime(11));
		for(int i=1; i<=50; i++) { //1부터 50까지의 숫자 들어감. 
			if(prime(i)==true) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		
		//결과
//		소수 출력
//		2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
		
	}

}
