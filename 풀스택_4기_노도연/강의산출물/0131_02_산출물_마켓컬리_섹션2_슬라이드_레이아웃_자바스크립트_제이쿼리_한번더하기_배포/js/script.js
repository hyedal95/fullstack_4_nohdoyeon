$(function(){

    let cnt=0;

    // 메인슬라이드 함수 
    function mainSlide(){
        $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
    }

    // 카운트 증가함수
    function nextCount(){
        cnt+=1;
        cnt > 4 ? cnt=4 : cnt;
    }
    // 카운트 감소함수
    function prevCount(){
        cnt-=1;
        cnt < 0 ? cnt=0 : cnt;
    }
    //다음 슬라이드 next-btn /slide-wrap
    $('.next-btn').on({
        click(){
            nextCount();
            mainSlide();
        }
    });
    //이전 슬라이드 pre-btn /slide-wrap
    $('.pre-btn').on({
        click(){
            prevCount();
            mainSlide();
        }
    });
})
