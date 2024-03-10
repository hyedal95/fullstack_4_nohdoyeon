Vue.component('modal-component',{
    props:['t'],
    template:`
        <div id="modal">
            <div class="container">
                <div class="title">
                    <h2>{{t}}</h2>
                </div>
                <div class="content"></div>
            </div>
        </div>
    `
});