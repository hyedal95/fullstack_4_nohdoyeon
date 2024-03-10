package test;

public class T04_For_행열_알고리즘_피라미드 {

	public static void main(String[] args) {
		// 5행 5열 행열 알고리즘
		// 피라미드 구현
		// 정수 2자리 빈칸 1칸 =>  "%2d "
		// 1행 들여쓰기 2칸
		// 2행 들여쓰기 1칸
		// 3행 들여쓰기 0칸
		/*
		  		1		
			2	3	4	
		5	6	7	8	9

		 */
		//1-1. 피라미드 구현
		
		int cnt=0;
		for(int i=1; i<=3; i++) {
			//1. 들여쓰기 3-1 =2 3-2=1 3-3=0
			for(int j=1; j<=3-i; j++) {
				System.out.printf("%3s", "");
			}
			//2. 카운트 증가 (i*2)-1 =1 | (2*2)-1 == 1+2(3) | (3*2)-1 ==  1+2+2(5) 
			//   증가 값 변화를 규칙적으로 예측 => 수열
			for(int j=1; j<=(i*2)-1; j++) {
				cnt++;
				System.out.printf("%02d ", cnt);
			}
			System.out.println();
		}
		
		//1-2. 피라미드 구현
		cnt=0;
		int step=-1; //2씩 증가하면서 1행의 값이 1이 되려면 초기값은?
		
		for(int i=1; i<=3; i++) {
			//step
			step+=2;
			
			//1. 들여쓰기 
			for(int j=1; j<=3-i; j++) {
				System.out.printf("%3s", "");
			}
			//2. 카운트 증가 
			//   증가 값 변화를 규칙적으로 예측 => 수열(-1) 1 3 5 2씩 증가
			for(int j=1; j<=step; j++) {
				cnt++;
				System.out.printf("%02d ", cnt);
			}
			System.out.println();
			
		}
		
		//1-3.피라미드구현 -> 다이아몬드 변형
		cnt=0;
		step=-1;
		
		for(int i=1; i<=3; i++) {
			//들여쓰기
			for(int j=1; j<=3-i; j++){
				System.out.printf("%3s","");
			}
			//카운트증가
			for(int j=1; j<=step; j++) {
				cnt++;
				System.out.printf("%2d ", cnt);
				
			}
			System.out.println();
		}
		
		
	}

}
