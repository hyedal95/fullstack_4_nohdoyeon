package study;

import study.user.UserDTO2;

/*
 	# 접근제한자
 	1. 디폴트 접근제한자는 
 		=> 동일한 패키지(폴더) 내부에서 서로다른 클래스를 접근할 수 있다.
	 	- default => 
	 	 기본 접근자는 private, public 등으로 명시하지 않으면 
	 	 자동으로 default 접근 제한을 받는다.
 	손으로 default 써도 되고 안 써도 된다.
 	
 	2. private 프라이빗 접근제한자는
 		=> 클래스 내부에서만 사용가능  (동일한 패키지 내부에서도 클래스 끼리도 안됨)
 	3. public 퍼브릭 접근제한자는
 		=> 서로 다른 패키지에서도 접근 사용가능 
 	4. protected 프로텍티드 접근제한자는
 		=> 같은 패키지에서만 사용가능 ( 객체와 상속관계의 객체들만 접근가능)

	=>> 대부분 private, public를 주로 사용하고, 명시하지 않는 경우는 default 이다.
	
 	

 */

public class S03_클래스_게터_세터 {

	public static void main(String[] args) {
		UserDTO2 userDto2 = new UserDTO2();
		
		//세터함수 
		userDto2.setUserName("노도연");
		userDto2.setUserId("hyedal95");
		userDto2.setUserPw("123456789");
		userDto2.setUserHp("010-8291-3711");
		userDto2.setUserGender("여자");
		userDto2.setUserEmail("hyedal95@gmail.com");
		userDto2.setUserBirth("1995.09.05");
		userDto2.setUserAge(30);
		userDto2.setUserAddress("경기도 안산시 상록구 광덕1로 356");
		//게터함수
		System.out.println("회원가입 정보 출력 2번째");
		System.out.printf("이름 : %s \n",userDto2.getUserName());
		System.out.printf("ID : %s \n",userDto2.getUserId());
		System.out.printf("PW : %s \n",userDto2.getUserPw());
		System.out.printf("HP : %s \n",userDto2.getUserHp());
		System.out.printf("성별 : %s \n",userDto2.getUserGender());
		System.out.printf("이메일 : %s \n",userDto2.getUserEmail());
		System.out.printf("생년월일 : %s \n",userDto2.getUserBirth());
		System.out.printf("나이 : %d \n",userDto2.getUserAge());
		System.out.printf("주소 : %s \n",userDto2.getUserAddress());

	}

}
