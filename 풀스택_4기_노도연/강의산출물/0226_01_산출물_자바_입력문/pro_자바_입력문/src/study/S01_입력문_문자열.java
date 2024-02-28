package study;

import java.util.Scanner; //자바에서 제공하는 클래스

public class S01_입력문_문자열 {
    public static void main(String[] args) {
        // 콘솔창에서(키보드) 사용자로부터 입력받기
        // 자바.유틸리티.Scanner 클래스 호출 사용
        // 사용시에는 반드시 생성자를 이용 인스턴스를 생성하여 사용한다.
        // 타입 객체이름 = new Scanner(시스템.입력); 사용 문법 규칙
        // Scanner scanner = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);
        // Scanner scn = new Scanner(System.in);

        // 1.화면에서 문자열을 입력을 받겠다.
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("문자열을 입력하세요"); //입력요청 메시지
        String str1 = scanner.nextLine(); // 콘솔 입력 문자열 str1 변수에 저장
        System.out.println("str1 :" + str1); //입력문자열 출력
        System.out.println();
        
        // 문자열을 입력하세요
        // 안녕하세요
        // str1 :안녕하세요


    }
}
