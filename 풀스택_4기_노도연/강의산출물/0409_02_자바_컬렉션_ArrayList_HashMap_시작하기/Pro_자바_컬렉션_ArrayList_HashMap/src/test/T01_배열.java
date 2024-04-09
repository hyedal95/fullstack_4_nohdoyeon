package test;

import java.util.ArrayList;
import java.util.Arrays;

public class T01_배열 {

	public static void main(String[] args) {
		// 1-1. 배열 => 문자열 저장하는 배열 선언
				String[] job = {"프론트","백엔드","안드로이드","ios","데이터엔지니어"};
			// 1-2. 배열 => 인덱스값 이용 출력 => for(){}
				System.out.println("1-2. 배열 => 인덱스값 이용 출력 => for(){}");
				for(int i=0; i<job.length; i++) {
					
					System.out.println(job[i]);
				}
			// 1-3. 배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}
				System.out.println();
				System.out.println("1-3.배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}");
				for(String item: job) {
					
					System.out.println(item);
				}
			// 2-1.숫자배열 = 리터럴{} 
				int [] num = {50,60,70,80,90};
			// 2-2.숫자배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}
				System.out.println();
				System.out.println("2-2.숫자배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}");
				for(int item: num) {
					System.out.println(item);
				}
			// 2-3. 평균 계산하기
				int hap = 0;
				double avg = 0.0;
				
				for(int item: num) {
					hap += item;
				}
				avg = hap / 5.0;
			// 2-4. 평균 출력 => Arrays.toString(arr) 배열을 문자열로 변환 
				System.out.println();
				System.out.println("2-4. 평균 출력 => Arrays.toString(arr) 배열을 문자열로 변환 ");
				System.out.printf("총점: %d , 평균: %.2f \n", hap, avg);
				System.out.printf("배열 : %s \n", num);
				System.out.printf("배열 : %s \n", Arrays.toString(num));
			// 3. 컬렉션 => ArrayList =>임포트 => ctrl+shift+o
				
			// 3-1. ArrayList 선언
				ArrayList<String> list = new ArrayList<>();
			// 3-2. ArrayList 배열항목 추가하기(add) <=> (remove)
				list.add("HTML5");
				list.add("CSS3");
				list.add("JavaScript");
				list.add("Java");
				list.add("Jsp");
				list.add("Vue");
				list.add("Vuex");
				list.add("MYSQL");
			// 3-3. ArrayList 배열 전체 출력
				System.out.println();
				System.out.println("3-3. ArrayList 배열 전체 출력");
				System.out.println(list);
			// 3-4. ArrayList 배열 항목 반복문 출력
				System.out.println();
				System.out.println("3-4. ArrayList 배열 항목 반복문 출력");
				for(String item:list) {
					System.out.println(item);
				}
			// 3-5 ArrayList  .get(인덱스번호) 게터 함수 배열
				System.out.println();
				System.out.println("3-5 ArrayList  .get(인덱스번호) 게터 함수 배열");
				System.out.println(list.get(0));
				System.out.println(list.get(1));
				System.out.println(list.get(2));
				System.out.println(list.get(3));
				System.out.println(list.get(4));
				System.out.println(list.get(5));
				System.out.println(list.get(6));
				System.out.println(list.get(7));
			// 3-6. ArrayList .remove("삭제할내용") 리스트 삭제
				System.out.println();
				System.out.println("3-6. ArrayList .remove(\"삭제할내용\") 리스트 삭제");
				System.out.println(".remove 삭제 전 list 목록");
				System.out.println(list);
				
				System.out.println();
				System.out.println(".remove 삭제 후 list 목록");
				list.remove("HTML5");
				list.remove("CSS3");
				list.remove("Vuex");
				System.out.println(list);
			// 3-7. ArrayList .get(인덱스번호) 게터 함수 배열 항목 반복문 출력
				System.out.println();
				System.out.println("3-7. ArrayList .get(인덱스번호) 게터 함수 배열 항목 반복문 출력");
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i));
				}
				
				
				

	}

}

//출력결과문
//1-2. 배열 => 인덱스값 이용 출력 => for(){}
//프론트
//백엔드
//안드로이드
//ios
//데이터엔지니어
//
//1-3.배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}
//프론트
//백엔드
//안드로이드
//ios
//데이터엔지니어
//
//2-2.숫자배열 => 배열 항목 출력 => for(문자열타입 변수: 배열이름){}
//50
//60
//70
//80
//90
//
//2-4. 평균 출력 => Arrays.toString(arr) 배열을 문자열로 변환 
//총점: 350 , 평균: 70.00 
//배열 : [I@a14482 
//배열 : [50, 60, 70, 80, 90] 
//
//3-3. ArrayList 배열 전체 출력
//[HTML5, CSS3, JavaScript, Java, Jsp, Vue, Vuex, MYSQL]
//
//3-4. ArrayList 배열 항목 반복문 출력
//HTML5
//CSS3
//JavaScript
//Java
//Jsp
//Vue
//Vuex
//MYSQL
//
//3-5 ArrayList  .get(인덱스번호) 게터 함수 배열
//HTML5
//CSS3
//JavaScript
//Java
//Jsp
//Vue
//Vuex
//MYSQL
//
//3-6. ArrayList .remove("삭제할내용") 리스트 삭제
//.remove 삭제 전 list 목록
//[HTML5, CSS3, JavaScript, Java, Jsp, Vue, Vuex, MYSQL]
//
//.remove 삭제 후 list 목록
//[JavaScript, Java, Jsp, Vue, MYSQL]
//
//3-7. ArrayList .get(인덱스번호) 게터 함수 배열 항목 반복문 출력
//JavaScript
//Java
//Jsp
//Vue
//MYSQL

