(function($,window){

    const genesis ={
        init(){
            this.section1();
            this.section2();
        },
        section1(){
            //1.변수
            //2.메인슬라이드 (버튼 on )
            //3.다음카운트함수
            //4.자동타이머함수
            //5.버튼클릭이벤트 + 플레이멈춤버튼
            //6.터치스와이프 + 도큐멘트
            //7.터치스와이프 안에 mousemove 

            //1. 변수
            let cnt=0;
            let setId=0;
            let mouseDown=0;
            let touchStart=null;
            let touchEnd=null;
            let dragStart=null;
            let dragEnd=null;
            let winW= $(window).width();

            //2.메인슬라이드 
            function mainSlide(){
                $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},600,'', function(){
                    if(cnt>10) cnt=0;
                    if(cnt< 0) cnt=10;
                    $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},0);
                });
                //버튼on 활성화
                $('.page-btn').removeClass('on');
                $('.page-btn').eq(cnt>10?0:cnt).addClass('on');
            }

            //3-1.다음카운트함수
            function nextCount(){
                if(!$('.slide-wrap').is(':animated')){
                    cnt+=1;
                    mainSlide(); 
                }

            }
            //3-2.이음카운트함수
            function prevCount(){
                if(!$('.slide-wrap').is(':animated')){
                    cnt-=1;
                    mainSlide(); 
                }
            }

            //4.자동타이머버튼
            function autoTimer(){
                setId = setInterval(nextCount,3000);
            }
            autoTimer();

            //5-1.버튼클릭이벤트
            $('.page-btn').each(function(idx){
                $(this).on({
                    click(){
                        cnt=idx;
                        clearInterval(setId);
                        mainSlide();
                        autoTimer();
                    
                    }
                })

            });
            //5-2. 플레이멈춤버튼
            $('.play-stop-btn').on({
                click(){
                    if($(this).hasClass('play')===true){
                        clearInterval(setId);
                        $(this).removeClass('play');
                        $(this).addClass('stop');
                    }else{
                        $(this).removeClass('stop');
                        $(this).addClass('play');
                        autoTimer();
                    } 
                }
            })

            //6.터치스와이프 잡고 끌고 놓기 down move up
            $('.content').on({
                mousedown(e){
                    winW= $(window).width();
                    clearInterval(setId);
                    mouseDown =true;
                    touchStart=e.clientX;
                    $('.slide-container').css({cursor:'grabbing'});
                    dragStart =e.clientX -($('.slide-wrap').offset().left+winW);

                },
                mousemove(e){
                    if(!mouseDown) return;
                    dragEnd =e.clientX;
                    $('.slide-wrap').css({left: `${dragEnd-dragStart}px`});
                    

                },
                mouseup(e){
                    
                    mouseDown =false;
                    touchEnd=e.clientX;
                    $('.slide-container').css({cursor:'grab'});
                    if(touchStart-touchEnd >500 ){
                        nextCount();
                    }
                    if(touchStart-touchEnd <-500){
                        prevCount();
                    }
                    if(touchStart-touchEnd <=500 && touchStart-touchEnd >= -500 ){
                        mainSlide();
                    }
                    autoTimer();
                }

            })
            //7.예외영역

            $(document).on({
                mouseup(e){
                    if(!mouseDown) return;
                    mouseDown =false;
                    touchEnd=e.clientX;
                    $('.slide-container').css({cursor:'grab'});
                    if(touchStart-touchEnd >500 ){
                        nextCount();
                    }
                    if(touchStart-touchEnd <-500){
                        prevCount();
                    }
                    if(touchStart-touchEnd <=500 && touchStart-touchEnd >= -500 ){
                        mainSlide();
                    }
                    autoTimer();

                }

            })


        },
        section2(){

        },
    }
    genesis.init();

})(jQuery,window);