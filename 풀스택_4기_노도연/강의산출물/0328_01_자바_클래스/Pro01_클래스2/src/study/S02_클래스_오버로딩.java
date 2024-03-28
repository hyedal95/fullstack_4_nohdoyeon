package study;

/*
	# 메서드 오버로딩(Overloading)
		- 하나의 클래스에 같은 이름 메서드를 여러 개 선언하는 것
		- 같은 이름의 메서드로 매개변수 값(개수가 다르고, 타입이 다르다)에
		  따라 다른 메서드를 호출하여 사용한다.
		  
	# 오버로딩의 조건
		1. 메서드 이름이 같아야한다.
		2. 매개변수의 개수 또는 타입이 달라야한다.
		
		그 때 그 때 중요한 체크포인트 
		클래스는 지역멤버냐 전역멤버냐
		메서드를 호출해서 사용할 때 매개변수 값에 따라서 달라진다.
		jsp 곧 들어가는데 자바를 이용해서 홈페이지 제작할 때 
		해당 오버로딩이 많이 나온다. 
		
		오버로딩이라는 메서드에서 이름이 같은건데 타입 개수 다르다는 것...!!! 
	# 실습]
		클래스 설계
		1. 사격형 너비, 높이
			-클래스이름 사각형(Rectangle)
			 멤버변수 (필드) 너비 (width )
			 멤버변수 (필드) 높이 (height)
			 멤버함수 (메서드) 매개변수없는 메서드(){}
			 멤버함수 (메서드) 매개변수1개 메서드(너비){}
			 멤버함수 (메서드) 매개변수2개 메서드(너비,높이){}
	
 */

public class S02_클래스_오버로딩 {

	public static void main(String[] args) {
		// 1. 객체 생성
		Rectangle rec =new Rectangle();
		// 2. 생성된 객체에서 메소드 호출 실행
		
		// 오버로딩 매개변수 0개 
		int result =rec.area();  // 변수로 받아주느냐, 또는 변수로 쓰느냐의차이
		
		System.out.println();
		System.out.println("객체(인스턴스) rec 생성사용");
		System.out.println("사각형 면적 : " + result);
		System.out.println("사각형 면적 : " + rec.area());
//		결과
//		사각형 면적 : 900
		// 오버로딩 매개변수1개 => 너비
		
		System.out.println("사각형 면적 : " + rec.area(50));
//		결과
//		사각형 면적 : 1500
		
		// 오버로딩 매개변수2개 => 너비 ,높이
		
		System.out.println("사각형 면적 : " + rec.area(50, 50));
//		결과
//		사각형 면적 : 2500
		
		// 클래스 객체 다른 이름으로 생성
		Rectangle k = new Rectangle();
		result = k.area(); //한번 사용한 변수는 그대로
		System.out.println();
		System.out.println("객체(인스턴스) k 생성사용");
		System.out.println("사각형 면적 : " + result);
		System.out.println("사각형 면적 : " + rec.area());
		System.out.println("사각형 면적 : " + rec.area(50));
		System.out.println("사각형 면적 : " + rec.area(50, 50));
		
		
		
		
	}

}

class Rectangle{
	int width = 30;
	int height = 30;
	
	// 오버로딩 => 메서드 이름이 모두 area() 매개변수는 (),(1),(2)
	
	int area(){ // 매개변수 x 메서드
		return width*height;
	}
	
	int area(int width){ // 매개변수 1개  메서드
		return width*height;
	}
	int area(int width, int height){ //매개변수 2개 메서드
		return width*height;
	}
}
