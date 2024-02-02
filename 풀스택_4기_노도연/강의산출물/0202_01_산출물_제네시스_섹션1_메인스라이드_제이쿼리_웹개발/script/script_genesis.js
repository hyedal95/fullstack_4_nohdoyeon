(function($){

    const genesis = {
        init(){
            this.section1();
            this.section2();
        },
        section1(){
            let cnt=0;
            mainSlide();
            //1. 메인슬라이드함수
            function mainSlide(){
                $('.slide-wrap').stop().animate({left:`${-100*cnt}%` },600);
            }

            //2. 다음카운트함수
            function nextCount(){

            }

            //3. 페이지버튼클릭이벤트
            //1페이지버튼
            $('.page-btn01').on({
                click(){
        
                    cnt=1;
                    mainSlide();  /* 메인함수 호출 */

                }
            });
            //2페이지버튼
            $('.page-btn02').on({
                click(){
                    cnt=2;
                    mainSlide();
                }
            });
            //3페이지버튼
            $('.page-btn03').on({
                click(){
                    cnt=3;
                    mainSlide();
                }
            });
            //4페이지버튼
            $('.page-btn04').on({
                click(){
                    cnt=4;
                    mainSlide();
                }
            });
            //5페이지버튼
            $('.page-btn05').on({
                click(){
                    cnt=5;
                    mainSlide();
                }
            });
            //6페이지버튼
            $('.page-btn06').on({
                click(){
                    cnt=6;
                    mainSlide();
                }
            });
            //7페이지버튼
            $('.page-btn07').on({
                click(){
                    cnt=7;
                    mainSlide();
                }
            });
            //8페이지버튼
            $('.page-btn08').on({
                click(){
                    cnt=8;
                    mainSlide();
                }
            });
            //9페이지버튼
            $('.page-btn09').on({
                click(){
                    cnt=9;
                    mainSlide();
                }
            });
            //10페이지버튼
            $('.page-btn10').on({
                click(){
                    cnt=10;
                    mainSlide();
                }
            });
            //11페이지버튼
            $('.page-btn11').on({
                click(){
                    cnt=11;
                    mainSlide();
                }
            });
        },
        section2(){
            let cnt=0;
        },

    }

    genesis.init();



})(jQuery);