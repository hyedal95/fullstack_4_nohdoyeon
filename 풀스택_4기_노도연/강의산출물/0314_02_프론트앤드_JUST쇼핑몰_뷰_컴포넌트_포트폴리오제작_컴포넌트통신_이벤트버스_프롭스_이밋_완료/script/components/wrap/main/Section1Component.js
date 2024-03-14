const Section1Component = {
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
    }

}