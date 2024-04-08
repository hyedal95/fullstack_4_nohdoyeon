package study;


/*
	# 인터페이스(Interface)
		- 추상클래스의 일종으로 미완성 정도가 매우 높다.
		- 추상메서드의 (abstract) 와 상수 (final) 만으로 멤버를 가질 수 있다.
		- 인터페이스 전체가 추상 메서드 이기 때문에 (abstract) 생략가능하다.
		- 다중 상속이 가능하다.
		- 인터페이스에서 선언하는 모든 멤버는 접근제한자가 public, default 로 구성하고있다. 
		- 구현시 implements 뒤에 인터페이스이름이 온다.
		- 구현 시 => 오버라이딩 구현해야한다.
		 : 인터페이스 선언 내에 미완성 메서드(추상메서드)를 반드시 호출 수정 변경 추가 실행 해야한다. 
		- 구현 시 => 오버라이딩 = > public 접근제한자 필수로 붙는다.
		
	# 인터페이스 선언
	interface 인터페이스이름 {
		상수멤버변수; public static final; 
		추상메서드; public abstract 메서드 이름();  
	}
	
	# 인터페이스 구현(상속)  implements 임플리먼츠 => 단일상속
	class 클래스명 implements 인터페이스이름 {
		@Override
		추상메서드(){
			내용;
		}
	 }
	 
	# 인터페이스 구현(상속)  implements 임플리먼츠 => 다중상속
	class 클래스명 implements 인터페이스이름A,인터페이스이름B,인터페이스이름C {
		@Override
		추상메서드A(){
			내용;
		}
		@Override
		추상메서드B(){
			내용;
		}
		@Override
		추상메서드C(){
			내용;
		}
	 }
	# 클래스와 인터페이스 함께 다중상속
	class 클래스명 extends 클래스명 implements 인터페이스이름 A,인터페이스이름B,인터페이스이름C{
		@Override
		추상메서드A(){
			내용;
		}
		@Override
		추상메서드B(){
			내용;
		}
		@Override
		추상메서드C(){
			내용;
		}
	}
	
 */
/*
	# 인터페이스2개를 선언하고, 
	  클래스 1개를 선언하여
	  인터페이스를 구현하고
	  메인 클래스의 메인 메서드에서 
	  객체를 생성하여 실행한다.
*/
// 인터페이스1
interface Dug{ //오리
	void cry();//미완성 
}

// 인터페이스2
interface Dog{ //강아지
	void cry();
}



// 클래스 -> 오류 발생 : 이유 오버라이딩 구현하지 않으면 발생한다.
class Animal implements Dug, Dog{ //동물 => 인터페이스 구현
	@Override
	public void cry() {
		System.out.println("동물 울음소리");
		
	}
	
}


public class S01_클래스_상속_인터페이스 {

	public static void main(String[] args) {
		
		Animal animal = new  Animal();
		animal.cry();
		
//		결과
//		동물 울음소리
	}

}
