package study;

/*
 	# 오버라이딩
 		- 오버라이딩이란?
 		: 부모클래스로부터 상속받은 메서드의 내용을
 		자식 클래스가 재정의(변경)하는 것을 
 		오버라이딩(@Override)이라한다.
 		오버라이딩은 자식클래스에서 실행한다.
 		어노테이션 =>@Override
 		
 		
 		
 		@Override  // =>상속받은 자식클래스가  부모클래스의  getData() 메서드 내용을 변경한다는 의미
 		void getData(){
 			sysout1
 			sysout2
 			sysout3
 		}
 */

// 1. 부모클래스
class ParentClass{
	String name;
	int payment;
	
	ParentClass(){} //부모클래스의 기본 생성자
	
	// 1) 이름,급여 셋팅 (초기화)하는 메서드 setData (이름,급여)
	void setData(String name,int payment) {
		this.name = name;
		this.payment = payment;
		
	}
	// 2) 이름,급여 출력 하는 메서드 getData()
	void getData1() {
		System.out.printf("이름 : %s \n급여: %d \n", this.name, this.payment);
		
	}
}

// 2. 자식클래스
class ChildClass extends ParentClass{
	String department; //부서
	// 1) 자식요소의 세터메서드 => 부모클래스의 같은 메서드로서 오버로딩 구현
	void setData(String name,int payment,String department) {
		super.setData(name,payment); // 부모클래스의 세터메서드
		this.department =department;
	}
	
	// 1)오버라이딩 => 부모 클래스의 세터메서드(매개변수 개수를 그대로 유지해야한다.) 
	@Override
	void setData(String name, int payment) { //부모 메서드를 가져오지만 값만 변경 가능, 매개변수 수정 안됨.
		
		super.setData(name, payment+100); // super => 부모클래스.세터메서드() => super.를 붙임으로서 자식 세터메서드랑 분류한다.

		
	}
	
	
	// 2) 게터 => 부모클래스 멤버변수, 멤버함수를 가져온다.
	void getData2(){
		getData1(); //부모클래스의 겟 데이터 호출
		System.out.printf("부서: %s\n", this.department); // 자식클래스의 내용 호출 출력
	}
	
	// 2) 오버라이딩 => 부모 클래스의 getData1() 메서드를 호출 변경 실행한다.
	//ctrl + 스페이스바 => get -> getData1 선택  => 자동으로 오버라이딩된 getData1() 메서드가 나온다.
	@Override  
	void getData1() {
		
//		super.getData1(); // 부모가 기본으로 생성이 된다.
		System.out.println("오버라이딩 내용 출력입니다.");
		System.out.printf("이름:  %s \n", this.name);
		System.out.printf("월급:  %s \n", this.payment);
		System.out.printf("부서:  %s \n", this.department);
	}
	
}

public class S03_클래스_상속_오버라이딩 {

	public static void main(String[] args) {
		ChildClass child = new ChildClass(); 
		
		child.setData("노도연", 3000000, "백엔드개발팀");
//		child.getData2();
		
		child.setData("이순신",2500000); //오버라이딩 세터함수
		child.getData1(); //오버라이딩 게터함수
		
//		이름 : 노도연 
//		급여: 3000000 
//		오버라이딩 내용 출력입니다.
//		부서:  백엔드개발팀 

//		오버라이딩 내용 출력입니다.
//		이름:  이순신 
//		월급:  2500100 
//		부서:  백엔드개발팀 

	}

}
