package test;

import java.util.Scanner;

public class T01_if_조건문_계절 {
    public static void main(String[] args) {
        // 정수(월 month)를 입력 받아서
        // if 조건문을 이용 4계절을 선택하는 프로그래밍
        //   봄: 3,4,5 
        // 여름: 6,7,8
        // 가을: 9,10,11
        // 겨울: 12,1,2

        //1.변수선언
        int month;
        //2.스캐너선언
        Scanner sc = new Scanner(System.in);
        //3.입력받을 내용입력
        System.out.println();
        System.out.print("1~12 중 입력하여 날짜를 출력하세요.");
        //4.입력받기
        month = sc.nextInt();
        //5.if조건문 || => or 또는 ~ 이거나, 
        if (month == 3 || month==4 || month ==5) {
            System.out.println("봄 (Spring)");
        }
        else if(month == 6 || month==7 || month ==8){
            System.out.println("여름 (Summer)");
        }
        else if(month == 9 || month==10 || month ==11){
            System.out.println("가을 (Fall)");
        }
        else if(month == 12 || month==1 || month ==2){
            System.out.println("겨울 (Winter)");
        }
        else{
            System.out.println("없는 월입니다. 확인하시고 다시 입력해주세요.");
        }

        //5.if조건문 && => AND 이고, ~이면서, 모두 만족 TRUE
        if (month >=3 && month <=5) { //3~5 범위
            System.out.println("봄 (Spring)");
        }
        else if(month >=6 && month <=8){ //6~8 범위
            System.out.println("여름 (Summer)");
        }
        else if(month >=9 && month <=11){ //9~11 범위
            System.out.println("가을 (Fall)");
        }
        else if(month ==12 || (month >=1 && month <=2)){ //1~2 범위 또는 12
            System.out.println("겨울 (Winter)");
        }
        else{
            System.out.println("없는 월입니다. 확인하시고 다시 입력해주세요.");
        }

    }
}
