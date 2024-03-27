package study;

public class S05_메서드_응용 {
	
	//메서드 선언  fn1 ()
	// 1. void 메서드 이름 () {}  리턴값 x 매개변수 x 
	
	static void fn1() {
		System.out.println("메서드1번. 리턴값 x 매개변수 x");
		System.out.println("void 메서드 이름 () {}  리턴값 x 매개변수 x ");
	}
	// 2. String 메서드이름 ( ) {}  리턴값 o 매개변수 x 
	static String fn2() {
		return "메서드2번. 리턴값 o 매개변수 x " ;
	}
	// 3. void 메서드이름(int num1 ,int num2) {}  리턴값 x 매개변수 o
	static void fn3(int num1, int num2) {
		System.out.printf("메서드3번. 리턴값 x 매개변수 o => 점수1: %d, 점수2: %d \n", num1,num2);
		System.out.println("void 메서드이름(int num1 ,int num2) {}");
	}
	// 4. int 메서드이름(int num1, int num2) {} 리턴값 o 매개변수 o
	static int fn4(int num1, int num2) {
		return num1+num2;
		
	}

	public static void main(String[] args) {
		// 메서드 선언 => 메서드 호출 실행
		// 메서드 구성
		/*
		리턴값  매개변수 	매서드 선언
		 x		x		1. void 메서드이름() {}
		 o		x		2. String 메서드이름 ( ) {}
		 x		o		3. void 메서드이름(int num1 ,int num2) {}
		 o		o		4. int 메서드이름(int num1, int num2) {}
		 */
		
		//1. 메서드 호출 실행
		fn1();
		System.out.println();
		// 결과
		// 메서드1번. 리턴값 x 매개변수 x
		
		//2. 메서드 호출 실행
		String str =fn2();
		System.out.println(str);
		System.out.println( "String 메서드이름 ( ) {}");
		System.out.println();
		// 결과
		// 메서드2번. 리턴값 o 매개변수 x
		
		//3. 메서드 호출 실행
		fn3(80, 90);
		System.out.println();
		// 결과
		// 메서드3번. 리턴값 x 매개변수 o => 점수1: 80, 점수2: 90 
		
		//4. 메서드 호출 실행
		int hap = fn4(80,90);
		System.out.printf("메서드4번. 리턴값 o 매개변수 o => 합: " + hap +"\n");
		System.out.println("int 메서드이름(int num1, int num2) {}");
		//결과
		//메서드4번. 리턴값 o 매개변수 o => 합: 170
		

	}

}
