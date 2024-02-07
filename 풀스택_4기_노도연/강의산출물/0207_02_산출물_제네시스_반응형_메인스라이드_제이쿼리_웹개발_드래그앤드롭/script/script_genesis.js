(function($,window){

    const genesis = {
        init(){
            this.section1();
            this.section2();
        },
        section1(){
            let cnt=0;
            let setId=0; //타이머 변수
            let mouseDown=0;
            let mouseUp=0;
            let md= false; // 터치를 안한 상태
            let dragStart =null;
            let dragEnd =null;
            let winW = $(window).width();


            //1. 메인슬라이드함수
            function mainSlide(){
                $('.slide-wrap').stop().animate({left:`${-100*cnt}%` },300,'easeInOutExpo',function(){
                    if(cnt>10) cnt=0;
                    if(cnt<0) cnt=10;
                    $('.slide-wrap').stop().animate({left:`${-100*cnt}%` },0);
                });
                
                //페이지 버튼 디버깅
                $('.page-btn').removeClass('on'); // 페이지버튼 모두 11개 추가 된 클래스(on) 삭제 
                $('.page-btn').eq(cnt>10?0:cnt).addClass('on'); //현재 페이지 버튼  cnt=> 0~10 인덱스 값 변경, 클래스(class) 추가 (add)
            }

            //2. 다음카운트함수  !=> false =>Not
            function nextCount(){ //애니메이트반복적으로 무지하게 터치스와이프 하는 걸 막고 마지막 터치스와이프만 사용
            if(!$('.slide-wrap').is(':animated')){ //애니메이션이 진행 안될 때만 증가(다음)
                
                cnt+=1;
                mainSlide();
                $('.play-stop-btn').removeClass('stop');
                $('.play-stop-btn').addClass('play');
                }
            }
            //2. 이전카운트함수 !=> false =>Not
            function prevCount(){
            if(!$('.slide-wrap').is(':animated')){ //애니메이션이 진행 안될 때만 감소(이전)
                
                cnt-=1;
                mainSlide();
                
                }

            }

            //3. 페이지버튼클릭이벤트 (동그라미 버튼 인디게이터버튼)
            
            $('.page-btn').each(function(idx){
                $(this).on({ //this는 현재 클릭한 버튼을 지시한다. (이(this)버튼)
                    click(){
                        clearInterval(setId);   // 1 타이머 일시정지
                        autoTimer();            // 자동타이머 호출 실행(재시작)
                        cnt=idx; // 버튼의 인덱스번호 
                        mainSlide(); // 메인함수 (애니메이션) 호출

                    }
                })
            });
            //4. 자동타이머
            function autoTimer(){
                setId = setInterval(nextCount,6000);
            }
            autoTimer();

            //5.플레이 일시정지 버튼 클릭 이벤트
            //  기본플레이상태
            //  현재 플레이 상태인지? 
            //  현재 정지 상태인지? 
            //  hasClass('play') 해스클래스: play클래스가 존재하면 true 아니면 false를 반환한다.
            //  hasClass('play') 해스 클래스는 클릭한 버튼 위치(자신)에 해당 클래스(play)의 존재 유무를 논리값으로 출력한다.
            //  자식요소는 find('play') 파인드로 찾는다.
            //  자식요소는 find('h1') 파인드로 찾는다. 태그이름
            //  자식요소는 find('span') 파인드로 찾는다. 태그이름
            //  자식요소는 find('#scrion1') 파인드로 찾는다. #아이디이름
            $('.play-stop-btn').on({
                click(){
                    if($(this).hasClass('play')===true){ //플레이상태이면 => 일시정지 하라 
                        $(this).removeClass('play');
                        $(this).addClass('stop');
                        clearInterval(setId); //일시정지

                    }
                    else{//일시정지라면 => 플레이 한다.
                        $(this).removeClass('stop');
                        $(this).addClass('play');
                        autoTimer(); //플레이
                    }
                    
                }
            });

            // 6. 터치 스와이프 -마우스 이벤트  mousedown & mouseup
            //  -마우스 터치가 좌측 방향 : 마우스 다운시작(마우스다운) ㄴ그리고 끌고 그리고 놓기(마우스업)
            //  -마우스 터치가 우측 방향 : 마우스 다운시작(마우스다운) ㄴ그리고 끌고 그리고 놓기(마우스업)
            //  -선택자는 슬라이드 박스와 페이지버튼 좌우 화살버튼 모두 포함한 박스 (content)
            //  -이벤트는 대문자없음.


            $('.content').on({
                mousedown(e){ //잡고
                    winW = $(window).width();
                    md= true; //터치한 상태
                    mouseDown =e.clientX; //터치시작 X좌표(수평)
                    // 슬라이드 일시정지
                    clearInterval(setId);

                    //마우스 커서 모양 변경=>잡는 모양 주먹 
                    $('.slide-container').css({cursor:'grabbing'});
                    //드래그 시작 좌표값 =>중요
                    dragStart =e.clientX-($('.slide-wrap').offset().left+winW); //드래그 시작추가 계산 좌표 필요

                },
                mousemove(e){ //끌고이동
                    //드래그 끝은 반드시 마우스 업이 되면 끝난다.
                    if(!md) return;
                    dragEnd =e.clientX;
                    //슬라이드 기차같이 길게 늘어진 슬라이드 랩퍼박스$('.slide-wrap')
                    $('.slide-wrap').css({left: dragEnd - dragStart});
                },
                mouseup(e){  //버그 마우스가 영역을 벗어나면 마우스업 이벤트 발생하지 않는데 => 디버깅 //놓고
                    
                    mouseUp=e.clientX; //터치끝 X좌표(수평)
                    // if(mouseDown-mouseUp > 0){ //다음
                    if(mouseDown - mouseUp >300 ){ //다음
                        nextCount();
                        

                    }
                    // if(mouseDown-mouseUp < 0){ //이전
                    if(mouseDown-mouseUp <-300){ //이전
                        clearInterval(setId);
                        prevCount();
                        

                    } 
                    //드래그 범위 미만은 다시 돌아간다.
                    if(mouseDown - mouseUp >=-300 && mouseDown - mouseUp <=300 ){
                        mainSlide();
                    }

                    autoTimer();

                    //마우스 커서 모양 변경 => 펼친 모양 보자기
                    $('.slide-container').css({cursor:'grab'});
                    md= false; //터치안한 상태 =초기화
                }
            })
            //나중에 상하 스와이프는 Y좌표 찾으면 된다.

            //mouseUp 영역을 벗어난 경우 =>예외처리
            $(document).on({
                mouseup(e){
                    
                    if(!md) return; //false이면 강제종료(md가 true가 아니면 false)
                    

                    mouseUp=e.clientX; //터치끝 X좌표(수평)
                    // if(mouseDown-mouseUp > 0){ //다음
                    if(mouseDown - mouseUp >300 ){ //다음
                        nextCount();
                        

                    }
                    // if(mouseDown-mouseUp < 0){ //이전
                    if(mouseDown-mouseUp <-300){ //이전
                        clearInterval(setId);
                        prevCount();
                        

                    } 
                    //드래그 범위 미만은 다시 돌아간다.
                    if(mouseDown - mouseUp >=-300 && mouseDown - mouseUp <=300 ){
                        mainSlide();
                    }

                    autoTimer();

                    //마우스 커서 모양 변경 => 펼친 모양 보자기
                    $('.slide-container').css({cursor:'grab'});
                    md= false; //터치안한 상태 =초기화
                },


            });

            



        },
        section2(){
            let cnt=0;
        },

    }

    genesis.init();



})(jQuery,window);