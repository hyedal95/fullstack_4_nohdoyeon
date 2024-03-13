const vue = new Vue({
    data(){
        return{
            title: '조이컨트리클럽'
        }
    },
    template:`
        <wrap-component />
    `,
    components:{
        'wrap-component' : WrapComponent 

    }

})
vue.$mount('#root');