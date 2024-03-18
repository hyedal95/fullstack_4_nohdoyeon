export default{
    props:[],
    template: `
        <section id="section1">
            <div class="slide-container">
                <div class="slide-content">
                    <ul class="slide-wrap">
                        
                        <li 
                            
                            v-for="item,idx in 슬라이드"
                            :class="['slide', 'slide'+(idx+1)]"
                            :key="item"
                        >
                            <a href="#" :title="item">
                                <span>{{item}}</span>
                            </a>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </section>
    `,
    data(){
        return{
            슬라이드 :[
                'JUST 쇼핑몰 오픈!',
                '종합 쇼핑의 새 막을 연다! JUST 쇼핑몰!',
                'JUST쇼핑몰 9월 세일 이벤트 안내'
            ]
        }
    },
    created(){//태그가 완성된 뒤에 제이쿼리 사용 가능
        //섹션1 메인슬라이드 실행 (각 섹션마다 각 created 훅 안에 넣어주면 된다. )

        //1. 변수   
        let cnt=0;

        //2. 메인슬라이드함수 3개 우측에서 좌측으로 이동  0 1 2
        function mainSlide(){ 
            console.log("현재: " + (cnt-1<0?2:cnt-1),  "다음: " + cnt)                
            $('.slide').css({zIndex:1,opacity:1});
            $('.slide').eq(cnt)  .css({zIndex:2});
            $('.slide').eq( cnt-1 < 0 ? 2 : cnt-1 ).css({zIndex:3}).animate({opacity: 0}, 1000);
        }

        //3. 다음카운트함수
        function nextCount(){
            cnt++;                
            if(cnt>2) cnt=0;
            mainSlide();

        }

        //4. 자동타이머함수
        function autoTimer(){
            setInterval(nextCount, 3000);
        }
        autoTimer();
    }

}