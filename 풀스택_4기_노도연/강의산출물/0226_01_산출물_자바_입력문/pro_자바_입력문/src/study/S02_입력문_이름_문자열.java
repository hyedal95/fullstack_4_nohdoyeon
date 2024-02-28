package study;

import java.util.Scanner;

public class S02_입력문_이름_문자열 {
    public static void main(String[] args) {
        //키보드로 이름 입력 받기 
        //키보드로 휴대폰번호를 입력 받기 
        //키보드로 주소를 입력 받기
        //키보드로 이메일을 입력 받기
        //출력


        Scanner sc = new Scanner(System.in);
        String name;
        String phone;
        String email;
        String address;

        
        System.out.println();
        // 이름입력
        System.out.println("이름을 입력하세요!");
        name = sc.nextLine();
        // 휴대폰 입력
        System.out.println("휴대폰번호를 입력하세요!");
        phone = sc.nextLine();
        // 이메일 입력
        System.out.println("이메일을 입력하세요!");
        email = sc.nextLine();
        // 주소 입력
        System.out.println("주소를 입력하세요!");
        address = sc.nextLine();

        // 출력
        System.out.println("=====출력문=====");
        System.out.println("이름 : " + name);
        System.out.println("휴대폰 : " + phone);
        System.out.println("이메일 : " + email);
        System.out.println("주소 : " + address);
        System.out.println();
        
        // 이름을 입력하세요!
        // 노도연
        // 휴대폰번호를 입력하세요!
        // 010-8291-3711
        // 이메일을 입력하세요!
        // hyedal95@gmail.com
        // 주소를 입력하세요!
        // 경기도 안산시 상록구 
        // =====출력문=====
        // 이름 : 노도연
        // 휴대폰 : 010-8291-3711
        // 이메일 : hyedal95@gmail.com
        // 주소 : 경기도 안산시 상록구 
    }
}
