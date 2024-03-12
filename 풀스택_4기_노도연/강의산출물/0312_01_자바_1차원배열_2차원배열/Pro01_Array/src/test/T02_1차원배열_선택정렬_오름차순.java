package test;

public class T02_1차원배열_선택정렬_오름차순 {

	public static void main(String[] args) {
		// 1차원배열_선택정렬_오름차순
		
		//1. 배열 정수 값 10개 지정
		
		int [] arr = {15,16,67,84,97,94,67,18,67,76};
		
		//2. 배열 값 for문 사용해서 출력해보기
		System.out.println("배열 값 for문 사용해서 출력해보기");
		for(int i=0; i<arr.length; i++) { // arr[0]부터 arr[10미만(9)]까지
			System.out.printf("arr[%d] = %d\n" , i,arr[i]);
		}
		
		//3. 선택정렬 오름차순 
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp =arr[i]; // 임시 변수 temp에 arr[i] 값 넣기
					arr[i] =arr[j]; // arr[j] 값 arr[i]값에 넣기
					arr[j] =temp; //arr[i] 값을 저장해놓은 변수인 temp값을 arr[j]공간에 넣기
				}
			}
		}
		System.out.println("배열 선택정렬 오름차순 출력하기");
		for(int i=0; i<arr.length; i++) { // arr[0]부터 arr[10미만(9)]까지
			System.out.printf("arr[%d] = %d\n" , i,arr[i]);
		}
	}

}
