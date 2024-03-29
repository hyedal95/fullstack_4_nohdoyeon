package study.sub;

public class Waffle{
//	멤버변수(필드)
	private String name; // 아무것도 정의되지 않고 변수 선언만 한 것! 기본값은 null // private는 같은 클래스 내부에서만 쓸 수 있음. 
	private int price; // 아무것도 정의되지 않고 변수 선언만 한 것! 기본값은 0


	//기본생성자
	public Waffle(){ 
		System.out.println("class Waffle{} => Waffle() 기본 생성자 구동");
	}
	
	// 세터 메서드 => 와플 이름, 가격 설정(초기화)하는 메서드 (vue에서는 설정하는 메서드를 세터메서드라고 한다.)
	public void setData(String name, int price) {
		//String name =이름;  //지역변수 = > 클래스의 변수와 같더라도 다르다.
		//int price =가격; 
		this.name = name; // this => 클래스의 객체를 의미한다. 내부의 지역변수와 중복되더라도 막을 수가 있는 것이다.
		this.price = price;
	}
	
	// 게터 메서드 => 데이터(와플이름,가격)내보내주는 메서드 
	public void getData() {
		System.out.printf("이름: %s , 가격: %d \n",this.name,this.price);  // 왠만하면 클래스 내부에서 사용할 때는 this. 를 붙여준다.
	}
	
}