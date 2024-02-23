package study;

public class S01_자료형_연산자 {
    public static void main(String[] args) {
        // 연산자 (Operation)
        // + - * / %
        // 증감연산자
        // ++, -- +=2 -=2
        int kor, end, mat, tot;
        double avg; //평균은 실수표현
        kor = 95;
        end = 89;
        mat = 99;

        tot = kor + end + mat;
        avg = tot/3;
        
        int cnt =0;

        System.out.println();
        System.out.println("성적처리");
        System.out.printf("%d = %d + %d + %d\n",tot,kor,end,mat  );
        System.out.printf("%f = %d/%d\n",avg,tot,3  );
        System.out.println();
        
        // 성적처리
        // 283 = 95 + 89 + 99
        // 94.333333 = 283/3     
        
        cnt++;
        System.out.println("");
        System.out.println("증감연산");
        System.out.printf("cnt++\n");
        System.out.printf("결과 = > %d\n", cnt);
        System.out.println("");

        // 증감연산
        // cnt++
        // 결과 = > 1

        cnt--;
        System.out.println("");
        System.out.println("증감연산");
        System.out.printf("cnt--\n");
        System.out.printf("결과 = > %d\n", cnt);
        System.out.println("");

        // 증감연산
        // cnt--
        // 결과 = > 0

        cnt+=3;
        System.out.println("");
        System.out.println("증감연산");
        System.out.printf("cnt+=3\n");
        System.out.printf("결과 = > %d\n", cnt);
        System.out.println("");
        
        // 증감연산
        // cnt+=3
        // 결과 = > 3

        cnt-=5;
        System.out.println("");
        System.out.println("증감연산");
        System.out.printf("cnt-=5\n");
        System.out.printf("결과 = > %d\n", cnt);
        System.out.println("");


        // 증감연산
        // cnt-=5
        // 결과 = > -2
    }
}
