package test;

import java.util.Scanner;

public class T05_키입력_분식메뉴 {
    public static void main(String[] args) {
        // 문제
        // 아래는 분식점 메뉴이다.
        // 주문받는 프로그램을 작성 하시오.
        // 메뉴 (1.떡볶이, 2. 순대, 3.오뎅)
        // 메뉴 키 입력 값 받아서
        // 분식 선택 주문 받는 프로그래밍

        // 예시]
        // 분식 메뉴를 선택하세요 (1. 떡볶이 2.순대, 3.오뎅)
        // 2
        // 순대를 주문하셨습니다.

        Scanner sc = new Scanner(System.in);

        int key;

        System.out.println();
        System.out.print("분식 메뉴를 선택하세요 (1. 떡볶이 2.순대, 3.오뎅)");
        key = sc.nextInt();
        System.out.printf(" %d\n ", key);

        if(key == 1){
            System.out.println("떡볶이를 주문하셨습니다.");
        }
        else if(key == 2){
            System.out.println("순대를 주문하셨습니다.");
        }
        else if(key == 3){
            System.out.println("오뎅을 주문하셨습니다.");
        }
        else{
            System.out.println("없는 키입니다. 1~3 중 하나를 선택해주세요.");
        }
    }
}
