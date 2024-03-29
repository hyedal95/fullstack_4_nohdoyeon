package test;

public class T00_클래스_매개변수_생성자_연습 {

	public static void main(String[] args) {
		// 기본생성자 구현
		Pizza2 p = new Pizza2();
		p.getDataDefault();
		
		// 생성자 매개변수1개 출력
		Pizza2 p1 = new Pizza2("이탈리안피자");
		p1.getDataDefault();
		
		// 생성자 매개변수2개 출력
		Pizza2 p2 = new Pizza2("이탈리안피자", 15000);
		p2.getDataDefault();

	}

}

class Pizza2{
	String name;
	int price;
	
	//기본생성자
	Pizza2(){
		this.name = "기본피자";
		this.price = 10000;
	}
	void getDataDefault() {
		System.out.printf("이름: %s , 가격: %d\n" , this.name, this.price);
	}
	//매개변수1개 생성자
	Pizza2(String name){
		this.name =name;
	}
	void getDataPa1() {
		System.out.printf("이름: %s , 가격: %d\n" , this.name, this.price);
	}
	//매개변수2개 생성자
	Pizza2(String name, int price){
		this.name =name;
		this.price =price;
	}
	void getDataPa2() {
		System.out.printf("이름: %s , 가격: %d\n" , this.name, this.price);
	}
	
}