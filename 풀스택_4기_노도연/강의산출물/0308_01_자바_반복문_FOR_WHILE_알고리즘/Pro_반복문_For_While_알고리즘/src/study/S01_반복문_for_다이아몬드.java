package study;

public class S01_반복문_for_다이아몬드 {

	public static void main(String[] args) {
		// 알고리즘 다이아몬드(마름모꼴) 모형 구현
		// for 문 사용 
		// 5행5열 이용 알고리즘
		
		// 구현 예측과정 '디버깅' => 행열 변화를 분석
		// 1행 2열 들여쓰기 => 카운트 1 2씩 증가 (step 초기값 -1 + 2 = 1)
		// 2행 1열 들여쓰기 => 카운트 3 2씩 증가 (1 + 2 =3)
		// 3행 0열 들여쓰기 => 카운트 5 2씩 감소 (3 + 2 =5)   =>> 조건문 중심기준으로 이전에는 2증가 이후에는 2감소 (IF문 사용)
		// 4행 1열 들여쓰기 => 카운트 3 2씩 감소 (5 - 2 =3)
		// 5행 2열 들여쓰기 => 카운트 1 2씩 감소 (3 - 2 =1)

		// 예시]
/*			
 			 1				1회 들여쓰기 2칸
 		 2	 3	 4			3회 들여쓰기 1칸
 	 5	 6	 7	 8	 9		5회 들여쓰기 0칸
 		10	11	12			3회 들여쓰기 1칸
 			13				1회 들여쓰기 2칸 

 */

		
		int cnt=0;
		int step=-1; // 카운트 반복문
		int indent; // 들여쓰기
		
		for(int i=1; i<=5; i++) { //행 5회 반복
			
			if(i<=3) { //  1행 2행 3행 
				step+=2;
				indent = 3-i;
			}
			else { // 4행 5행 
				step-=2;
				indent = i-3;	
			}
		
			//들여쓰기
			for(int j=1; j<=indent; j++) { 
				System.out.printf("%3s", "");
			}
			//카운트
			for(int j=1; j<=step; j++) {
				cnt++;
				System.out.printf("%2d ", cnt);
			}
			System.out.println();
		}

	}

}

