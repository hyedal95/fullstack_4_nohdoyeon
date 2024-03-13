const BannerComponent ={
    props:[],
    template:`
    <div class="quick-menu">
        <ul>
            <li v-for="item in banner" :key="item.title"><a href="#" :title="item.title"><img :src="item.imgSrc" :alt="alt"></a></li>
        </ul>
    </div>
    `,
    data(){
        return{
            banner:[
                {title:'웨딩 배너 1' , imgSrc:'./images/wedding-img22.jpg', alt:'웨딩 부부'},
                {title:'웨딩 배너 2' , imgSrc:'./images/wedding-img23.jpg',alt:'부케'},
                {title:'웨딩 배너 3' , imgSrc:'./images/wedding-img24.jpg', alt:'미니피자'}
            ]
        }
    }
}

