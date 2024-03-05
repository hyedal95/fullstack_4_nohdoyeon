(function($){

       const dycompany ={
        init(){
            this.header();
            this.section1();
            this.section2();
            this.section3();
            this.main();
            this.footer();
            this.modal();
        },
        header(){
            //모바일버전 메뉴 나타내기 버튼
            $('.moblie-btn.hide').on({
                click(){
                    $('.bottom').addClass('on');
                    $('.moblie-btn').addClass('on');

                }
            })
            $('.close-button').on({
                click(){
                    $('.bottom').removeClass('on');
                    $(this).removeClass('on');
                }
            })


            //메인버튼 마우스 놓으면 해당 메인메뉴 on활성화 및 서브메뉴 보여지기 효과
            $('.main-btn').on({
                mouseenter(){
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                    $('.sub').stop().hide(0);
                    $(this).next().slideDown(300);
                },
                foucs(){
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                    $('.sub').stop().hide(0);
                    $(this).next().slideDown(300);
                }
            });
            $('.col').on({
                mouseleave(){
                    $('.main-btn').removeClass('on');
                    $('.sub').stop().slideUp(300);
                }
            })

            // 팝업창
            $('#family').on({
                change(){
                    if($(this).val()!==""){
                        window.open($(this).val());
                    }
                }
            })

            
            

        },
        section1(){},
        section2(){
            //갤러리버튼 클릭
            $('.gallery-btn').on({
                click(){
                    $('.gallery-btn').addClass('on');
                    $('.notice-btn').addClass('on');
                    $('.gallery').addClass('on');
                    $('.notice').addClass('on');
                }
            })

            //공지사항버튼 클릭
            $('.notice-btn').on({
                click(){
                    $('.gallery-btn').removeClass('on');
                    $('.notice-btn').removeClass('on');
                    $('.gallery').removeClass('on');
                    $('.notice').removeClass('on');
                }
            })
        },
        section3(){},
        main(){
            //메인슬라이드
            //1.변수
            let cnt=0;
            let setId=0;
            //2.메인슬라이드함수
            function mainSlide(){
                console.log("현재"+ (cnt-1<0?2:cnt-1) + "다음" +cnt);
                // 현재0다음1
                // 현재1다음2
                // 현재-1(2)다음0
                // 현재0다음1
                $('.slide').css({zIndex:1, opacity:1});
                $('.slide').eq(cnt).css({zIndex:2});
                $('.slide').eq(cnt-1<0?2:cnt-1).css({zIndex:3}).animate({opacity:0},1000);

            }
            //3.다음카운트함수
            function nextCount(){
                cnt++;
                if(cnt>2){cnt=0};
                mainSlide();
            }
            //4.자동타이머함수
            function autoTimer(){
                setId= setInterval(nextCount,3000);
            }
            autoTimer();
        },
        footer(){},
        modal(){
            $('.popup-btn').on({
                click(){
                    $('.modal').addClass('on');
                }
            })

            $('.close-btn').on({
                click(){
                    $('.modal').removeClass('on');
                }
            })
        },
       }
       dycompany.init(); 
})(jQuery);