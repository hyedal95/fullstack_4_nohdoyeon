import HeaderComponent from './wrap/HeaderComponent.js';
import MainComponent from './wrap/MainComponent.js';
import FooterComponent from './wrap/FooterComponent.js';
import ModalComponent from './wrap/ModalComponent.js';

export default{
    props:[],
    template: `
        <div id="wrap">
            <header-component :logo-title="logoTitle"  @eventEmit="eventEmit" @eventSubEmit="eventSubEmit"/>
            <main-component />
            <footer-component />
            <modal-component />
        </div>
    `,
    components:{
        'header-component'  : HeaderComponent,
        'main-component'    : MainComponent,
        'footer-component'  : FooterComponent,
        'modal-component'   : ModalComponent
    },
    data(){
        return{
            logoTitle:{
                title1:'JUST',
                title2:'쇼핑몰' //자식컴포넌트 중 헤더컴포넌트.js 안에 들어있는 내용을 메인메뉴를 title2에 보내주는 것
            } 
        }
        
    },
    methods:{
        eventEmit(z){
            this.logoTitle.title2 = z;
            console.log(z);
        },
        eventSubEmit(y){
            this.logoTitle.title1 =y;
            console.log(y)
        }
    }
}