package study;

import java.util.Scanner;

public class S03_입력문_정수 {
    public static void main(String[] args) {
        // 이름 문자열 입력 받기 nextLine();
        // 나이 정수 입력 받기 nextInt();
        // 급여 정수 입력 받기 nextInt();


        Scanner sc =new Scanner(System.in);
        
        String name;
        int age;
        int pay;

        // 이름 문자열 입력
        System.out.println("이름 ?_");
        name = sc.nextLine();
        
        // 나이 정수 입력
        System.out.println("나이 ?_");
        age =sc.nextInt();

        // 급여 정수 입력
        System.out.println("급여 ?_");
        pay = sc.nextInt();

        System.out.println("=====출력문=====");
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
        System.out.println("급여 = " + pay +"원");

        // 이름 ?_
        // 노도연
        // 나이 ?_
        // 30
        // 급여 ?_
        // 4500000
        // =====출력문=====
        // 이름 = 노도연
        // 나이 = 30
        // 급여 = 4500000원

    }
}
