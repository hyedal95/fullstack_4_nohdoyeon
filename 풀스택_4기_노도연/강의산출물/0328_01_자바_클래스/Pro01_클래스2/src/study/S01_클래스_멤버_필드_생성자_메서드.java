package study;

/*
 # 클래스 멤버 용어 정리
 
 class {
 	필드;
 	생성자;
 	메서드;
 }
 
 # 클래스의 멤버
 -  멤버 ? = 클래스의 구성원인 필드,생성자,메서드를 모아서 부르는 명칭이다.
 	* 필드 	: 멤버 변수 (전역변수-(클래스 전체사용)== 클래스변수 , 지역변수{중괄호 내부에 선언된 영역안에서 사용})
 	* 메서드 	: 멤버 함수
 	* 생성자 	: 클래스 이름을 'new 클래스이름()' => 인스턴스 (객체) 생성 
 	*		: 클래스 이름에 new를 붙이면 만들어지는 객체를 생성자라고 부른다.  
 # 객체생성(인스턴스)
 	클래스 이름(클래스 타입) 객체이름 = new 클래스이름( );
 	
 # static 키워드
 
 	- non-static 지역 멤버변수
 	- non-static 지역 멤버함수
 	
 	- static 전역 멤버변수
 	- static 전역 멤버함수
 
		[1]. 클래스 선언 (외부 클래스)
		
		class Person {
			
		}
		
		[2]. 클래스 설계
		
		
		class Person {
			* 필드(멤버변수);
			이름;
			나이;
			시력;
			취미;
			
			(1). static이 없는 경우 메서드(멤버함수) 
			
			void showProfile{
				* 출력설계;
				이름;
				나이;
			}
			
			(2). static이 있는 경우 메서드(멤버함수)
			
			static void showProfile2{
				* 출력설계;
				이름;
				나이;
				시력;
				취미;
			} 
		}
*/
public class S01_클래스_멤버_필드_생성자_메서드 {

	public static void main(String[] args) {
		// [2] 객체 생성해서 사용
		// Person.show_profile1(); => 오류발생! ? 객체를 생성해야만 호출실행가능
		// Person 객체이름 = new Person(); 
		Person per = new Person(); 
		
		//결과
//		이름 : 해달
//		나이 : 30
		// 1. 멤버함수1 호출 : 입력(저장) => 출력
		// 1-1. 입력(저장) 후 출력
		per.name = "해달";
		per.age = 30;
		per.sight =1.2;
		per.hobby = "애니메이션 시청 & 드라마 결말포함 몰아보기";
//		결과
//		이름 : 해달
//		나이 : 30
//		시력 : 1.2
//		취미 : 애니메이션 시청 & 드라마 결말포함 몰아보기
		
		// 1-2. 멤버함수 출력
		per.show_profile1(); // 인스턴스이름.멤버함수 불러옴.
		
		// 결과
//		이름 : 해달
//		나이 : 30
		
		// 2. 멤버변수 호출
//		System.out.println("이름 : " + 객체이름.멤버(이름선택));
		
		System.out.println("이름 : " + per.name);
		System.out.println("나이 : " + per.age);
		System.out.println("시력 : " + per.sight);
		System.out.println("취미 : " + per.hobby);
//		결과
//		이름 : 해달
//		나이 : 30
//		시력 : 1.2
//		취미 : 애니메이션 시청 & 드라마 결말포함 몰아보기
		
		// 3. static 멤버함수2 호출
		
		Person.show_profile2();
		
		//결과
//		static void show_profile2()
		
		

		// [3] 객체생성 없이 => static 전역변수 static 전역함수 호출 실행
		// 클래스이름.멤버변수 static
		// 클래스이름.멤버함수 static
		System.out.println();
		
		System.out.println("[3] 객체생성 없이 => 전역변수 전역함수 호출 실행");
		System.out.println("시력 : " + per.sight);
		System.out.println("취미 : " + per.hobby);
//		결과
//		[3] 객체생성 없이 => 전역변수 전역함수 호출 실행
//		시력 : 1.2
//		취미 : 애니메이션 시청 & 드라마 결말포함 몰아보기
		
		
		Person.show_profile2();
//		결과
//		static void show_profile2()
//		시력 : 1.2
//		취미 : 애니메이션 시청 & 드라마 결말포함 몰아보기		
		
		System.out.println();

		

	}

}//메인 클래스 끝

//[1] 클래스 선언
class Person {
	// 필드(4개의 멤버변수)
	String 	name; // 지역변수 =>반드시 외부에서 객체를 생성해야만 호출실행 가능
	int 	age;  // 지역변수 =>반드시 외부에서 객체를 생성해야만 호출실행 가능
	static double	sight; // 전역변수 => 객체생성 없이도 호출실행 가능
	static String	hobby; // 전역변수 => 객체생성 없이도 호출실행 가능
	
	// 리턴값없는 메서드(멤버함수) => 지역함수 =>반드시 외부에서 객체를 생성해야만 호출실행 가능
	void show_profile1() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	// 리턴값없는 static(정적) 메서드(멤버함수) => 전역변수 => 객체 생성 없이도 호출실행가능
	// static => 전역함수, 전역변수
	// static => 지역변수 사용 불가 [지역변수를 전역으로 바꾸어줘야 사용가능]
	
	// 전역이란, 필드 멤버변수 앞에 static을 붙여주는 것
	static void show_profile2() {
		//System.out.println("이름 : " + name); 지역변수는 static 내에서는 사용불가 => 오류발생
		//System.out.println("나이 : " + age); 지역변수는 static 내에서는 사용불가 => 오류발생
		System.out.println("static void show_profile2()");
		System.out.println("시력 : " + sight);
		System.out.println("취미 : " + hobby);
	}

}