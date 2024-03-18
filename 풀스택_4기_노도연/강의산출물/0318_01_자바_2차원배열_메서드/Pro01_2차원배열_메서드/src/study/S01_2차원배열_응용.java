package study;

public class S01_2차원배열_응용 {

	public static void main(String[] args) {
		// 문제1] 2차원 배열 응용
		// 배열 변수 이름 a
		// 카운트 변수 이름 cnt  
		// 5행 5열
		// 0 0 0 0 1
		// 0 0 0 2 3
		// 0 0 4 5 6
		// 0 7 8 9 10
		// 1112131415
		
		// 1단계 5행 5열 1~25까지
		
		// [문제] 알고리즘 구현
		// 1. 2차원 배열 선언
		// 2. 반복문 구현
		// 3. 카운트 배열에 카운트 넣기 
		// [출력]
		// 1. 반복문 구현
		// 2. print문 구현 출력
		System.out.println("풀이1 1~25까지 ");
		int [][] arr = new int[5][5]; 
		int cnt =0;
		
		// [풀이1] 1~25
		// [입력문]
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				cnt++;
				arr[i][j] =cnt;
			}
		}
		// [출력문]
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				cnt++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();

		}
//		풀이1 1~25까지 
//		  1  2  3  4  5
//		  6  7  8  9 10
//		 11 12 13 14 15
//		 16 17 18 19 20
//		 21 22 23 24 25
		
		System.out.println("풀이2 1~15까지 ");
		arr = new int[5][5]; 
		cnt =0;
		// [풀이2] 1~15
		// [입력문]
		
		for(int i=0; i<arr.length; i++) {
			for(int j=4-i; j<arr[i].length; j++ ) { 
				cnt++;
				arr[i][j] =cnt;
			}
		}
		
		// [출력문]
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				cnt++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();

		}
//		풀이2 1~15까지 
//		  0  0  0  0  1
//		  0  0  0  2  3
//		  0  0  4  5  6
//		  0  7  8  9 10
//		 11 12 13 14 15
		

		
		
		
		
		


	}

}	