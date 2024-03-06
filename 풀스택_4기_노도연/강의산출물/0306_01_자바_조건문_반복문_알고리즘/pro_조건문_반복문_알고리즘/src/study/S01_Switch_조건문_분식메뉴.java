package study;

import java.util.Scanner;

public class S01_Switch_조건문_분식메뉴 {
    public static void main(String[] args) {
        // 조건문 switch 스위치 조건문
        // 문제 ] 분식메뉴  1. 떡볶이 2. 순대 3. 오뎅 4. 튀김
        // 메뉴 번호를 선택
        // switch 조건문
        // 어떤 변수의 값을 갖는지 경우 case 를 선택하여 실행문을 실행한다.
        // args 파라미터값 (변수값)에 따라서 달라진다.
        // case 내부에 반드시 조건이 만족하면 명령문 실행하고, 
        // break;를 이용 강제 종료한다.

        //1.변수선언
        int 분식메뉴;

        //2.스캐너 변수 선언 +import java.util.Scanner;도 잘 선언되었는지 확인할 것.

        Scanner sc = new Scanner(System.in);

        //3. 입력문 받기 전 질문 출력도 함께
        System.out.println();
        System.out.println("분식메뉴 4가지가 있다. 메뉴 번호를 선택해주세요. ");
        System.out.println("메뉴 1. 떡볶이 2. 순대 3. 오뎅 4. 튀김 ");
        //4. nextInt();로 입력을 받음.
        분식메뉴 = sc.nextInt();
        
        //5.switch 조건문에 따라서 case에 해당하는 메뉴가 출력이 이루어진다.

        switch (분식메뉴) {
            case 1:
                System.out.println("1번 메뉴 떡볶이를 선택했습니다.");
                break;
            case 2:
                System.out.println("2번 메뉴 순대를 선택했습니다.");
                break;      
            case 3:
                System.out.println("3번 메뉴 오뎅을 선택했습니다.");
                break;   
            case 4:
                System.out.println("4번 메뉴 튀김을 선택했습니다.");
                break;  
            default: //else와 같다.
                System.out.println("메뉴에 없는 번호를 선택했습니다.");
                break;
        }

    }
}


// 결과물

// 분식메뉴 4가지가 있다. 메뉴 번호를 선택해주세요. 
// 메뉴 1. 떡볶이 2. 순대 3. 오뎅 4. 튀김 
// 3번 메뉴 오뎅을 선택했습니다.

// 분식메뉴 4가지가 있다. 메뉴 번호를 선택해주세요.
// 메뉴 1. 떡볶이 2. 순대 3. 오뎅 4. 튀김
// 6
// 메뉴에 없는 번호를 선택했습니다.