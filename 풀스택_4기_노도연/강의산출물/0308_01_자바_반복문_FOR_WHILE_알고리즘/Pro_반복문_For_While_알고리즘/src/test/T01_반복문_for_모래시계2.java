package test;

import java.util.Scanner;

public class T01_반복문_for_모래시계2 {

	public static void main(String[] args) {
		// 모래시계 모양 구현
		// 문제] 7행 7열 모래 시계 구현하시오.
		// 우선 1차 
		
		// 예시]
/*				1	2	3	4	5	6	7
 * 					8	9	10	11	12
 * 						13	14	15
 * 							16
 * 						17	18	19	
 * 					20	21	22	23	24
 * 				25	26	27	28	29	30	31
 * 				
 * 
 * 
 */
		int cnt=0;
		int step;    
		int end;
		int row;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행을 입력하세요.");
		row = sc.nextInt();
		
		step = row+2; // 7+2 =9
		int center = (int)(row/2)+1;
		
		System.out.println();
		
		
		for(int i=1; i<=row; i++) { //7행
			
			if(i<=center) {
				step-=2;
				end= i-1; // 0 1 2 3
			}
			else {
				step+=2;
				end= row-i; // 7-5 = 2 , 7-6= 1 , 7-7= 0 => 2 1 0
			}
			
			
			//들여쓰기 1행 0 2행 1 3행 2 4행 3        else=>   5행 2 6행 1 7행 0
			for(int j=1; j<=end; j++) {
				System.out.printf("%3s", "");
			}
			//카운트 1행 7 2행 5 3행 3 4행 1         else => 5행 3 6행 5 7행 7
			for(int j=1; j<=step; j++) {
				cnt++;
				System.out.printf("%2d ", cnt);
			}
			System.out.println();
		}
		

	}

}
