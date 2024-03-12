package study;

public class S03_1차원배열_생성자방식선언 {

	public static void main(String[] args) {
		// 자료형[] 배열이름  = {배열값}; 1.리터럴방식
		
		// 1차원 배열 생성자 방식 선언  
		// 배열 길이 5개 공간을 생성
		// int [] arr= new int[5]; 2.생성자방식
		// "리터럴 방식은 주로 test연습할 때 쓰이고,
		// 주로 생성자 방식으로 쓰인다."
		
		
		int [] arr= new int[5];
		
		// 배열에 값 입력(대입)
		arr[0] = 80;
		arr[1] = 70;
		arr[2] = 60;
		arr[3] = 85;
		arr[4] = 95;
		
		System.out.println("배열[인덱스] 값 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("점수[%d] = %d\n" , i, arr[i]);
		}
		
//		석차 = 1; 
//		석차(Rank) 구하기 본인 점수가 1등이야? 나보다 큰 점수 있니? 그럼 '석차+=1'
//		점수[0] = 80  석차 몇 등? 3 
//		점수[1] = 70  석차 몇 등? 4
//		점수[2] = 60  석차 5
//		점수[3] = 85  석차 2
//		점수[4] = 95  석차 1
		
		//석차 출력해보기!
		
		
		
	}

}
