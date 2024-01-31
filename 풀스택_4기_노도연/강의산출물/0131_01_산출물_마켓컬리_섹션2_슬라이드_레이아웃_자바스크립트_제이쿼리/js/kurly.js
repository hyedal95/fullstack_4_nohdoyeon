/* 
$(function(){

    let cnt =0;
    $('.slide-right-arrow-btn').on({
        click(){
            cnt+=1;
            if(cnt >4){
                cnt =4;
            }
            $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
        }
    });

    $('.slide-left-arrow-btn').on({
        click(){
            cnt-=1;
            if(cnt<0){
                cnt=0;
            }
            $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
        }
    })

}); 
*/

/* 
$(function(){

    let cnt=0;

    // 다음슬라이드
    $('.slide-right-arrow-btn').on({
        click(){
            cnt+=1; // 0 1 2 3 4 
            cnt > 4 ? cnt=4 : cnt; 
            $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
        }
    });
    // 이전슬라이드
    $('.slide-left-arrow-btn').on({
        click(){
            cnt-=1; // 0 1 2 3 4 
            cnt < 0 ? cnt=0 : cnt; 
            $('.slide-wrap').css({marginLeft:`${-cnt*100}%`});
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

// 공책에 쓰고, 나중에는 안보고 직접 코딩할 줄 알아야한다.
// 대학 x 학사보유여부 
// 학사학위가 있느냐 없느냐의 따라서 인증이 된다.
// oo학위 oo이학사 oo석사 oo박사 
// 대학원 최소 5학기 이상(박사학위) : 직업이 있어야 (돈이 있어야 ) 주경야독 필수 
// 결혼하기전에 꿈을 펼쳐보자! 
// 직장 잡아놓고 자격증 따고 전공하고 할 수 있는만큼 해보는 것
// 젊어 고생은 사서도 한다. 돈 주고서라도 경력을 쌓자! 
// 2년 후에는 그것이 배가 된다. 
// 초임 3000~4000 2년 경력 쌓으면 무조건 4000 넘어간다.
// 경력 5년 연봉 5000이상~~!! 경력~실력 쌓는 사람은 연봉 6000~7000이 그냥 넘어가는 것
// 개발자 it는 나이 제한 없이 돈을 벌 수 있다. 
// 그 결과가 오기까지 공부하는 시간이 필요하다.
// it 미국 원서....볼 줄 알아야한다.
// 시행착오로 만든 공부를 알려주는 것이다. 
// it는 안가면 도태된다. 노력할 수 밖에 없는 것. 인생은 발전에 발전을 거듭해서 자기자신을 만들어가야한다.
// 노력안하면 -------노숙자; 아무생각x 놀기만 자기만 함....;;;;;; 무상무념
// 자동차는 그저 나의 교통수단,,,, 그 돈 그냥 모으고 렌트해서 사용하자
// 적게 벌어도 알차게 모으는 게 좋은 것! 
// 시간이 지나서 경험한 것도 값진 것이지만 너무 늦어버리면안된다.
// 딱 6개월 공부... 벌써1주 지났음. 벌써 5개월밖에 안남았네...;;
// 조바심나면 우울증 생긴다.... 1시간도 빈틈없이..!! 
// 정해진 시간이란 것은 어느 순간 찾아온다... ㅠㅠ 포트폴리오...;;; 
// 그 사이 과정이 굉장히 중요하니깐, 하루 하루 매 시간 공부하는 그것이 소중하고 그것이 모여서 결과가 된다.
// 가지고 있는 처지에서 조금씩 조금씩 변화를 줘야하지 갑자기 확! 주면 안된다.
// 6개월 후에 취업해서 월급 받을 것을 생각하자!!! 나의 영원한 직업 !! 전문지식 쌓는 기간 =6개월
// 지식은 영원하다. 공부기술로 평생 먹고살기 위해서 공부하는 것이다.  인내하자! 

