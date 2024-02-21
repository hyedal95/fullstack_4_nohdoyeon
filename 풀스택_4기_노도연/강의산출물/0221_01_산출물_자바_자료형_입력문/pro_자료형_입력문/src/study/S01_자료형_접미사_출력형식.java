package study;

public class S01_자료형_접미사_출력형식 {
    public static void main(String[] args) {
        boolean power = true;     //논리형(부울린) 1byte(8bit)
        
        char ch1 = 'A';           //문자형(캐릭터) 2byte(16bit)   홀따옴표
        char ch2 = '나';          //문자형(캐릭터) 2byte(16bit)  홀따옴표
        
        String name = "이순신";   //문자열(스트링) 8byte(64bit)  겹따옴표
        String email = "hyedal95@gmail.com";   //문자열(스트링) 8byte(64bit)  겹따옴표
        
        int num = 120;            //숫자(정수)     4byte(32bit)
        long pay1 = 6500000;      //숫자(정수)     8byte(64bit)  접미사 L 생략 가능
        long pay2 = 6500000L;     //숫자(정수)     8byte(64bit)  접미사 L 대문자 표기
        
        float weight1 = 72.57f;    //숫자(실수)     4byte(32bit)  접미사 f 생략 불가 생략하면 오류발생
        double weight2 = 72.57;   //숫자(실수)     8byte(64bit)  접미사 d 생략 가능
        double weight3 = 72.57d;  //숫자(실수)     8byte(64bit)  접미사 d 소문자 표기

        // 추가 자료형
        //
        // 표현범위 부호비트 -2^n ~ 2^n-1
        // 65536 32768 16384 8192 4096 2048 1024 512 256 128 64 32 16 8 4  2   1 
        //                                           2^8 2^7 ...          2^1 2^0
        // 2^8= 256가지수 저장공간 범위 => -128 ~ 127
        // byte 바이트는 영문 1자 8비트를 의미한다.
        // 1비트 부호비트 : 7비트(데이터비트) =n -2^7~2^7 => -128 ~ (128-1)

        byte b1 = 120;            //숫자(정수)     1byte(8bit) 표현범위가 -128부터 +127까지
        byte b2 = 127;            //숫자(정수)     1byte(8bit)
        byte b3 = -127;           //숫자(정수)     1byte(8bit)
        byte b4 = -128;           //숫자(정수)     1byte(8bit)
      //byte b5 = -129;           //숫자(정수)     1byte(8bit) 표현범위 오버플로우(기억공간 범위 자리넘침)
      //byte b6 = 128;            //숫자(정수)     1byte(8bit) 표현범위 오버플로우(기억공간 범위 자리넘침)
        
      //short 2byte(16bit) =2^16 =>65,536가지수 -32768 ~ +32767
        short s1 = 32767;         //숫자(정수)     2byte(16bit) 
      //short s2 = 32768;         //숫자(정수)     2byte(16bit) 표현범위 오버플로우(기억공간 범위 자리넘침)
        short s3 = -32768;        //숫자(정수)     2byte(16bit) 
      //short s4 = -32769;        //숫자(정수)     2byte(16bit) 표현범위 오버플로우(기억공간 범위 자리넘침)
        short s5 = -500;          //숫자(정수)     2byte(16bit) 
        short s6 = 5500;          //숫자(정수)     2byte(16bit) 

        System.out.println("자료형 논리(boolean)");
        System.out.printf("boolean power = %b\n", power);
        System.out.println("자료형 문자(char)");
        System.out.printf("char \tch1 = \'%c\'\n", ch1);
        System.out.printf("char \tch2 = \'%c\'\n", ch2);
        System.out.println("자료형 실수(float,double)");
        System.out.printf("float \tweight1 = %6.2ff\n", weight1);
        System.out.printf("double \tweight2 = %6.2f\n", weight2);
        System.out.printf("double \tweight3 = %6.2fd\n", weight3);
        System.out.println("자료형 정수(int,long)");
        System.out.printf("int \tnum = %d\n", num);
        System.out.printf("long \tpay1 = %d\n", pay1);
        System.out.printf("long \tpay2 = %d\n", pay2);
        System.out.println("자료형 문자열(String)");
        System.out.printf("String \tname = \"%s\"\n", name);
        System.out.printf("String \temail = \"%s\"\n", email);
        System.out.println("자료형 바이트(byte)");
        System.out.printf("byte \tb1 = %d\n", b1);
        System.out.printf("byte \tb2 = %d\n", b2);
        System.out.printf("byte \tb3 = %d\n", b3);
        System.out.printf("byte \tb4 = %d\n", b4);
        System.out.println("byte \tb5 = -129 오버플로우 발생 -128까지 입력해야 함.");
        System.out.println("byte \tb6 = 128  오버플로우 발생 127까지 입력해야 함.");
        System.out.println("자료형 숏(short)");
        System.out.printf("short \ts1 = %d\n", s1);
        System.out.println("short \ts2 = 32768  오버플로우(기억공간 범위 자리넘침)");
        System.out.printf("short \ts3 = %d\n", s3);
        System.out.println("short \ts4 = -32769  오버플로우(기억공간 범위 자리넘침)");
        System.out.println();


        //결과
        // 자료형 논리(boolean)
        // boolean power = true
        // 자료형 문자(char)
        // char    ch1 = A
        // char    ch2 = 나
        // 자료형 실수(float,double)
        // float   weight1 = 72.570000
        // double  weight2 = 72.570000
        // double  weight3 = 72.570000
        // 자료형 정수(int,long)
        // int     num = 120
        // long    pay1 = 6500000
        // long    pay2 = 6500000
        // 자료형 문자열(String)
        // String  name = 이순신
        // String  email = hyedal95@gmail.com
        // 자료형 바이트(byte)
        // byte    b1 = 120
        // byte    b2 = 127
        // byte    b3 = -127
        // byte    b4 = -128
        // byte    b5 = -129 오버플로우 발생 -128까지 입력해야 함.
        // byte    b6 = 128  오버플로우 발생 127까지 입력해야 함.
        // 자료형 숏(short)
        // short   s1 = 32767
        // short   s2 = 32768  오버플로우(기억공간 범위 자리넘침)
        // short   s3 = -32768
        // short   s4 = -32769  오버플로우(기억공간 범위 자리넘침)        
    }
}
