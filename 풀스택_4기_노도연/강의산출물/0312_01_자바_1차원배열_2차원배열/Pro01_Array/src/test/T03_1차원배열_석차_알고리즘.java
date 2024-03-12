package test;

import java.util.Scanner;

public class T03_1차원배열_석차_알고리즘 {

	public static void main(String[] args) {
		// 입출력 설계 => 석차 알고리즘 구현
		
		// 점수 grade 배열변수 생성자 방식 선언 int [5]
		// 순위 rank  배열변수 생성자 방식 선언 int [5]
		// 석차 suk   석차 증가 변수 선언 int suk;
		// 키입력 sc 					 Scanner sc 
		
		//5명의 점수를 키보드 입력 받아서 배열에 저장하고
		//석차 알고리즘 구현하기
		
		//1. 생성자 방식으로 성적 5개
		int [] grade = new int[5];
		Scanner sc =new Scanner(System.in);
//		System.out.print("1번째 점수 입력하세요.");
//		grade[0] = sc.nextInt();
//		System.out.print("2번째 점수 입력하세요.");
//		grade[1] = sc.nextInt();
//		System.out.print("3번째 점수 입력하세요.");
//		grade[2] = sc.nextInt();
//		System.out.print("4번째 점수 입력하세요.");
//		grade[3] = sc.nextInt();
//		System.out.print("5번째 점수 입력하세요.");
//		grade[4] = sc.nextInt();
//		
		//학생 5명 점수를 입력
		System.out.println("학생 점수 입력하세요.");
//		for(int i=0; i<grade.length; i++) {
//			grade[i] = sc.nextInt();
//		}
		int i=-1;
		while(i<grade.length) {//-1 0 1 2 3
			i++; //0 1 2 3 4 
			grade[i] =sc.nextInt();
	
		}
		
		//2. 석차는 생성자 방식으로 공간 5개 지정
		int [] rank = new int[5];
		//3. 석차 증가 변수 선언
		int suk;
		
		//4. 우선 점수 잘 출력되는지 확인하기 
		for(i=0; i<grade.length; i++) {
			System.out.printf("점수 [%d] = %d\n", i , grade[i]);
		}
		
		//5.석차 구현하기
		
		for(i=0; i<grade.length; i++) { //내 점수
			suk = 1; //나는 1등이야!!!  초기화
			for(int j=0; j<grade.length; j++) { // 우리반 전체
				if(grade[i]<grade[j]) { // 내 점수보다 우리반 점수 크면
					suk++; // 내 석차는 올라간다.
				}
			}
			
			rank[i] =suk; // 석차[i]에 석차 값 대입

		}
		//6. 학생 5명 석차 구현 후 점수와 순위 출력
		System.out.println();
		System.out.println("순위를 구해볼까?!!! ");
		for(i=0; i<grade.length; i++) {
			System.out.printf("점수 = %3d 석차 = %d등\n", grade[i],rank[i]);
		}
		System.out.println();
		
//		결과
//		1번째 점수 입력하세요.
//		54
//		2번째 점수 입력하세요.
//		67
//		3번째 점수 입력하세요.
//		87
//		4번째 점수 입력하세요.
//		94
//		5번째 점수 입력하세요.
//		100
//		점수 [0] = 54
//		점수 [1] = 67
//		점수 [2] = 87
//		점수 [3] = 94
//		점수 [4] = 100
//
//		순위를 구해볼까?!!! 
//		점수 = 54 석차 = 5등
//		점수 = 67 석차 = 4등
//		점수 = 87 석차 = 3등
//		점수 = 94 석차 = 2등
//		점수 = 100 석차 = 1등
		
		//동등석차의 경우
//		학생 점수 입력하세요.
//		94
//		100
//		95
//		94
//		88
//		점수 [0] = 94
//		점수 [1] = 100
//		점수 [2] = 95
//		점수 [3] = 94
//		점수 [4] = 88
//
//		순위를 구해볼까?!!!  3등이 2명이면 4등 없이 동등석차 2명이 3등이된다.
//		점수 =  94 석차 = 3등
//		점수 = 100 석차 = 1등
//		점수 =  95 석차 = 2등
//		점수 =  94 석차 = 3등
//		점수 =  88 석차 = 5등


		

	}

}
