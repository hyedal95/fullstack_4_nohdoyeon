package study;

public class S02_알고리즘_소수 {

	public static void main(String[] args) {
		// 알고리즘 소수 1부터 10까지
		
		boolean a = true; // 소수인지 아닌지 판별 boolean함수 필요
		
		for(int i=1; i<=10; i++) {
			
			a =true; //초기화 : 초기화를 안하면 false가 계속 남아있는다.
			if(i==1) a= false;
			for(int j=2; j<i; j++) { // 체크포인트 j<i
				if(i%j ==0) { 
					a =false;
				}
			}
			if(a == true) {
				System.out.printf("%d ", i);
			}
		}
		// 결과
		// 2 3 5 7 


	}

}
