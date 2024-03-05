(function($){

    const script = {
        init(){
            this.section1();
            this.section2();
            this.section3();
        },
        section1(){
            let cnt=0;
            let setId=0;

            //1.
            function mainSlide(){
                $('.slide-wrap1').stop().animate({left:`${cnt*-1340}px`},300,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap1').stop().animate({left:`${cnt*-1340}px`},0)
                })

            }
            //2.
            function nextCount(){
                cnt++;
                mainSlide();
            }
            //3.
            function autoTimer(){
                setId =setInterval(nextCount,3000);
            }
            autoTimer();


        },
        section2(){
            let cnt=0;
            let setId=0;

            //1.
            function mainSlide(){
                $('.slide-wrap2').stop().animate({top:`${cnt*-600}px`},300,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap2').stop().animate({top:`${cnt*-600}px`},0)
                })

            }
            //2.
            function nextCount(){
                cnt++;
                mainSlide();
            }
            //3.
            function autoTimer(){
                setId =setInterval(nextCount,3000);
            }
            autoTimer();
        },
        section3(){
            let cnt=0;
            let setId=0;

            //1.
            function mainSlide(){
                console.log('현재' + (cnt-1<0?2:cnt-1) + '다음' +cnt)

                $('#section3 .slide').css({zIndex:1 , opacity:1});
                $('#section3 .slide').eq(cnt).css({zIndex:2 });
                $('#section3 .slide').eq(cnt-1<0?2:cnt-1).css({zIndex:3}).animate({opacity:0},1000);
            }
            //2.
            function nextCount(){
                cnt++;
                if(cnt>2){cnt=0};
                mainSlide();
            }
            //3.
            function autoTimer(){
                setId =setInterval(nextCount,3000);
            }
            autoTimer();
        },
    }
    script.init();
})(jQuery);