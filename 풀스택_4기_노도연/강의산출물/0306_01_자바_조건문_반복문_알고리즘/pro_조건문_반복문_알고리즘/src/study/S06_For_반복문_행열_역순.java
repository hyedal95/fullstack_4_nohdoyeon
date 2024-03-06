package study;

public class S06_For_반복문_행열_역순 {
    public static void main(String[] args) {
        // 5줄을 반복 구현하되
        // 1 ~  임의의 수를 출력
        // 단, 줄이 증가하면 칸도 증가하여 출력
        // 예시]

        // 1 2 3 4 5
        // 6 7 8 9
        // 10 11 12
        // 13 14
        // 15

        int hap=0;

        // 개인 코딩
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                hap++;
                System.out.printf("%3d ",hap); 

            }
            System.out.println(); //줄바꿈  

        }
        // 선생님 코딩
        for(int i=1; i<=5; i++){
            for(int j=1; j>=6-i; j++){
                hap++;
                System.out.printf("%3d ",hap); 

            }
            System.out.println(); //줄바꿈  

        }
        
    }
}

// 결과
// 1  2  3  4  5 
// 6  7  8  9    
// 10 11 12       
// 13 14 
// 15 