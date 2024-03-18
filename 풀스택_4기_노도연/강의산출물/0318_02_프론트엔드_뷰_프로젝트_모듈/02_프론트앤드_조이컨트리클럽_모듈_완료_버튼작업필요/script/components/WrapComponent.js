import HeaderComponent from './wrap/HeaderComponent.js';
import MainComponent from './wrap/MainComponent.js';
import FooterComponent from './wrap/FooterComponent.js';
import BannerComponent from './wrap/BannerComponent.js';
import ModalComponent from './wrap/ModalComponent.js';

export default{
    props:[],
    template:`
        <div id="wrap">
            <header-component :header-state="headerState" @mainEmitShow="mainEmitShow"/>
            <main-component />
            <footer-component :footer-state="footerState"/>
            <banner-component :banner-state="bannerState"/>
            <modal-component :modal-state="modalState"/>
        </div>
    `,
    components:{
        'header-component': HeaderComponent,
        'main-component': MainComponent,
        'footer-component': FooterComponent,
        'banner-component': BannerComponent,
        'modal-component': ModalComponent

    },
    data(){
        return{
            headerState:{
                카테고리 : [
                    {메인메뉴:'CLUB', 서브메뉴:['클럽소개','시설안내']},
                    {메인메뉴:'BOOKING', 서브메뉴:['요금안내','예약안내','위약안내']},
                    {메인메뉴:'INFORMATION', 서브메뉴:['명예의전당','이벤트','자료실','포토갤러리']},
                    {메인메뉴:'COMMUNITY', 서브메뉴:['공지사항','Q&A']},
                ]
            },
            bannerState:{
                banner:[
                    {title:'웨딩 배너 1' , imgSrc:'./images/wedding-img22.jpg', alt:'웨딩 부부'},
                    {title:'웨딩 배너 2' , imgSrc:'./images/wedding-img23.jpg', alt:'부케'},
                    {title:'웨딩 배너 3' , imgSrc:'./images/wedding-img24.jpg', alt:'미니피자'}
                ]
            },
            footerState:{
                logoSrc:'./images/wedding-img19.jpg',
                address:'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestiae beatae ipsa magni est modi, dolorem eius quo. Quo, dolore in. Placeat, ullam esse enim voluptas ab facilis distinctio quidem unde!',
                p:'Copyright &copy; Reserved 회사이름',
    
                sns:[
                    {title:'인스타그램', imgSrc:'./images/icon_1.png'},
                    {title:'트위터', imgSrc:'./images/icon_2.png'},
                    {title:'유튜브', imgSrc:'./images/icon_3.png'}
                ]
            },
            modalState:{
                title:'공지사항',
                pText:[
                    'Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis aliquid distinctio fugiat odio facere enim earum, officia eius exercitationem dolorum totam dolore, praesentium quia consectetur aliquam ratione consequuntur laborum illum.',
                    'Tempora laudantium voluptates facere saepe vel corporis tenetur reprehenderit cum accusamus ad dolorum molestias perspiciatis voluptas amet error, minima doloribus similique inventore quisquam odit excepturi nesciunt? Eligendi atque voluptate nulla?',
                    'Incidunt, dolorem? Perferendis asperiores corporis sunt necessitatibus beatae excepturi earum aliquid explicabo, praesentium aperiam nobis perspiciatis minus enim, est at veritatis tenetur ipsa, voluptatem quam maiores ipsum autem! Quod, dignissimos!'
                ]

            }
            
        }
    },
    methods:{
        mainEmitShow(z){
            this.modalState.title = z;
            console.log(z);
        }
    }
}