const HeaderComponent ={
    props:[],
    template:`
    <header id="header">
        <div class="top">
            <h1>
                <a href="#" title="로고">
                    <img src="./images/wedding-img19.jpg" alt="로고">
                </a>
            </h1>
        </div>
        <div class="bottom">
            <nav id="nav">
                <ul>
                    <li 
                        class="col" 
                        v-for="item,idx in 카테고리" 
                        :key="item.메인메뉴"
                        @mouseleave="mouseOutNav"
                    >
                        <a 
                            @mouseenter="clickMainBtn(idx)"  
                            href="#" 
                            :class="['main-btn', {'on':isOn[idx]}]" 
                            :title="item.메인메뉴"
                        >
                            {{item.메인메뉴}}
                        </a>
                        <div 
                            :class="['sub', 'sub'+(idx+1), {'on':isOn[idx]}]"
                        >
                            <ul>
                                <li 
                                    v-for="item2 in item.서브메뉴" 
                                    :key="item2"
                                >
                                    <a href="#" 
                                    :title="item2"
                                    >
                                        {{item2}}
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </nav>
            <aside> <!-- 스팟메뉴를 보통 어사이드로 많이한다. -->
                <span>
                    <a href="#" title="로그인">로그인</a>
                    <i>|</i>
                    <a href="#" title="회원가입">회원가입</a>
                </span>
            </aside>
        </div>
    </header>
    `,
    data(){
        return{

            카테고리 : [
                {메인메뉴:'CLUB', 서브메뉴:['클럽소개','시설안내']},
                {메인메뉴:'BOOKING', 서브메뉴:['요금안내','예약안내','위약안내']},
                {메인메뉴:'INFORMATION', 서브메뉴:['명예의전당','이벤트','자료실','포토갤러리']},
                {메인메뉴:'COMMUNITY', 서브메뉴:['공지사항','Q&A']},
            ],
            // isOn:[false,false,false,false],
            // isOn: new Array(10).fill(false) // fill 배열채우기(10칸) => false
            // 숫자 0부터 9까지 10개 채우기
            // isOn: Array.from(Array(10).keys())
            isOn: new Array(4).fill(false)

        }
    },
    methods:{
        clickMainBtn(idx){  //전달인자가 보낸 것이 매개변수  ==>  전달인자 idx => 매개변수  i 
            // this.isOn=[false,false,false,false]; //모든 메인버튼 초기화
            this.isOn= new Array(4).fill(false);    //모든 메인버튼 초기화
            this.isOn[idx]= true;
            console.log('메인버튼 클릭 이벤트'+ idx);
        },
        mouseOutNav(){
            this.isOn= new Array(4).fill(false);
        }
    }
}