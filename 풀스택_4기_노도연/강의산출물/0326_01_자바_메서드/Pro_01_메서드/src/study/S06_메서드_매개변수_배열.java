package study;

public class S06_메서드_매개변수_배열 {
	
	//1. 메서드 선언 : 평균점수 리턴값이 있는 메서드
	//				매개변수는 점수 3개를 배열로 전달받는다.
	
	static double avg(int[] arr ) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum/3.0;
	}

	public static void main(String[] args) {
		// 메서드 매개변수 배열처리
		int [] grade = {90,95,92};
 		double result = avg(grade);
 		System.out.println("성적처리 메서드 실행 결과");
		System.out.printf("평균점수 : %f\n",result);
		//결과
		//성적처리 메서드 실행 결과
		//평균점수 : 92.333333

	}

}
