# 강의1편
- 키보드로 입력 받아서 처리한다 Scanner
- 성적처리 => 웹 브라우저에서 숫자 입력을 받으면 모두 문자열로 입력된다.
- 이름 문자열
- 국어 문자열
- 영어 문자열
- 수학 문자열
- 총점 정수
- 평균 실수
- 학점 문자열 A+ A B+ B C+ C D+ D E F

- 1. 변수 선언
```java
        String name;
        String kor;
        String eng;
        String mat;
        int sum;
        double avg;
        String grade;
```

- 2. 키보드 입력문 객체 (인스턴스) 생성
```java
        //키보드 입력문 객체 (인스턴스) 생성 
        Scanner sc = new Scanner(System.in);
```

- 3. 총점에 대한 강제형변환, 평균에 대한 자동형변환
    - 총점 정수
    - 문자열 숫자를 정수형으로 강제형변환해야한다.  
    - Integer.parseInt(문자열변수) => 정수로 변환 
    - 자동형변환 실수 = (double)정수 /3 ;   큰 자료형(양동이) = 작은 자료형 /3  생략가능
    - avg = sum/3 ;
    - 자동형변환 실수 잘려서 손실 예] 93.2455 =>93
    - 총점/3; => 소수이하 손실 정수만 출력
    - 그래서 나누기를 실수 변환해서 해야 한다. 손실 없다.  예] avg = sum/3.00; 
    - 예]
    - 총점/3.0; 
    - (double)총점/3;
    - (double)총점/3.0;
```java
        sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(mat) ;
        avg = (double)sum/3 ; // 실수 = (double)정수 /3 ;   큰 자료형(양동이) = 작은 자료형 /3  생략가능
```
- 4. 학점 (조건문)
        if(조건){결과물}else if(또다른 조건){}else{그 외 결과}
```java
        //학점 처리 조건문(IF문)
        if(avg>=95){
            grade = "A+";
        }
        else if(avg>=90){
            grade = "A";
        }
        else if(avg>=85){
            grade = "B+";
        }
        else if(avg>=80){
            grade = "B";
        }
        else if(avg>=75){
            grade = "C+";
        }
        else if(avg>=70){
            grade = "C";
        }
        else if(avg>=65){
            grade = "D+";
        }
        else if(avg>=60){
            grade = "D";
        }
        else{
            grade = "F";
        }

```

- 5. printf("~~~\n", 변수) 출력하기   
    - printf는 줄바꿈이 안되기때문에, 출력물 끝에 \n 뉴 라인을 삽입해서 줄바꿈으로 출력해준다.

```java
        // 3단계.출력문 포멧 형식
        // 예시]
        // 이름 : 이순신, 국어:89, 영어:92, 수학:98, 총점:____, 평균:_____ , 학점:____
        System.out.println();
        System.out.printf("이름 : %s, 국어 : %s, 영어 : %s ,수학 : %s, 총점: %d, 평균: %.2f, 학점: %s\n", name, kor, eng , mat ,sum,avg,grade );
        System.out.println();

```
# 문제1
- 문제1]
- 키보드로 입력 받아서 처리한다 Scanner
- 성적처리 => 웹 브라우저에서 숫자 입력을 받으면 모두 문자열로 입력된다.
- 이름 문자열 name
- 국어 정수 kor
- 영어 정수 eng
- 수학 정수 mat
- 총점 정수 sum
- 평균 실수 avg
- 단, 입력은 국어, 영어, 수학 모두 문자열로 입력을 받아서 변수에 저장은 정수로 한다.
- 변수에 저장은 문자열 정수로 한다.

- 출력문 포멧 형식
-  예시]
-  이름 : 이영희, 국어: 95, 영어 :12 평균은 소수점 3자리
```java
        String name;
        int kor;
        int eng;
        int mat;
        int sum;
        double avg;
        String grade;

        Scanner sc= new Scanner(System.in);

        System.out.println();
        System.out.print("이름:");
        name = sc.nextLine();
        System.out.print("국어:");
        kor = Integer.parseInt(sc.nextLine());
        System.out.print("영어:");
        eng = Integer.parseInt(sc.nextLine());
        System.out.print("수학:");
        mat = Integer.parseInt(sc.nextLine());

        sum = kor + eng + mat;
        avg = (double)sum/3;

        if(avg>=95){
            grade = "A+";
        }
        else if(avg>=90){
            grade = "A";
        }
        else if(avg>=85){
            grade = "B+";
        }
        else if(avg>=80){
            grade = "B";
        }
        else if(avg>=75){
            grade = "C+";
        }
        else if(avg>=70){
            grade = "C";
        }
        else if(avg>=65){
            grade = "D+";
        }
        else if(avg>=60){
            grade = "D";
        }
        else{
            grade = "F";
        }

        System.out.println();
        System.out.printf("이름 : %s, 국어: %d, 영어 :%d, 수학 : %d, 총점 : %d, 평균: %.3f, 학점: %s\n",name,kor,eng,mat,sum,avg,grade  );
        System.out.println();
```


