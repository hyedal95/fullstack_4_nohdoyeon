package study;

// 1. 부모클래스
class Human{
	String name;
	int age;
	
	//기본생성자
	
	Human(){
		System.out.println("나는 사람입니다.");
	};
	//생성자 오버로딩 멤버변수만 !!! 
	Human(String name, int age) {
		this.name =name;
		this.age =age;
	}
	
	void getData1() {
		System.out.printf("저는 %s 이고 ,\n나이는 %d \n", this.name,this.age);
	}
}
// 2. 자식클래스
class Actor extends Human{
	String job;
	
	
	
	Actor(){
		System.err.println("나는 배우입니다.");
	};
	// 배우 전공
	Actor(String job){
		this.job=job;
	}
	// 이름, 나이, 전공 
	Actor(String name,int age,String job){
		// 부모 클래스의 생성자를 호출 => 슈퍼 super() 부모 생성자를 호출할 때 쓰임.
		// 부모 클래스의 생성자 오버로딩을 구현할 수 있다. super() , super(name, age);
		// super(); // Human(){} 기본 생성자 호출
		super(name, age); 
//		Human(name,age); // 이걸 사용할려면 인스턴스 객체를 만들어줘야한다.
//		Human human =new Human(name,age); 
		this.job=job;
	}
	
	void getData2() {
		System.out.printf("저는 %s 이고 ,\n나이는 %d ,\n%s 전공입니다.\n", this.name,this.age,this.job);
	}
}


public class S02_클래스_상속_super {

	public static void main(String[] args) {
		
		Actor actor = new Actor(); //기본 생성자 자동 부모클래스, 자식클래스 호출 출력
		
//		나는 사람입니다.
//		나는 배우입니다.
		
		// 배우 구체적 직업
		Actor actor2 = new Actor("아바타"); 
		actor2.getData2();
		
//		저는 null 이고 ,
//		나이는 0 ,
//		아바타 전공입니다.
		
		// 이름, 나이, 배우 구체적 직업
		Actor actor3 = new Actor("김아중",43,"영화연기"); 
		actor3.getData2();
		
//		저는 김아중 이고 ,
//		나이는 43 ,
//		영화연기 전공입니다.
		
		// 부모 클래스의 겟 데이터 호출실행
		System.out.println();
		actor3.getData1();
		
//		저는 김아중 이고 ,
//		나이는 43 
	}

}
