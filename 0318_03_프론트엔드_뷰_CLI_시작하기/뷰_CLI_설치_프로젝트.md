# Vue CLI 설치

1. npm i -g @vue/cli

2. vue --version
```
    $ vue --version
    @vue/cli 5.0.8
```

3. 프로젝트 생성
    [작업폴더만들고]
    - vue create 프로젝트이름
    - vue create just_cli2

4. 프로젝트 실행
    is -la
    cd just_cli2 
    npm run serve //뷰의 서버를 켜준다.

5. 제이쿼리 설치
    cd just_cli2 
    npm i jquery

6. 제이쿼리 확인
    package.json 내부
    ```json
        "dependencies": {
        "core-js": "^3.8.3",
        "jquery": "^3.7.1",
        "vue": "^2.6.14"
    }
    ```
7. public 정적 디렉토리(폴더)
    [css]
    [images]
    -index.html
    <head>
        <title>JUST쇼핑몰</title>
        <link rel="stylesheet" href="./css/style.css">
    </head>

8. src 동적 디렉토리 
    - main.js
        -App.vue 기존 컴포넌트 삭제
        -WrapComponent.vue 컴포넌트 임포트

9. src
    [components] 
        -WrapComponent.vue
        [wrap]
        - HeaderComponent.vue
        - MainComponent.vue
          [main]
            - Section1Component.vue
            - Section2Component.vue
        - FooterComponent.vue
        - ModalComponent.vue

