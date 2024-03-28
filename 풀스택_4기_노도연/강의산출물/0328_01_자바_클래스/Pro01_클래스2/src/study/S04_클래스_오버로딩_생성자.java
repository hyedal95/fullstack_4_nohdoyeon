package study;

//기본 생성자만 가지고 있는 클래스 => 멤버변수, 멤버메서드 없는 클래스
class Waffle01{
	
}
class Waffle02{
	//멤버 변수 
	String name; //와플이름 : 외부에서 객체 생성해서 변경 가능
	int price; //와플가격 : 외부에서 객체 생성해서 변경 가능
	
	//멤버 메서드(함수) //리턴값 x(void) 값 변경 o
	
	//멤버변수 변경(초기화) 메서드 세터(setter) 메서드  vue랑 연결됨.
	void setData(String 와플이름,int 가격 ) {
		name = 와플이름;
		price = 가격;
	}
	
	//출력 메서드(함수) => 외부에 가져다가 쓸 수 있는 것 showData
	void showData() {
		System.out.printf("와플이름 : %s , 가격: %d", name, price);
	}
	
}

public class S04_클래스_오버로딩_생성자 {

	public static void main(String[] args) {
		// 변경 따로 출력 따로 이제 실행을 위해서 메인 클래스 내부 메인 메서드 안에 적어준다.
		Waffle01 w1 =new Waffle01();
 		Waffle02 w2 =new Waffle02();
 		
 		//세터 값을 초기화(변경)
 		w2.setData("사과잼와플", 4500);
 		//출력 
 		w2.showData();
 		
// 		결과
// 		와플이름 : 사과잼와플 , 가격: 4500
	}

}
