package study.sub;

public class Waffle2{ //외부 클래스명은 각 class에 생성된 이름과 중복되지 않도록한다.   *세터, 게터는 이해하기 쉽게 붙여놓은 이름
	private String name;
	private int price;
	//매개변수 있는 생성자를 선언하면 기본 생성자는 만들어 지지 않는다.
	//1. 세터 생성자(디폴트) => 생성자의 매개변수 값으로 멤버변수(필드)를 초기화(세터:설정)한다.
	public Waffle2(){ 
		//this 도입 => this는 객체 (클래스 자신) 
		this.name = "기본와플";
		this.price = 2500;	
	}
	//1. 게터 메서드
	public void getDataDefault() {
		System.out.printf("이름: %s , 가격: %d\n" , this.name, this.price);
	}
	//2. 세터 생성자(매개변수1개)
	public Waffle2(String name){ 
		this.name = name;
	}
	//2. 게터 메서드
	public void getDataPa1() {
		System.out.printf("이름: %s , 가격: %d\n" , this.name, this.price);
	}
	//3. 세터 생성자(매개변수2개)
	public Waffle2(String name, int price){ // 아까는 세터메서드에 넣었는데, 이번에는 생성자에 매개변수를 넣는다. //매개변수는 같아도 상관없음.
		this.name = name; //이 접근 방식은 클래스 내부에서 접근할 경우 this를 붙인다.
		this.price = price; 	
	}
	//3. 게터 메서드
	public void getDataPa2() {
		System.out.printf("이름: %s , 가격: %d\n" , this.name, this.price);
	}
}