package test.sub;
// 이름[노도연], 수업명[자바], 생월[9월]
// 자바 수업을 수강중입니다.
// 노도연의 생일은 9월입니다.

// 외부 클래스는 패키지[test.sub] 
// => Student 클래스 파일 생성
// 메인 클래스에서 객체를 생성하여
// 멤버변수 값을 초기화하고 
// 메서드를 실행시켜확인해봅시다.

public class Student{
	//멤버변수(필드)
	private String name;
	private String subject;
	private int month;
	
	//기본생성자 만들어도 되고 안만들어도되고
	public Student(){
		System.out.println("기본생성자입니다.");
	}
	
	public void setData(String name, String subject, int month ) {
		this.name = name;
		this.subject = subject;
		this.month = month;
	}
	
	public void getData() {
		System.out.printf("%s 수업을 수강중입니다. \n",this.subject);
		System.out.printf("%s 의 생일은 %d월입니다. \n",this.name, this.month);
	}


}