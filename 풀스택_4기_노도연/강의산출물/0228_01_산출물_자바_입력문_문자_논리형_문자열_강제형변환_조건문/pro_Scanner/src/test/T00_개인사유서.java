package test;

import java.util.Scanner;

public class T00_개인사유서 {
    public static void main(String[] args) {
        //개인사유서
        //인적사항
        //성명 문자열
        //생년월일 문자열
        //E-mail 문자열
        //휴대폰번호 문자열
        //개인사유 내용 문자열

        String name;
        String birth;
        String email;
        String phone;
        String leason;

        Scanner sc =new Scanner(System.in);

        System.out.println("");
        System.out.print("성명:");
        name =sc.nextLine();
        System.out.print("생년월일:");
        birth =sc.nextLine();
        System.out.print("E-mail:");
        email =sc.nextLine();
        System.out.print("휴대폰번호:");
        phone =sc.nextLine();
        System.out.print("사유기재하시오.");
        leason =sc.nextLine();

        System.out.println();
        System.out.printf("성명: %s, 생년월일: %s, E-mail: %s, 휴대폰번호: %s \n ========= \n %s",name,birth,email,phone,leason );
        System.out.println();


    }
}
