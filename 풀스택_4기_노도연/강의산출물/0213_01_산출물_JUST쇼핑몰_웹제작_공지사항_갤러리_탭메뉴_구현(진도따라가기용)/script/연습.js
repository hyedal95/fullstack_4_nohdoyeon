연습.js(function($){
    const just ={
        init(){
            this.header();
            this.section1();
            this.section2();
            this.footer();
        },

        header(){
            //메인버튼에 마우스 오버시(mouseenter ===mouseover) 서브메뉴 박스 전체가 아래로
            //부드럽게 나타난다. 슬라이드 다운 애니메이션 이벤트 구현
            $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().slideDown(300);
                }
            });

            //서브메뉴를 벗어나면 부드럽게 다시 올라간다. (mouseleave ===)
            //메인메뉴를 벗어나면 부드럽게 다시 올라간다. (mouseleave ===)
            $('.sub').on({
                mouseleave(){
                    $('.sub').stop().slideUp(300);
                }
            });
        },
        section1(){
            //1.변수
            let cnt=0;
            //2.메인슬라이드함수
            function mainSlide(){
                $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},600 ,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap').stop().animate({left:`${-100*cnt}%`},0)
                })
            }
            //3.다음카운트함수
            function nextCount(){
                cnt++;
                mainSlide();

            }
            //4.자동타이머함수
            function autoTimer(){
                setId=setInterval(nextCount,3000);
            }
            autoTimer();

        },
        section2(){

        },
        footer(){

        },

    }
    just.init();

})(jQuery);