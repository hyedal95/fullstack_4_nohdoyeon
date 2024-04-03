(function($, window){   

    const event = {
        init(){
            this.header();
            this.section1();
            this.section2();
            this.section3();
            this.section4();
            this.timerCounter();
            this.section5();
            this.section6();
            this.section7();
            this.section8();
            this.section9();
            this.section10();
            this.section11();
            this.section12();
        },
        header(){
         
            let newScroll = 0;  // 현재스크롤값
            let oldScroll = 0;  // 이전스크롤값
            let mobileBtn = $('#header .mobile-btn');
            let right = $('#header .right');
            let nav = $('#nav');
            let navBtn = $('.nav-btn');
            
            mobileBtn.on({
                click(e){
                    e.preventDefault();
                    nav.stop().slideToggle(300);
                }
            });

            // 모바일 상태에서 메뉴 클릭시 
            // 해당 섹션으로 이동하고 메뉴는 slideUp(300)
            navBtn.on({
                click(){                    
                    // 클릭시 창너비가 991 이하면 slideUp(300) 구현
                    if( $(window).innerWidth()<=991 ){
                        nav.stop().slideUp(300);
                    }                    
                }
            });

            // 화면 너비 991 초과시 반응형 
            //$(window).resize(); // 화면 크기가 변경되면 동작한다.
            $(window).resize(function(){
                if($(window).width()>991){  // 창너비
                // if($(window).innerWidth()>991){ // 창내부너비
                    //nav.stop().slideDown(0); // display: block
                    //nav.stop().show(0); // display: block
                    nav.css({display:'block'}); // 모바일 이벤트로 slideUp() 사라진 메뉴 보이게한다.
                }
                else {
                    nav.css({display:'none'});
                    // nav.stop().hide(0)
                    // nav.stop().slideUp(0)
                }
            });




           // 상단에서 아래로 스크롤값이 60 이상 
           // 헤더 높이 60 배경은 검정으로 변경 테두리아래는 삭제
           // 윈도우 스크롤이벤트 : 스크롤값이 1픽셀이상 변경되면 이벤트 발생
            $(window).scroll(function(){
                
                if( $(window).scrollTop() >= 10 ){
                    $('#header').addClass('on');
                    $('.right').addClass('on');
                }
                
                if( $(window).scrollTop() === 0 ){
                    $('#header').removeClass('on');
                    $('.right').removeClass('on');
                }
                
                // 올드스크롤값-뉴스크롤값
                // 스크롤이 아래로 내려가면 down - 음수
                // 스크롤이 위로 올라가면 up + 양수               
                newScroll = $(window).scrollTop();
                    if(  oldScroll-newScroll < 0 ){ // scroll down                        
                        $('#header').addClass('down');
                    }
                    if(  oldScroll-newScroll > 0 ){ // scroll up
                        $('#header').removeClass('down');
                    }
                oldScroll = newScroll;

            });
        },
        section1(){
           
            
            
        },
        section2(){
            const title = $('#section2 .title');
            const left = $('#section2 .left');
            const right = $('#section2 .right');

            $(window).scroll(function(){                
                if( $(window).scrollTop() > 200 ){
                    title.addClass('ani');
                    left.addClass('ani');
                    right.addClass('ani');
                }
                if( $(window).scrollTop() === 0 ){
                    title.removeClass('ani');
                    left.removeClass('ani');
                    right.removeClass('ani');
                }
            });  
        },
        section3(){
            const container = $('#section3 .container');
            const sec2OffsetTop = $('#section2').offset().top;
            // 섹션2의 탑값이 상단에 도달하면 

            $(window).scroll(function(){
                if($(window).scrollTop() >= sec2OffsetTop){
                    container.addClass('ani');
                }
                
                if($(window).scrollTop() == 0){
                    container.removeClass('ani');
                }
            });
        },
        section4(){
            const title = $('#section4 .title');
            const textBox = $('#section4 .text-box');
            const ulli = $('#section4 ul li');
            const sec3OffsetTop = $('#section3').offset().top-400;
            // 섹션2의 탑값이 상단에 도달하면 

            $(window).scroll(function(){
                if($(window).scrollTop() >= sec3OffsetTop){
                    title.addClass('ani');
                    textBox.addClass('ani');
                    ulli.addClass('ani');
                }
                
                if($(window).scrollTop() == 0){
                    title.removeClass('ani');
                    textBox.removeClass('ani');
                    ulli.removeClass('ani');
                }
            }); 
        },
        timerCounter(){



            const section4Top = $('#section4').offset().top+500;
            const content = $('#timerCounter .content');
 
            $(window).scroll(function(){
                if($(window).scrollTop()>=section4Top){
                    content.addClass('on');
                }
                if($(window).scrollTop()===0){
                    content.removeClass('on');
                }
            });




            // 날짜 & 시간 카운터
            let id = 0;
            const number = $('#timerCounter .number');

            titmerCounterFn();
            function titmerCounterFn(){
                // 7일간 셋팅 일정 : 현재날짜시간 => 남은 날짜, 시, 분, 초 카운트 계산하기
                let now = new Date(); // 현재날짜
                let start = new Date('2024-04-03 09:30:00');
                    start.setDate( start.getDate() + 7 ); // 7일 카운터
                let end = start - now; // 601297238 ms 밀리초 단위로 출력된다. 
                let days = Math.floor(end/(24*60*60*1000)); 
                let hours = Math.floor(end/(60*60*1000)%24);
                let minutes = Math.floor(end/(60*1000)%60);
                let seconds = Math.floor(end/(1000)%60);

                // 카운트 타이머 종료 조건문
                if(now >= start){
                    clearInterval(id);
                    days = 0;
                    hours = 0;
                    minutes = 0;
                    seconds = 0;
                    number.eq(0).text(days<10?`0${days}`:days);
                    number.eq(1).text(hours<10?`0${hours}`:hours);
                    number.eq(2).text(minutes<10?`0${minutes}`:minutes);
                    number.eq(3).text(seconds<10?`0${seconds}`:seconds);
                }
                else{
                    number.eq(0).text(days<10?`0${days}`:days);
                    number.eq(1).text(hours<10?`0${hours}`:hours);
                    number.eq(2).text(minutes<10?`0${minutes}`:minutes);
                    number.eq(3).text(seconds<10?`0${seconds}`:seconds);
                }               
            }

            id = setInterval(titmerCounterFn, 1000);

        },
        section5(){
            const section4Top = $('#section4').offset().top+600;
            const title = $('#section5 .title');
            const nav = $('#section5 .nav');
            const buttonBox = $('#section5 .button-box');
            const navBtn = $('#section5 .nav-btn');  // 4개 each() 메서드사용
            const tabmenu = $('#section5 .tabmenu'); // 4개 each() 메서드사용

            navBtn.each(function(idx){
                $(this).on({
                    click(e){                        
                        e.preventDefault();
                        navBtn.removeClass('on');
                        navBtn.eq(idx).addClass('on');3
                        tabmenu.fadeOut(0);
                        tabmenu.eq(idx).fadeIn(600);
                    }
                });
            });

            $(window).scroll(function(){
                if($(window).scrollTop()>=section4Top){
                    title.addClass('on');
                    nav.addClass('on');
                    buttonBox.addClass('on');
                    tabmenu.addClass('on');
                }
                if($(window).scrollTop()===0){
                    title.removeClass('on');
                    nav.removeClass('on');
                    buttonBox.removeClass('on');
                    tabmenu.removeClass('on');
                }
            });


        },
        section6(){
            const section5Top = $('#section5').offset().top+300;
            const title = $('#section6 .title');
            const content = $('#section6 .content');

            $(window).scroll(function(){
                if($(window).scrollTop()>=section5Top){
                    title.addClass('on');
                    content.addClass('on');
                }
                if($(window).scrollTop()===0){
                    title.removeClass('on');
                    content.removeClass('on');
                }
            });
        },
        section7(){            
           const galleyBtn = $('#section7 .galley-btn');
           const modal = $('#modal');
           const modalImg = $('#modal img');
           const modalCloseBtn = $('#modal .modal-close-btn');
           const modalNextBtn = $('#modal .modal-next-btn');
           const modalPrevBtn = $('#modal .modal-prev-btn');
           const modalImgBtn = $('#modal .modal-img-btn');

           const section5Top = $('#section5').offset().top+800;
           const title = $('#section7 .title');
           const content = $('#section7 .content');

           $(window).scroll(function(){
               if($(window).scrollTop()>=section5Top){
                   title.addClass('on');
                   content.addClass('on');
               }
               if($(window).scrollTop()===0){
                   title.removeClass('on');
                   content.removeClass('on');
               }
           });




           let num = 0;

            // 모달창 이미지
            function modalImageFn(){
                // 가져온 이미지 소스로 모달창 이미지 변경하기
                modalImg.attr('src', `./img/event-img${num}.jpg` ).stop().fadeOut(0).fadeIn(300);
            }


           // 모달창 열기
           galleyBtn.on({
                click(){
                    modal.stop().fadeIn(300);
                    $('html').addClass('on');
                    // 클릭한 이미지 src 속성 가져오기
                    let imgSrc = $(this).children('img').attr('src');
                    let start = imgSrc.indexOf('-img')+4; // 15
                    let end = imgSrc.indexOf('.jpg');  // 16 17
                    // num = imgSrc.substr(start,end-start); // substr(시작위치, 글자수)
                    num = imgSrc.substring(start,end);       // substring(시작위치, 끝위치)

                    // data- 속성을 사용하는 경우 : 제이쿼리에서 지원한다.
                    //num = $(this).children('img').data('num'); // 데이터 속성의 번호 가져오기

                    // 가져온 이미지 소스로 모달창 이미지 변경하기
                    modalImageFn();
                }
           });
           
           // 모달창 닫기
           modal.on({
                click(){
                    modal.stop().fadeOut(300);
                    $('html').removeClass('on');
                }
           })

           // 모달닫기 버튼클릭 이벤트
           modalCloseBtn.on({
                click(e){
                    e.preventDefault();
                    e.stopPropagation();
                    modal.stop().fadeOut(300);
                    $('html').removeClass('on');
                }
           });

           // 이전 갤러리 이미지 버튼 이벤트
           modalPrevBtn.on({
                click(e){
                    e.preventDefault();
                    e.stopPropagation();
                    num--;
                    if(num<8){
                        num=15;
                    }
                     // 가져온 이미지 소스로 모달창 이미지 변경하기
                     modalImageFn();
                }
           })

           // 다음 갤러리 이미지 번트 이벤트
           modalNextBtn.on({
            click(e){
                e.preventDefault();
                e.stopPropagation();
                num++;
                if(num>15){
                    num=8;
                }
                 // 가져온 이미지 소스로 모달창 이미지 변경하기
                 modalImageFn();
            }
           })

           // 모달 이미지 버튼 다음 갤러리 이미지 번트 이벤트
           modalImgBtn.on({
                click(e){
                    e.preventDefault();
                    e.stopPropagation();  
                    num++;
                    if(num>15){
                        num=8;
                    }
                     // 가져온 이미지 소스로 모달창 이미지 변경하기
                     modalImageFn();
                }
           });


        },
        section8(){
            const section7Top = $('#section7').offset().top;
            const title = $('#section8 .title');
            const content = $('#section8 .content');
 
            $(window).scroll(function(){
                if($(window).scrollTop()>=section7Top){
                    title.addClass('on');
                    content.addClass('on');
                }
                if($(window).scrollTop()===0){
                    title.removeClass('on');
                    content.removeClass('on');
                }
            });
        },
        section9(){

            const section7Top = $('#section7').offset().top+500;
            const content = $('#section9 .content');
 
            $(window).scroll(function(){
                if($(window).scrollTop()>=section7Top){
                    content.addClass('on');
                }
                if($(window).scrollTop()===0){
                    content.removeClass('on');
                }
            });




            // 타이머 카운트
            // 숫자가 10초동안 각각이 증가하여 동시에 정해진 숫자로 정지한다.
            // 780 45 320 990
            // 10초 나누기 그래야 1초동안에 더할 숫자가 크기가 나온다.
            // 78  4.5 32	99
            const number = $('#section9 .number');
            const barGraphe = $('#section9 .bar-graphe');
            const count = [780,45,320,990];  // 곽괄호는 배열을 선언할 때 사용
            let cnt     = [0,0,0,0];
            let id      = [0,0,0,0];

            const Count2 = 65;
            let cnt2 = 0;
            let id2 = 0;

            number.each(function(i){
                id[i] = setInterval(function(){
                    cnt[i] += count[i]/1000;
                    if(cnt[i]>count[i]){
                        cnt[i]=count[i];
                        clearInterval(id[i]);
                    }
                    number.eq(i).text(Math.ceil(cnt[i]));
                }, 10);
            });


            // each() 메서드 사용 안함
            id2 = setInterval(function(){
                cnt2 += 0.065;
                if(cnt2>65){
                    cnt2=65;
                    clearInterval(id2);
                }
                barGraphe.css({width: cnt2})
            }, 10);
        


        },
        section10(){
            const section7Top = $('#section7').offset().top+800;
            const title = $('#section10 .title');
            const contentUlLi = $('#section10 .content li');
 
            $(window).scroll(function(){
                if($(window).scrollTop()>=section7Top){
                    title.addClass('on');
                    contentUlLi.addClass('on');
                }
                if($(window).scrollTop()===0){
                    title.removeClass('on');
                    contentUlLi.removeClass('on');
                }
            });
        },
        section11(){

            const section10Top = $('#section10').offset().top+300;
            const left = $('#section11 .left');
            const right = $('#section11 .right');
 
            $(window).scroll(function(){
                if($(window).scrollTop()>=section10Top){
                    left.addClass('on');
                    right.addClass('on');
                }
                if($(window).scrollTop()===0){
                    left.removeClass('on');
                    right.removeClass('on');
                }
            });




            const submitBtn = $('#section11 .submit-btn');

            // 정규표현식 REGEXP
            // 언어 : 패턴언어
            // 문자열로 입력된 모든 데이터를 처리한다.
            // . 1글자
            // ? 0자 또는 1자
            // * 0자이상
            // + 1자이상
            // () 그룹
            // [] 범위
            // /g Global 글로발 전역(전체범위)

            // 정규표현식 기본 표현식
            // 단순 콘솔창으로 테스트
            // 영문 소문자 범위
            // 시작문자 ^
            // 끝문자 $
            // | or
            // & and
            const regexp1 = /[a-z]/g;
            const regexp2 = /[A-Za-z]/g;  //대소문자 구별없다
            const regexp3 = /[A-Z]/gi;  //대소문자 구별없다
            const regexp4 = /[0-9]/g;  // 0 ~ 9  숫자
            const regexp5 = /[a-zA-Z0-9]/g;  // 0 ~ 9  숫자
            const regexp6 = /[A-Z]+[0-9]+/g;  // A-Z 1자이상  0 ~ 9 1자이상  숫자
            const regexp7 = /[A-Z]*[0-9]+/g;  // A-Z 0자이상  0 ~ 9 1자이상  숫자

            // 시작문자는 영문대소문자구별없이 시작 1자이상 필수
            // 중간에는 @ 0자 또는 1자( 골뱅이 문자 없어도 되고 있어도 되고 단 1자)
            // 끝문자는 영문대소문자구별없이 반드시 2~3자 사이 범위 수량자
            const regexp8 = /^[a-zA-Z]+[@]?[a-zA-Z]{2,3}$/g;
            
            // 시작문자 영문 1자이상 필수
            // 중간 . 0자 또는 1자
            // 영문 0자 이상
            // @ 
            const regexp9 = /^([a-z]+[._-]?[a-z]*)@([a-z]+[._-]?[a-z]*).[a-z]{2,3}$/g;
            //  (   )@(  ).co
            //  (   )@(  ).com
            //  (   )@(  ).kr
            // 예1]  'java@pro.com'
            // 예2]  'java@pro.co'
            // 예3]  'java@abc.com'
            // 예4]  'moonjong@naver.com'
            // 예5]  'moon.jong@naver.co.kr'
            // 예6]  'moonjong@yhoo.co.kr'
            // 예7]  'moon_jong@naver.co.kr'
            // 예8]  'moon-jong@yahoo.co.kr'



            // 정규표현식이 맞나 틀리나 검증은 test(); 테스트 메서드 사용
            // test() 메서드는 정규표현식이 맞다면 true 를 반환한다.
            // test() 메서드는 정규표현식이 틀리다면 false 를 반환한다.
            // 1. 테스트
            let str1 = 'LOVE';          
            let str2 = 'Love';          
            let str3 = 'abcdef';
            let str4 = '2589';

                // 영문소문자
            let result = regexp1.test(str1);  // 정규표현식.test(문자열);
                console.log( result );

                // 영문소문자
                result = regexp1.test(str2);
                console.log( result );

                // 영문대소문자 구별없음
                result = regexp2.test(str2); 
                console.log( result );

                // 영문대소문자 구별없음
                result = regexp3.test(str2); 
                console.log( result );

                // 숫자 0 ~ 9
                result = regexp4.test(str3); 
                console.log( str3 + ' ' + result );

                // 숫자 0 ~ 9
                result = regexp4.test(str4); 
                console.log( str4 + ' ' + result );

                // 영문대소문자 그리고 숫자
                result = regexp5.test('Love123'); 
                console.log( 'Love123' + ' ' + result );

                // 영문대소문자 그리고 숫자
                result = regexp5.test('Love'); 
                console.log( 'Love' + ' ' + result );

                // A-Z 1자이상  0 ~ 9 1자이상  숫자
                result = regexp6.test('abc123'); 
                console.log( 'abc123' + ' ' + result );

                // A-Z 1자이상  0 ~ 9 1자이상  숫자
                result = regexp6.test('ABC123'); 
                console.log( 'ABC123' + ' ' + result );

                // A-Z 1자이상  0 ~ 9 1자이상  숫자
                result = regexp6.test('123'); 
                console.log( '123' + ' ' + result );

                // A-Z 1자이상  0 ~ 9 1자이상  숫자
                result = regexp6.test('ABC'); 
                console.log( 'ABC' + ' ' + result );

                // A-Z 0자이상  0 ~ 9 1자이상  숫자
                result = regexp7.test('2929');  
                console.log( 'ABC' + ' ' + result );

                // A-Z 0자이상  0 ~ 9 1자이상  숫자
                result = regexp7.test('ABC');  
                console.log( 'ABC' + ' ' + result );

                // A-Z 0자이상  0 ~ 9 1자이상  숫자
                result = regexp7.test('ABC393939'); 
                console.log( 'ABC393939' + ' ' + result );

                // const regexp8 = /^[a-zA-Z]+[@]?[a-zA-Z]{2,3}$/g;  
                // 시작문자는 영문대소문자구별없이 시작 1자이상 필수
                // 중간에는 @ 0자 또는 1자( 골뱅이 문자 없어도 되고 있어도 되고 단 1자)
                // 끝문자는 영문대소문자구별없이 반드시 2~3자 사이 범위 수량자
                result = regexp8.test('Javascript@com'); 
                console.log( 'Javascript@com' + ' ' + result );

                result = regexp8.test('2Java@co'); 
                console.log( '2Java@com' + ' ' + result );

                result = regexp8.test('Programming@java'); 
                console.log( 'Programming@java' + ' ' + result );





            // 키보드 테스트
            // 아이디가 'email' 선택자를 이용
            // 정규표현식 테스트
            // 이메일 입력상자 값
            $('#email').on({
                // change(e){ // 체인지 바뀌면 체크(리액트)
                keyup(e){ // 키보드 올라오면 체크(제이쿼리)
                    result = regexp9.test( $(this).val() ); 
                    console.log( result );
                }   
            });




            // AJAX API         
            // 전송버튼 클릭 이벤트
            submitBtn.on({
                click(e){
                    e.preventDefault();
                    
                    // 빈값 허용 안함 : 유효성 검사
                    if( $('#name').val()==='' ){
                        alert("이름을 입력하세요");
                        $('#name').focus();
                        return false; // 전송 취소
                    }                    
                    else if( $('#email').val()==='' ){
                        alert("이메일을 입력하세요");
                        $('#email').focus();
                        return false; // 전송 취소
                    }
                    else if( $('#ticket').val()==='' ){
                        alert("티켓타입을 선택하세요");
                        $('#ticket').focus();
                        return false; // 전송 취소
                    }
                    else if( $('#message').val()==='' ){
                        alert("메시지를 입력하세요");
                        $('#message').focus();
                        return false; // 전송 취소
                    }
                    else { // 모두 입력되었다면 ajax 구현
                   
                        $.ajax({
                            url:'./seats.php',
                            type:'POST', //GET
                            data:{
                                name: $('#name').val(),
                                email: $('#email').val(),
                                ticket: $('#ticket').val(),
                                message: $('#message').val(),
                            },
                            success(res){ // AJAX 성공메시지 
                                alert('성공적으로 전송되었습니다.');
                                setTimeout(function(){
                                    $('#name').val('');
                                    $('#email').val('');
                                    $('#ticket').val('');
                                    $('#message').val('');
                                },500);
                            },
                            error(err){ // AJAX 실패메시지 
                                console.log( err );  
                            }
                        });
                    }
                 

                }
            });



        },        
        section12(){

            const section11Top = $('#section11').offset().top+300;
            const title = $('#section12 .title');
            const content = $('#section12 .content');
 
            $(window).scroll(function(){
                if($(window).scrollTop()>=section11Top){
                    title.addClass('on');
                    content.addClass('on');
                }
                if($(window).scrollTop()===0){
                    title.removeClass('on');
                    content.removeClass('on');
                }
            });






            const submitBtn = $('#section12 .submit-btn');

            // AJAX API         
            // 전송버튼 클릭 이벤트
            submitBtn.on({
                click(e){
                    e.preventDefault();

 
                    // 빈값 허용 안함 : 유효성 검사
                    if( $('#name2').val()==='' ){
                        alert("이름을 입력하세요");
                        $('#name2').focus();
                        return false; // 전송 취소
                    }                    
                    else if( $('#email2').val()==='' ){
                        alert("이메일을 입력하세요");
                        $('#email2').focus();
                        return false; // 전송 취소
                    }
                    else if( $('#message2').val()==='' ){
                        alert("메시지를 입력하세요");
                        $('#message2').focus();
                        return false; // 전송 취소
                    }
                    else { // 모두 입력되었다면 ajax 구현
                   
                        $.ajax({
                            url:'./contactus.php',
                            type:'POST', //GET
                            data:{
                                name: $('#name2').val(),
                                email: $('#email2').val(),
                                message: $('#message2').val(),
                            },
                            success(res){ // AJAX 성공메시지 
                                alert('성공적으로 전송되었습니다.');
                                setTimeout(function(){
                                    $('#name2').val('');
                                    $('#email2').val('');
                                    $('#message2').val('');
                                    // 완료되면 부드럽게 맨위로 이동하게 한다.
                                    // 스무스 스크롤링
                                    $('html, body').animate({scrollTop: 0}, 300);
                                },500);
                               
                            },
                            error(err){ // AJAX 실패메시지 
                                console.log( err );  
                            }
                        });
                    }




                }
            });



        },
        footer(){}
    }
    event.init();    

})(jQuery, window);