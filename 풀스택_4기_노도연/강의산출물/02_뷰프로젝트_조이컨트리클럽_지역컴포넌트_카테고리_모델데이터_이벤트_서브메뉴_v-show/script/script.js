(function($){
    class Obj {
        init(){

            // this.header();
            this.section1();
            this.section2();
            this.section3();
            this.footer();
            this.modal();
        }
        header(){
            //메인버튼 마우스 오버 이벤트
            $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().slideUp(0);
                    $(this).next().slideDown(500);
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                },
                focus(){
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

            //메인슬라이드 테스트
            // mainSlide(); //1
            // mainSlide(); //2
            // mainSlide(); //3

            //2.메인슬라이드 함수
            function mainSlide(){

                console.log("현재슬라이드 :" + (cnt-1 < 0 ? 2 : cnt-1) + "다음슬라이드 :" + cnt);
                // 0 = > 1 
                // 1 = > 2
                // 2(-1) = > 0
                // 0 = > 1
                // 1 = > 2
                $('.slide').css({zIndex:1}).animate({opacity:1},0) // 모든 슬라이드(3개) 초기화
                $('.slide').eq(cnt).css({zIndex:2})   //다음 슬라이드
                $('.slide').eq(cnt-1<0 ? 2 : cnt-1).css({zIndex:3}).animate({opacity:0},1000)   // 맨위 슬라이드(현재 슬라이드)
            }
            //3.다음카운트 함수
            function nextCount(){
                cnt++;
                if(cnt>2){cnt=0}
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
            //갤러리버튼 클릭시
            $('.gallery-btn').on({
                click(){
                    $('.gallery-btn, .notice-btn, .gallery, .notice').addClass('on');
                },
                focus(){
                    $('.gallery-btn, .notice-btn, .gallery, .notice').addClass('on');
                }
            })

            //공지사항버튼 클릭시
            $('.notice-btn').on({
                click(){
                    $('.gallery-btn, .notice-btn, .gallery, .notice').removeClass('on');
                }
            })
        }
        footer(){

        }
        modal(){
            //모달 열기
            $('.modal-btn').on({
                click(){
                    $('.modal').removeClass('close');
                    $('.modal').addClass('open');
                }
            })
            //모달 닫기
            $('.close-btn').on({
                click(){
                    $('.modal').addClass('close');
                    $('.modal').removeClass('open');
                }
            })
        }
    }
    const obj = new Obj(); //클래스 객체를 생성하여 사용한다.
    obj.init();

})(jQuery);