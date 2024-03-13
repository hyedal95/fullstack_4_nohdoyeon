const Section3Component ={
    props:[],
    template:`
        <section id="section3">
            <div class="container">
                <div class="title hide">
                    <h2>{{title}}</h2>
                </div>
                <div class="content">
                    <div class="button-box">
                        <button class="notice-btn">공지사항</button>
                        <button class="gallery-btn">갤러리</button>
                    </div>
                    <div class="contents notice">
                        <ul>
                            <li 
                                v-for="item in notice" 
                                :key="item.date"    
                            ><a href="#" class="modal-btn">{{item.noticeText}}</a><span>{{item.date}}</span></li>
                        </ul>
                    </div>
                    <div class="contents gallery">
                        <ul>
                            <li v-for="item in gallery"><a href="#"><span>{{item}}</span></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
    `,
    data(){
        return{
            title:'공지사항&갤러리',
            notice:[
                {
                    noticeText:'Lorem ipsum dolor sit amet consectetur, adipisicing elit. Incidunt assumenda debitis, quibusdam dolor at quod recusandae cumque ut ipsam rem qui sed officia odit eius. Quisquam beatae eligendi delectus alias.', 
                    date:'2024-03-14'
                },
                {
                    noticeText:'Repudiandae assumenda nemo ipsa illum id quae eligendi beatae omnis nam vero laboriosam itaque dolores debitis, animi nisi reiciendis, voluptas necessitatibus non facere at dicta accusamus, asperiores explicabo fuga. Temporibus?', 
                    date:'2024-03-13'
                },
                {
                    noticeText:'Eum ipsam consequuntur reprehenderit ab temporibus officia quaerat asperiores, hic ipsa, fugiat reiciendis unde veritatis accusantium! Quae cupiditate, consequuntur rerum laborum error nulla aliquam, quisquam illum, consectetur provident laboriosam dolore!', 
                    date:'2024-03-12'
                },
                {
                    noticeText:'Ratione provident ipsum repudiandae optio assumenda blanditiis eaque dolore quisquam nam aspernatur quos fugiat culpa rem, cupiditate dolorum perspiciatis, laboriosam veritatis voluptas voluptate cum totam! Nisi cupiditate minus vel consectetur!', 
                    date:'2024-03-11'
                },
            ],

            gallery:[
                'Gallery1','Gallery2','Gallery3'
            ]
        }
    }
}
