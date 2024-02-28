package test;

import java.util.Scanner;

public class T01Scanner_문자열_정수_실수 {
    public static void main(String[] args) {
        //1.이름 문자열 2.학교 문자열 3.전공 문자열 4.학번 정수 5. 시력 실수
        String name;
        String school;
        String major;
        int num;
        double sight;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("학교 : ");
        school = sc.nextLine();
        System.out.print("전공 : ");
        major = sc.nextLine();
        System.out.print("학년 : ");
        num = sc.nextInt();
        System.out.print("시력 : ");
        sight = sc.nextDouble();

        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("학교 : " + school);
        System.out.println("전공 : " + major);
        System.out.println("학년 : " + num +"학년");
        System.out.println("시력 : " + sight);

    }
}

// 결과
// 이름 : 노도연
// 학교 : 한국방송통신대학교
// 전공 : 컴퓨터과학과
// 학년 : 4
// 시력 : 1.5

// 이름 : 노도연
// 학교 : 한국방송통신대학교
// 전공 : 컴퓨터과학과
// 학년 : 4학년
// 시력 : 1.5