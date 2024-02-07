// 1. 즉시표현함수식:제이쿼리 $ 사인 충돌을 피하기 위한 함수
// 2. 즉시표현함수식 안에 객체(Object) : 헤더, 메인, 푸터, 섹션 등 변수 종복을 피하기 위해서 (변수 충돌을 막기 위해서 ) console.log($); 로 꼭 돌아가는지 확인하기
// 객체 genesis ={}

(function($,window){


    const genesis ={
        init(){
            this.section1();
            this.section2();
        },
        section1(){
            //1.변수설정
            //2.메인슬라이드함수
            //3.다음카운트함수
            //4.자동타이머함수
            //웹디자인기능사 실기는 요기까지!!!


            //5.페이지버튼클릭이벤트
            //6.터치스와이프
            //7.드래그앤드롭

            //1.변수
            let cnt=0;
            let setId=0;
            let touchStart= null;
            let touchEnd= null; 
            let mouseDown= false;
            let dragStart= null;
            let dragEnd= null;
            let winW = $(window).width(); //반응형 => 창너비(); $(window).width();
            //2.메인슬라이드
            function mainSlide(){ /* 0~10 */ 
                $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},300,'easeInOutExpo',function(){
                    if(cnt>10) cnt=0;
                    if(cnt<0 ) cnt=10;
                    $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},0);

                });
                //페이지번호 이벤트
                $('.page-btn').removeClass('on');
                $('.page-btn').eq(cnt>10?0:cnt).addClass('on');

            }

            //3.다음카운트 함수
            function nextCount(){
                cnt+=1;
                mainSlide();

            }
            //3.이전카운트 함수
            function prevCount(){
                cnt-=1;
                mainSlide();

            }

            //4.자동타이머함수
            function autoTimer(){
                setId = setInterval(nextCount,3000);
            }
            autoTimer();


            //5-1. 페이지버튼클릭이벤트 : idx를 cnt에 저장하고 메인함수 호출 실행
            $('.page-btn').each(function(idx){
                $(this).on({
                    click(){ 
                        clearInterval(setId);
                        cnt=idx;
                        mainSlide(); //페이지버튼은 늘 메인슬라이드를 호출한다.
                        autoTimer();


                    }
                });

            });

            //5-2.페이지버튼클릭이벤트 : 정지 플레이버튼 클릭 이벤트 ( 토글기능 )
            // 토글(Toggle) 기능: 하나의 버튼으로 두가지 기능을 수행하는 방법 => 정지/ 플레이
            // 가. play 클래스가 있니? 그러면 플레이 상태 hasClass

            $('.play-stop-btn').on({
                click(){
                    if($(this).hasClass('play')===true){ //정지
                        clearInterval(setId);
                        $(this).removeClass('play');
                        $(this).addClass('stop');
                    
                    }
                    else{ //플레이
                        $(this).removeClass('stop');
                        $(this).addClass('play');
                        autoTimer();

                    }

                }
            });


            //6-1.터치스와이프
            // -터치 시작 mouseDown > 터치 끝 mouseUp => 다음 카운트
            // -터치 시작 mouseDown < 터치 끝 mouseUp => 이전 카운트 
            $('.content').on({
                mousedown(event){                    
                    winW = $(window).width();
                    mouseDown= true; //터치시작
                    $('.slide-container').css({cursor:'grabbig'}); 
                    clearInterval(setId);
                    touchStart = event.clientX;
                    dragStart = event.clientX -($('.slide-wrap').offset().left +winW);

                },
                mousemove(event){
                    if(!mouseDown) return;
                    dragEnd = event.clientX;
                    $('.slide-wrap').css({left: `${dragEnd -dragStart}px` });


                },
                mouseup(event){
                    mouseDown= false; //터치끝
                    $('.slide-container').css({cursor:'grab'});
                    touchEnd = event.clientX;
                    if(touchStart - touchEnd >500){ /* <=500 */ 
                        nextCount();
                    }
                    if(touchStart - touchEnd <-500){ /* >=-500 */
                        prevCount();
                    }
                    if(touchStart - touchEnd <=500 && touchStart - touchEnd >=-500){
                        mainSlide();
                    }
                    autoTimer();

                }
            });

            //6-2.터치스와이프 도큐먼트
            // - mouseDown => true 인경우에만 실행 아니면 종료 return;
            // -터치 시작은 했는데, 마우스업(터치끝)이 슬라이드영역 밖으로 나가서 
            // -인식이 안되는 경우 즉 마우스업이 없는경우 디버깅
            $(document).on({
                mouseup(event){
                    // if(mouseDown===false) return;          //마우스다운이 false이면
                    // if(!mouseDown===true) return;          //마우스다운이 true가 아니면
                    if(!mouseDown) return;          //마우스다운이 true가 아니면
                    mouseDown= false; //터치끝
                    $('.slide-container').css({cursor:'grab'});
                    touchEnd = event.clientX;
                    if(touchStart - touchEnd >500){ /* <=500 */ 
                        nextCount();
                    }
                    if(touchStart - touchEnd <-500){ /* >=-500 */
                        prevCount();
                    }
                    if(touchStart - touchEnd <=500 && touchStart - touchEnd >=-500){
                        mainSlide();
                    }
                    autoTimer();


                }
            })


            




        }, //섹션1메소드 끝
        section2(){


        },

    }
    genesis.init();

})(jQuery,window);