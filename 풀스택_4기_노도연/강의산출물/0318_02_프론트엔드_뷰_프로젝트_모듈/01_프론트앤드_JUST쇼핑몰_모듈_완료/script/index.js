import WrapComponent from "./components/WrapComponent.js";

const vue = new Vue({
    data:{
        title:'JUST 쇼핑몰'
    },
    template:`
        <wrap-component></wrap-component>
    `,
    components: {
        'wrap-component'    : WrapComponent
    }   

});
vue.$mount('#root');