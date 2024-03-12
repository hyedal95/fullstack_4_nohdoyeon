package study;

public class S02_1차원배열_선택정렬 {

	public static void main(String[] args) {
		//배열은 java에서 굉장히 중요하다.
		//성적처리 또는 석차 구할 때 필요! 배열은 무궁무진한 데이터 처리 가능
		//자료구조 선택정렬(Selection Sort), 삽입정렬, 버블정렬
		//선택정렬 => 내림차순 구현하기 
		
		int [] a = {10,15,30,12,14,64,71,15,45,32};
		
		
		System.out.println();
		System.out.println("배열 값 10개 출력");
		for(int i=0; i<a.length; i++) { //
			System.out.printf("a[%d] = %d\n", i ,a[i]);
		}
		
		/*
		    배열 값 10개 출력
			a[0] = 10
			a[1] = 15
			a[2] = 30
			a[3] = 12
			a[4] = 14
			a[5] = 64
			a[6] = 71
			a[7] = 15
			a[8] = 45
			a[9] = 32
		*/
		// 선택정렬?
		// i= 0  ~ 8(a.length-1)  => j= i+1 비교  (1~9)
		//내림차순(Descending)=> < 크다 
		//오름차순(Ascending)	=> > 작다
		
		//1. 내림차순
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					int imsi;
					imsi = a[i];
					a[i] =a[j];
					a[j] = imsi;
				}
			}
		}
		System.out.println();
		System.out.println("자료구조 선택정렬 내림차순 구현 후 출력");
		for(int i=0; i<a.length; i++) { //
			System.out.printf("a[%d] = %d\n", i ,a[i]);
		}
		
		/*
			자료구조 선택정렬 내림차순 구현 후 출력
			a[0] = 71
			a[1] = 64
			a[2] = 45
			a[3] = 32
			a[4] = 30
			a[5] = 15
			a[6] = 15
			a[7] = 14
			a[8] = 12
			a[9] = 10
		 */
		
		//2. 오름차순
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int imsi;
					imsi = a[i];
					a[i] =a[j];
					a[j] = imsi;
				}
			}
		}
		System.out.println();
		System.out.println("자료구조 선택정렬 오름차순 구현 후 출력");
		for(int i=0; i<a.length; i++) { //
			System.out.printf("a[%d] = %d\n", i ,a[i]);
		}
		/*
			자료구조 선택정렬 오름차순 구현 후 출력
			a[0] = 10
			a[1] = 12
			a[2] = 14
			a[3] = 15
			a[4] = 15
			a[5] = 30
			a[6] = 32
			a[7] = 45
			a[8] = 64
			a[9] = 71
		 */
	}

}
