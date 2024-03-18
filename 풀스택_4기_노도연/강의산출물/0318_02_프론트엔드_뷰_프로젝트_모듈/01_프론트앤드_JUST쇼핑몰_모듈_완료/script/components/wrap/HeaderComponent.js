export default{
    props:['logoTitle'],
    template:  `
        <header id="header">
            <div class="left">
                <h1><a href="./index.html" :title="logoTitle.title1 +''+ logoTitle.title2"><span>{{logoTitle.title1}}</span> <span>{{logoTitle.title2}}</span></a></h1>
            </div>
            <div class="right">
                <nav id="nav">
                    <ul>
                        <li 
                            @mouseleave="onMouseOutNav"
                            class="col" 
                            v-for="(item,i) in 카테고리" 
                            :key="item.메인메뉴"                            
                        >
                            <a 
                                @mouseenter="onMouseOverMainBtn(i)"
                                href="#" 
                                :class="['main-btn', {'on':isOn[i]}]" 
                                :title="item.메인메뉴"
                                @click.prevent="eventEmitMethod(item.메인메뉴)" 
                            >
                                {{item.메인메뉴}}
                            </a>
                            <div 
                                :class="['sub', 'sub'+(i+1)]"
                                v-show="isOn[i]"
                            >
                                <div class="sub-container">
                                    <ul>
                                        <li 
                                            v-for="(column,idx) in item.서브메뉴" 
                                            :key="idx"
                                        >
                                            <ul>
                                                <li 
                                                    v-for="row in column"  
                                                    :key="row"
                                                >
                                                    <a  
                                                        
                                                        href="#" 
                                                        :title="row"
                                                        @click.prevent="eventSub(row)"
                                                    >
                                                        {{row}}
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul>
                </nav>
            </div>
        </header>
    `,
    data(){
        return{
          카테고리:[
            {
                메인메뉴:'탑',            
                서브메뉴: [
                    ['블라우스','티','셔츠','니트'],
                    ['자켓','코트','가디건','머플러'],
                    ['청바지','짧은바지','긴바지','레깅스'],
                    ['귀고리','목걸이','반지','팔찌']
                ]
            },
            {
                메인메뉴:'아우터', 
                서브메뉴: [
                    ['블라우스','티','셔츠','니트'],
                    ['자켓','코트','가디건','머플러'],
                    ['청바지','짧은바지','긴바지','레깅스'],
                    ['귀고리','목걸이','반지','팔찌']
                ]
            },
            {
                메인메뉴:'팬츠', 
                서브메뉴: [
                    ['블라우스','티','셔츠','니트'],
                    ['자켓','코트','가디건','머플러'],
                    ['청바지','짧은바지','긴바지','레깅스'],
                    ['귀고리','목걸이','반지','팔찌']
                ]
            },
            {
                메인메뉴:'악세사리', 
                서브메뉴: [
                    ['블라우스','티','셔츠','니트'],
                    ['자켓','코트','가디건','머플러'],
                    ['청바지','짧은바지','긴바지','레깅스'],
                    ['귀고리','목걸이','반지','팔찌']
                ]
            }
          ],
          isOn: [false,false,false,false]
        }
    },
    methods:{
        onMouseOverMainBtn(i){
            this.isOn = [false,false,false,false]
            this.isOn[i] = true
        },
        onMouseOutNav(){
            this.isOn = [false,false,false,false]
        },
        eventEmitMethod(z){ 
            // 전송을 하는 역할 => $emit 이밋 
            // 메뉴를 선택하여 부모 컴포넌트WrapComponent 에게 전달한다.
            // 자식 => 부모 통신 $emit 이밋
            // 이밋은 이벤트 버스가 없을 때 거의 똑같다.
            // this == HeaderComponent
            // this.$emit('전송이벤트이름', '매개변수');
            this.$emit('eventEmit', z);
        },
        eventSub(y){
            this.$emit('eventSubEmit', y);
            console.log(y);
        }
    }
}
