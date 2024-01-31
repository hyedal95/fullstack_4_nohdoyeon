/* 
$(function(){

    let cnt=0;

    //다음 슬라이드
    $('.slide-right-arrow-btn').on({
        click(){
            cnt+=1;
            cnt > 4 ? cnt=0 : cnt; 
        $('.slide-wrap').css({marginLeft: `${-cnt*100}%`});
        }
    });
    //이전 슬라이드 
    $('.slide-left-arrow-btn').on({
        click(){
            cnt-=1;
            cnt < 0 ? cnt=0 : cnt;
        $('.slide-wrap').css({marginLeft: `${-cnt*100}%`});
        }
    });
}); 
*/

$(function(){

    let cnt=0;

    //공통된 내용은 함수를 만들어서 호출하여 사용하면 편리하다.
    //1. 메인슬라이드
    //버튼 클릭하여 호출 하는 함수는  클릭 이벤트 보다 위에 있는 게 기본이다. (권장사항)
    //function 함수는 위치에 상관없이 호출할 수 있지만, 기본은 위 내용대로 한다.  

    function mainSlide(){
        $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
    }

    // 2-1. 다음(next) 슬라이드 (증가) 카운트(count) 함수
    function nextCount(){
        cnt+=1;
        cnt >4 ? cnt=4 : cnt;
    }
    // 2-2. 이전(prev) 슬라이드 (감소)  카운트(count) 함수
    function prevCount(){
        cnt-=1;
        cnt <0 ? cnt=0 : cnt;
    }

    //3-1.다음 화살 버튼 이벤트
    $('.slide-right-arrow-btn').on({
        click(){
            nextCount(); //다음 카운트함수 호출
            mainSlide(); //메인함수 호출
        }
    });

    //3-2.이전 화살 버튼 이벤트
    $('.slide-left-arrow-btn').on({
        click(){
            prevCount(); //이전 카운트함수 호출
            mainSlide(); //메인함수 호출
        }
    });
});