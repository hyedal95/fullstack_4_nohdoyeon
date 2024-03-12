const vue = new Vue({
    data:{

    },
    template:`
        <wrap-component></wrap-component>
    `,
    components:{
        'wrap-component': WrapComponent,


    }
});
vue.$mount('#root');