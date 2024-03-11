package study;

import java.util.Scanner;

public class S01_반복문_for_기사_1_7_행열_scanner {

	public static void main(String[] args) {
		// 문제] 
		// 기사문제 1 ~ 7 숫자를 이용 7행 7열 모래시계 구현
		/*
		  
		  1 2 3 4 5 6 7
		    2 3 4 5 6
		      3 4 5
		        4
		      3 4 5
		    2 3 4 5 6
		  1 2 3 4 5 6 7
		 
		 */
		
		//문제 접근을 위한 수정 단계를 '디버깅'단계 라고 한다.
		//분석 설계 기획 디버깅
		//디버깅 단계를 거쳐라!!!
		//0단계. 7 * 7 줄바꿈 없이
		//1단계. 7 * 7 줄바꿈 구현 카운트 1~7 다음행 초기화
		//2단계. 들여쓰기 구현
		//3단계. 카운트 행 증가하면, 1씩 증가 행과의 관계
		//4단계. [center = 4행]기점으로 반대로 구현된다. 행 증가하면서 카운트 감소
		
		int cnt=0;
		int indent;
		int row;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("행을 입력하세요! ");
		row = sc.nextInt();
		
		
		int count= (int)row+2;
		int center = (int)(row+1)/2;
		
		for(int i=1; i<=row; i++) {
			cnt=0;
			
			if(i<=center) {
				count-=2;
				indent=i-1;
			}else {
				count+=2;
				indent=row-i;
			}
			
			//들여쓰기 0 1 2 3 else 7-i 2 1 0
			for(int j=1; j<=indent; j++) {
				System.out.printf("%2s", "");
			}
			
			//카운트 7 5 3 1  else 3 5 7
			for(int j=1; j<=count; j++) {
				cnt++;
				System.out.printf("%d ", cnt);
			}
			System.out.println();
		}

		
		 
		
		
	}

}
