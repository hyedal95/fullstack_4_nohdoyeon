(function($){

    const just = {
        init(){
            this.header();
            this.section1();
            this.section2();
        },
        header(){
           // 메인버튼에 마우스 오버시(mouseenter === mouseover) 서브메뉴 박스 전체가 아래로
           // 부드럽게 나타난다. 슬라이드 다운 애니메이션
            $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().slideDown(300);
                }
            });

            // 서브메뉴를 벗어나면 부드럽게 다시 올라간다.
            $('.sub').on({
                mouseleave(){
                    $('.sub').stop().slideUp(300);
                }
            });
        },
        section1(){
            //1. 변수
            let cnt=0;

            //2. 메인슬라이드
            function mainSlide(){ // 0 1 2
                console.log( cnt );
               $('.slide-wrap').stop().animate({top: `${-300*cnt}px`}, 600, function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap').stop().animate({top: `${-300*cnt}px`}, 0);
               });
            }

            //3. 다음카운트
            function nextCount(){
                cnt++;
                mainSlide();
            }

            //4. 자동타이머 3초간격
            function autoTimer(){
                setInterval(nextCount, 3000);
            }
            autoTimer();

        },
        section2(){
            //갤러리 클릭시 공지사항갤러리 on 활성화
            //갤러리버튼 클릭 이벤트
            $('.gallery-btn').on({
                click(){
                    $('.gallery-btn').addClass('on');
                    $('.notice-btn').addClass('on');
                    $('.gallery').show(0);
                    $('.notice').hide(0);
                }
            });
            //공지사항 클릭시 공지사항갤러리 on 비활성화
            //공지사항버튼 클릭 이벤트
            $('.notice-btn').on({
                click(){
                    $('.gallery-btn').removeClass('on');
                    $('.notice-btn').removeClass('on');
                    $('.notice').show(0);
                    $('.gallery').hide(0);
                }
            });

        },
    }
    just.init();


})(jQuery);