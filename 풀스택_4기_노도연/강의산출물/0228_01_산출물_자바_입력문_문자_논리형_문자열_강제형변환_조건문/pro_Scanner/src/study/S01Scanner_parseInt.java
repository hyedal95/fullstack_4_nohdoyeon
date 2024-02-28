package study;

import java.util.Scanner;

public class S01Scanner_parseInt {
    public static void main(String[] args) {
        // 키보드로 입력 받아서 처리한다 Scanner
        // 성적처리 => 웹 브라우저에서 숫자 입력을 받으면 모두 문자열로 입력된다.
        // 이름 문자열 name
        // 국어 문자열 kor
        // 영어 문자열 eng
        // 수학 문자열 mat
        // 총점 정수 sum
        // 평균 실수 avg
        // 학점 문자열 grade =>  A+ A B+ B C+ C D+ D F

        String name;
        String kor;
        String eng;
        String mat;
        int sum;
        double avg;
        String grade;

        //키보드 입력문 객체 (인스턴스) 생성 
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("국어 : ");
        kor = sc.nextLine(); 
        System.out.print("영어 : ");
        eng = sc.nextLine();
        System.out.print("수학 : ");
        mat = sc.nextLine();
        System.out.println();
        
        //총점 정수
        //문자열 숫자를 정수형으로 강제형변환해야한다.
        //Integer.parseInt(문자열변수) => 정수로 변환
        sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(mat) ;
        avg = sum/3.00 ;   // 실수 = (double)정수 /3 ;   큰 자료형(양동이) = 작은 자료형 /3  생략가능
                                // 자동형변환 실수 잘려서 손실 예] 93.2455 =>93
                                // 총점/3; => 소수이하 손실 정수만 출력
                                // 그래서 나누기를 실수 변환해서 해야 한다. 손실 없다.
                                // 나누기할 때 분자 또는 분모에 실수가 있어야한다.
                                // 예]
                                // 총점/3.0; 
                                // (double)총점/3;
                                // (double)총점/3.0;
        //학점 처리 조건문(IF문)
        if(avg>=95){
            grade = "A+";
        }
        else if(avg>=90){
            grade = "A";
        }
        else if(avg>=85){
            grade = "B+";
        }
        else if(avg>=80){
            grade = "B";
        }
        else if(avg>=75){
            grade = "C+";
        }
        else if(avg>=70){
            grade = "C";
        }
        else if(avg>=65){
            grade = "D+";
        }
        else if(avg>=60){
            grade = "D";
        }
        else{
            grade = "F";
        }


        // 1단계.출력문 포멧 형식
        // 예시]
        // 이름 : 이순신, 국어:89, 영어:92, 수학:98
        System.out.println();
        System.out.printf("이름 : %s, 국어 : %s, 영어 : %s ,수학 : %s\n", name, kor, eng , mat );
        System.out.println();

        // 2단계.출력문 포멧 형식
        // 예시]
        // 이름 : 이순신, 국어:89, 영어:92, 수학:98, 총점:____, 평균:_____ (소수점 2자리)
        System.out.println();
        System.out.printf("이름 : %s, 국어 : %s, 영어 : %s ,수학 : %s, 총점: %d, 평균: %.2f \n", name, kor, eng , mat ,sum,avg );
        System.out.println();

        // 3단계.출력문 포멧 형식
        // 예시]
        // 이름 : 이순신, 국어:89, 영어:92, 수학:98, 총점:____, 평균:_____ , 학점:____
        System.out.println();
        System.out.printf("이름 : %s, 국어 : %s, 영어 : %s ,수학 : %s, 총점: %d, 평균: %.2f, 학점: %s\n", name, kor, eng , mat ,sum,avg,grade );
        System.out.println();


    }
}
