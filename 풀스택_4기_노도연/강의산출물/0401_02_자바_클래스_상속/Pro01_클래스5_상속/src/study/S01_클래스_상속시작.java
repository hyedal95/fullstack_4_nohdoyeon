package study;

/*
	# 상속(extends 익스텐즈)
	부모 클래스를 상속 받아 자식클래스를 작성하는 것. 
	자식 클래스는 부모클래스로부터 필드와 메서드를 상속 받는다. (단, 생성자는 제외 => 생성자는 우리가 직접 만들어 쓰는 것.)
	기존의 클래스를 재사용해서 새로운 클래스를 작성한다.
	
	클래스에서의 상속은 꽃 
	클래스의 확장성을 위한 것이 상속
	단, 자식에게 물려줄 때는 필드와 메서드만 물려준다는 것. 
	
	예제]
	대학교 School
	대학교 - 학생 Student
	대학교 - 교수 Professor 
	
	대학교 클래스 생성
	학생 클래스 생성
	대학교와 학생은 종속 관계 
	
	
	


 */
//부모클래스
class School{
	String names = "한국대학교";
	String address = "서울시";
}
//자식클래스(학생) => 자식이 부모클래스로부터 상속(extends) 받는다. 
class Student extends School{ // 부모클래스로부터 모든 데이터(필드와 메서드) 를 내려 받겠다. 
	String name= "노도연";
	String hakgwa= "정보처리";
	String hakbun= "2024";
}
//자식클래스(교수) 
class Professor extends School{
	String name= "문선종";
	String hakgwa= "정보처리";
}

public class S01_클래스_상속시작 {

	public static void main(String[] args) {
		
		Student student = new Student();
		Professor pro = new Professor();
		
		System.out.println("학생 클래스 정보 출력");
		System.out.printf("학생이름 : %s \n", student.name);
		System.out.printf("학생학교 : %s \n", student.names);
		System.out.printf("학생학교주소 : %s \n", student.address);
		System.out.printf("학생학과 : %s \n", student.hakgwa);
		System.out.printf("학생학번 : %s \n", student.hakbun);
		
//		결과
//		학생 클래스 정보 출력
//		학생이름 : 노도연 
//		학생학교 : 한국대학교 
//		학생학교주소 : 서울시 
//		학생학과 : 정보처리 
//		학생학번 : 2024 
		
		System.out.println();
		
		System.out.println("교수 클래스 정보 출력");
		System.out.printf("교수이름 : %s \n", pro.name);
		System.out.printf("학교이름 : %s \n", pro.names);
		System.out.printf("학교주소 : %s \n", pro.address);
		System.out.printf("학과 : %s \n", pro.hakgwa);
		
		


	}

}
