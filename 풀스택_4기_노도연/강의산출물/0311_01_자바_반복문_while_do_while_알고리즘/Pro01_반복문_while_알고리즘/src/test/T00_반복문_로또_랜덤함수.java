package test;

import java.util.Random;
import java.util.Scanner;

public class T00_반복문_로또_랜덤함수 {

	public static void main(String[] args) {
		// 로또번호 추첨
		
		// 랜덤 인스턴스 생성
		Random rd = new Random();
		// 스캐너 인스턴스 생성
		Scanner sc =new Scanner(System.in);
		
		int cnt=0;
		int a;
		//1. 질문하기 
		
		System.out.println("로또 몇 장 필요하신가요? ");
		a = sc.nextInt();
		System.out.printf("%d 장 주세요!! \n", a );
		
		System.out.println("|| 출 ||");
		System.out.println("|| 력 ||");
		System.out.println("|| 중 ||");
	
		
		
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=6; j++) {
				cnt++;
				int num =(int)(Math.ceil(rd.nextDouble()*46)); // 1~45까지 할려면 * 해당 숫자의 +1
				System.out.printf("[ %2d ]", num);
			}
			System.out.println();
				
		}
		
		System.out.printf("로또 %d 장 나왔습니다. \n",a);

	}

}
