package study;

import java.util.ArrayList;
import java.util.Arrays;

/*
	# 배열 Array
	- 고정 길이
	- 배열의 길이 => length
	 
	# 컬렉션 ArrayList
	- import 해야 사용 할수 있다.
	- 가변 길이 => size
	
 */
public class S01_배열_ArrayList {

	public static void main(String[] args) {
		// 1-1. 배열 => 문자열 저장하는 배열 선언
		String[] java = {"클래스","상속","리스트","배열","메서드"};  //java[0] ... java[4] 까지
		
		// 1-2. 배열 => 인덱스값 이용 출력 => for(){}
		for(int i =0; i<java.length; i++) {
			System.out.println(java[i]);
		}
//		클래스
//		상속
//		리스트
//		배열
//		메서드
		
		// 1-3. 배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}
		//	  배열이나 컬렉션에 들어 있는 데이터를 차례로 변수에 저장하여 출력하는 반복문
		System.out.println();
		for(String item : java) {
			System.out.println(item);
		}
//		클래스
//		상속
//		리스트
//		배열
//		메서드
		
		// 2-1.숫자배열 = 리터럴{} 
		int [] arr = {10,20,30,40,50};
		// 2-2.숫자배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}
		System.out.println();
		for(int item : arr) {
			System.out.println(item);
		}
		
//		10
//		20
//		30
//		40
//		50
		
		// 2-3. 평균 계산하기
		int hap = 0;
		double avg = 0.0;
		
		for(int item: arr) {
			hap += item;
		}
		avg = hap / 5.0;
		
		// 2-4. 평균 출력 => Arrays.toString(arr) 배열을 문자열로 변환 
		System.out.printf("총점 : %d \n", hap);
		System.out.printf("평균 : %.2f \n", avg);
		System.out.printf("배열 : %s \n", arr); //배열 : [I@a14482 
		System.out.printf("배열 : %s \n", Arrays.toString(arr) ); //배열 : [10, 20, 30, 40, 50] 
//		총점 : 150 
//		평균 : 30.00 
//		배열 : [I@a14482 
//		배열 : [10, 20, 30, 40, 50]   
//		배열을 문자열로 보고 싶을 때 이렇게 적용해준다. 
//		^ Arrays.toString(arr)
		
		// 3. 컬렉션 => ArrayList =>임포트 => ctrl+shift+o
		// 	   - 가변길이
		// ArrayList<String> 생성될 객체이름 = new ArrayList<>();
		// 3-1. ArrayList 선언
		ArrayList<String> list = new ArrayList<>();
		
		// 3-2. ArrayList 배열항목 추가하기(add) <=> (remove)
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		list.add("수박");
		list.add("사과");
		
		// 3-3. ArrayList 배열 전체 출력
		System.out.println();
		System.out.println();
		System.out.println("ArrayList 배열 전체 출력하기");
		System.out.println(list);

//		ArrayList 배열 항목 출력하기
//		[딸기, 바나나, 망고, 수박, 사과]
		
		// 3-4. ArrayList 배열 항목 반복문 출력
		System.out.println();
		System.out.println();
		System.out.println("ArrayList 배열 항목 출력하기");
		for(String item:list) {
			
			System.out.println(item);
		}
		
		//3-5 ArrayList  .get(인덱스번호) 게터 함수 배열
		System.out.println();
		System.out.println();
		System.out.println("ArrayList  .get(인덱스번호) 게터 함수 배열");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		// 3-6. ArrayList .remove("삭제할내용") 리스트 삭제
		System.out.println();
		System.out.println("ArrayList .remove(\"삭제할내용\") 적용 전");
		System.out.println(list);
		
		
		list.remove("딸기");
		System.out.println();
		System.out.println("ArrayList .remove(\"삭제할내용\") 적용 후");
		System.out.println(list);
		
		// 3-7. ArrayList .get(인덱스번호) 게터 함수 배열 항목 반복문 출력
		System.out.println();
		System.out.println();
		System.out.println("ArrayList  .get(인덱스번호) 게터 함수 배열");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
//		ArrayList  .get(인덱스번호) 게터 함수 배열
//		바나나
//		망고
//		수박
//		사과
	}

}
