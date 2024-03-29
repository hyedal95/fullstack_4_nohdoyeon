package study.sub;

public class Waffle3{ //// 퍼블릭을 쓰면 외부에서 가져다 쓸 때 오류가 없다.
	private String name;
	private int price;
	
	public Waffle3(){
		this.name = "기본와플";
		this.price = 3000;
	} //기본 생성자 => 기본 생성자가 없으면, 매개변수 안 넣으면 무조건 오류가 뜸. 그래서 항상 기본 생성자 넣어주는 게 좋다.
	
	//매개변수 2개있는 것 
	public Waffle3(String name, int price){
		this.name = name;
		this.price =price;
	}
	
	public void getData() {
		System.out.printf("이름 : %s , 가격: %d \n" , this.name, this.price);
	}
}