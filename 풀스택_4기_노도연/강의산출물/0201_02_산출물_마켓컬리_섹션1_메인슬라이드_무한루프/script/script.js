$(function(){

    //0.변수설정
    let cnt=0;
    $('.total-number').text($('.slide').length-2);  //전체슬라이드 길이 21-2=19

    //1.메인슬라이드함수
    function mainSlide(){
        //애니메이션 실행
        $('.slide-wrap').animate({marginLeft:`${-100*cnt}%`},300, function(){   // $('.slide-wrap').css({marginLeft:`${-100*cnt}%`});  -- css는 속도를 넣을 수 없기에 css에 가서  .slide-wrap{ transition: all 0.6s;} 써야함
            if(cnt>18) cnt= 0;  //return 리턴 => 처음으로 되돌아간다.
            if(cnt< 0) cnt=18;  //return 리턴 => 마지막으로 되돌아간다.
            $('.slide-wrap').animate({marginLeft:`${-100*cnt}%`},0);
            
        })
    
        //카운트 숫자 current-number
        // $('.current-number').text(cnt+1>20?cnt=1:(cnt===0 ?19:(cnt===-1? 18:cnt)));  
        $('.current-number').text(cnt+1>19?cnt=1:((cnt+1)===0?19:cnt+1));  

        // $('.current-number').html(<b>`${cnt}`</b>); 태그사용가능

    }

    //2-1.다음카운트함수
    function nextCount(){
        cnt+=1;
        mainSlide();
    }

    //2-2.이전카운트함수
    function prevCount(){
        cnt-=1;
        mainSlide();
    }

    //3-1.다음버튼 클릭 이벤트
    $('.arrow-right-btn').on({
        click(){
            nextCount();
        }
    });
    //3-2.이전버튼 클릭 이벤트
    $('.arrow-left-btn').on({
        click(){
            prevCount();
        }
    });
    //4.자동 타이머 실행 4초간격으로 다음카운트 함수 호출 실행
    // setInterval(prevCount,4000);
    setInterval(nextCount,2000);

    //5. 페이드인아웃 
   


});
