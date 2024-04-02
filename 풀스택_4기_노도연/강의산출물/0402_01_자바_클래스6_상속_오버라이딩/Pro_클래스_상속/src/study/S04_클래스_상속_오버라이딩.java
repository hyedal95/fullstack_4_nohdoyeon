package study;

/*
	# 오버라이딩2
	1. 부모클래스(SuperClass) 	: 동물(Animal)
		-멤버변수 	: 우는소리 (sound) 
		-게터 & 세터 
	
	2. 자식클래스(SubClass) 동물1 	참새(Bird)	 	짹짹
	3. 자식클래스(SubClass) 동물2 	오리(Duck) 		꽥꽥
	4. 자식클래스(SubClass) 동물3 	호랑이(Tiger) 	어흥
	
	2. 자식클래스 : 
	
 */

// 1. 부모클래스
class Animal{
	String name;
	String sound;
	
	//1) 기본생성자
//	Animal(){}
	//2) 세터메서드
	void setData(String name,String sound) {
		this.name =name;
		this.sound =sound;
	}
	
	//3) 게터메서드
	void getData() {
		System.out.println("동물우는 소리");
	}
}
// 2. 자식클래스(SubClass) 동물1 	참새(Bird)	 	짹짹
class Bird extends Animal{
	

	//부모 클래스 게터 메서드 이용 => 오버라이딩 구현
	@Override
	void setData(String name,String sound) {
		// TODO Auto-generated method stub
		super.setData(name,sound);
	}
	

	@Override
	void getData() {
		
		super.getData();
		System.out.printf("%s 울음소리 %s \n", super.name,super.sound);
	}

}
//3. 자식클래스(SubClass) 동물2 	오리(Duck) 		꽥꽥
class Duck extends Animal{
	//부모 클래스 게터 메서드 이용 => 오버라이딩 구현
	
	@Override
	void setData(String name,String sound) {
		// TODO Auto-generated method stub
		super.setData(name,sound);
	}
	
	@Override
	void getData() {
		
		super.getData();
		System.out.printf("%s 울음소리 %s \n", super.name,super.sound);
	}
}
//4. 자식클래스(SubClass) 동물3 	호랑이(Tiger) 	어흥
class Tiger extends Animal{
	//부모 클래스 게터 메서드 이용 => 오버라이딩 구현
	@Override
	void setData(String name,String sound) {
		
		super.setData(name,sound);
	}
	
	@Override
	void getData() {
		
		super.getData();
		System.out.printf("%s 울음소리 %s \n", super.name,super.sound);
	}
}


public class S04_클래스_상속_오버라이딩 {
	public static void main(String[] args) {
		//인스턴스생성 구현 
		Bird bird = new Bird(); 
		Duck duck = new Duck(); 
		Tiger tiger = new Tiger(); 
		
		// 참새 오버라이딩 호출 실행
		bird.setData("참새","짹짹짹째째째짹쨲!!!");
		bird.getData();
		
//		동물우는 소리
//		참새 울음소리 짹짹
		
//		동물우는 소리
//		참새 울음소리 짹짹짹째째째짹쨲!!! 
		
		// 오리 오버라이딩 호출 실행
		duck.setData("오리","꽦꽥꽤꽤꼬ㅒ꽤ㅗ꺠꼬ㅒ꽤!!");
		duck.getData();
		
//		동물우는 소리
//		오리 울음소리 꽥꽥
		
//		동물우는 소리
//		오리 울음소리 꽦꽥꽤꽤꼬ㅒ꽤ㅗ꺠꼬ㅒ꽤!! 
		
		// 호랑이 오버라이딩 호출 실행
		tiger.setData("호랑이","어흐엉으흫흥어흥ㅇ!!!");
		tiger.getData();
		
//		동물우는 소리
//		호랑이 울음소리 어흥

//		동물우는 소리
//		호랑이 울음소리 어흐엉으흫흥어흥ㅇ!!! 
		
		
//		setData는 데이터를 수정하고 getData는 데이터를 가져온다.


	}

}
