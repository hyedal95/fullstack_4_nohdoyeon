Vue.component('header-component',{
    props:['t'],
    template:`

        <header id="header">
            <div class="container">
                <div class="title">
                    <h2>{{t}}</h2>
                </div>
                <div class="content">

                </div>
            </div>
        </header>
    `
});