package test;

public class T02_For_행열_알고리즘_삼각_우측기준_혼자연습 {

	public static void main(String[] args) {
		// 문제
		// 행열 알고리즘 아래 출력예시를 보고 구현하시오.
		// 행증가 열 카운트 감소 + 들여쓰기 증가
		// 들여쓰기	0      카운트 	5
		//			1				4
		//			2				3	
		//			3				2
		//			4				1
/*		
			01	02	03	04	05
				06	07	08	09
					10	11	12
						13	14
							15
*/
		
		//변수선언
		int cnt=0;
		
		for(int i=1; i<=10; i++) {
			//들여쓰기
			for(int j=1; j<=i-1; j++) {
				System.out.printf("%3s","");
			}
			//카운트 증가
			for(int j=1; j<=11-i; j++) {
				cnt++;
				System.out.printf("%02d ", cnt);
			}
			//줄바꿈
			System.out.println();
		}
		
		System.out.println();
		System.out.println("피라미드 역방향 구현하기");
		cnt=0;
		
		for(int i=1; i<=10; i++) {
			//들여쓰기
			for(int j=1; j<=i-1; j++) {
				System.out.printf("%3s", "");
			}
			//카운트 증가
			for(int j=1; j<=11-(i*2); j++) {
				cnt++;
				System.out.printf("%02d ", cnt);
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("피라미드 구현하기 -실패");
		
		cnt=0;
		int num=0;
		
		for(int i=1; i<=10; i++) { //10줄 
			//들여쓰기
			for(int j=1; j<=11-(i/2); j++) {
				System.out.printf("%3s","");
			}
			//카운트 증가
			for(int j=1; j<=i; j++ ) {
				cnt++;
				
				System.out.printf("%02d ", cnt);
			}
			System.out.println();
		}

	}

}
