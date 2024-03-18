export default{
    props:['footerState'],
    template:`
        <footer id="footer">
            <div class="left">
                <h1>
                    <a href="#" title="로고">
                        <img :src="footerState.logoSrc" alt="로고">
                    </a>
                </h1>
            </div>
            <div class="center">
                <address>
                    {{footerState.address}}
                </address>
                <p>
                    {{footerState.p}}
                </p>
            </div>
            <div class="right">
                <a href="#" v-for="item in footerState.sns"  :title="item.title"><img :src="item.imgSrc" :alt="item.title"></a>
            </div>
        </footer>
    `,
    data(){
        return{

        }
    }
}