(function($){

    const shop = {
        init(){
            // this.header();
            this.section1();
            // this.section2();
            this.footer();
        },
        header(){
            
            //1. 메인버튼
            $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().slideUp(0);
                    $(this).next('.sub').stop().slideDown(200);
                    // 메인버튼
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                }
            });

            //2. 메인버튼과 서브메뉴 칸
            $('.col').on({
                mouseleave(){
                    $('.sub').stop().slideUp(200);
                    $('.main-btn').removeClass('on');
                }
            })


        },
        section1(){
            //1. 변수   
            let cnt=0;

            //2. 메인슬라이드함수 3개 우측에서 좌측으로 이동  0 1 2
            function mainSlide(){ 
                console.log("현재: " + (cnt-1<0?2:cnt-1),  "다음: " + cnt)                
                $('.slide').css({zIndex:1,opacity:1});
                $('.slide').eq(cnt)  .css({zIndex:2});
                $('.slide').eq( cnt-1 < 0 ? 2 : cnt-1 ).css({zIndex:3}).animate({opacity: 0}, 1000);
            }

            //3. 다음카운트함수
            function mextCount(){
                cnt++;                
                if(cnt>2) cnt=0;
                mainSlide();

            }

            //4. 자동타이머함수
            function autotimer(){
                setInterval(mextCount, 3000);
            }
            autotimer();

        },
        section2(){
           
            // 갤러리버튼 클릭 이벤트
            $('.gallery-btn').on({
                click(){
                    $('.gallery-btn').addClass('on');
                    $('.notice-btn').addClass('on');
                    $('.notice-box').hide();
                    $('.gallery-box').show();
                }
            })

             // 공지사항버튼 클릭 이벤트
             $('.notice-btn').on({
                click(){
                    $('.gallery-btn').removeClass('on');
                    $('.notice-btn').removeClass('on');
                    $('.notice-box').show();
                    $('.gallery-box').hide();
                }
            })

            // 팝업버튼 클릭 이벤트
            $('.popup-btn').on({
                click(){
                    $('.popup').css({display:'flex'}); // show().css({display:'flex'})
                }
            });
            // 팝업닫기버튼 클릭 이벤트
            $('.close-btn').on({
                click(){
                    // $('.popup').hide();
                    $('.popup').css({display:'none'}); // hide()
                }
            });


        },
        footer(){
            
        }
    }
    shop.init();

})(jQuery);