package test;

import java.util.Scanner;

public class T02_반복문_while_기사_1_7_행열_연습 {

	public static void main(String[] args) {
		// 문제] 
		// 들여쓰기 shift + tab 내어쓰기 tab
		// 기사문제 1 ~ 7 숫자를 이용 7행 7열 모래시계 구현
		/*
				  
				  1 2 3 4 5 6 7
				    2 3 4 5 6
				      3 4 5
				        4
				      3 4 5
				    2 3 4 5 6
				  1 2 3 4 5 6 7
				 
		*/
				
		int cnt=0;
		int indent=0;
		int row;
		int center;
		int i=0;
		int j=0;
				
		Scanner sc =new Scanner(System.in);
		System.out.println("홀수 행을 입력하세요");
		row = sc.nextInt();
				
		center = (row+1)/2;
		int count=(int)row+2;
		
		while(i<row) {
			i++;
			//조건문
			if(i<=center) {
				indent = i-1;
				count-=2;
			}
			else {
				indent = row- i;
				count+=2;
			}
			//들여쓰기
			j=0;
			while(j<indent) {
				j++;
				System.out.printf("%3s","");
			}
			//카운트
			j=0;
			cnt=indent;
			while(j<count) {
				j++;
				cnt++;
				System.out.printf("%2d ", cnt);
				
			}
			System.out.println();

		}


	}

}
