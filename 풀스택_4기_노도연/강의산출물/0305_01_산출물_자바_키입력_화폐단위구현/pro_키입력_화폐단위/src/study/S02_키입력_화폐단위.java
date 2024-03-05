package study;

import java.util.Scanner;

public class S02_키입력_화폐단위 {
    public static void main(String[] args) {
        //급여를 입력 받아서 화폐단위 매수 구하기 =>나머지 연산자 '%' 사용하기

        int pay;
        int w10000;
        int w1000;
        int w100;
        int w10;
        int w1;

        Scanner sc =new Scanner(System.in);

        // 급여 입력 받기
        System.out.println();
        System.out.print("급여를 입력하세요!");
        pay = sc.nextInt();
        System.out.printf("급여: %d", pay);

        //만원권 계산
        w10000 = pay/10000;
        System.out.printf("만원권 : %d매 \n" , w10000);

        //천원권 계산
        pay = pay % 10000; // 만원권 나머지 
        w1000 = pay/1000;
        System.out.printf("천원권 : %d매 \n" , w1000);

        //백원권 계산
        pay = pay % 1000; // 천원권 나머지
        w100 = pay/100;
        System.out.printf("백원권 : %d매 \n" , w100);

        //십원권 계산
        pay = pay % 100; // 백원권 나머지 
        w10 = pay/10;
        System.out.printf("십원권 : %d매 \n" , w10);

        //일원권 계산
        pay = pay % 10; // 십원권 나머지 
        w1 = pay/1;
        System.out.printf("일원권 : %d매 \n" , w1);

    }
}

// 결과
// 급여를 입력하세요!
// 56789
// 급여 : 56789 
// 만원권 : 5 매
// 천원권 : 6 매
// 백원권 : 7 매
// 십원권 : 8 매
// 일원권 : 9 매