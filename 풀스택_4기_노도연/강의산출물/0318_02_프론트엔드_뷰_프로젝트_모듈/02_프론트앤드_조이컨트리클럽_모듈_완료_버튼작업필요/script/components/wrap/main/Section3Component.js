export default{
    props:['s3State'],
    template:`
        <section id="section3">
            <div class="container">
                <div class="title hide">
                    <h2>{{s3State.title}}</h2>
                </div>
                <div class="content">
                    <div class="button-box">
                        <button @click.prevent="noticeBtnMethod" class="['notice-btn', {'on':isOn}]">공지사항</button>
                        <button @click.prevent="galleryBtnMethod" class="'[gallery-btn', {'on':isOn}]">갤러리</button>
                    </div>
                    <div class="contents notice">
                        <ul>
                            <li 
                                v-for="item,idx in s3State.notice" 
                                :key="item.date"    
                            >
                                <a  
                                    @click.prevent="modalOpenBtn(idx)"
                                    href="#" 
                                    class="modal-btn(idx)"
                                >
                                {{item.noticeText}}
                                </a>
                                <span>{{item.date}}</span>
                            </li>
                        </ul>
                    </div>
                    <div class="contents gallery">
                        <ul>
                            <li v-for="item in s3State.gallery"><a href="#"><span>{{item}}</span></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
    `,
    data(){
        return{
            isOn:false
        }
    },
    methods:{
        modalOpenBtn(idx){
            eventBus.$emit('modalOpen', idx);
        },
        //갤러리클릭시
        galleryBtnMethod(){
            this.isOn = true;

        },
        //공지사항 클릭시
        noticeBtnMethod(){
            this.isOn = false;
        },


    }
}
