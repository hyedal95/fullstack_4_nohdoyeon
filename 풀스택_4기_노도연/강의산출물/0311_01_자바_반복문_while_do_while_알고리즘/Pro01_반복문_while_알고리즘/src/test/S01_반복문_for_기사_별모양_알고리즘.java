package test;

public class S01_반복문_for_기사_별모양_알고리즘 {

	public static void main(String[] args) {
		// 문제] 
		// 별 모양을 이용 7행 7열 아래와 같은 모양으로 출력
		/*
		  
		  * * * * * * *
		    * * * * *
		      * * *
		        *
		      * * *
		    * * * * *
		  * * * * * * *
		 
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
		int indent=0;
		int step= 9;
		
		for(int i=1; i<=7; i++) {
			
			//중앙을 기준으로 들여쓰기 indent j 값 조건문 구현
			if(i<=4) {  
				step-=2; //  7칸 5칸 3칸 1칸 => 칸 반복 횟수 결정 
				indent=i-1; // 0 1 2 3
			}else {
				step+=2; // 3칸 5칸 7칸
				indent=7-i; // 7-5(i 행) =2, 7-6(i행) =1 , 7 -7(i행) =0  => 2 1 0
			}
			
			cnt =indent;
			//들여쓰기 0 1 2 3 else 7-i 2 1 0
			for(int j=1; j<=indent; j++) {
				System.out.printf("%2s", "");
			}
			
			//카운트 7 5 3 1  else 3 5 7
			for(int j=1; j<=step; j++) {
				cnt++;
				System.out.printf("%s ", "*");
			}
			System.out.println();
		}


	}

}
