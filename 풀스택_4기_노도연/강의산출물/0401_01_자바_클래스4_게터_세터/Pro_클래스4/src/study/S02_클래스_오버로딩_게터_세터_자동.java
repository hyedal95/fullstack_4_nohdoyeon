package study;

/*
 패키지 명[user] 라는 패키지 안에 저장한다.
 클래스 명 UserDto.java
 		
 		MVC 패 턴 디자인 (입력과 출력, 디자인을 분류해서 작업할 수 있다. ) 
 		주로 홈페이지 ,웹개발,앱개발할 때 필수이다.
 		모델(Model) 컨트롤러(Controller) 뷰(View Template) => 모델에서 뷰를 조절하기 위해 중간에 컨트롤러 프로그램이 있어야한다.
 		그 프로그램이 vue.js 나 자바의 프로그램이다. 
 		뷰 탬플릿은 자바에서 jsp를 사용하지만, 이쁘게 꾸미기 위해서 모델과 뷰는 서로 정보를 넣고 뺄 수없어서 
 		컨트롤러가 반드시 필요하다.
 		모델과 뷰는 혼자 일 못함 => 그래서 있는 게 컨트롤러
 		이 3가지의 이름을 따서 MVC패턴이라고 한다.
 		MVC패턴 디자인이라고 한다.
 		
 		DTO(Data Transfer Object) 
 		클래스 => 고객관리( User) DTO => UserDTO  또는 UserDto 
 		
 
 	# 회원가입 데이터 처리 (사용자 User)
 	1. 멤버변수(필드) => 최종적으로 [모델]데이터베이스에 저장하기 위한 변수 => 클래스에 소속된 변수라서 '멤버'라는 단어가 붙은 것. => 정보 저장 데이터 필드
 		- 아이디 String => userId
 		- 비밀번호 String => userPw
 		- 이름 String => userName
 		- 나이 integer = int => userAge
 		- ... 그 외 여러 데이터들이 있다. 주소, 이메일 등등 
 	2. 멤버 메서드 (멤버함수)  
 		- set(set메서드)  =>  '멤버 변수에 저장하는 역할(기능)' => 관리자는 Admin 유저는 user
 			setUserId
 			setUserPw
 			setUserName
 			setUserAge
 		- get(get메서드) => '멤버 변수값 가져오는 역할(기능)' => 어떤 데이터를 가져올 때는 게터메서드를 사용한다.
 		 	getUserId
 			getUserPw
 			getUserName
 			getUserAge
 		

 우리 눈에 보여지는 건 geter , seter 통해서 멤버필드에 저장되고 그것또한 새로고침하면 사라지니깐, 
 데이터베이스(모델)에 저장한다.
 
 모델[데이터베이스]
 
 	실습]
 	UserDto 클래스 접근해서 데이터 저장하고 데이터 가져오기
 */
//외부 생성자는 import를 해줘야한다. 그리고 위치 
import study.user.UserDto;

public class S02_클래스_오버로딩_게터_세터_자동 {

	public static void main(String[] args) {
		UserDto userDto =new UserDto();
		
		// 세터함수 호출 데이터 저장 하고
		userDto.setUserId("otteryeonny");
		userDto.setUserPw("123456789!");
		userDto.setUserName("노도연");
		userDto.setUserAge(30);
		
		
		// 게터함수 호출 데이터 가져오기
		// 리턴값은 바로 출력하면됨. syso 아웃
		System.out.println("회원가입 정보 출력");
		System.out.printf("ID : %s\n",userDto.getUserId());
		System.out.printf("Pw : %s\n",userDto.getUserPw());
		System.out.printf("이름 : %s\n",userDto.getUserName());
		System.out.printf("나이 : %d\n",userDto.getUserAge());

		
		}

}
