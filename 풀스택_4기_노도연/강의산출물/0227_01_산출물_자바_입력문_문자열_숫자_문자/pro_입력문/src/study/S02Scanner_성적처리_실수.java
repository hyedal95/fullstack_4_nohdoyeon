package study;

import java.util.Scanner;

public class S02Scanner_성적처리_실수 {
    public static void main(String[] args) {
        //문제1 
        //이름 name 문자열
        //국어 kor 영어 eng 수학 mat 모두 입력을 실수로 입력받고
        //총점 tot 은 정수로 연산 형변환 (실수(8)->정수(4) 대->소 강제형변환)
        //평균은 avg 실수로 소숫점 이하 2자리 출력
        //출력형식은 printf() 한줄로 출력
        //예시]
        //이름:조지현 국어:83.0 영어:95.0 수학:99.0 총점:277 평균:92.33

        Scanner sc =new Scanner(System.in);
        String name;
        double kor;
        double eng;
        double mat;
        int tot; // 총점 입력 받고 계산
        double avg; //평균 입력 받고 계산


        System.out.print("이름 : ");    //문자열
        name = sc.nextLine();

        System.out.print("국어 : ");    //실수
        kor = sc.nextDouble();

        System.out.print("영어 : ");    //실수
        eng = sc.nextDouble();

        System.out.print("수학 : ");    //실수
        mat = sc.nextDouble();
        
        tot = (int)kor+(int)eng+(int)mat; //강제 형변환 | 정수 = (정수)실수 + (정수)실수 + (정수)실수
        avg = tot/3; //자동형변환 되기때문에 강제형변환 생략 가능

        System.out.println();
        System.out.printf("이름:%s 국어:%.1f 영어:%.1f 수학:%.1f 총점:%d 평균:%.2f", name , kor , eng , mat , tot , avg );
        System.out.println();
    }
}
// 결과
// 이름 : 조지현
// 국어 : 83
// 영어 : 95
// 수학 : 99

// 이름:조지현 국어:83.0 영어:95.0 수학:99.0 총점:277 평균:92.3