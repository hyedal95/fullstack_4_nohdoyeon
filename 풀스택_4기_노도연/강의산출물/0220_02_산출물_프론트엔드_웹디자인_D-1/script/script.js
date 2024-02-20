(function($){
    class Obj {
        init(){

            this.header();
            this.section1();
            this.section2();
            this.section3();
            this.footer();
        }
        header(){
            //메인버튼 마우스 오버 이벤트
            $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().slideUp(0);
                    $(this).next().slideDown(500);
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                }
            });
            //col영역 떠나면 서브메뉴 사라짐.
            $('.col').on({
                mouseleave(){
                    $('.sub').stop().slideUp(200);
                    $('.main-btn').removeClass('on');
                }
            });
        }
        section1(){
            //1.변수설정
            let cnt=0;
            let setId=0;
            //2.메인슬라이드 함수
            function mainSlide(){
                $('.slide-wrap').stop().animate({top:`${-400*cnt}px`},600,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap').stop().animate({top:`${-400*cnt}px`},0);
                });
            }
            //3.다음카운트 함수
            function nextCount(){
                cnt++;
                mainSlide();

            }
            //4.자동타이머함수
            function autoTimer(){
                setId=setInterval(nextCount,3000);
            }
            autoTimer();
        }
        section2(){
        }
        section3(){

        }
        footer(){

        }
    }
    const obj = new Obj(); //클래스 객체를 생성하여 사용한다.
    obj.init();

})(jQuery);