package study;

public class S02_반복문_while_기사_1_7_행열 {

	public static void main(String[] args) {
		// 문제]  while 문 활용해서 문제 풀기
		// while문은 초기화 시키는 것이 가장 중요하다.
		// for문과 while문의 차이점을 잘 파악해보기 
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
		int indent=0;
		int step= 9;
		int i=0;
		int j=0;
		
		while(i<7) {
			i++; //1 ~7
			
			//중앙을 기준으로 들여쓰기 indent j 값 조건문 구현
			if(i<=4) {  
				step-=2; //  7칸 5칸 3칸 1칸 => 칸 반복 횟수 결정 
				indent=i-1; // 0 1 2 3
			}else {
				step+=2; // 3칸 5칸 7칸
				indent=7-i; // 7-5(i 행) =2, 7-6(i행) =1 , 7 -7(i행) =0  => 2 1 0
			}
			//들여쓰기
			j=0;
			while(j<indent) {
				j++;
				System.out.printf("%2s", "");
			}
			//카운트 => 칸을 반복 
			cnt =indent;
			j=0;
			while(j<step) {
				j++; //칸을 반복 : 7, 5, 3, 1, 3 , 5 , 7 
				cnt++; // 카운트 증가 
				System.out.printf("%d ", cnt);
			}
			System.out.println();
		}
	}
}
