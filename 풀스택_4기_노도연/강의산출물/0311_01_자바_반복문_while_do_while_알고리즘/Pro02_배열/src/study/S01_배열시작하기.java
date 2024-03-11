package study;

public class S01_배열시작하기 {

	public static void main(String[] args) {
		// 배열 Array 어레이   (어떤 기억의 장소) []
		// 배열 선언과 동시에 값을 설정하기 (초기화 값)
		// 숫자(정수) 10, 20, 30 3개의 값을 배열에 넣기
		
		//배열 선언과 초기화
		//int [] 변수 이름 = {값1, 값2, 값3}
		

		int [] a = {10,20,30};
		
		//a[0] => 배열 첫번째 기억장소 a[배열인수 index]
		//a[1] => 배열 두번째 기억장소 a[배열인수 index]
		//a[2] => 배열 세번째 기억장소 a[배열인수 index]
	
		System.out.println();
		System.out.println("배열의 주소값 가져오기");
		System.out.printf("배열길이  =%d \n" ,a.length);
		System.out.printf("a[0] 의 값%d \n" ,a[0]);
		System.out.printf("a[1] 의 값%d \n" ,a[1]);
		System.out.printf("a[2] 의 값%d \n" ,a[2]);
		System.out.println();
		

		//배열의 주소값 가져오기
		//배열길이  =3 
		//a[0] 의 값10 
		//a[1] 의 값20 
		//a[2] 의 값30 
		
		// 반복문 구현
		
		for(int i=0; i<a.length; i++) { //3미만은 2까지 
			System.out.printf("a[%d] = %d \n", i , a[i]);
		}


	}

}
