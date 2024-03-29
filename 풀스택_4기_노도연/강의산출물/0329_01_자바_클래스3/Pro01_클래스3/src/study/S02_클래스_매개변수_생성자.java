package study;

import study.sub.Waffle2;

//외부클래스 => Waffle2.java 옮김
public class S02_클래스_매개변수_생성자 {

	public static void main(String[] args) {
		//생성자 오버로딩이 이루어지고 있는 못브
		
		//1. 기본 생성자 구현
		Waffle2 waf = new Waffle2();
		//매개변수 1개냐 2개냐에 따라서 값을 넣어줘야한다.
		waf.getDataDefault();
//		결과
//		이름: 기본와플 , 가격: 2500
		
		//2. 생성자 매개변수1개 
		Waffle2 waf1 = new Waffle2("젤라또 와플");
		waf1.getDataPa1();
//		결과
//		이름: 젤라또 와플 , 가격: 0  => 가격은 없으니깐, 0 
			
		//3. 생성자 매개변수1개 
		Waffle2 waf2 = new Waffle2("누텔라치즈 와플", 5000);
		waf2.getDataPa2();
//		결과
//		이름: 누텔라치즈 와플 , 가격: 5000

	}

}
