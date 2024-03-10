package test;

public class T03_For_행열_알고리즘_4행3열_3행4열 {

	public static void main(String[] args) {
		// 문제1
		// 4행 3열    ==>    3열 4행
		//01 02 03   =>   01 02 03 04 
		//04 05 06   =>   05 06 07 08
		//07 08 09   =>   09 10 11 12
		//10 11 12
		
		System.out.println();
		System.out.println("4행3열");
		int cnt=0;
		
		for(int i=1; i<=4; i++) { //4행
			
			for(int j=1; j<=3; j++) {
				cnt++;
				System.out.printf("%02d ", cnt);
			}
			System.out.println();
		}
/*		결과값
		4행3열
		01 02 03 
		04 05 06 
		07 08 09 
		10 11 12 
*/		
		
		System.out.println();
		System.out.println("3행4열");
		cnt =0; //변수 초기화
		
		for(int i=1; i<=3; i++) { //3행
			
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.printf("%02d ", cnt);
			}
			System.out.println();
		}
/*		결과값
		3행4열
		01 02 03 04 
		05 06 07 08 
		09 10 11 12
*/
	}

}
