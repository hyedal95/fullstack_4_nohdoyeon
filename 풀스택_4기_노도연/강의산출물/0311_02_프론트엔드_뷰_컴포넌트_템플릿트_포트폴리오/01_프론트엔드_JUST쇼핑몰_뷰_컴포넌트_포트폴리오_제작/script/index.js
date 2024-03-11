const vue =new Vue({
    data:{
        title:'쇼핑몰',

    },
    template:`
        <wrap-component></wrap-component>
    `,
    components:{
        'wrap-component': WrapComponent //=> WrapComponent.js 변수 이름 가져오기

    }
});
vue.$mount('#root');