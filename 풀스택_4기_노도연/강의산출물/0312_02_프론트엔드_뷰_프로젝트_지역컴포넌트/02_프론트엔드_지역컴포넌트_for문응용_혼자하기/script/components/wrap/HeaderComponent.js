const HeaderComponent ={
    props:[''],
    template:`
    <header id="header">
    <div class="left">
        <h1><a href="./index.html" title="JUST쇼핑몰"><span>JUST</span> <span>쇼핑몰</span></a></h1>
    </div>
    <div class="right">
        <nav id="nav">
            <ul>
                <li class="col" v-for="item,idx in 메인메뉴">
                    <a href="#" class="main-btn" :title="item">{{item}}</a>
                    <div :class="['sub','sub'+(idx+1)]">
                        <div class="sub-container">
                            <ul>
                                <li>
                                    <ul>
                                        <li v-for="item in 서브1"><a href="#" :title="item">{{item}}</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <ul>
                                        <li v-for="item in 서브2"><a href="#" :title="item">{{item}}</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <ul>
                                        <li v-for="item in 서브3"><a href="#" :title="item">{{item}}</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <ul>
                                        <li v-for="item in 서브4"><a href="#" :title="item">{{item}}</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>


            </ul>

        </nav>
    </div>
</header>
    `,
    data(){
        return{

            메인메뉴:['탑','아우터','팬츠','악세사리'],
            서브1:['블라우스','티','셔츠','니트'],
            서브2:['자켓','코트','가디건','머플러'],
            서브3:['청바지','짧은바지','긴바지','레깅스'],
            서브4:['귀고리','목걸이','반지','팔찌'],
            
        }
    }
}