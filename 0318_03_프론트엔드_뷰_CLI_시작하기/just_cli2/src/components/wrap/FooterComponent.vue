<template>
    <footer id="footer">
            <div class="left">
                <h1><a href="./index.html" title="JUST 쇼핑몰 로고"><span>JUST</span> <span>쇼핑몰</span></a></h1>
            </div>
            <div class="center">
                <div class="container">
                    <address>{{주소}}</address>
                    <p>Copyright &copy; 2018 just 쇼핑몰, All right reserved.</p>    
                </div>
            </div>
            <div class="right">
                <div class="container">
            
                    <a v-for="item in sns" href="#" :title="item.타이틀" :key="item.이미지">
                        <img :src="item.이미지" :alt="item.타이틀">
                    </a>
            
                </div>
            </div>
        </footer>
</template>

<script>
export default {
    name:"FooterComponent",
    props:[],
    data(){
        return{
            주소:'서울시 마포구 홍익로 29(서교동, 동교빌딩) just 쇼핑몰',
            sns:[
                {타이틀:'인스타그램', 이미지:'./images/icon_1.png'},
                {타이틀:'트위터', 이미지:'./images/icon_2.png'},
                {타이틀:'유튜브', 이미지:'./images/icon_3.png'}
            ]
        }
    }
}
</script>

<style>

</style>