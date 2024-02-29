(function($){

    const script ={
        init(){
            this.header();
            this.section1();
            this.section2();
            this.section3();
            this.footer();
        },
        header(){},
        section1(){
            //변수설정
            let cnt=0;
            let setId=0;
            //메인슬라이드함수
            function mainSlide(){ // 1 2 3
                $('.slide').css({zIndex:1}).stop().fadeIn(0);
                $('.slide').eq(cnt>2?0:cnt).css({zIndex:2});
                $('.slide').eq(cnt-1).css({zIndex:3}).stop().fadeOut(1000);
            }
            //다음카운트함수
            function nextCount(){
                cnt++;
                if(cnt>2){cnt=0}
                mainSlide();
            }
            //자동타이머함수
            function autoTimer(){
                setId=setInterval(nextCount,3000);
            }
            autoTimer();
        },
        section2(){},
        section3(){},
        footer(){},
    }
    script.init();

})(jQuery);