const FooterComponent ={
    props:[],
    template:`
        <footer id="footer">
            <div class="left">
                <h1>
                    <a href="#" title="로고">
                        <img :src="logoSrc" alt="로고">
                    </a>
                </h1>
            </div>
            <div class="center">
                <address>
                    {{address}}
                </address>
                <p>
                    {{p}}
                </p>
            </div>
            <div class="right">
                <a href="#" v-for="item in sns"  :title="item.title"><img :src="item.imgSrc" :alt="item.title"></a>
            </div>
        </footer>
    `,
    data(){
        return{
            logoSrc:'./images/wedding-img19.jpg',
            address:'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestiae beatae ipsa magni est modi, dolorem eius quo. Quo, dolore in. Placeat, ullam esse enim voluptas ab facilis distinctio quidem unde!',
            p:'Copyright &copy; Reserved 회사이름',

            sns:[
                {title:'인스타그램', imgSrc:'./images/icon_1.png'},
                {title:'트위터', imgSrc:'./images/icon_2.png'},
                {title:'유튜브', imgSrc:'./images/icon_3.png'}
            ]
        }
    }
}