package study;

/*
	# 상속
	- 부모클래스(상위클래스, 슈퍼 클래스 SuperClass)
		class 부모 클래스{
		
		
		}
	- 자식클래스(하위클래스, 서브클래스 SubClass)
		* 부모 클래스 => 상속
		class 자식클래스명 extents 부모클래스명 {
		
		
		}


 */

// 	# 부모클래스(superclass)
class Waffle{
	String name;
	int price;
	
	void msgS() {
		System.out.println("부모클래스 메시지");
	}
	void setData(String name, int price) {
		this.name =name;
		this.price =price;
	}
	void getDataS() {
		System.out.println("이름 : " +this.name);
		System.out.println("가격 : " +this.price);
	}
	
}

//	# 자식클래스(subclass)
class WaffleChild extends Waffle{
	String source;
	
	void msgC() {
		System.out.println("자식클래스 메시지");
	}
	
	//상속 관계에 있는 자식클래스에서 부모클래스의 메서드를 오버로딩으로 기능을 확장할 수 있다. 
	//오버로딩이 되어서 => 자식클래스의 메서드와 부모클래스의 메서드가 이름이 같다.
	void setData(String name, int price, String source) {
		setData(name,price);
		this.source =source;
		
	}
	
	//부모클래스와 자식클래스의 겟데이터 메서드이름은 달라야 한다.
	void getDataC() {
		getDataS(); // 부모 클래스 겟데이터 가져오고 
		System.out.println("소스 : " +this.source);
	}
	
}


public class S01_클래스_상속 {

	public static void main(String[] args) {
		WaffleChild wc = new WaffleChild();
		
		wc.msgC(); // 자식클래스 메시지 메서드 호출
		wc.msgS(); // 부모클래스 메시지 메서드 호출
		
		//자식클래스 세터메서드 => 멤버변수 초기화 ( 오버로딩 )
		wc.setData("캬라멜", 6000, "치즈");
		
		//출력메서드 게터메서드 
		wc.getDataC();
		
//		결과
//		자식클래스 메시지
//		부모클래스 메시지
//		이름 : 캬라멜
//		가격 : 6000
//		소스 : 치즈

	}

}
