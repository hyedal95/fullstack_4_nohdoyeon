package study;

class Waffle{
	// 멤버변수X
	// 메서드 여러 개 = 오버로딩
	String name() {
		return "와플";
	}
	String name(String source) {
		return source + "와플";
	}
	String name(String source1, String source2) {
		return source1+" "+ source2 + "와플";
	}
	String name(String source1, int count) {
		return source1 + "와플" + count + "개";
	}
	String name(int year, int count) {
		return year + "년 와플" + count + "개";
	}
	String name(int year,String source , int count) {
		return year + "년 "+ source +"와플" + count + "개";
	}
	
}


public class S03_클래스_오버로딩_와플 {

	public static void main(String[] args) {
		
		Waffle w = new Waffle();
		
		System.out.println();
		System.out.println("# 메서드 오버로딩(Overloading)");
		
		System.out.println(w.name());
		System.out.println(w.name("초코범벅"));
		System.out.println(w.name("크림","젤라또"));
		System.out.println(w.name("사과잼",5));
		System.out.println(w.name(2024,10));
		System.out.println(w.name(2025,"사과잼",5));
		
		System.out.println("++클래스 내 다양한 메서드를 생성해서 출력하는 것이 바로 오버로딩이다.");
		
//		결과
//		# 메서드 오버로딩(Overloading)
//		와플
//		초코범벅와플
//		크림 젤라또와플
//		사과잼와플5개
//		2024년 와플10개
//		2025년 사과잼와플5개
//		++클래스 내 다양한 메서드를 생성해서 출력하는 것이 바로 오버로딩이다.

	}

}
