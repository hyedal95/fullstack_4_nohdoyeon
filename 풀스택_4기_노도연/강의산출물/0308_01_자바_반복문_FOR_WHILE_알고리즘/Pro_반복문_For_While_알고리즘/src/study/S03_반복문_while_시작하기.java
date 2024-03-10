package study;

public class S03_반복문_while_시작하기 {

	public static void main(String[] args) {
		/*(잘쓰면 프로그래머 개발자 능력이 높아질 수 있다.)
		# while문 시작하기 
		
		while(조건문) {
			화일문의 실행 범위(스코프 scope)

		}
 		*/
		
		// 1. 1~10까지 줄바꿈 없이 while(){} 출력
		// 조건문 비교연산 이하<=
		// 예시]
		// 1 2 3 4 5 6 7 8 9 10
		
		int cnt = 0;
		while(cnt <=10){	
			cnt++; //
			System.out.printf("%d ", cnt); // 
			
		}
		System.out.println();
		//출력 결과
		//1 2 3 4 5 6 7 8 9 10 11
		
		cnt = 1;
		while(cnt <=10){	
			
			System.out.printf("%d ", cnt); // 1~10
			cnt++; // 2~11
			
		}
		System.out.println();
		//출력 결과
		//1 2 3 4 5 6 7 8 9 10 
		
		
//		=====================================
		System.out.println();
		
		// 2. 1~10까지 줄바꿈 없이 while(){} 출력
		// 조건문 비교연산 미만 <
		// 예시]
		// 1 2 3 4 5 6 7 8 9 10
		
		cnt = 0;
		while(cnt <10){
			cnt++;			
			System.out.printf("%d ", cnt);
		}
		System.out.println();
		//출력 결과
		//1 2 3 4 5 6 7 8 9 10 
		
//		=====================================	
		System.out.println();
		// 3. 7~0까지 출력하기
		cnt=7;
		while(cnt >=0){
			System.out.printf("%d ", cnt); // 7~ 0
			cnt--; //6 ~0
		}
		System.out.println();
		//출력 결과
		//7 6 5 4 3 2 1 0
		
//		=====================================	
		System.out.println();
		// 4. 1 ~ 100까지 자연수의 sum(합)을 구하시오.
		cnt=1;
		int hap = 0;
		while(cnt<=100){
			hap+= cnt; // 1부터 누적  1 2 ... 100 
			cnt++;
			
		}
		System.out.println();
		System.out.printf("1~100까지 자연수의 합 : %d \n", hap);
		
		//출력 결과
		//1~100까지 자연수의 합 : 5050
		
//		=====================================
		System.out.println();
		// 화일문의 주의점 : 반복문의 무한루프에 빠지지 않도록 주의할 것! 
		// 5. 무한 반복문이용 5번 반복하고 종료 (강제종료) break 
		
		cnt=0;
		
		while(true) {
			cnt++;
			if(cnt>5) { 
				break; //강제종료
			}
				System.out.println(cnt);
		}
		//출력 결과
		//1
		//2
		//3
		//4
		//5

//		=====================================
		System.out.println();
		// 6. 무한반복문 구현해서
		//	-1~20까지의 홀수 출력하기  
		//	-20까지 출력 그리고 강제 종료
		
		cnt=0;
		
		while(true) {
			cnt++;
			
			if(cnt>20) {
				break;
			}
			//홀수 출력
			if(cnt%2 != 0) { // 나머지가 0이 아니면 홀수 
			System.out.printf("%d ",cnt);
			}
		}
		//출력 결과
		//1 3 5 7 9 11 13 15 17 19
		
	}
}
