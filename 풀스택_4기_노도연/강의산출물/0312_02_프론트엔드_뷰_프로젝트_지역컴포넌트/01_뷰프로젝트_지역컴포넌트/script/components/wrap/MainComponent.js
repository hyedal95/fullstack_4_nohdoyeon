const MainComponent ={
    props:[],
    template:`
        <main id="main">
            <section1-component />
            <section2-component />
            <section3-component />
        </main>
    
    `,
    components:{
        'section1-component':Section1Component,
        'section2-component':Section2Component,
        'section3-component':Section3Component,
    }
}