<template>
        <main id="main">
            <section1-component />
            <section2-component :data-state="dataState" />
        </main>
</template>

<script>
import Section1Component from './main/Section1Component.vue';
import Section2Component from './main/Section2Component.vue';

export default {
    name:"MainComponent",
    props:[],
    components:{
        'section1-component': Section1Component,
        'section2-component': Section2Component
    },
    data(){
        return{
            dataState:{ 
                공지사항:[
                    {공지:'9월 just 쇼핑몰 세일 안내!',날짜:'2024-03-13'},
                    {공지:'불편한 경험은 저희에게도 알려주세요.',날짜:'2024-03-12'},
                    {공지:'카카오톡 친구 추가하고 할인쿠폰 받아 가세요.',날짜:'2024-03-11'},
                    {공지:'"다른곳에선 못보는~ 매력발산 아이템들 구경해 보실래요?',날짜:'2024-03-10'},
                    {공지:'just 쇼핑몰을 친구에게 추천하면 할인쿠폰을 드립니다!',날짜:'2024-03-09'}
                ],
                갤러리:[
                    {타이틀:'청바지, 블라우스, 파우치 홍보 여성 모델 이미지', 이미지:'./images/img1.jpg'},
                    {타이틀:'청바지, 크로스백, 썬글라스, 수영복 홍보 이미지', 이미지:'./images/img2.jpg'},
                    {타이틀:'노란 원피스 입은 모델 이미지', 이미지:'./images/img3.jpg'}
                ]
            }
        }
    }
    
}
</script>

<style>

</style>