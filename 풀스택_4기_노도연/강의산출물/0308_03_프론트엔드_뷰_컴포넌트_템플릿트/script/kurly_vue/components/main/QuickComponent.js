Vue.component('quick-component',{
    props:['t'],
    template:`
        <div id="quick">
            <div class="container">
                <div class="title">
                    <h2>{{t}}</h2>
                </div>
                <div class="content"></div>
            </div>
        </div>
    `
});