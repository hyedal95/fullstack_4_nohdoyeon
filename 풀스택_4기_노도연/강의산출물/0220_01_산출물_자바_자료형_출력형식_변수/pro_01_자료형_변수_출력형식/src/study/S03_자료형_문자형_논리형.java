package study;

public class S03_자료형_문자형_논리형 {
    public static void main(String[] args) {
        //문자 자료형
        int ch00 = 65; // 정수 65
        char ch10 = 65; // A 아스키코드값 대문자 A 소문자 a 97
        char ch1 = 'A';
        char ch20 = 97; // a 소문자 
        char ch2 = 'a';
        char ch3 = '강';
        char ch4 = '가';
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 5 < 8; //논리연산 8은5보다 크다. 참(true)
        boolean b4 = 5 == 8; //논리연산 8은5와 같다. 거짓(false)



        System.out.println();
        System.out.println("문자 자료형 출력문1");
        System.out.println("정수 int 자료형" + ch00);
        System.out.println("문자 자료형" + ch10);
        System.out.println("문자 자료형" + ch1);
        System.out.println("문자 자료형" + ch20);
        System.out.println("문자 자료형" + ch2);
        System.out.println("문자 자료형" + ch3);
        System.out.println("문자 자료형" + ch4);
        System.out.println("논리 자료형" + b1);
        System.out.println("논리 자료형" + b2);
        System.out.println("논리 자료형" + b3);
        System.out.println("논리 자료형" + b4);

        //결과
        //문자 자료형 출력문1
        //정수 int 자료형65
        //문자 자료형A
        //문자 자료형A
        //문자 자료형a
        //문자 자료형a
        //문자 자료형강
        //문자 자료형가 
        //논리 자료형 true
        //논리 자료형 false
        //논리 자료형 true
        //논리 자료형 false

        System.out.println();
        System.out.println("문자 자료형 출력문2");
        System.out.printf("정수 int 자료형 %s\n", ch00 ); // 65
        System.out.printf("정수 int 자료형 %c\n", ch00 ); // 65 =>A
        System.out.printf("정수 int 자료형 %c\n", 66 ); // 66 =>B
        System.out.printf("정수 int 자료형 %c\n", 67 ); // 67 =>C
        System.out.printf("정수 int 자료형 %c\n", 68 ); // 68 =>D
        System.out.printf("정수 int 자료형 %c\n", 69 ); // 69 =>E
        System.out.printf("정수 int 자료형 %c\n", 70 ); // 70 =>F
        System.out.printf("문자 자료형 %c\n", ch10 );
        System.out.printf("문자 자료형 %c\n", ch1 );
        System.out.printf("문자 자료형 %s\n", ch1 );
        System.out.printf("문자 자료형 %c\n", ch20 );
        System.out.printf("문자 자료형 %c\n", ch2 );
        System.out.printf("문자 자료형 %c\n", ch3 );
        System.out.printf("문자 자료형 %c\n", ch4 );
        System.out.printf("논리 자료형 %b\n", b1 );
        System.out.printf("논리 자료형 %b\n", b2 );
        System.out.printf("논리 자료형 %b\n", b3 );
        System.out.printf("논리 자료형 %b\n", b4 );
        //결과
        //문자 자료형 출력문2
        //정수 int 자료형 65
        //정수 int 자료형 A
        //정수 int 자료형 B
        //정수 int 자료형 C
        //정수 int 자료형 D
        //정수 int 자료형 E
        //정수 int 자료형 F
        //문자 자료형 A
        //문자 자료형 A
        //문자 자료형 A
        //문자 자료형 a
        //문자 자료형 a
        //문자 자료형 강
        //문자 자료형 가
        //논리 자료형 true
        //논리 자료형 false
        //논리 자료형 true
        //논리 자료형 false
    }
}
