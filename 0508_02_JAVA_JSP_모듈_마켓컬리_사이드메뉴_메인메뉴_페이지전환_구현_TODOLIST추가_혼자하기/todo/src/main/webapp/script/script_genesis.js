(function($){
	
    const genesis ={

        init(){
            this.section1();

        },
        section1(){ //섹션1 시작

            //1.변수
            let cnt=0;
            let setId=0;
            let touchStart=null;
            let touchEnd=null;
            let mouseDown=false;

            //2.메인슬라이드
            function mainSlide(){
                $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},600,'easeInOutExpo',function(){
                    if(cnt>10) cnt=0;
                    if(cnt< 0) cnt=10;
                    $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},0)
                });

                //버튼클릭 on 활성화 
                $('.page-btn').removeClass('on');
                $('.page-btn').eq(cnt>10?0:cnt).addClass('on');

            }
            //3.다음카운트
            function nextCount(){
                if(!$('.slide-wrap').is(':animated')){
                    cnt+=1;
                    mainSlide();
                }
                

            }
            //3.이전카운트
            function prevCount(){
                if(!$('.slide-wrap').is(':animated')){
                    cnt-=1;
                    mainSlide();
                }

            }
            //4.자동타이머
            function autoTimer(){
                setId = setInterval(nextCount, 6000);
            }
            autoTimer();

            //5.버튼클릭이벤트 (1번 2번 )
            $('.page-btn').each(function(idx){
                $(this).on({
                    click(){
                        clearInterval(setId);
                        cnt=idx;
                        mainSlide();
                        autoTimer();
                    }
                })

            })

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

            //6.터치스와이프
            $('.content').on({
                mousedown(e){
                    mouseDown = true;
                    $('.slide-container').css({cursor:'grabbing'});
                    clearInterval(setId);
                    touchStart = e.clientX;

                },
                mouseup(e){

                    mouseDown = false;
                    touchEnd = e.clientX;
                    $('.slide-container').css({cursor:'grab'});
                    if(touchStart > touchEnd){
                        nextCount();
                        
                    }
                    if(touchStart <touchEnd){
                        prevCount();
                    }
                    autoTimer();
                }
            })

            //7. 도큐멘트
            $(document).on({
                mouseup(e){
                    if(!mouseDown) return;
                    touchEnd =e.clientX;
                    $('.slide-container').css({cursor:'grab'});
                    if(touchStart>touchEnd){
                        nextCount();

                    }
                    if(touchStart <touchEnd){
                        prevCount();
                    }
                }

            })

        }
   }
    genesis.init();

})(jQuery);