export default {
    props:['s1State'],
    template:`
        <section id="section1">
            <div class="slide-container">
                <div class="slide-content">
                    <ul class="slide-wrap">
                        <li 
                            v-for="(item,idx) in s1State.slide" 
                            :class="['slide', 'slide'+(idx+1), 'blind']" 
                            :title="item"
                            :key="item"
                        >
                            {{item}}
                        </li>
                    </ul>
                </div>
            </div>
        </section>
    `,
    data(){
        return{

        }
    },
    created(){
        //1.변수설정
        let cnt=0;
        let setId=0;

        //메인슬라이드 테스트
        // mainSlide(); //1
        // mainSlide(); //2
        // mainSlide(); //3

        //2.메인슬라이드 함수
        function mainSlide(){

            // console.log("현재슬라이드 :" + (cnt-1 < 0 ? 2 : cnt-1) + "다음슬라이드 :" + cnt);
            // 0 = > 1 
            // 1 = > 2
            // 2(-1) = > 0
            // 0 = > 1
            // 1 = > 2
            $('.slide').css({zIndex:1}).animate({opacity:1},0) // 모든 슬라이드(3개) 초기화
            $('.slide').eq(cnt).css({zIndex:2})   //다음 슬라이드
            $('.slide').eq(cnt-1<0 ? 2 : cnt-1).css({zIndex:3}).animate({opacity:0},1000)   // 맨위 슬라이드(현재 슬라이드)
        }
        //3.다음카운트 함수
        function nextCount(){
            cnt++;
            if(cnt>2){cnt=0}
            mainSlide();

        }


        //4.자동타이머함수
        function autoTimer(){
            setId=setInterval(nextCount,3000);
        }
        autoTimer();
    }
}

