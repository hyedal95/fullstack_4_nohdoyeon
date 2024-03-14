package study;

public class S01_1차원배열_문자_문자열 {

	public static void main(String[] args) {
		// 문자 타입 배열 생성하기
		// 예] Happy 문자열을 글자단위로 배열변수에 저장
		char [] ch = new char[5];
		
		ch[0] ='H'; //글자는 '홑따옴표' 사용
		ch[1] ='a'; 
		ch[2] ='p'; 
		ch[3] ='p'; 
		ch[4] ='y'; 
		
		System.out.println();
		System.out.println("문자 타입 배열 출력하기");

		
		for(int i=0; i<ch.length; i++) { // 배열 0번째 공간에서 5보다 작은 4번째까지 1씩 증가하면서 
			System.out.printf("ch[%d] = %c, (Ascii Code)아스키코드 =%3d,문자 =%c \n",i,ch[i],(int)ch[i], (int)ch[i]); 
			// ch[0]~ch[4]까지 출력해라!  
			// 문자를 숫자로 출력하기 위해서 강제형변환해주기 (int)ch[i]
			// %c 로 출력되는 경우에는 (int)ch[i]여도 자동형변환이 된다.  문자 > 숫자 
			
		}
		System.out.println();
		
//		문자 타입 배열 출력하기   (문자를 정수로 = (Ascii Code)아스키코드)
//		ch[0] = H, (Ascii Code)아스키코드 = 72, H 
//		ch[1] = a, (Ascii Code)아스키코드 = 97, a 
//		ch[2] = p, (Ascii Code)아스키코드 =112, p 
//		ch[3] = p, (Ascii Code)아스키코드 =112, p 
//		ch[4] = y, (Ascii Code)아스키코드 =121, y 
		
		// 아스키 코드 (정수) 10진수 사용중
		// 정수 65 ~ 90 영문 대문자 A(65) ~ Z(90)
		// 정수 97 ~122 영문 소문자 a(97) ~ z(122)
		System.out.println();
		System.out.println("정수 65 ~ 90 영문 대문자 A(65) ~ Z(90)");
		for(int i=65; i<=90; i++) {
			System.out.printf("숫자 = %3d, 문자 =%c \n", i, i );
		}
		System.out.println();
		
		System.out.println();
		System.out.println("정수 97 ~122 영문 소문자 a(97) ~ z(122)");
		for(int i=97; i<=122; i++) {
			System.out.printf("숫자 = %3d, 문자 =%c \n", i, i );
		}
		System.out.println();
		
		// 문자 => 문자열 저장
		// 문자값 '홑따옴표'  ==> 출력 %c
		// 문자열값 "겹따옴표" ==> 출력 %s
		System.out.println();
		System.out.println("변수 str 문자열 저장 과정 출력");
		String str = ""; // 문자열은 "겹따옴표"
		for(int i=0; i<ch.length; i++) {
			str += ch[i]; // sh[i]값을 str에 누적시켜서 출력해라.
			System.out.printf("str = %s\n", str );
		}
		System.out.println();
		System.out.println("변수 str 문자열 출력");
		System.out.printf("str = %s ", str);
	}

}



//문자 타입 배열 출력하기
//ch[0] = H, (Ascii Code)아스키코드 = 72,문자 =H 
//ch[1] = a, (Ascii Code)아스키코드 = 97,문자 =a 
//ch[2] = p, (Ascii Code)아스키코드 =112,문자 =p 
//ch[3] = p, (Ascii Code)아스키코드 =112,문자 =p 
//ch[4] = y, (Ascii Code)아스키코드 =121,문자 =y 
//
//
//정수 65 ~ 90 영문 대문자 A(65) ~ Z(90)
//숫자 =  65, 문자 =A 
//숫자 =  66, 문자 =B 
//숫자 =  67, 문자 =C 
//숫자 =  68, 문자 =D 
//숫자 =  69, 문자 =E 
//숫자 =  70, 문자 =F 
//숫자 =  71, 문자 =G 
//숫자 =  72, 문자 =H 
//숫자 =  73, 문자 =I 
//숫자 =  74, 문자 =J 
//숫자 =  75, 문자 =K 
//숫자 =  76, 문자 =L 
//숫자 =  77, 문자 =M 
//숫자 =  78, 문자 =N 
//숫자 =  79, 문자 =O 
//숫자 =  80, 문자 =P 
//숫자 =  81, 문자 =Q 
//숫자 =  82, 문자 =R 
//숫자 =  83, 문자 =S 
//숫자 =  84, 문자 =T 
//숫자 =  85, 문자 =U 
//숫자 =  86, 문자 =V 
//숫자 =  87, 문자 =W 
//숫자 =  88, 문자 =X 
//숫자 =  89, 문자 =Y 
//숫자 =  90, 문자 =Z 
//
//
//정수 97 ~122 영문 소문자 a(97) ~ z(122)
//숫자 =  97, 문자 =a 
//숫자 =  98, 문자 =b 
//숫자 =  99, 문자 =c 
//숫자 = 100, 문자 =d 
//숫자 = 101, 문자 =e 
//숫자 = 102, 문자 =f 
//숫자 = 103, 문자 =g 
//숫자 = 104, 문자 =h 
//숫자 = 105, 문자 =i 
//숫자 = 106, 문자 =j 
//숫자 = 107, 문자 =k 
//숫자 = 108, 문자 =l 
//숫자 = 109, 문자 =m 
//숫자 = 110, 문자 =n 
//숫자 = 111, 문자 =o 
//숫자 = 112, 문자 =p 
//숫자 = 113, 문자 =q 
//숫자 = 114, 문자 =r 
//숫자 = 115, 문자 =s 
//숫자 = 116, 문자 =t 
//숫자 = 117, 문자 =u 
//숫자 = 118, 문자 =v 
//숫자 = 119, 문자 =w 
//숫자 = 120, 문자 =x 
//숫자 = 121, 문자 =y 
//숫자 = 122, 문자 =z 
//
//
//변수 str 문자열 저장 과정 출력
//str = H
//str = Ha
//str = Hap
//str = Happ
//str = Happy
//
//변수 str 문자열 출력
//str = Happy 
