Vue.component('section2-component',{
    props:['t'],
    template:`
        <section id="section2">
            <div class="container">
                <div class="title">
                    <h2>{{t}}</h2>
                </div>
                <div class="content"></div>
            </div>
        </section>    
    `
});