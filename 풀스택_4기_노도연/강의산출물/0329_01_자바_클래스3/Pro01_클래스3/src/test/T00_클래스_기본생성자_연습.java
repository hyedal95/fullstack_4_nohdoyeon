package test;

public class T00_클래스_기본생성자_연습 {

	public static void main(String[] args) {
		// Pizza 객체 생성
		Pizza p = new Pizza();
		p.setData("치즈피자", 10000);
		p.getDate();

	}

}

class Pizza{
	//멤버변수(필드) 생성
	String name;
	int price;
	
	//기본생성자 생성
	Pizza (){
		System.out.println("class Pizza => Pizza(){} 기본생성자 생성");
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price =price;
		
	}
	
	void getDate() {
		System.out.printf("이름 : %s , 가격 : %d\n", this.name);
	}
}
