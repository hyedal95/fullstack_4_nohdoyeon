package homework;

import java.util.Scanner;

public class H02_java_다이아몬드_알고리즘_구현2_Scanner응용버전 {

	public static void main(String[] args) {
		//다이아몬드 알고리즘 구현
		//5행 5열
		//알고리즘 분석  
		//1행 들여쓰기 2칸 카운트 1
		//2행 들여쓰기 1칸 카운트 3
		//3행 들여쓰기 0칸 카운트 5
		//4행 들여쓰기 1칸 카운트 3   ---> 센터
		//5행 들여쓰기 2칸 카운트 1
		//예시]
/*				1
 * 			2	3	4
 * 		5	6	7	8	9
 * 			10	11	12
 * 				13
 */
		
		int cnt=0;
		int step=-1;
		int end;  //end값 선언
		int row;
		int center;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("홀수 행을 입력하세요");
		row = sc.nextInt();
		center =(int)(row/2)+1;
		
		for(int i=1; i<=row; i++) { // 5줄(행)
			
			if(i<=center) {     
				step+=2;
				end =center-i;
				
			}
			else {
				step-=2;
				end =i-center;
			}
			
			
			//1.들여쓰기 1행(3-i(1)=2) 2행( 3-i(2)=1) 3행(3-i(3)=0) else 4행 ( (i)4-3=1) 5행 ((i)5-3 =2)  
			for(int j=1; j<=end; j++) {
				System.out.printf("%3s", "");
			}
			//2.카운트 증가 // step  초기화값 -1+(1행 +2) =1 /  1+(2행 +2) =3 / 3+(3행 +2) =5 else 4행(5-2=3)  5행 (3-2=1)
			for(int j=1; j<=step; j++) {
				cnt++;
				System.out.printf("%2d ", cnt);
			}
			System.out.println();
		}
	}

}
