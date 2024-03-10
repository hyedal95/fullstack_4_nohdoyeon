Vue.component('footer-component',{
    props:['t'],
    template:`
        <footer id="footer">
            <div class="container">
                <div class="title">
                    <h2>{{t}}<span>노도연<p>(안산그린 TDD기반 개발자과정4기)</p></span></h2>
                </div>
                <div class="content">

                </div>
            </div>
        </footer>    
    `
});