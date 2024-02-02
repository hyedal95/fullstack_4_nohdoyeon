$(function(){
    //0.변수설정 + 텍스트기반 토탈
    let cnt=0;
    
    $('.total-number').text($('.slide').length-2);
    

    //1.메인슬라이드 함수 + 텍스트기반 현재위치
    function mainSlide(){
        $('.slide-wrap').animate({top:`${-370*cnt}px`},400,function(){
            console.log( cnt) ;
            if(cnt > 18) cnt=0;
            if(cnt < 0) cnt=18;
            $('.slide-wrap').animate({top:`${-370*cnt}px`},0)
        })

        // 텍스트기반 현재위치
        $('.current-number').text(cnt+1>19? cnt=1:((cnt+1)===0?19:cnt+1));

    }

    //2-1.위 카운트 함수 (숫자 올라감)
    function topCount(){
        cnt+=1;
        mainSlide();
    }
    //2-2.아래 카운트 함수  (숫자 내려감)
    function bottomCount(){
        cnt-=1;
        mainSlide();
    }

    //3-1.위 버튼 클릭 이벤트
    $('.arrow-top-btn').on({
        click(){
            topCount();
        }
    })

    //3-2.아래 버튼 클릭 이벤트
    $('.arrow-bottom-btn').on({
        click(){
            bottomCount();
        }
    })

    //4.자동 타이머 4초 간격
    // setInterval(bottomCount, 4000);


});