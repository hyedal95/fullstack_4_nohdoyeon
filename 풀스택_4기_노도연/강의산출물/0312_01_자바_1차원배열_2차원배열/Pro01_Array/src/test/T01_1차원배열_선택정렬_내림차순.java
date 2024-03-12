package test;

public class T01_1차원배열_선택정렬_내림차순 {

	public static void main(String[] args) {
		// 1차원배열_선택정렬_내림차순
		
		// 1.배열 10개 선언
		int [] arr = {54,87,15,67,64,88,91,100,46,51};
		
		// 2.배열 10개 출력 
		
		System.out.println("배열 값 10개 출력");
		for(int i=0; i<arr.length; i++) { //0~ (arr.length)9까지
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		
		for(int i=0; i<arr.length-1; i++) { // arr[0]~arr[8]까지
			for(int j=i+1; j<arr.length; j++) { //arr[1] ~ arr[9]까지
				if(arr[i]<arr[j]) {
					//임시 변수 통해서 교환
					int imsi;
					imsi = arr[i];   // 임시에 i값 넣기 
					arr[i] = arr[j]; // i값에 j값 넣기 
					arr[j] = imsi;   //j값에 임시값(i) 넣기 
				}
			}
		}
		System.out.println("배열 선택정렬_내림차순 출력");
		for(int i=0; i<arr.length; i++) { //0~ (arr.length)9까지
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		

	}

}
