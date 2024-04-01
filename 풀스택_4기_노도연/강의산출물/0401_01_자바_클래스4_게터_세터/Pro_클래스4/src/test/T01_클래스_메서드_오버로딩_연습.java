package test;

class Tester{
	
	double getAverage(int a, int b) {
		return (double)(a+b)/2;
	}
	double getAverage(int a, int b, int c) {
		return (double)(a+b+c)/3;
	}
	double getAverage(int a, int b,int c, int d) {
		return (double)(a+b+c+d)/4;
	}
}

public class T01_클래스_메서드_오버로딩_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tester tester = new Tester();
		
		System.out.printf("2과목 평균 : %.2f \n", tester.getAverage(97, 82));
		System.out.printf("3과목 평균 : %.2f \n", tester.getAverage(97, 82, 97));
		System.out.printf("4과목 평균 : %.2f \n", tester.getAverage(97, 82, 81, 64));

	}

}
