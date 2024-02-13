(function($){
    const just={
        init(){
            this.header();
            this.section1();
            this.section2();
            this.footer();
        },
        header(){
        
            $('.main-btn').on({
                mouseenter(){
                    $('.sub-nav').stop().slideDown(300);
                }
            });
            $('#nav').on({
                mouseleave(){
                    $('.sub-nav').stop().slideUp(300);
                }
            })
        },
        section1(){

            let cnt=0;
            let setId=0;

            function mainSlide(){
                $('.slide-wrap').stop().animate({top:`${-300*cnt}px`},600,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap').stop().animate({top:`${-300*cnt}px`},0);
                })
            }
            function nextCount(){
                cnt++;
                mainSlide();
            }
            function autoTimer(){
                setId=setInterval(nextCount,3000);
            }
            autoTimer();

        },
        section2(){},
        footer(){},
    }
    just.init();
})(jQuery);