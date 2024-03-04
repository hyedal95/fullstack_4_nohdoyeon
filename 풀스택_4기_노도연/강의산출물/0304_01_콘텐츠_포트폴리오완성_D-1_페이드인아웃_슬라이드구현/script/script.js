(function($){

    class Obj {
        init(){
            this.header();
            this.section1();
            this.section2();
            this.section3();
            this.footer();
            this.modal();
        }        
        header(){
            // 메인버튼 마우스 오버 이벤트
            $('.main-btn').on({
                mouseenter(){
                    $('.sub').stop().slideUp(0);
                    $(this).next().stop().slideDown(200);
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                },
                focus(){
                    $('.sub').stop().slideUp(0);
                    $(this).next().stop().slideDown(200);
                    $('.main-btn').removeClass('on');
                    $(this).addClass('on');
                }
            })
            $('.col').on({
                mouseleave(){
                    $('.sub').stop().slideUp(200);
                    $('.main-btn').removeClass('on');
                }
            })
        }
        section1(){
            let cnt=0;
            //1. 메인슬라이드함수 (페이드인아웃)
            function mainSlide(){
                if(cnt>2){cnt=0};

                $('.slide').css({zIndex:1, opacity:1}); //슬라이드 전체 초기화 
                $('.slide').eq(cnt).css({zIndex:2}); //다음 슬라이드
                $('.slide').eq(cnt-1).css({zIndex:3}).animate({opacity:0}, 3000); //현재 슬라이드 페이드아웃
                
            }
          

            //2. 다음카운트함수
            function nextCount(){
                cnt++; //1
                mainSlide();
            }
            //페이드 인아웃 테스트
            nextCount(); //현재 슬라이드가 서서히 사라지면서 다음 슬라이드가 나타남.

            //3. 자동타이머함수
            function autoTimer(){
                setInterval(nextCount, 3000);
            }
            autoTimer(); 
        }
        section2(){
            // 공지사항버튼 클릭이벤트 
            $('.notice-btn').on({
                click(){
                    $('.notice-btn, .gallery-btn, .notice, .gallery').removeClass('on');
                }
            })
            // 갤러리버튼 클릭이벤트 
            $('.gallery-btn').on({
                click(){
                    $('.notice-btn, .gallery-btn, .notice, .gallery').addClass('on');
                }
            })
        }
        section3(){
            
        }
        footer(){
           
        }
        modal(){
            // 모달 열기
            $('.notice-popup-btn').on({
                click(e){
                    e.preventDefault();
                    $('.modal').removeClass('close');
                    $('.modal').addClass('open');
                }
            })
            
            // 모달 닫기
            $('.close-btn').on({
                click(e){
                    e.preventDefault();
                    $('.modal').removeClass('open');
                    $('.modal').addClass('close');
                }
            })
           

        }
    }
    const obj = new Obj(); // 클래스 객체를 생성하여 사용한다.
    obj.init();

})(jQuery);