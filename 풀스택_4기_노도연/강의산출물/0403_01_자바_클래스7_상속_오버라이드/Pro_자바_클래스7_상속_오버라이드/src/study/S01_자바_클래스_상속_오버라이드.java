package study;
/*
	# 부모클래스 = 대학교
	# 자식클래스 = 학생
	
	1. 부모클래스(슈퍼클래스 ==상위클래스) => 대학교 (University)
		1) 멤버변수(필드) 
			- 학교명 => name
			- 학과 => department
		2) 멤버함수(메서드)
			- 세터함수 setData()
			- 게터함수 getData()
			
	2. 자식클래스(서브클래스 ==하위클래스) => 학생 (Student)
		1) 멤버변수(필드)
			- 학생이름 => name
			- 학과 => department
			- 학년 => year
			- 성적 => grade
		
		2) 멤버함수(메서드) 
			@Override => 부모클래스의 메서드 내용 변경하는 것
			- 세터함수 setData()
			@Override
			- 게터함수 getData()
	3. 클래스 상속을 구현 자유롭게 데이터 오버라이딩 입력 출력 구현하시오.
 */

class University{
	String name;
	String department;
	
	void setData(String name,String department) {
		this.name =name;
		this.department = department;
	}

	void getData() {
		System.out.println("대학교 정보");
		System.out.printf("대학교명: %s\n",this.name);
		System.out.printf("학과이름: %s\n",this.department);
	}
	
}

class Student extends University{
	String name;
	String department;
	int year;
	String grade;
	
	
	void setData(String name, String department, int year, String grade){
		this.name =name;
		this.department =department;
		this.year =year;
		this.grade =grade;
		
	}
	// 부모 클래스 setData()  @Override => ctrl +스페이스바 => 자동 코딩
	@Override
	void setData(String name, String department) { //대학교 내용 변경 //Override 부모클래스의 내용만 변경 
		System.out.println("override 변경 테스트");
		super.setData(name+"대학교", department+"학과");
		
		
	}
	//// 부모 클래스 getData()  @Override  => Ctrl +스페이스바 => 자동 코딩
	@Override
	void getData() {
		super.getData();
		System.out.printf("학생이름: %s\n", this.name);
		System.out.printf("학생과목: %s\n", this.department);
		System.out.printf("학생학번: %d\n", this.year);
		System.out.printf("학생점수: %s\n", this.grade);
	}
	
}


public class S01_자바_클래스_상속_오버라이드 {

	public static void main(String[] args) {
		Student s = new Student(); //부모클래스 객체명 = new 자식클래스() ;로 해도 상관없으나, 일반적으로 자식클래스명 객체명 = new 자식클래스명();을 이용한다.
		
		s.setData("노도연", "java", 2021, "C학점"); //자식 클래스 데이터 초기화 =>자식클래스의 setData 메서드 입력
		s.setData("한국방송통신", "컴퓨터과"); //부모클래스 데이터 오버라이딩 초기화 => 자식클래스에서 오버라이딩한 부모클래스의 setData 메서드 변경입력
		s.getData(); //부모클래스 멤버변수와 자식클래스 멤버변수 오버라이딩출력 => 자식클래스의 getData()에 오버라이딩으로 부모와 자식의 get 데이터 같이 출력! 
		
		
	}

}
