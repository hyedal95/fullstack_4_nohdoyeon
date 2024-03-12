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
                    <li class="col" v-for="item,idx in 카테고리">
                        <a href="#" class="main-btn" :title="item.메인메뉴">{{item.메인메뉴}}</a>
                        <div :class="['sub', 'sub'+(idx+1)]">
                            <ul>
                                <li v-for="item2 in item.서브메뉴"><a href="#" :title="item2">{{item2}}</a></li>
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
            ]

        }
    }
}