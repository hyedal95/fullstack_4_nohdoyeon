(function($){

    class Obj {
        init(){
            this.header();
            this.section1();
            this.section2();
            this.section3();
            this.modal();
        }
        header(){
              //메인메뉴 마우스오버시 서브메뉴 나오면서 메인메뉴 고정
              $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().hide(0);
                    $(this).next().stop().slideDown(600);
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                },
                focus(){
                    $('.sub').stop().hide(0);
                    $(this).next().stop().slideDown(600);
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                }
            }),
            //col에서 벗어나면 서브메뉴 사라짐
            $('.col').on({
                mouseleave(){
                    $('.main-btn').removeClass('on');
                    $('.sub').stop().slideUp(300);
                }
            })
        }
        section1(){
            //메인슬라이드
            let cnt=0;
            let setId=0;

            function mainSlide(){
                $('.slide-wrap').stop().animate({top:`${cnt*-400}px`},600,function(){
                    if(cnt>3) cnt=0;
                    $('.slide-wrap').stop().animate({top:`${cnt*-400}px`},0)
                })
            }

            function nextCount(){
                cnt++;
                mainSlide();

            }

            function autoTimer(){
                setId =setInterval(nextCount,3000);
            }
            autoTimer();
        }
        section2(){}
        section3(){
            //공지사항&갤러리
            //갤러리버튼 클릭시 
            $('.gallery-btn').on({
                click(){
                    $('.gallery-btn').addClass('on');
                    $('.notice-btn').addClass('on');
                    $('.gallery').addClass('on');
                    $('.notice').addClass('on');
                }
            })

            //공지사항 버튼 클릭시
            $('.notice-btn').on({
                click(){
                    $('.gallery-btn').removeClass('on');
                    $('.notice-btn').removeClass('on');
                    $('.gallery').removeClass('on');
                    $('.notice').removeClass('on');
                }
            })
        }
        modal(){
            $('.popup').on({
                click(){
                    $('.modal').addClass('open');
                }
            })
            $('.close-btn').on({
                click(){
                    $('.modal').removeClass('open');
                }
            })
        }
    }
    const obj = new Obj();
    obj.init();
})(jQuery);