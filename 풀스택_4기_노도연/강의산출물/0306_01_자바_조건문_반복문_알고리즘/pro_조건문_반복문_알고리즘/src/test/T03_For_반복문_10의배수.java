package test;

public class T03_For_반복문_10의배수 {
    public static void main(String[] args) {
        //1~100 중 10의 배수이면서 15의 배수 출력 누적합
        //10의 배수이면서 10의 배수 출력 
        //10의 배수이면서 10의 배수 누적합 

        //15의 배수이면서 15의 배수 출력 
        //15의 배수이면서 15의 배수 누적합
        //그리고 두 배수의 합을 출력

        int hap=0;
        

        for(int i=1; i<=100; i++){
            if(i%10==0 && i%15==0){
                System.out.printf(" %d\n" , i );
                hap +=i;
            }
            
        }

        System.out.println();
        System.out.printf("10의 배수 AND 15의 배수의 누적합: %d\n", hap);
    }
}

// 30
// 60
// 90

// 10의 배수 AND 15의 배수의 누적합: 180