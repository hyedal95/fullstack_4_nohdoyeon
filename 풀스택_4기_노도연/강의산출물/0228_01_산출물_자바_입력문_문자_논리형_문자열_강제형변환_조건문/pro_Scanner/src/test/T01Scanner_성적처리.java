package test;

import java.util.Scanner;

public class T01Scanner_성적처리 {
    public static void main(String[] args) {
        // 문제1]
        // 키보드로 입력 받아서 처리한다 Scanner
        // 성적처리 => 웹 브라우저에서 숫자 입력을 받으면 모두 문자열로 입력된다.
        // 이름 문자열 name
        // 국어 정수 kor
        // 영어 정수 eng
        // 수학 정수 mat
        // 총점 정수 sum
        // 평균 실수 avg
        // 단, 입력은 국어, 영어, 수학 모두 문자열로 입력을 받아서 변수에 저장은 정수로 한다. [웹 입력]
        // 변수에 저장은 문자열 정수로 한다.

        //출력문 포멧 형식
        // 예시]
        // 이름 : 이영희, 국어: 95, 영어 :12 평균은 소수점 3자리

        String name;
        int kor;
        int eng;
        int mat;
        int sum;
        double avg;
        String grade;

        Scanner sc= new Scanner(System.in);

        System.out.println();
        System.out.print("이름:");
        name = sc.nextLine();
        System.out.print("국어:");
        kor = Integer.parseInt(sc.nextLine());
        System.out.print("영어:");
        eng = Integer.parseInt(sc.nextLine());
        System.out.print("수학:");
        mat = Integer.parseInt(sc.nextLine());

        sum = kor + eng + mat;
        avg = (double)sum/3;

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

        


        System.out.println();
        System.out.printf("이름 : %s, 국어: %d, 영어 :%d, 수학 : %d, 총점 : %d, 평균: %.3f, 학점: %s\n",name,kor,eng,mat,sum,avg,grade  );
        System.out.println();

        // 결과물
        // 이름:이영희
        // 국어:92
        // 영어:92
        // 수학:91

        // 이름 : 이영희, 국어: 92, 영어 :92, 수학 : 91, 총점 : 275, 평균: 91.667, 학점: A

    }
}
