<template>
    <div id="wrap">
        <header-component :logo-title="logoTitle"  @eventEmit="eventEmit" @eventSubEmit="eventSubEmit"/>
        <main-component />
        <footer-component />
        <modal-component />
    </div>
</template>

<script>
import HeaderComponent from './wrap/HeaderComponent.vue';
import MainComponent from './wrap/MainComponent.vue';
import FooterComponent from './wrap/FooterComponent.vue';
import ModalComponent from './wrap/ModalComponent.vue';


export default {
    name:"WrapComponent",
    props:[],
    components:{
        'header-component'  : HeaderComponent,
        'main-component'    : MainComponent,
        'footer-component'  : FooterComponent,
        'modal-component'   : ModalComponent
    },
    data(){
        return{
            logoTitle:{
                title1:'JUST',
                title2:'쇼핑몰'
            } 
        }
        
    },
    methods:{
        eventEmit(z){
            this.logoTitle.title2 = z;
            console.log(z);
        },
        eventSubEmit(y){
            this.logoTitle.title1 =y;
            console.log(y)
        }
    }
}
</script>

<style>
    
</style>