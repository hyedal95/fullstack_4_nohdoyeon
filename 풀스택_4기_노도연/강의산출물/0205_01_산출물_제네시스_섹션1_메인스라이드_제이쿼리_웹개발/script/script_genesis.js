(function($){

    const genesis = {
        init(){
            this.section1();
            this.section2();
        },
        section1(){
            let cnt=0;

            //1. 메인슬라이드함수
            function mainSlide(){
                $('.slide-wrap').stop().animate({left:`${-100*cnt}%` },500);
                

                //페이지 버튼 이벤트(네이게이션:현재 위치가 어디인지 보여줌)
                $('.page-btn').removeClass('on'); // 페이지버튼 모두 11개 추가 된 클래스(on) 삭제 
                $('.page-btn').eq(cnt).addClass('on'); //현재 페이지 버튼  cnt=> 0~10 인덱스 값 변경, 클래스(class) 추가 (add)
            }

            //2. 다음카운트함수
            function nextCount(){

            }

            //3. 페이지버튼클릭이벤트 (동그라미 버튼 인디게이터버튼)
            //반복구현 코딩 간략화 동일한 클래스 11개의 페이지 버튼 이벤트 구현 each() 이치 메서드
            // $('.page-btn').each()
            // $('.page-btn').each(function(){});
            // $('.page-btn').each(function(index){
                // console.log( '페이지 버튼 11개 index 값 확인하기');
                // console.log( index);
            // });
            
            $('.page-btn').each(function(idx){
                $(this).on({ //this는 현재 클릭한 버튼을 지시한다. (이(this)버튼)
                    click(){
                        // console.log(idx);
                        cnt=idx; // 버튼의 인덱스번호 
                        mainSlide(); // 메인함수 (애니메이션) 호출
                    }
                })
            });

            $('.page-btn').each(function(idx){
                $('.page-btn').eq(idx).on({ //eq는 0부터 해당하는 번호가 들어온다. 
                    click(){
                        // console.log(idx);
                        cnt=idx; // 버튼의 인덱스번호 
                        mainSlide(); // 메인함수 (애니메이션) 호출
                    }
                })
            });

            //나열형 버튼 하나 하나 클릭하는 방식
            //1페이지버튼
            // $('.page-btn01').on({
            //     click(){
            //         cnt=0;
            //         mainSlide();  /* 메인함수 호출 */

            //     }
            // });
            // //2페이지버튼
            // $('.page-btn02').on({
            //     click(){
            //         cnt=1;
            //         mainSlide();
            //     }
            // });
            // //3페이지버튼
            // $('.page-btn03').on({
            //     click(){
            //         cnt=2;
            //         mainSlide();
            //     }
            // });
            // //4페이지버튼
            // $('.page-btn04').on({
            //     click(){
            //         cnt=3;
            //         mainSlide();
            //     }
            // });
            // //5페이지버튼
            // $('.page-btn05').on({
            //     click(){
            //         cnt=4;
            //         mainSlide();
            //     }
            // });
            // //6페이지버튼
            // $('.page-btn06').on({
            //     click(){
            //         cnt=5;
            //         mainSlide();
            //     }
            // });
            // //7페이지버튼
            // $('.page-btn07').on({
            //     click(){
            //         cnt=6;
            //         mainSlide();
            //     }
            // });
            // //8페이지버튼
            // $('.page-btn08').on({
            //     click(){
            //         cnt=7;
            //         mainSlide();
            //     }
            // });
            // //9페이지버튼
            // $('.page-btn09').on({
            //     click(){
            //         cnt=8;
            //         mainSlide();
            //     }
            // });
            // //10페이지버튼
            // $('.page-btn10').on({
            //     click(){
            //         cnt=9;
            //         mainSlide();
            //     }
            // });
            // //11페이지버튼
            // $('.page-btn11').on({
            //     click(){
            //         cnt=10;
            //         mainSlide();
            //     }
            // });


        },
        section2(){
            let cnt=0;
        },

    }

    genesis.init();



})(jQuery);