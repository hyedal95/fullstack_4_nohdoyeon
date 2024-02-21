package study;

public class S02_자료형_형변환 {
    public static void main(String[] args) {
        //형변환 : 기본형 7가지를 서로 자료형을 변환 사용할 수 있다.
        //자료형 변수이름 = (자료형)리터럴값;
        char ch1 = (char)65; 
        System.out.println();
        System.out.println("형변환");
        System.out.println(ch1);
        System.out.println();

        //형변환
        //A

        //2. 정수 66 => 강제 형변환 문자형으로 
        int num = 66;
        char ch2 = (char)num;
        System.out.println(); 
        System.out.printf("int num = %d\n", num); 
        System.out.printf("char ch2 = (char)%d\n",num);
        System.out.printf("결과  ch2 = %c\n",ch2); //출력 문자 
        System.out.println(); 

        // int num = 66
        // char ch2 = (char)66
        // 결과  ch2 = B

        //ch2 문자를 숫자로 강제형변환
        int num2 = (int)ch2;
        System.out.println();
        System.out.printf("int num2 = (int)%c\n",ch2); //문자
        System.out.printf("결과 num2 = %d\n",num2); //결과 숫자
        System.out.println();

        // 결과
        // int num2 = (int)B
        // 결과 num2 = 66

        //ch2 문자를 숫자로 강제형변환
        // B => 66+5 = 71
        int num3 = (int)ch2 + 5;
        System.out.println();
        System.out.printf("int num2 = (int)%c + 5\n",ch2); //문자
        System.out.printf("결과 num2 = %d\n",num3); //결과 숫자
        System.out.println();

        //결과
        // int num2 = (int)B + 5
        // 결과 num2 = 71
        
        //바이트= >정수
        //정수= >바이트
        //숏=> 바이트
        //실수 => 정수
        //정수 => 실수
        //문자 => 실수
        //실수 => 문자

        //실수=>정수 소숫점 미만 숫자 손실된다.
        double d1= 3.14159;
        int d2= (int)d1;
        System.out.println();
        System.out.printf("double d1 =%.5f\n", d1);         //실수
        System.out.printf("int d2 =(int)%.5f\n", d1);   //(정수형변환)실수
        System.out.printf("결과 d2 =%d\n", d2); 
        System.out.println();            //결과 숫자(정수)
    }
}
