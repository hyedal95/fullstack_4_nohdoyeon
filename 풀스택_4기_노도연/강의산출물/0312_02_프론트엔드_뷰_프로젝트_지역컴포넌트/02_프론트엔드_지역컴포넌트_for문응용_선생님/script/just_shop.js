(function($){

    const shop = {
        init(){
            this.header();
            this.section1();
            this.section2();
            this.footer();
        },
        header(){
            // 네비게이션
            // 1. 메인버튼
           $('.main-btn').on({
            mouseenter(){

                $('.sub').stop().slideUp(0);
                $(this).next().stop().slideDown(300);

                $('.main-btn').removeClass('on');
                $(this).addClass('on');
            }

           });
           //2.칸
           $('.col').on({
            mouseleave(){

                $('.sub').stop().slideUp(200);
                $('.main-btn').removeClass('on');

            }
           });

        },
        section1(){
            //1. 변수   
            let cnt=0;

            //2. 메인슬라이드함수 3개 우측에서 좌측으로 이동  0 1 2
            function mainSlide(){ 

                console.log("현재"+(cnt-1<0 ? 2 : cnt-1)+"다음"+cnt);

                // 현재0다음1
                // 현재1다음2
                // 현재-1(2)다음0
                // 현재0다음1
                // 현재1다음2
               $('.slide').css({zIndex:1, opacity:1});
               $('.slide').eq(cnt)  .css({zIndex:2});
               $('.slide').eq(cnt-1<0 ? 2 : cnt-1).css({zIndex:3}).animate({opacity:0},1000);
            }

            //3. 다음카운트함수
            function mextCount(){
                cnt++;
                if(cnt>2){cnt=0};
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
                    $('.gallery').show(0);
                    $('.notice').hide(0);
                }
            })

             // 공지사항버튼 클릭 이벤트
            $('.notice-btn').on({
                click(){
                    $('.gallery-btn').removeClass('on');
                    $('.notice-btn').removeClass('on');
                    $('.notice').show(0);
                    $('.gallery').hide(0);
                }
            })

            //공지사항 1번째 글 클릭시 팝업창 오픈 이벤트 
            $('.popup-btn').on({
                click(){
                    $('.popup').css({display:'flex'});  
                    /* ===$('.popup').show().css({display:'flex'}); */
                    /* 쇼를 하면 디스플레이 블록이 되서 플렉스가 사라짐 */
                }
            });
            //팝업창 닫기 클릭 이벤트
            $('.close-btn').on({
                click(){
                    // $('.popup').hide(0); //display:none;
                    $('.popup').css({display:'none'}); //display:none;
                }
            });

        },
        footer(){
            
        }
    }
    shop.init();

})(jQuery);