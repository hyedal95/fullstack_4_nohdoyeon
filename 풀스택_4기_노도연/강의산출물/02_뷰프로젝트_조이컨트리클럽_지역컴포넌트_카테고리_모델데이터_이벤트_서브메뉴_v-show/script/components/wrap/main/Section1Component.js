const Section1Component ={
    props:[],
    template:`
        <section id="section1">
            <div class="slide-container">
                <div class="slide-content">
                    <ul class="slide-wrap">
                        <li 
                            v-for="(item,idx) in slide" 
                            :class="['slide', 'slide'+(idx+1), 'blind']" 
                            :title="item"
                            :key="item"
                        >
                            {{item}}
                        </li>
                    </ul>
                </div>
            </div>
        </section>
    `,
    data(){
        return{
            slide :['slide1','slide2','slide3']
        }
    }
}

