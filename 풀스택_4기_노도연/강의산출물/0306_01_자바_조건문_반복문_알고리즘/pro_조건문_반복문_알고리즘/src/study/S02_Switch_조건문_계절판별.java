package study;

import java.util.Scanner;

public class S02_Switch_조건문_계절판별 {
    public static void main(String[] args) {
        // 정수(월 month)를 입력 받아서
        // switch 조건문을 이용 4계절을 선택하는 프로그래밍
        //   봄: 3,4,5 
        // 여름: 6,7,8
        // 가을: 9,10,11
        // 겨울: 12,1,2
        
        //1. 변수선언
        int month;

        //2. 스캐너 선언
        Scanner sc = new Scanner(System.in);

        //3. 입력받을 내용 
        System.out.println();
        System.out.print("월을 숫자로 입력하세요!");
        
        //4. 입력문 
        month = sc.nextInt();

        //5. 조건문
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄(Spring)");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름(Summer)");
                break;    
            case 9:
            case 10:
            case 11:
                System.out.println("가을(Fall)");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울(Winter)");
                break;                
            default:
                System.out.println("월을 확인하고, 1~12월 중 입력해주세요.");
                break;
        }

    }
}

// 결과

// 월을 숫자로 입력하세요!12
// 겨울(Winter)

// 월을 숫자로 입력하세요!13
// 월을 확인하고, 1~12월 중 입력해주세요.