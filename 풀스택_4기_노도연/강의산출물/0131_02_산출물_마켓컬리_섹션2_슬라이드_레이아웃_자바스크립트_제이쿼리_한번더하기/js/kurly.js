// pre-btn
// next-btn
// slide-wrap

/* $(function(){

    let cnt=0;

    // 1.메인슬라이드함수
    function mainSlide(){
        $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
    }

    // 2-1.다음카운트함수
    function nextCount(){
        cnt+=1;
        cnt >4 ? cnt=4 : cnt;
    }

    // 2-2.이전카운트함수
    function prevCount(){
        cnt-=1;
        cnt <0 ? cnt=0 : cnt;
    }

    // 3-1.다음화살버튼클릭이벤트
    $('.next-btn').on({
        click(){
            nextCount();
            mainSlide();
        }
    });

    // 3-2.이전화살버튼클릭이벤트
    $('.pre-btn').on({
        click(){
            prevCount();
            mainSlide();
        }
    });
});
 */

$(function(){
    //변수 지정 맨위
    let cnt = 0;

    //1.메인슬라이드함수
    function mainSlide(){
        $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
    }
    //2-1.다음카운트함수
    function nextCount(){
        cnt+=1;
        cnt >4 ? cnt=4 : cnt;
    }
    //2-2.이전카운트함수
    function prevCount(){
        cnt-=1;
        cnt <0 ? cnt=0 : cnt;

    }
    //3-1.다음화살버튼클릭이벤트
    $('.next-btn').on({
        click(){
            nextCount();
            mainSlide();
        }
    });
    //3-2.이전화살버튼클릭이벤트
    $('.pre-btn').on({
        click(){
            prevCount();
            mainSlide();

        }
    });

});