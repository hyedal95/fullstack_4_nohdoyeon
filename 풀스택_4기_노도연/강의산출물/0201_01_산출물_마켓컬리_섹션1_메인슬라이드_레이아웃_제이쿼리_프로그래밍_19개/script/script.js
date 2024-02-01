//기존슬라이드 구현하기
$(function(){
    //0. 변수 설정 값이 변하면 let 값이 고정이면 count
    let cnt=0;
    //1.메인슬라이드
    function mainSlide(){  // 0~18(19개) 
        // $('.slide-wrap').css({marginLeft: `${-cnt*100}%`});
        $('.slide-wrap').css({'margin-left': `${-cnt*100}%`}); // -100% - 200% - 300% ... -1800%

    }
    //2-1.다음카운트함수
    function nextCount(){
        cnt+=1; 
        cnt >18 ? cnt=18 : cnt;

    }
    //2-2.다음카운트함수
    function prevCount(){
        cnt-=1; 
        cnt < 0 ? cnt=0 : cnt;

    }
    //3-1.다음화살버튼클릭이벤트
    $('.arrow-right-btn').on({
        click(){
            nextCount(); //다음카운트함수 호출 실행
            mainSlide();
        }
    });
    //3-2.이전화살버튼클릭이벤트
    $('.arrow-left-btn').on({
        click(){
            prevCount(); //이전카운트함수 호출 실행
            mainSlide();
        }
    });


});

// 자동슬라이드
