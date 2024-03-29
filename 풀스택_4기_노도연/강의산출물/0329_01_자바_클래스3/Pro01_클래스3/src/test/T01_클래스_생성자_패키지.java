package test;

import test.sub.Student;

public class T01_클래스_생성자_패키지 {

	public static void main(String[] args) {

		//생성자를 이용 멤버변수 값을 초기화하고 
		// 메서드를 실행시켜 확인해봅시다. 
		
		Student s = new Student();
		s.setData("노도연", "자바", 9);
		s.getData();
		
//		멤버변수는 못들어간다.이유는 멤버변수(필드)에 private을 놓았기때문에
		
//		결과
//		기본생성자입니다.
//		자바 수업을 수강중입니다. 
//		노도연 의 생일은 9월입니다. 


	}
}


