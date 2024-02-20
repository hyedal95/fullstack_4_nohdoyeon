package study;

public class S02_자료형_문자열_실수_출력형식 {
    public static void main(String[] args) {
        // 문자열 자료형 String 스트일
        // 실수 자료형 float 플롯트, double 더블

        String name = "이순신"; // 출력 형식 문자열 %s
        int age = 49;
        float weight1 = 78.01234567890123456789f; //float형은 반드시 맨뒤에f를 붙인다. (출력 형식 문자열 %f)
        double weight2 = 78.01234567890123456789; // 출력 형식 문자열 %f

        System.out.println("자료형 문자열과 실수 변수설정, 출력형식");
        System.out.println(name +"장군 나이는"+ age + ", 몸무게는" + weight1 + "입니다.");
        System.out.println(name +"장군 나이는"+ age + ", 몸무게는" + weight1 + "입니다.");
        
        System.out.println();
        
        System.out.printf("%s 장군 나이는 %d 몸무게는 %f 입니다.\n", name, age, weight1);
        System.out.printf("%s 장군 나이는 %d 몸무게는 %f 입니다.\n", name, age, weight2);

        // 결과
        // 자료형 문자열과 실수 변수설정, 출력형식
        // 이순신장군 나이는49, 몸무게는78.012344입니다.
        // 이순신장군 나이는49, 몸무게는78.012344입니다.

        // 이순신 장군 나이는 49 몸무게는 78.012344 입니다.
        // 이순신 장군 나이는 49 몸무게는 78.012346 입니다.

        System.out.println();
        
        System.out.printf("%s 장군 나이는 %d 몸무게는 %21.18f 입니다.\n", name, age, weight1);
        System.out.printf("%s 장군 나이는 %d 몸무게는 %21.18f 입니다.\n", name, age, weight2);

        //결과
        //이순신 장군 나이는 49 몸무게는 78.012344360351560000 입니다.
        //이순신 장군 나이는 49 몸무게는 78.012345678901240000 입니다.

    }
}
