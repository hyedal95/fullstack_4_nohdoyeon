const WrapComponent ={
    props:[],
    template:`
        <div id="wrap">
            <header-component />
            <main-component />
            <footer-component />
            <banner-component />
            <modal-component />
        </div>
    `,
    components:{
        'header-component': HeaderComponent,
        'main-component': MainComponent,
        'footer-component': FooterComponent,
        'banner-component': BannerComponent,
        'modal-component': ModalComponent

    }
}