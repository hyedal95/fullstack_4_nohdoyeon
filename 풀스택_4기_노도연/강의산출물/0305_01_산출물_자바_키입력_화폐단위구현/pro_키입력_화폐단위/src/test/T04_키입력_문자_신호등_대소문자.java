package test;

import java.util.Scanner;

public class T04_키입력_문자_신호등_대소문자 {
    public static void main(String[] args) {
        // 영문 대소문자 구분없이 모두 대문자로 변환하여 입력받기
        // 조건문 빨강(R): 정지신호, 녹색(G): 진행신호, 노랑(Y): 주의신호 
        // 입력 받아서  신호등 조건문 구현
        // 입력은 R, G, Y 중 1자만 입력 받는다.
        // 신호 (sign)
        char sign;
        Scanner sc = new Scanner(System.in);



        // 문자인 경우
        // Character.toUpperCase(영문자); =>대문자 변환
        // Character.toLowerCase(영문자); =>소문자 변환

        // 문자열인 경우
        // 문자열.toUpperCase(); =>대문자 변환
        // 문자열.toLowerCase(); =>소문자 변환

        System.out.println();
        System.out.println("신호등 색깔(R,G,Y)중 1개 선택 입력 : ");
        sign = Character.toUpperCase(sc.next().charAt(0));

        if(sign == 'R'){
            System.out.println("정지신호");
        }
        else if(sign == 'G'){
            System.out.println("진행신호");
        }
        else if(sign == 'Y'){
            System.out.println("주의신호");
        }
        else{
            System.out.println("없는 신호입니다. 다시 입력해주세요.");
        }
    }
}
