package study;

import study.sub.Waffle3;


public class S03_클래스_객체배열선언 { // 퍼블릭을 쓰면 외부에서 가져다 쓸 때 오류가 없다.

	public static void main(String[] args) {
		// 기본 생성자
		Waffle3 waf = new Waffle3(); // 빨간 밑줄 오류는 오버로딩 기본생성자가 없기 때문에 오류 발생
		waf.getData();
//		결과
//		이름 : 기본와플 , 가격: 3000 
		
		// 객체3개 생성 반복 구현
		Waffle3 waf1 = new Waffle3("아이스크림", 5000 );
		Waffle3 waf2 = new Waffle3("딸기바나나", 7000 );
		Waffle3 waf3 = new Waffle3("누텔라", 8000 );
		
		waf1.getData();
		waf2.getData();
		waf3.getData();
		
		//결과
//		이름 : 아이스크림 , 가격: 5000 
//		이름 : 딸기바나나 , 가격: 7000 
//		이름 : 누텔라 , 가격: 8000 
		
		// 객체 배열 선언 구현 
		// 객체 배열 반복문 실행
		Waffle3[] arr = new Waffle3[5];//클래스를 배열 선언한다. 와플3의 객체 이름은 arr   
		//배열을 쓰는 이유는 이름은 같으나, 객체이름이 다 다르기 때문에 그리고 반복문 사용 가능함. 
		arr[0]= new Waffle3("아이스크림", 5000 );
		arr[1]= new Waffle3("딸기바나나", 7000 );
		arr[2]= new Waffle3("누텔라", 6000  );
		arr[3]= new Waffle3("카라멜", 8000  );
		arr[4]= new Waffle3("카푸치노", 8000  );
		
		for(int i=0; i<arr.length; i++) { // 0~ 2까지
			arr[i].getData(); // i가 0~2까지인 각 배열의 데이터가 나온다.
		}
		//결과
//		이름 : 아이스크림 , 가격: 5000 
//		이름 : 딸기바나나 , 가격: 7000 
//		이름 : 누텔라 , 가격: 8000 
		//결과
//		이름 : 아이스크림 , 가격: 5000 
//		이름 : 딸기바나나 , 가격: 7000 
//		이름 : 누텔라 , 가격: 6000 
//		이름 : 카라멜 , 가격: 8000 
//		이름 : 카푸치노 , 가격: 8000 


	}

}

//외부 클래스 파일로 저장 => Waffle3.java 옮김 (메인 생성 하지말고 만들어서 옮김)
