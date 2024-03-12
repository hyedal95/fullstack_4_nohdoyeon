package study;

public class S01_1차원배열 {

	public static void main(String[] args) {
		// 1차원 배열 선언 정수 값 5개 
		// 자료형[] 배열이름  = {배열값}; 리터럴방식 
		int [] arr = {10,20,30,40,50};
		
		
		// 배열의 길이 length  ==> javaScript 방식 똑같다 (선언만 다르다) 
		System.out.println();
		System.out.println("배열의 길이 length");
		System.out.printf("arr.length : %d \n", arr.length);
		System.out.println();
		
		//< 출력 결과 >
		//배열의 길이 length
		//arr.length : 5
		
		// 배열의 값을 출력하기 
		// arr[인덱스번호]  => index number => 0 ~ 4 
		//				(0부터 시작 배열 길이가 5이기에 (5-1=4) 까지)
		
		System.out.println();
		System.out.println("배열[index] 값 출력하기");
		System.out.printf("arr[%d] = %d\n", 0, arr[0]);
		System.out.printf("arr[%d] = %d\n", 1, arr[1]);
		System.out.printf("arr[%d] = %d\n", 2, arr[2]);
		System.out.printf("arr[%d] = %d\n", 3, arr[3]);
		System.out.printf("arr[%d] = %d\n", 4, arr[4]);
		System.out.println();
		
		//< 출력 결과 >
		//배열의 값 출력하기
		//arr[0] = 10
		//arr[1] = 20
		//arr[2] = 30
		//arr[3] = 40
		//arr[4] = 50
		
		//배열의 값을 수정하기
		arr[0] = 15;
		arr[1] = 25;
		
		//배열의 값 변경 출력하기
		//2개의 값만 변경
		System.out.println();
		System.out.println("배열의 값 변경 출력하기");
		int i =-1;
		while(i<4) { //-1 0 1 2 3 
			i++; //  0 1 2 3 4
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		//< 출력 결과 >
		//배열의 값 변경 출력하기
		//arr[0] = 15
		//arr[1] = 25
		//arr[2] = 30
		//arr[3] = 40
		//arr[4] = 50
		
		//배열 교환
		//두번째 배열(arr[1]) 값을  다섯번째 배열(arr[4])에 저장하기
		//맞교환은 1개가 삭제된다. 그래서 임시 변수가 필요하다.
		//arr[1] = arr[4]; => 2번째 값은 다섯번째 값으로 채워진다. 이전 값은 지워진다.
		
		int imsi; //임시변수명으로 주로 'imsi' 또는 'temp'가 많이 쓰인다. 
		imsi =arr[1];
		arr[1] = arr[4];
		arr[4] =imsi;
		
		System.out.println();
		System.out.println("배열의 값 교환 출력하기");
		i =-1;
		while(i<4) { //-1 0 1 2 3 
			i++; //  0 1 2 3 4
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		//< 출력 결과 >
		//배열의 값 교환 출력하기
		//arr[0] = 15
		//arr[1] = 50
		//arr[2] = 30
		//arr[3] = 40
		//arr[4] = 25
		
		//배열 내림차순 정렬 
		//for문 사용
		//교환만 하는 경우 결과는 오름차순이 된다.
		
		for(i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
//				System.out.println("비교값"+ arr[i]);
				if(arr[i]<arr[j]) { //15 보다 50
					imsi =arr[i];
					arr[i] = arr[j];
					arr[j] =imsi;
//					System.out.println("출력값"+ arr[j]);
				}
			}
				
		}
		
		System.out.println();
		System.out.println("배열 내림차순 출력하기");
		//내림차순 교환 출력
		i =-1;
		while(i<4) { //-1 0 1 2 3 
			i++; //  0 1 2 3 4
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		
//		배열 내림차순 출력하기
//		arr[0] = 15
//		arr[1] = 25
//		arr[2] = 30
//		arr[3] = 40
//		arr[4] = 50
		
		//배열 오름차순 출력하기
		
		//배열 오름차순 정렬		
				
		for(i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
//						System.out.println("비교값"+ arr[i]);
				if(arr[i]>arr[j]) { //15 보다 50
					imsi =arr[i];
					arr[i] = arr[j];
					arr[j] =imsi;
//							System.out.println("출력값"+ arr[j]);
				}
			}
				
		}
		
		System.out.println();
		System.out.println("배열 오름차순 출력하기");
		//오름차순 교환 출력
		i =-1;
		while(i<4) { //-1 0 1 2 3 
			i++; //  0 1 2 3 4
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		
//		배열 오름차순 출력하기
//		arr[0] = 50
//		arr[1] = 40
//		arr[2] = 30
//		arr[3] = 25
//		arr[4] = 15

		//자료구조 선택정렬(Selection Sort), 삽입정렬, 버블정렬


	}

}
