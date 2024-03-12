package study;

public class S04_1차원배열_석차_알고리즘 {

	public static void main(String[] args) {
		
		//석차 알고리즘 구현하기
		//점수 이용해서 석차 구하기 (성적이 클수록 석차 1) 
		
		//1. 리터럴 방식 평균점수 배열 5개 값 선언 
		int [] avg = {91,98,77,79,60}; 	// 평균 점수
		//2. 생성자 방식 석차 배열 5개 공간 선언 
		int [] rank = new int[5]; 		// 석차 저장될 배열
		int suk; 						// 석차 증가 변수 선언
		
		for(int i=0; i<avg.length; i++) { //내 점수
			suk = 1; // 나를 1등으로 본다. 내점수 나오면 (줄 바뀌면) 초기화
			for(int j=0; j<avg.length; j++) { //우리 반 전체
				if(avg[i]<avg[j]) { //avg[i]는 내점수 avg[j]는 우리반 전체
//					나보다 더 크니? 그럼 석차는 증가한다.
					suk++;
				}
			}
			rank[i] = suk; //rank[i] 값에 석차를 넣어줘라!  == 석차를 배열에 저장
		}
		//석차 구현 후 출력
		System.out.println();
		System.out.println("석차를 배열에 저장 후 출력");
		for(int i=0; i<avg.length; i++) {
			System.out.printf("평균점수 = %3d 석차 =[%d]등\n", avg[i], rank[i]);
		}
		System.out.println();
		
//		평균점수 = 91 석차 =[2]등
//		평균점수 = 98 석차 =[1]등
//		평균점수 = 77 석차 =[4]등
//		평균점수 = 79 석차 =[3]등
//		평균점수 = 60 석차 =[5]등
		
	}

}
