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
                <li class="col" v-for="(item,idx) in 카테고리">
                    <a href="#" class="main-btn" :title="item.메인메뉴">{{item.메인메뉴}}</a>
                    <div :class="['sub','sub'+(idx+1)]">
                        <div class="sub-container">
                            <ul>
                                <li v-for="column in item.서브메뉴"> 
                                    <ul>
                                        <li v-for="row in column"><a href="#" :title="row">{{row}}</a></li>
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

            카테고리:[
                {
                    메인메뉴:'탑',
                    서브메뉴:[
                        ['블라우스','티','셔츠','니트'],  
                        ['자켓','코트','가디건','머플러'], 
                        ['청바지','짧은바지','긴바지','레깅스'], 
                        ['귀고리','목걸이','반지','팔찌'] 
                    ]
                },
                {
                    메인메뉴:'아우터',
                    서브메뉴:[
                        ['블라우스','티','셔츠','니트'],  
                        ['자켓','코트','가디건','머플러'], 
                        ['청바지','짧은바지','긴바지','레깅스'], 
                        ['귀고리','목걸이','반지','팔찌'] 
                    ]
                },
                {
                    메인메뉴:'팬츠',
                    서브메뉴:[
                        ['블라우스','티','셔츠','니트'],  
                        ['자켓','코트','가디건','머플러'], 
                        ['청바지','짧은바지','긴바지','레깅스'], 
                        ['귀고리','목걸이','반지','팔찌'] 
                    ]
                },
                {
                    메인메뉴:'악세사리',
                    서브메뉴:[
                        ['블라우스','티','셔츠','니트'],  
                        ['자켓','코트','가디건','머플러'], 
                        ['청바지','짧은바지','긴바지','레깅스'], 
                        ['귀고리','목걸이','반지','팔찌'] 
                    ]
                }
            ]
        }
    }
}