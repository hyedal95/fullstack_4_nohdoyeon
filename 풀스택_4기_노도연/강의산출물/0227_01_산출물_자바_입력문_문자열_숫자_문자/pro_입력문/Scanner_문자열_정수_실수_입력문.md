# Scanner_문자열_정수_실수
  - 보통 실수는 float보다 double을 많이 쓴다.
  - 이름 name 문자열, 나이 age 정수, 시력  sight실수, 취미 hobby문자열 입력받기
  - 문제 발생) 문자열 정수 실수 문자열 순으로 입력 받을 때 실수 입력 후 문자열 입력을 넘어가버리는 상태 발생
  - 문제 발생 이유) 실수에서 enter 칠 때 발생하는 '개행문자'를 처리하지 않고 버퍼에 남기기 때문에 넘어간
  - 1문제 해결) 문자열 문자열 정수 실수 순으로 변경
  - 2또다른 문제 해결) 실수형에서 nextLine()을 재껴버리기 때문에 실수입력과 문자열 사이에 sc.nextLine(); 을 추가함으로써 해결 가능
```java
        String name;
        int age;
        double sight;
        String hobby;
        Scanner sc =new Scanner(System.in); //키보드 입력

        //이름 입력받기
        System.out.println();
        System.out.println("이름 :");   //문자열 nextLine()
        name =sc.nextLine();
        System.out.println("취미 :");   //문자열 nextLine()
        hobby = sc.nextLine();
        System.out.println("나이 :");   //정수 nextInt()
        age =sc.nextInt();
        System.out.println("시력 :");   //실수 nextDouble()
        sight=  sc.nextDouble();

        System.out.println();

        System.out.println("이름 : " + name);
        System.out.println("취미 : " + hobby);
        System.out.println("나이 : " + age);
        System.out.println("시력 : " + sight);

```

```java
        String name;
        int age;
        double sight;
        String hobby;
        Scanner sc =new Scanner(System.in); //키보드 입력

        //이름 입력받기
        System.out.println();
        System.out.print("이름 :");   //문자열 nextLine()
        name =sc.nextLine();
        System.out.print("나이 :");   //정수 nextInt()
        age =sc.nextInt();
        System.out.print("시력 :");   //실수 nextDouble()
        sight=sc.nextDouble();
        sc.nextLine();
        System.out.print("취미 :");   //문자열 nextLine()
        hobby =sc.nextLine();
        
        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("시력 : " + sight);
        System.out.println("취미 : " + hobby);

```
<!-- 
결과1
이름 :노도연
취미 :포켓몬고게임
나이 :30
시력 :1.5

이름 : 노도연
취미 : 포켓몬고게임
나이 : 30
시력 : 1.5

결과2
이름 :노도연
나이 :30
시력 :1.5
취미 :포켓몬고게임

이름 : 노도연
나이 : 30
시력 : 1.5
취미 : 포켓몬고게임 
-->



# Scanner_문자열_정수_실수2 (성적처리_실수편)
  - 문제1 
  - 이름 name 문자열
  - 국어 kor 영어 eng 수학 mat 모두 입력을 실수로 입력받고
  - 총점 tot 은 정수로 연산 형변환 (실수(8)->정수(4) 대->소 강제형변환)
  - 평균은 avg 실수로 소숫점 이하 2자리 출력
  - 출력형식은 printf() 한줄로 출력
  - 예시]
  - 이름:조지현 국어:83.0 영어:95.0 수학:99.0 총점:277 평균:92.33
```java
        Scanner sc =new Scanner(System.in);
        String name;
        double kor;
        double eng;
        double mat;
        int tot; // 총점 입력 받고 계산
        double avg; //평균 입력 받고 계산


        System.out.print("이름 : ");    //문자열
        name = sc.nextLine();

        System.out.print("국어 : ");    //실수
        kor = sc.nextDouble();

        System.out.print("영어 : ");    //실수
        eng = sc.nextDouble();

        System.out.print("수학 : ");    //실수
        mat = sc.nextDouble();
        
        tot = (int)kor+(int)eng+(int)mat; //강제 형변환 | 정수 = (정수)실수 + (정수)실수 + (정수)실수
        avg = tot/3; //자동형변환 되기때문에 강제형변환 생략 가능

        System.out.println();
        System.out.printf("이름:%s 국어:%.1f 영어:%.1f 수학:%.1f 총점:%d 평균:%.2f", name , kor , eng , mat , tot , avg );
        System.out.println();
```

<!-- 
결과
이름 : 조지현
국어 : 83
영어 : 95
수학 : 99
이름:조지현 국어:83.0 영어:95.0 수학:99.0 총점:277 평균:92.3 
-->