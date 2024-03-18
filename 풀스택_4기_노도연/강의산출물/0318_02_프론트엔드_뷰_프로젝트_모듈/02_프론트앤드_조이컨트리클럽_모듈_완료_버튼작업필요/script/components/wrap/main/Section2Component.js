export default{
    props:['s2State'],
    template:`
        <section id="section2">
            <div class="container">
                <div class="title hide">
                    <h2>{{s2State.title}}</h2>
                </div>
                <div class="content">
                    <a href="#" class="box" title="benner link">
                        <div class="left">
                            <img :src="s2State.imgSrc" alt="">
                        </div>
                        <div class="right">
                            <h3>{{s2State.rightTitle}}</h3>
                            <p>
                                {{s2State.p1Text}}
                                {{s2State.p2Text}},<br>
                                {{s2State.p3Text}}
                            </p>
                        </div>
                        <div class="arrow"></div>
                    </a>
                </div>
            </div>
        </section>
    `,
    data(){
        return{
            

        }
    }
}