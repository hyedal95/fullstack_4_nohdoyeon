export default{
    props:['bannerState'],
    template:`
    <div class="quick-menu">
        <ul>
            <li v-for="item in bannerState.banner" :key="item.title"><a href="#" :title="item.title"><img :src="item.imgSrc" :alt="item.alt"></a></li>
        </ul>
    </div>
    `,
    data(){
        return{

        }
    }
}

