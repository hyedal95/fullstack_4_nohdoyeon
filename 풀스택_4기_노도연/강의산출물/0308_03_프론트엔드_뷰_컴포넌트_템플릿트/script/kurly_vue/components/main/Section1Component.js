Vue.component('section1-component',{
    props:['t','member'],
    template:`
        <section id="section1">
            <div class="container">
                <div class="title">
                    <h2>{{t}}</h2>
                </div>
                <div class="content">
                    <ul>
                        <li v-for="item, idx in member">{{idx+1}} {{item.이름}} {{item.나이}}</li>  
                    </ul>
                </div>
            </div>
        </section>
    `
});