import Section1Component from './main/Section1Component.js';
import Section2Component from './main/Section2Component.js';
import Section3Component from './main/Section3Component.js';

export default{
    props:[],
    template:`
        <main id="main">
            <section1-component :s1-state="s1State"/>
            <section2-component :s2-state="s2State"/>
            <section3-component :s3-state="s3State"/>
        </main>
    
    `,
    components:{
        'section1-component':Section1Component,
        'section2-component':Section2Component,
        'section3-component':Section3Component,
    },
    data(){
        return{
            s3State:{
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
            },
            s2State:{
                title:'section2',
                imgSrc:'./images/wedding-img17.jpg',
                h3Text:'Lorem ipsum dolor sit amet consectetur, adipisicing elitd.',
                p1Text:'Lorem ipsum dolor sit amet consectetur adipisicing elit.',
                p2Text:'Nam beatae dicta commodi? Quam sed quibusdam hic veniam nesciunt ducimus explicabo',
                p3Text:'quaerat beatae quo doloremque soluta excepturi in amet et itaque!',
            },
            s1State:{
                slide :['slide1','slide2','slide3']
            }
        }
    }
}