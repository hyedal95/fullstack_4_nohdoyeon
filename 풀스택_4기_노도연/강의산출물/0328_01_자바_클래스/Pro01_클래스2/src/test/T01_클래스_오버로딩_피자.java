package test;

class Pizza{
	
	//멤버함수 (메서드)
	String name() {
		return "피자";
	}
	String name(String s1) {
		return  s1 + " 피자 ";
	}
	String name(String s1, String s2) {
		return s1 + " 피자 " + "+" + s2 + "추가";
	}
	String name(String s1, String s2, int num) {
		return s1 + " 피자 " + "+" + s2 + "추가"+ num +"개" ;
	}

}

public class T01_클래스_오버로딩_피자 {

	public static void main(String[] args) {
		Pizza p = new Pizza();
		
		System.out.println(p.name());
		System.out.println(p.name("치즈"));
		System.out.println(p.name("하와이안","치즈크러스트"));
		System.out.println(p.name("하와이안","치즈클러스트", 2));
		

	}

}
