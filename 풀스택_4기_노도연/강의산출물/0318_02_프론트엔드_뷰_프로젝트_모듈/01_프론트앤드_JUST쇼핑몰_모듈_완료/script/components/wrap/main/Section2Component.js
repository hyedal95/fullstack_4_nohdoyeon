export default {
    props:['dataState'], //  (html)data-state=>(js)dataState 프롭스이름은 반드시 카멜 케이스
    template: `
        <section id="section2">
            <div class="left">
                <div class="container">
                    <div class="title">
                        <button @click.prevent="clickNoticeMethod" :class="['notice-btn', {'on':isOn}]" title="공지사항">공지사항</button>    
                        <button @click.prevent="clickGalleryMethod" :class="['gallery-btn', {'on':isOn}]" title="갤러리">갤러리</button>    
                    </div>
                    <div class="content">
                        <div v-show="isNotice" class="notice-box">
                            <ul>
                                <li
                                    v-for="item,idx in dataState.공지사항"
                                    :key="item.공지" 
                                >
                                    <a href="#" 
                                        :class="['popup-btn', idx===0?'on':'']" 
                                        :title="item.공지" 
                                        @click.prevent="modalOpenBtn(idx)"                                       
                                    >
                                        {{item.공지}}
                                    </a>
                                    <span>{{item.날짜}}</span>
                                </li>
                            </ul>
                        </div>
                        <div v-show="isGallery" class="gallery-box">
                            <ul>
                                <li v-for="item in dataState.갤러리" :key="item.타이틀">
                                    <a href="#" :title="item.타이틀">
                                        <img :src="item.이미지" :alt="item.타이틀">
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="center">
                <div class="container">
                    <div class="title hide"><h2>이벤트 배너</h2></div>
                    <div class="content">
                        <a href="#" :title="이벤트"><h3>{{이벤트}}</h3></a>
                    </div>
                </div>
            </div>
            <div class="right">
                <div class="container">
                    <div class="title hide"><h2>바로가기 배너</h2></div>
                    <div class="content">
                    <ul>
                            <li v-for="item in 바로가기" :key="item">
                                <a href="#" :title="item">
                                    <span>{{item}}</span>
                                </a>
                            </li>                            
                    </ul>
                    </div>
                </div>
            </div>
        </section>
    `,
    data(){
        return{

            이벤트:'여름 마지막 세일',
            바로가기:['할인정보','이벤트정보','고객정보'],
            isNotice: true,
            isGallery:false,
            isOn:false
        }
    },
    methods:{
        clickNoticeMethod(){ //공지사항클릭시
            this.isNotice= true;
            this.isGallery=false;
            this.isOn=false;
        },
        clickGalleryMethod(){ //갤러리클릭시
            this.isNotice= false;
            this.isGallery=true;
            this.isOn=true;
        },
        modalOpenBtn(idx){//공지사항 1번째 글 클릭할 경우 
            eventBus.$emit('openModal', idx)

        }


        
    }
}