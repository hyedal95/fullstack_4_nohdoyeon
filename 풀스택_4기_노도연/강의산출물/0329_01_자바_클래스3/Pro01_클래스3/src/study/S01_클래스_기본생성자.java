package study;

import study.sub.Waffle;

public class S01_클래스_기본생성자 {

	public static void main(String[] args) {
		// 외부 클래스 사용할려면 선언 먼저 해야한다. 
		Waffle waffle = new Waffle(); // waffle 객체 생성 // 기본생성자는 선언만하면 출력이 된다.
		waffle.setData("일반와플", 3000); //데이터 입력(초기화)
		waffle.getData(); //데이터 출력(내보내기)
		
		
//		결과
//		class Waffle{} => Waffle() 기본 생성자 구동
//		이름: 일반와플 , 가격: 3000 


	}

}
