package study;

/*
 # 클래스 Class
 	- 필드(Field 필드)  => 변수 이용 배열 ,반복문, 자료타입, 메소드 이용해서 응용도 해봄
 	- 메서드(Method 메서드) => 메서드 선언 및 메서드 출력도 해봄
 	- 생성자(Constructor 컨스트럭터) =>0327 배울 내용 
	
 */

public class S01_클래스_시작하기 {

	public static void main(String[] args) {
		// 외부 클래스는 객체(인스턴스)를 생성하여 사용할 수 있다.
		Rectangle rec = new Rectangle(); // 인스턴스(객체) 생성 EX) 클래스명 [객체이름] = new 클래스명();
		
		System.out.println("클래스 내부 변수 width 가져오기");
		System.out.println(rec.area); // 객체. 하면 해당 클래스에서 가져올 수 있는 필드들이 쫘아아아아악 나온다.
	
		
	}// main 메인 메서드
} // main 메인 클래스

// 외부클래스 시작
// 클래스 선언 => 사각형(Rectangle) 클래스 선언 
// 선언된 클래스는 
// 메인메소드 안에서 
// 생성자를 이용 인스턴스(객체)를 생성하여 사용한다.

// 클래스 이름은 파스칼케이스(첫글자 대문자 Rect)
class Rectangle{
	int width = 90;
	int height = 150;
	int area = width * height;
	
}
