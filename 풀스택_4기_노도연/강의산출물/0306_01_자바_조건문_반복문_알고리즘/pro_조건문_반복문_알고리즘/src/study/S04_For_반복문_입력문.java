package study;

import java.util.Scanner;

public class S04_For_반복문_입력문 {
    public static void main(String[] args) {
        // 문제 ] 입력 값(정수)을 5개 받아서 => 반복문 1~5
        // 평균을 구하여 출력 하시오.
        int hap=0; //누적변수는 반드시 초기값이 0으로 셋팅
        double avg; 

        Scanner sc =new Scanner(System.in);


        for(int i=1; i<=5; i++){
            System.out.println("정수를 입력하세요");
            hap += sc.nextInt(); // 입력값 누적합
        }
        
        avg = (double)hap/5;
        System.out.println();
        System.out.printf("합계 : %d\n", hap);
        System.out.printf("평균 : %.2f\n", avg);
        System.out.println();

    }
}
