package study;

// 클래스 => 	메서드 포함된다.
//			메인메서드와 사용자 정의 메서드(리턴값 있는 메서드, 리턴값 업는 메서드) 존재함.
// 여러 조건이 있는데, 대표적으로 메서드가 포함이 되어있다.  
public class S01_메서드 {
	// 메인 메서드
	public static void main(String[] args) { //static에서 'void' 가 있는 경우는 리턴값이 없는 메서드이다.
		// # 메서드(Method) => 함수라고도 한다.
		// # 메서드이름은 식별자로 카멜케이스 기법 따른다. == 파일명 규칙과 같다.
		// # static 스태틱 => 클래스 내부에서 메모리에 고정적으로 할당된다.
		// # static => 프로그램이 시작되면 메모리 영역에 적재된다. ( 공간 차지! 그러나, 프로그램이 종료되면 해제된다.)
		// 클래스 내부에서 고정적으로 사용하는 메서드이구나! 생각하면 된다. 또 다른 특징으로는 인스턴스를 생성하지 않아도된다.
		// 2-1. 리턴값이 있는 메서드 호출
		int a = fn1(); // 메서드명으로 호출해서 int a라는 변수에 넣어줘라.
		System.out.println(a);
		// 결과 => 
		// 50
		
		// 2-2. 리턴값이 있는 메서드 호출
		double b =outPi();
		System.out.println();
		System.out.println(b);
		// 결과 => 
		// 3.14
	
		// 2-3. 리턴값이 있는 메서드 호출
		char c =ch();
		System.out.println();
		System.out.println(c);
		// 결과 => 
		// K
		
		// 2-4. 리턴값이 있는 메서드 호출
		String d =str();
		System.out.println();
		System.out.println(d);
		// 결과 => 
		// 문자열을 리턴하는 메서드
		
		// 2-5. 리턴값이 없는 메서드 호출 => 리턴값이 없는 메서드는 바로 호출
		System.out.println();
		str2();

		// 결과 => 
		// 문자열을 리턴하는 메서드
	}
		
	// # 메인 메서드 밖에 선언한다.
	// 1-1. 정수형(int) 메서드 선언 => 리턴값이 있는 메서드 
	//			void	=> 리턴값이 없는 메서드
	// [static 정의 int 숫자 () 있어서 함수 ] 
	static int fn1() {
		return 50; // 반환 할 값 적어주기
	}
	
	// 1-2. 실수형(double) 메서드 선언 => 리턴값이 있는 메서드
	static double outPi() {
		return 3.14; 
	}
	// 1-3. 문자형(char) 메서드 선언 => 리턴값이 있는 메서드
	static char ch() {
		return 'K';  //홀따옴표 써야 char이 된다.
	}
	// 1-4. 문자열(String) 메서드 선언 => 리턴값이 있는 메서드
	static String str() {
		return "문자열을 리턴하는 메서드";  
	}
	// 1-5. 리턴값이 없는 메서드
	static void str2() { //리턴이 없으니, 출력을 이곳에서 한다.
		System.out.println("리턴값이 없는 메서드"); 
	}
}

//main은 공용 public 꼭 들어간다.
