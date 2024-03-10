package study;

public class S01_For_행열_알고리즘_삼각_우측기준 {

	public static void main(String[] args) {
		// 행열 알고리즘
		// 화면 줌인 ( ctrl + shift + [+] |[-])

		// 줄 지우기 CTRL+ D  되돌리기 CTRL+Z 다시 실행 CTRL+Y 
		// sysout ctrl + 스페이스바 + enter 눌르면  System.out.println();

		// 실행 => CTRL + F11
		// 1. 5칸씩 출력하고 줄바꿈
		System.out.println();
		System.out.println("1. 5칸씩 출력하고 줄바꿈");
		System.out.println();
		int cnt=0;
		
		for(int i=1; i<=5; i++) { //5행(줄) 반복
			for(int j=1; j<=5; j++) { //5(열)칸 1 2 3 4 5 5칸이 생기면 1줄이 생기는 식으로 반복 
				cnt+=1;
				System.out.printf("%2d ", cnt);
			}
			System.out.println(); // 줄나눔
		}
/*
		 1  2  3  4  5 
		 6  7  8  9 10 
		11 12 13 14 15 
		16 17 18 19 20 
		21 22 23 24 25
*/
		// 2. 줄바꿈없이 1행에 모두 출력
		System.out.println();
		System.out.println("2. 줄바꿈없이 1행에 모두 출력");
		System.out.println();
		
		cnt=0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				cnt+=1;
				System.out.printf("%2d ", cnt);
			}
		}
		
		//1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		
		// 줄 단위 복사 => 해당줄에서 CTRL + ALT+ ↓ ('ㅁ' + 한자키)
		
		// 3-1. 좌측 기준 삼각형 알고리즘구현

		

/*
							1
						2	3
					4	5	6
				7	8	9	10
			11	12	13	14	15

 */
		System.out.println();
		System.out.println("3-1. 좌측 기준 삼각형 알고리즘구현 ");
		System.out.println();
		
		//들여쓰기 없이 출력
		cnt=0;
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				cnt++;
				System.out.printf("%2d ", cnt);
			}
			System.out.println();
		}
/*
		 1 
		 2  3 
		 4  5  6 
		 7  8  9 10 
		11 12 13 14 15
*/
		// 3-2. 우측 기준 삼각형 알고리즘구현
		//		- 들여쓰기 하고
		//		- 카운트 증가 출력
		// 들여쓰기방법:
		//		줄이 증가하면 칸이 감소
		//		첫줄 4칸 들여쓰기 후 카운트 출력
		//		첫줄 3칸 들여쓰기 후 카운트 출력
		//		첫줄 2칸 들여쓰기 후 카운트 출력
		//		첫줄 1칸 들여쓰기 후 카운트 출력
		//		첫줄 0칸 들여쓰기 후 카운트 출력
		// 카운트 증가방법:
		//		줄번호를 칸번호와 일치 시킨다.
		//		행증가 => 칸증가 줄 증가하면 칸이 증가한다.
		System.out.println();
		System.out.println("3-2. 우측 기준 삼각형 알고리즘구현 ");
		System.out.println();
		
		cnt=0; //cnt 초기화
		
		for(int i=1; i<=5; i++) {
			//들여쓰기
			for(int j=1; j<=5-i; j++) {
				System.out.printf("%3s", ""); //3칸 공백(문자열) %3s == %2s(공백)
			}
			//카운트 증가
			for(int j=1; j<=i; j++) {
				cnt++;
				System.out.printf("%2d ", cnt);
			}
			System.out.println();
		}
/*
						1 
					 2  3 
				  4  5  6 
			   7  8  9 10 
		   11 12 13 14 15 
*/

	}

}
