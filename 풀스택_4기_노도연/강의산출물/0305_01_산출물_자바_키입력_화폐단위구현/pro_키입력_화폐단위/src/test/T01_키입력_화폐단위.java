package test;

import java.util.Scanner;

public class T01_키입력_화폐단위 {
    public static void main(String[] args) {
        // 급여를 입력받아서 화폐단위별 매수를 구한다.

        Scanner sc = new Scanner(System.in);

        long pay;
        long w10000;
        long w1000;
        long w100;
        long w10;
        long w1;

        System.out.println();
        System.out.println("급여를 입력하세요.");
        pay = sc.nextLong();
        System.out.printf("급여 : %d \n", pay);

        // 예시] 56789원
        // 만원권 5 매 
        // 천원권 6 매
        // 백원권 7 매
        // 십원권 8 매
        // 일원권 9 매

        w10000 = (int)pay/10000;
        System.out.printf("만원권 : %d 매\n", w10000);

        pay = (int)pay- (w10000 *10000);
        w1000 = (int)pay/1000;
        System.out.printf("천원권 : %d 매\n", w1000);

        pay = (int)pay - (w1000 *1000);
        w100 = (int)pay/100;
        System.out.printf("백원권 : %d 매\n", w100);

        pay =(int)pay - (w100*100);
        w10 =(int)pay/10;
        System.out.printf("십원권: %d 매\n", w10);

        pay =(int)pay -(w10*10);
        w1 = (int)pay/1;
        System.out.printf("일원권: %d 매\n", w1);

    }
}
