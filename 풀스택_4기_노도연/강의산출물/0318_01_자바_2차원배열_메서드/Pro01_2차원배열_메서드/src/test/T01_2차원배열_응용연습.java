package test;

public class T01_2차원배열_응용연습 {

	public static void main(String[] args) {
		// 문제1] 2차원 배열 응용
		// 배열 변수 이름 a
		// 카운트 변수 이름 cnt  
		// 5행 5열
		// 1 0 0 0 0
		// 2 3 0 0 0
		// 4 5 6 0 0
		// 7 8 9 100 
		// 1112131415
		
		// 1단계 5행 5열 1~25까지
		
		// [문제] 알고리즘 구현
		// 1. 2차원 배열 선언
		// 2. 반복문 구현
		// 3. 카운트 배열에 카운트 넣기 
		// [출력]
		// 1. 반복문 구현
		// 2. print문 구현 출력
		
		int [][] a= new int[5][5];
		int cnt =0;
		
		for(int i=0; i<a.length; i++) { //5행 0 1 2 3 4
			for(int j=0; j<i+1; j++) {
				cnt++;
				a[i][j] =cnt; 
			}
		

		}
		
		for(int i=0; i<a.length; i++) { 
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		

	}

}
