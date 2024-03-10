package test;

public class T05_For_행열_알고리즘_다이아몬드 {

	public static void main(String[] args) {
		// 다이아몬드 구현하기
		// 			01
		//		 02 03 04
		//    05 06 07 08 09
		//       10 11 12
		//          13
		
		int cnt=0;
		int step=-1;
		
		
		
		for(int i=1; i<=5; i++) {
			if(i<=3) {	
				step+=2;
				//들여쓰기 2 1 0 
				for(int j=1; j<=3-i; j++) {
					System.out.printf("%3s", "");
				}
				//카운트 1 3 5 7 9
				for(int j=1; j<=step; j++) {
					cnt++;
					System.out.printf("%02d ", cnt);
				}
			}
			else {
				step-=2;
				//들여쓰기 2 1 0 
				for(int j=1; j<=i-3; j++) {
					System.out.printf("%3s", "");
				}
				//카운트 1 3 5  
				for(int j=1; j<=step; j++) {
					cnt++;
					System.out.printf("%02d ", cnt);
				}
			}
				
			System.out.println();
		}

	}

}

//if문 3이하까지는 
//나머지 else 2씩 감소 

