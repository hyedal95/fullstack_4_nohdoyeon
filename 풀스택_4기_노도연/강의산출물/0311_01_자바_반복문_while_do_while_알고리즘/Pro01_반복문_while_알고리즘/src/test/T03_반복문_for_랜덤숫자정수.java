package test;

import java.util.Random;

public class T03_반복문_for_랜덤숫자정수 {

	public static void main(String[] args) {
		// 랜덤한 정수 모래 시계 구현 
		// 임의의 수 출력 카운트
		/*
		 * 
		 * 
		 * 
		 */
		
		
		//랜덤 인스턴스 생성
		Random rd= new Random();
		
		int cnt=0;
		int indent=0;
		int step=9;
		
		for(int i=1; i<=7; i++) { // 7줄(행)
			
			if(i<=4) {
				indent=i-1;
				step-=2;
			}
			else {
				indent=7-i;
				step+=2;
			}
			
			//들여쓰기
			for(int j=1; j<=indent; j++) {
				System.out.printf("%3s","");
			}
			//카운트
			cnt =indent;
			for(int j=1; j<=step; j++) {
				cnt++; // 임의의 수로 변환 random()
				
				int num =(int)(Math.ceil(rd.nextDouble()*cnt+0.5)); 
				// 임의의 수로 변환 Random() 반올림 할 경우 math 추가 해도 됨 Math.ceil
				// 
				// 질문1 . 임의의 수 범위 지정 
				// 질문2 . 중복 숫자 안나오게끔  if문 사용  랜덤함수는 중복숫자가 나올 수 있다. 
				// 
				
				System.out.printf("%2d ",num);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 내가 해보고 싶은 것 (로또 번호 추출) row scanner로 받아서 col은 6개가 나오나, col에 있는 숫자들은 임의의 숫자  (숫자 범위는 1~45, 중복하지 않고)
		
		

	}

}
