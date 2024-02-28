# 뷰_ v-show 이벤트
 - v-show="" 데이터에 등록해주고 메소드에 보여지게하는 것
 - v-show= "true" 이면 보이고 "false"이면 숨긴다.
```html
        <div id="root">
        <div class="container">
            <div class="title">
                <h1> {{title}} </h1>
            </div>
            <div class="content">
                <div class="button-box">
                    <button @click="onClickShow1">이미지1</button>
                    <button @click="onClickShow2">이미지2</button>
                    <button @click="onClickShow3">이미지3</button>
                    <button @click="onClickShow4">이미지4</button>
                    <button @click="onClickShow5">이미지5</button>
                </div>
                <div class="img-box"> 
                    <!-- v-show="" 데이터에 등록해주고 메소드에 보여지게하는 것 --> 
                    <!-- v-show= "true" 이면 보이고 "false"이면 숨긴다. -->
                    
                    <img v-show="isImage1" src="./images/wedding-img10.jpg" alt="이미지1">
                    <img v-show="isImage2" src="./images/wedding-img11.jpg" alt="이미지2">
                    <img v-show="isImage3" src="./images/wedding-img12.jpg" alt="이미지3">
                    <img v-show="isImage4" src="./images/wedding-img13.jpg" alt="이미지4">
                    <img v-show="isImage5" src="./images/wedding-img14.jpg" alt="이미지5">
                </div>
            </div>
        </div>
    </div>
```

```css
        #root{width: 100%; padding: 50px 0;}
        #root .container{width: 100%;}
        #root .container .title{width: 100%; padding-bottom: 50px; }
        #root .container .title h1{width: 100%; text-align: center; font-size: 28px; color: #09d; }

        #root .container .content{width: 100%; }
        /* 버튼박스 */
        #root .container .content .button-box{width: 100%; text-align: center; padding-bottom: 30px;}
        #root .container .content .button-box button{padding: 5px 20px; cursor: pointer;}
        /* 이미지박스 */
        #root .container .content .img-box{width: 100%; text-align: center; }
        #root .container .content .img-box img{width: 800px;}
```


 - <script></script> 내부 안에서는 뷰 선언 후, 데이터와 메소드를 분리해서 사용하면 편리하다.
1.  뷰 선언 => 뷰 객제(인스턴스)생성 #root를 마운트로 연결만 해줬다.
    선언부는 짧게만들고, 각각 분리해준다.
```js
        const vue =new Vue({
            data: data,
            methods: methods
        });
        vue.$mount('#root');
```

2.  상태변수 관리 데이터
    데이터 분리
```js
        const data={
            title: '웨딩 신랑 신부 이미지1',
            isImage1:true,
            isImage2:false,
            isImage3:false,
            isImage4:false,
            isImage5:false
        }
```

3.  버튼 클릭 이벤트, 메소드 관리
    메소드 분리

```js
        const methods={
            //버튼 클릭 이벤트 등록 => 메소드 호출
            onClickShow1(){
                    this.isImage1 = true;
                    this.isImage2 = false;
                    this.isImage3 = false;
                    this.isImage4 = false;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지1';
                },
                onClickShow2(){
                    this.isImage1 = false;
                    this.isImage2 = true;
                    this.isImage3 = false;
                    this.isImage4 = false;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지2';
                },
                onClickShow3(){
                    this.isImage1 = false;
                    this.isImage2 = false;
                    this.isImage3 = true;
                    this.isImage4 = false;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지3';
                },
                onClickShow4(){
                    this.isImage1 = false;
                    this.isImage2 = false;
                    this.isImage3 = false;
                    this.isImage4 = true;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지4';
                },
                onClickShow5(){
                    this.isImage1 = false;
                    this.isImage2 = false;
                    this.isImage3 = false;
                    this.isImage4 = false;
                    this.isImage5 = true;
                    this.title = '웨딩 신랑 신부 이미지5';
                }
            }
```





```js

        // 상태변수 관리 데이터
        // 데이터 분리
        const data={
            title: '웨딩 신랑 신부 이미지1',
            isImage1:true,
            isImage2:false,
            isImage3:false,
            isImage4:false,
            isImage5:false
        }
        // 버튼 클릭 이벤트, 메소드 관리
        // 메소드 분리
        const methods={
            //버튼 클릭 이벤트 등록 => 메소드 호출
            onClickShow1(){
                    this.isImage1 = true;
                    this.isImage2 = false;
                    this.isImage3 = false;
                    this.isImage4 = false;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지1';
                },
                onClickShow2(){
                    this.isImage1 = false;
                    this.isImage2 = true;
                    this.isImage3 = false;
                    this.isImage4 = false;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지2';
                },
                onClickShow3(){
                    this.isImage1 = false;
                    this.isImage2 = false;
                    this.isImage3 = true;
                    this.isImage4 = false;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지3';
                },
                onClickShow4(){
                    this.isImage1 = false;
                    this.isImage2 = false;
                    this.isImage3 = false;
                    this.isImage4 = true;
                    this.isImage5 = false;
                    this.title = '웨딩 신랑 신부 이미지4';
                },
                onClickShow5(){
                    this.isImage1 = false;
                    this.isImage2 = false;
                    this.isImage3 = false;
                    this.isImage4 = false;
                    this.isImage5 = true;
                    this.title = '웨딩 신랑 신부 이미지5';
                }
            }
        // 뷰 선언 => 뷰 객제(인스턴스)생성 #root를 마운트로 연결만 해줬다.
        // 선언부는 짧게만들고, 각각 분리해준다.
        const vue =new Vue({
            data: data,
            methods: methods
        });
        vue.$mount('#root');

```

