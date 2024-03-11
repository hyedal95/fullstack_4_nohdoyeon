package test;

public class S02_반복문_for_별모양응용_알고리즘 {

	public static void main(String[] args) {
		 
		/*
		 문제 1] 5행 5열
			 * 
			 **
			 ***
			 ****
			 *****
 
		 문제 2] 5행 5열
		 		  * 
		 		 **
		        ***
			   ****
			  *****
		
		 문제 3] 5행 5열
		 	*****
		 	 ****
		 	  ***
		 	   **
		 	    *
		 
		 문제 4] 5행 5열
		  	*****
		 	****
		 	***
		 	**
		 	*
		 문제 5] 5행 9열
		 		*
		  	   ***
		  	  *****
		  	 *******
		  	*********
		 
		 문제 6] 5행 9열

		  	*********
		  	 *******
		  	  *****	
		  	   ***
		  	    *	 
		 	
		 */
		
		System.out.println("문제 1번");
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		System.out.println("문제 2번");
		System.out.println();
		

		for(int i=1; i<=5; i++) {

			//들여쓰기  4 3 2 1 0 
			for(int j=1; j<=5-i; j++) {
				System.out.printf("%1s","");
			}
			//카운트
			for(int j=1; j<=i; j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		System.out.println("문제 3번");
		System.out.println();
		

		for(int i=1; i<=5; i++) {
			//들여쓰기  0 1 2 3 4 
			for(int j=1; j<=i-1; j++) {
				System.out.printf("%1s","");
			}
			//카운트
			for(int j=1; j<=6-i; j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		System.out.println("문제 4번");
		System.out.println();
		

		for(int i=1; i<=5; i++) {
			//카운트
			for(int j=1; j<=6-i; j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		System.out.println("문제 5번");
		System.out.println();
		
		int count=-1;

		for(int i=1; i<=5; i++) {
			count+=2;
			//들여쓰기 4 3 2 1 0
			for(int j=1; j<=5-i; j++) {
				System.out.printf("%1s","");
			}
			//카운트 1 3 5 7 9 
			for(int j=1; j<=count; j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		System.out.println("문제 6번");
		System.out.println();
		
		count=11;

		for(int i=1; i<=5; i++) {
			count-=2;
			//들여쓰기 0 1 2 3 4
			for(int j=1; j<=i-1; j++) {
				System.out.printf("%1s","");
			}
			//카운트 9 7 5 3 1
			for(int j=1; j<=count; j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		

	}

}
