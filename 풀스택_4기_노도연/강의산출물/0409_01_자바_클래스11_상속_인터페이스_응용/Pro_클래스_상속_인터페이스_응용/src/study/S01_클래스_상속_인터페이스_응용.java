package study;
// # 매개변수로 전수를 받아서 완성하고 구현하는 인턴페이스
// 1.성적 점수 평가(Evaluation) 인터페이스 선언 => Grade평가인터페이스
interface Grade평가{
	int getGrade(int jumsoo); // 인터페이스 미완성 메서드 (추상 메서드)
	
}


// 2.성적 점수 평가(Evaluation) 클래스 interface 구현(implements) => Grade평가클래스
class Grade평가클래스 implements Grade평가{ 
	@Override
	public int getGrade(int jumsoo) { //인터페이스 => 구현 => 완성메서드
		return jumsoo;
	}
}
public class S01_클래스_상속_인터페이스_응용 {

	public static void main(String[] args) {
		
		// 3. 성적 점수 평가 클래스 객체 생성 실행
		Grade평가클래스 grade= new Grade평가클래스();
		System.out.println("점수는" + grade.getGrade(60));
		
//		결과
//		점수는60
		
	}

}
