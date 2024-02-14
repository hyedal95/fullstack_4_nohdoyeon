(function($){
    const just={
        init(){
            this.header();
            this.section1();
            this.section2();
            this.footer();
        },
        header(){
            //메인버튼 마우스 놓으면 서브메뉴 나타남
            $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().slideDown(300);
                }
            });
            //메인버튼과 서브영역에서 벗어나면 서브메뉴 사라짐
            $('#nav').on({
                mouseleave(){
                    $('.sub').stop().slideUp(300);
                }
            });
        },
        section1(){
            //1.변수설정
            let cnt=0;
            let setId=0;
            //2.메인슬라이드함수
            function mainSlide(){
                $('.slide-wrap').stop().animate({top:`${cnt*-300}px`},600,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap').stop().animate({top:`${cnt*-300}px`},0)
                });
            }
            //3.다음카운트함수
            function nextCount(){
                cnt++;
                mainSlide();

            }
            //4.자동타이머함수
            function autoTimer(){
                setId = setInterval(nextCount,3000);
            }
            autoTimer();
        },
        section2(){
            //갤러리버튼 클릭이벤트
            $('.gallery-btn').on({
                click(){
                    $('.gallery-btn').addClass('on');
                    $('.notice-btn').addClass('on');
                    $('.gallery').show(0);
                    $('.notice').hide(0);
                }
            });

            //공지사항 클릭이벤트
            $('.notice-btn').on({
                click(){
                    $('.gallery-btn').removeClass('on');
                    $('.notice-btn').removeClass('on');
                    $('.notice').show(0);
                    $('.gallery').hide(0);
                }
            });
        },
        footer(){},

    }
    just.init();
})(jQuery);