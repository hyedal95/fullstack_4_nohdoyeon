const ModalComponent = {
    props:[],
    template:  `
        <div v-show="isShow" class="popup">
            <div class="container">
                <div class="title">
                    <h1>{{타이틀}}</h1>
                </div>
                <div class="content">
                    <ul>
                        <li v-for='item in 모달내용' :key="item">{{item}}</li>
                    </ul>
                </div>
                <div class="button-box">
                    <button @click.prevent="modalCloseBtn" class="close-btn" title="닫기">닫기</button>
                </div>
            </div>
        </div>
    `,
    data(){
        return{
            타이틀:'9월 JUST 쇼핑몰 세일 안내',
            모달내용:[
                '오랜만에 찾아온 세일 안내!',
                'JUST 쇼핑몰이 제안하는 유니크한 시즌별 패션 트렌드를 즐겨보세요.',
                '오랜만에 찾아온 휴면고객이라면, 지금 바로 로그인 하고 적립금 1,000원을 받으세요!'
            ],
            isShow:false
        }
    },
    methods:{
        modalCloseBtn(){
            this.isShow=false;

        }

    },
    created(){
        eventBus.$on('openModal',(idx)=>{
            if(idx===0){
                this.isShow=true;
            }
        })

    }
}