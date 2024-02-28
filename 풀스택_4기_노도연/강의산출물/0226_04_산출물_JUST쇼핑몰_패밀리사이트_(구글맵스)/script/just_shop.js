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
            //1. 
            $('.menu-btn').on({
                mouseenter(){
                    $('.sub').stop().slideUp(0);
                    $(this).next().stop().slideDown(200);
                    //메인버튼 배경 on
                    $('.menu-btn').removeClass('on');
                    $(this).addClass('on');
                },
                focus(){
                    $('.sub').stop().slideUp(0);
                    $(this).next().stop().slideDown(200);
                    //메인버튼 배경 on
                    $('.menu-btn').removeClass('on');
                    $(this).addClass('on');
                }
            });
            //2.메뉴 해당 칸을 마우스 아웃시(떠나면) => 서브메뉴 숨긴다.
            $('.col').on({
                mouseleave(){
                    //서브메뉴 다운 업
                    $('.sub').stop().slideUp(200);
                    //메인버튼 배경 on 스타일
                    $('.menu-btn').fadeIn(0).delay(200).removeClass('on');
                    
                }
            });
        },
        section1(){
            //1. 변수   
            let cnt=0;

            //2. 메인슬라이드함수 3개 우측에서 좌측으로 이동  0 1 2
            function mainSlide(){ 
               $('.slide-wrap').stop().animate({top:`${-300*cnt}px`}, 600,function(){
                    if(cnt>2) cnt=0;
                    $('.slide-wrap').stop().animate({top:`${-300*cnt}px`}, 0);
               });
            }

            //3. 다음카운트함수
            function mextCount(){
                cnt++;
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
            /* family */ /* on-change => 선택 후 메뉴를 선택했을 때 끝난다. */
            $('#family').on({
                change(){ //이벤트 체인지 이벤트
                    console.log( $(this).val() );
                    // location.href = $(this).val(); //location.href는 선택한 곳의 값으로 이동한다.
                    // 셀렉트박스 선택값(value)
                    window.open($(this).val()); //새창(팝업창) 전체크기
                }
            })
        }
        /* 난 새창으로 띄우고 싶다  그건 window.open() (사이트주소) */
    }
    shop.init();

})(jQuery);