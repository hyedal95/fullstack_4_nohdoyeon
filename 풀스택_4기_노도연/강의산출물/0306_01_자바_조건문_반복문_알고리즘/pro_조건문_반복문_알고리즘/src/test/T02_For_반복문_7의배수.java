package test;

public class T02_For_반복문_7의배수 {
    public static void main(String[] args) {
        // 1~100 카운트 숫자 중
        // 7의 배수를 출력
        // 그리고 7의 배수의 합을 출력

        int hap =0;

        for(int i=1; i<=100; i++){
            if(i%7==0){
                System.out.printf("7의 배수: %d\n" , i);
                hap+=i;
            }
        }
        System.out.println();
        System.out.printf("7의 배수의 합 : %d\n", hap);
        System.out.println();
    }
}

// 결과
// 7의 배수: 7
// 7의 배수: 14
// 7의 배수: 21
// 7의 배수: 28
// 7의 배수: 35
// 7의 배수: 42
// 7의 배수: 49
// 7의 배수: 56
// 7의 배수: 63
// 7의 배수: 70
// 7의 배수: 77
// 7의 배수: 84
// 7의 배수: 91
// 7의 배수: 98

// 7의 배수의 합 : 735