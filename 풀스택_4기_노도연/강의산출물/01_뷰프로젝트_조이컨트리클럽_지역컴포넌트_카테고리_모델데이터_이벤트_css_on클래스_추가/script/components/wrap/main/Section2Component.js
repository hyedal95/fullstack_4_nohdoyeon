const Section2Component ={
    props:[],
    template:`
        <section id="section2">
            <div class="container">
                <div class="title hide">
                    <h2>{{title}}</h2>
                </div>
                <div class="content">
                    <a href="#" class="box" title="benner link">
                        <div class="left">
                            <img :src="imgSrc" alt="">
                        </div>
                        <div class="right">
                            <h3>{{rightTitle}}</h3>
                            <p>
                                {{p1Text}}
                                {{p2Text}},<br>
                                {{p3Text}}
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
            title:'section2',
            imgSrc:'./images/wedding-img17.jpg',
            h3Text:'Lorem ipsum dolor sit amet consectetur, adipisicing elitd.',
            p1Text:'Lorem ipsum dolor sit amet consectetur adipisicing elit.',
            p2Text:'Nam beatae dicta commodi? Quam sed quibusdam hic veniam nesciunt ducimus explicabo',
            p3Text:'quaerat beatae quo doloremque soluta excepturi in amet et itaque!',

        }
    }
}