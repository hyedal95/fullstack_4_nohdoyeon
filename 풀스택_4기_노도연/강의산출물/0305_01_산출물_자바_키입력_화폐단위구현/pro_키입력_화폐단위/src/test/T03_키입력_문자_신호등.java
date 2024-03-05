package test;

import java.util.Scanner;

public class T03_키입력_문자_신호등 {
    public static void main(String[] args) {
        // 문자 1글자 빨강(R): 정지신호, 녹색(G): 진행신호, 노랑(Y): 주의신호 
        // 입력 받아서  신호등 조건문 구현
        // 입력은 R, G, Y 중 1자만 입력 받는다.

        // 신호(sign)
        char sign;

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("신호등 색상을 입력하세요(R, G, Y) 중 1자만 선택 입력하세요.");
        sign = sc.next().charAt(0);

        if(sign == 'R' || sign == 'r'){
            System.out.println("정지신호");
        }
        else if(sign == 'G' || sign == 'g'){
            System.out.println("진행신호");
        }
        else if(sign == 'Y' || sign == 'y'){
            System.out.println("주의신호");
        }
        else{
            System.out.println("없는 신호입니다. 다시 입력해주세요.");
        }
        
    }
}
