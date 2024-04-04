package study;

/*
	# 기본자료형( Number형[byte , shot,int, long, float,double], 문자형과 문자열형 [char,String], 참거짓형[boolean] ...) 
	# 캐스팅 : 형(타입)변환
	- 업캐스팅 	: 작은 타입 => 큰 타입 변환
	- 다운캐스팅	: 큰 타입 => 작은 타입 변환
	
	예시]
		int num = 20;
		double num2 = num; // 업캐스팅(int 정수 => double 실수 : 정수20이 실수 타입으로 자동 형변환)  : (작은타입 => 큰타입)
		
		double num3 = 567.9871;
		int num4 = (int)num3; // 다운캐스팅 : ( 큰 타입 => 작은 타입) : (작은타입)강제형변환
		
	============================================================================================================
	# 참조자료형(클래스 class, 배열 arr, 인터페이스) 
	# 클래스 상속 => 캐스팅 (클래스 형변환) => 상속관계에서만 
	- 업캐스팅 	: 자식클래스(하위클래스==서브클래스) => 부모클래스(상위클래스==슈퍼클래스)로 변환
	- 다운캐스팅	: 
		* 업캐스팅된 객체(클래스)의 타입을 다시 원래대로 되돌리는 것(복원)    ***개념이 다름. ***
		* 반드시 업캐스팅된 객체만 다시 복원 가능하다.
	
 */
// 클래스명은 첫글자 대문자인 파스칼 케이스 사용
// 1.  슈퍼클래스 : 동물 (Animal)
class Animal{
	String sound;
	

	//자동 완성은 
//	오른쪽 마우스 소스 에 게터 세터 사운드 선택하고 Last member 선택 / 첫번째 게터 그리고 세터 만들겠다 선택하고 , 기본 public (다른 패키지에서도 사용) final은 상수변환 => 제너럴

	public void getSound() {
		System.out.println("동물우는소리");
		System.out.printf("%s\n",this.sound);
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
}
// 2.  서브클래스 : 오리 (Duck)
class Duck extends Animal{
	String name;
	//After member 선택시 name 다음줄에  생성하겠다.

	public void setName(String name) {
		this.name = name;
	}
	
	//컨트롤 스페이스바 set 치면 나온다. [자동 오버라이드] 
	@Override
	public void setSound(String sound) {
		super.setSound(sound);
	}
	@Override
	public void getSound() {
		System.out.printf("동물 중 %s는 %s 운다.\n", this.name,super.sound );
	}

	
}

public class S01_자바_클래스_상속_업캐스팅_다운캐스팅 {

	public static void main(String[] args) {
		int num = 20;
		double num2 = num; // 업캐스팅(int 정수 => double 실수 : 정수20이 실수 타입으로 자동 형변환)  : (작은타입 => 큰타입)
		
		double num3 = 567.9871;
		int num4 = (int)num3; // 다운캐스팅 : ( 큰 타입 => 작은 타입) : (작은타입)강제형변환
		
		Duck d = new Duck();
		

		d.setName("오리");
		d.setSound("꽥꽦꽦"); // 부모클래스에 있는 걸 자식클래스에 오버라이드했기때문에 Duck에서 가져와서 쓸 수 있느 것! 
		d.getSound();


//		동물 중 오리는 꽥꽦꽦 운다.
		
		// 업캐스팅 구현 /////////////////////////////////////////////////////
		// # 자식클래스와 부모클래스의 공통요소(멤버)만 사용가능 그리고 부모클래스 멤버 모두 사용가능
		// 	=> 자식클래스에만 존재하는 멤버=> setName(), name 두 개는 사용 불가능
		// 중요한 것은 클래스의 참조타입이 무엇이냐!!! 
		// 클래스의 참조타입이 큰 부모클래스로 자식클래스가 자동으로 형변환된다. => 업캐스팅
		// 이름은 다르기에 따로 쓸 수 있으나, 방법은 아래와같이 쓸 수 있다/
		Animal  d2 =new Duck(); 	//  업캐스팅 : 부모클래스 <= 자식클래스   
		Animal ani1 = d; 		//  업캐스팅 : 부모클래스 <= 자식클래스   
		Animal ani2 =new Duck(); //  업캐스팅 : 부모클래스 <= 자식클래스   
		
		ani2.setSound("꿀꿀");
		ani2.getSound();
//		

//		동물 중 null는 꿀꿀 운다.
		
		
		// 다운캐스팅 구현(복원) = > 부모클래스타입 => 자식클래스타입
		// 자식클래스 인스턴스이름 = (자식클래스) 업캐스팅된인스턴스이름
		
		Duck d3 = (Duck) ani2; //강제형변환 
		
		d3.setName("강아지");
		d3.setSound("멍멍");
		d3.getSound();
		
//		동물 중 강아지는 멍멍 운다.
	}

}
