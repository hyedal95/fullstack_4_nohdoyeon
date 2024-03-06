package study;

public class S05_For_반복문_행열 {
    public static void main(String[] args) {
        // 5줄을 반복 구현하되
        // 1 ~  임의의 수를 출력
        // 단, 줄이 증가하면 칸도 증가하여 출력
        // 예시]
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // 행열 ==수열 
        // 행이 증가할 때 행도 증가한다.

        int hap=0;
        
        // 다중 반복문
        for(int i=1; i<=5; i++){ // 줄 증가
            for(int j=1; j<=i; j++){ // 줄 증가
                hap++;
                System.out.printf("%2d ",hap);   /* %2d를 사용함으로 2자리수 우측정렬이되서 나옴 */
            }
            System.out.println(); //줄바꿈
        }


    }
}

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15