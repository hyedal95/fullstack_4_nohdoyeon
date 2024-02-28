package study;

import java.util.Scanner;

public class S01Scanner_문자열_정수_실수 {
    public static void main(String[] args) {
        //보통 실수는 float보다 double을 많이 쓴다.
        //이름 name 문자열, 나이 age 정수, 시력  sight실수, 취미 hobby문자열 입력받기
        String name;
        int age;
        double sight;
        String hobby;
        Scanner sc =new Scanner(System.in); //키보드 입력

        //이름 입력받기
        System.out.println();
        System.out.print("이름 :");   //문자열 nextLine()
        name =sc.nextLine();
        
        //웹페이지에서 입력을 숫자를 받으면 => 문자형 숫자 계산 불가 => 숫자로 변경 강제 형변환 
        // "79" + "80" =>7980 문자열 숫자
        // 79 + 80 =>159 정수 숫자
        System.out.print("나이 :");   //정수 nextInt()
        age =sc.nextInt();
        System.out.print("시력 :");   //실수 nextDouble()
        sight=sc.nextDouble();
        sc.nextLine();
        System.out.print("취미 :");   //문자열 nextLine()
        hobby =sc.nextLine();
        
        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("시력 : " + sight);
        System.out.println("취미 : " + hobby);

    }
}

// 결과
// 이름 :노도연
// 취미 :포켓몬고게임
// 나이 :30
// 시력 :1.5

// 이름 : 노도연
// 취미 : 포켓몬고게임
// 나이 : 30
// 시력 : 1.5


// 결과2
// 이름 :노도연
// 나이 :30
// 시력 :1.5
// 취미 :포켓몬고게임

// 이름 : 노도연
// 나이 : 30
// 시력 : 1.5
// 취미 : 포켓몬고게임


