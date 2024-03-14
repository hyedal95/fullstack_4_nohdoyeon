const ModalComponent ={
    props:['modalState'],
    template:`
    <div :class="['modal', {'close':isClose}, {'on':isOn}]">
        <div class="container">
            <div class="title">
                <h1>{{modalState.title}}</h1>
            </div>
            <div class="content">
                <p v-for="item in modalState.pText" :key="item">{{item}}</p>
            </div>
            <div class="button-box">
                <button @click.prevent="modalCloseBtn" class="close-btn">닫기</button>
            </div> 
        </div>
    </div>
    
    `,
    data(){
        return{
            isClose:true,
            isOn:false

        }

    },
    methods:{
        modalCloseBtn(){ //모달창 닫기 버튼  
            this.isClose=true;
            this.isOn=false;
        }
    },
    created(){
        eventBus.$on('modalOpen',(idx)=>{
            if(idx===0){
                this.isClose=false;
                this.isOn=true;
            }
        })
    }
}