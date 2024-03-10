Vue.component('footer-component',{
    props:['t'],
    template:`
        <footer id="footer">
            <div class="container">
                <div class="title">
                    <h2>{{t}}</h2>
                </div>
                <div class="content"></div>
            </div>
        </footer>
    `
});