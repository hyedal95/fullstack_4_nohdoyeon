package study;

public class S03_For_반복문 {
    public static void main(String[] args) {
        // 반복문
        // 1~10 카운트 i 
        // 짝수의 합 
        // 홀수의 합
        // 1~10 누적합을 hap=0 구하시오. => 초기값 반드시 필요하다.

        int evenhap =0; //짝수합
        int oddhap =0;  //홀수합
 

        for(int i=1; i <=10; i++){
            if(i%2==0){ //i 를 2로 나누어 나머지가 0이면 짝수
                System.out.printf( " 짝수 : %d ", i);
                evenhap +=i;
            }
            else{
                System.out.printf( " 홀수 : %d ", i);
                oddhap +=i;
            }

        }
        System.out.println();
        System.out.printf("1~10 짝수합은 = %d\n", evenhap);
        System.out.printf("1~10 홀수합은 = %d\n", oddhap);
        

        System.out.println();

    }
}

// 홀수 : 1  짝수 : 2  홀수 : 3  짝수 : 4  홀수 : 5  짝수 : 6  홀수 : 7  짝수 : 8  홀수 : 9  짝수 : 10 
// 1~10 짝수합은 = 30
// 1~10 홀수합은 = 25