package study;

public class S03_반복문_do_while {

	public static void main(String[] args) {
		// 반복문 for, while, do-while
		// do while()
		// 특징 : 조건이 뒤에 있다.
		// 1~10 줄바꿈 없이 출력해보세요! 
		
		// 1.while()문 구현
		System.out.println();
		System.out.println("1.while()문 구현");
		
		int cnt =0;
		while(cnt<10) { // 0 1 2 3 4 5 6 7 8 9 
			cnt++; // 1 2 3 4 5 6 7 8 9 10 
			System.out.printf("%d ", cnt);
			
		}
		
//		결과
//		1.while()문 구현
//		1 2 3 4 5 6 7 8 9 10
		

		// 2.do -while()문 구현 - 조건이 뒤에 있다. 
		System.out.println();
		System.out.println();
		System.out.println("2.do -while()문 구현");

		cnt=0; // cnt 값 초기화
		do {
			cnt++;
			System.out.printf("%d ", cnt);
		}while(cnt<10);
		
//		결과
//		2.do -while()문 구현
//		1 2 3 4 5 6 7 8 9 10 
		
		// 3. while(){} 문과 차이 비교
		// 조건을 먼저 비교하니까 실행 안함
		System.out.println();
		System.out.println();
		System.out.println("3. while(){} 문과 차이 비교");
		
		cnt = 0;
		
		while(cnt>0) { //0보다 크니? 아니야 종료 
			System.out.println("while(){}문 실행");
		}
		
//		결과
//		3. while(){} 문과 차이 비교

		// 4. do{}while() 문과 차이 비교
		// 조건을 나중에 비교하니까 1회 실행 
		System.out.println();
		System.out.println();
		System.out.println("4. do{}while() 문과 차이 비교");
		
		cnt = 0;
		
		do { //실행
			System.out.println("while(){}문 실행");
		}while(cnt>0); //조건 0보다 크니? 아니야 종료  //소괄호 끝나면 무조건 세미콜론
		
//		결과
//		4. do{}while() 문과 차이 비교
//		while(){}문 실행

	}

}
