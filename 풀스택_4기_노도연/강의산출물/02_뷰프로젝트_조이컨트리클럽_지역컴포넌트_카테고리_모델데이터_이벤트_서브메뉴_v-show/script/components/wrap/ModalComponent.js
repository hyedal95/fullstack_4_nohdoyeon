const ModalComponent ={
    props:[],
    template:`
    <div class="modal close">
        <div class="container">
            <div class="title">
                <h1>{{title}}</h1>
            </div>
            <div class="content">
                <p v-for="item in pText" :key="item">{{item}}</p>
            </div>
            <div class="button-box">
                <button class="close-btn">닫기</button>
            </div>
        </div>
    </div>
    
    `,
    data(){
        return{
            title:'공지사항',
            pText:[
                'Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis aliquid distinctio fugiat odio facere enim earum, officia eius exercitationem dolorum totam dolore, praesentium quia consectetur aliquam ratione consequuntur laborum illum.',
                'Tempora laudantium voluptates facere saepe vel corporis tenetur reprehenderit cum accusamus ad dolorum molestias perspiciatis voluptas amet error, minima doloribus similique inventore quisquam odit excepturi nesciunt? Eligendi atque voluptate nulla?',
                'Incidunt, dolorem? Perferendis asperiores corporis sunt necessitatibus beatae excepturi earum aliquid explicabo, praesentium aperiam nobis perspiciatis minus enim, est at veritatis tenetur ipsa, voluptatem quam maiores ipsum autem! Quod, dignissimos!'
            ]

        }

    }
}