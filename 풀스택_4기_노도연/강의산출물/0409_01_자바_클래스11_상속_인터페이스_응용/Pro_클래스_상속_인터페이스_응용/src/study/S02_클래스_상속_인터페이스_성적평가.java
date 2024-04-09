package study;

import java.util.HashMap;
import java.util.Scanner;

//# 매개변수로 전수를 받아서 완성하고 구현하는 인터페이스

/*
 	# 성적처리 프로그램
 	  1. 성적평가 인터페이스 
 	  인터페이스이름 :Grade
 	  get메서드(매개변수 점수) 미완성 메서드  getGrade=> 인터페이스 선언
 	  
 	  2. 성적평가 클래스
 	  인터페이스를 구현(임플리먼츠 implements) =>미완성메서드를 완성한다.
 	  성적평가 조건표
 	  점수 >=95 && 점수 <100 => A+
 	  점수 >=90 && 점수 <95  => A
 	  점수 >=85 && 점수 <90  => B+
 	  점수 >=80 && 점수 <85  => B
 	  점수 >=75 && 점수 <80  => C+
 	  점수 >=70 && 점수 <75  => C
 	  점수 >=65 && 점수 <70  => D
 	  점수 >=60 && 점수 <65  => E
 	  점수 <60  => F
 	
 */
// 1. 인터페이스 선언
interface Grade인터페이스 {
	String getGrade(String name, int jumsoo);
	
	
	
}
// 2. 클래스선언 구현(implements) 인터페이스 
class Grade평가클래스조건문 implements Grade인터페이스{
	
	String name;
	// 해쉬 맵 Hash Map => HashMap
	// 키 	: 밸류
	// key 	: value
	// "이름" : "이순신"
	// 자바에서 제공하는 클래스 임포트 => 자동 임포트 CTRL + SHIFT + O (알파벳)
	// 해쉬맵 <제네릭 => 타입지정> 생성됟객체이름 = new 해쉬맵<> ();
	HashMap <String, String> map = new HashMap<>();
	
	@Override
	public String getGrade(String name, int jumsoo) {
		
		this.name =name;
		
		String grade;
		if(jumsoo >=95 && jumsoo <=100) {
			grade = "A+";
		}
		else if(jumsoo >=90 && jumsoo <95) {
			grade = "A";
		}
		else if(jumsoo >=85 && jumsoo <90) {
			grade = "B+";
		}
		else if(jumsoo >=80 && jumsoo <85) {
			grade = "B";
		}
		else if(jumsoo >=75 && jumsoo <80) {
			grade = "C+";
		}
		else if(jumsoo >=70 && jumsoo <75) {
			grade = "C";
		}
		else if(jumsoo >=65 && jumsoo <70) {
			grade = "D";
		}
		else if(jumsoo >=60 && jumsoo <65) {
			grade = "E";
		}
		else {
			grade = "F";
		}
		
		return  grade; // 문자열 리턴 값
	}
}


public class S02_클래스_상속_인터페이스_성적평가 {

	public static void main(String[] args) {
		Grade평가클래스조건문 a =new Grade평가클래스조건문();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("점수를 입력해주세요.");
		System.out.printf("학점 : %s, 이름 : %s\n" ,  a.getGrade("이순신",num=sc.nextInt()),a.name );
		System.out.printf("학점 : %s, 이름 : %s\n" ,  a.getGrade("권소영",num=sc.nextInt()),a.name);
		System.out.printf("학점 : %s, 이름 : %s\n" ,  a.getGrade("이수정",num=sc.nextInt()),a.name);
		System.out.printf("학점 : %s, 이름 : %s\n" ,  a.getGrade("정지연",num=sc.nextInt()),a.name);
		System.out.printf("학점 : %s, 이름 : %s\n" ,  a.getGrade("조지연",num=sc.nextInt()),a.name);
		System.out.printf("학점 : %s, 이름 : %s\n" ,  a.getGrade("홍우현",num=sc.nextInt()),a.name);
		
		
//		메서드에 프린트문을 그대로 쓰면 되는데, 리턴문이여서 순서가 중요하다.
//		결과
//		점수를 입력해주세요.
//		86
//		학점 : B+, 이름 : 이순신
//		97
//		학점 : A+, 이름 : 권소영
//		81
//		학점 : B, 이름 : 이수정
//		64
//		학점 : E, 이름 : 정지연
//		86
//		학점 : B+, 이름 : 조지연
//		70
//		학점 : C, 이름 : 홍우현
	}

}
