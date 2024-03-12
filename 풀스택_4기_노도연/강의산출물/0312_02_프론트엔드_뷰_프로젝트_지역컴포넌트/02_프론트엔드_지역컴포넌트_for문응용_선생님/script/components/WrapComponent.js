const WrapComponent = {
    props:[''],
    template:`

        <div id="wrap">
            <header-component></header-component>
            <main id="main">
                <section1-component></section1-component>
                <section2-component></section2-component>
            </main>
            <footer-component></footer-component>
            <modal-component></modal-component>
        </div>
    
    `,
    components:{
        'header-component': HeaderComponent,
        'section1-component': Section1Component,
        'section2-component': Section2Component,
        'footer-component': FooterComponent,
        'modal-component': ModalComponent,
    }
    
}