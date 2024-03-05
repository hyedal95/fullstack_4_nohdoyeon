package study;

import java.util.Scanner;

public class S03_키입력_문자_신호등 {
    public static void main(String[] args) {
        // 문자 1글자 빨강(R): 정지신호, 녹색(G): 진행신호, 노랑(Y): 주의신호 
        // 입력 받아서  신호등 조건문 구현
        // 입력은 R, G, Y 중 1자만 입력 받는다.

        // 신호(sign)
        char sign;
        Scanner sc =new Scanner(System.in);

        System.out.println();
        System.out.print("신호등 색상을 입력하세요(R, G, Y) 중 1자만 선택 입력하세요.");
        sign = sc.next().charAt(0); //문자를 첫글자 1자만 입력 //컨트롤 +스페이스바

        //문자는 반드시 변수 갑이 홑따옴표를 사용한다.
        //문자열은 곁따옴표
        if(sign == 'R' || sign == 'r'){
            System.out.println("정지 신호 입니다.");
        }
        else if(sign == 'G'|| sign == 'g'){
            System.out.println("진행 신호 입니다.");
        }
        else if(sign == 'Y'|| sign == 'y'){
            System.out.println("주의 신호 입니다.");
        }else{
            System.out.println("없는 신호 입니다. 확인하고 다시 입력하세요.");
        }

    } 
}
