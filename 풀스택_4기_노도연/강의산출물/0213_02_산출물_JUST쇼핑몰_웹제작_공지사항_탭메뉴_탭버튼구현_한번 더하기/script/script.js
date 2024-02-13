(function($){
    const just ={
        init(){
            this.header();
            this.section1();
            this.section2();
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
            $('.sub').on({
                mouseleave(){
                    $('.sub').stop().slideUp(300);
                }
            });
        },
        section1(){
            //1.변수
            let cnt=0;
            let setId=0;
            //2.메인슬라이드
            function mainSlide(){ /* 0~2 */
                $('.slide-wrap').stop().animate({top:`${-300*cnt}px`},600,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap').stop().animate({top:`${-300*cnt}px`},0)
                });
            }
            //3.다음카운트
            function nextCount(){
                cnt+=1;
                mainSlide();
            }
            //4.자동타이머 3초 간격
            function autoTimer(){
                setId=setInterval(nextCount,3000);

            }autoTimer();

        },
        section2(){
            $('.gallery-btn').on({
                click(){
                    $('.notice-btn').addClass('on');
                    $('.gallery-btn').addClass('on');
                }
            })
            $('.notice-btn').on({
                click(){
                    $('.notice-btn').removeClass('on');
                    $('.gallery-btn').removeClass('on');
                }
            })

        },

    }
    just.init();

})(jQuery);