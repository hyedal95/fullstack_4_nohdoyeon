Vue.component('section1-component',{
    props:['t'],
    template:`
        <section id="section1">
            <div class="container">
                <div class="title">
                    <h2>{{t}}</h2>
                </div>
                <div class="content"></div>
            </div>
        </section>  
    `
});