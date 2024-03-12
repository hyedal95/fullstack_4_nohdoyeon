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

    },
    beforeCreate(){ //비포 크레이트 훅 생명주기 Life Cycle
        console.log('뷰 생명주기 beforeCreate');
    },
    created(){ //크레이트드 훅 생명주기 Life Cycle
        console.log('뷰 생명주기 create');
        // 요소 선택 가능
        // 제이쿼리 사용 가능
    },
    beforeMounte(){ // 비포마운트  화면 부착 이전 상태   (마운트"화면에 그림이 그려지는 것")
        console.log('뷰 생명주기 beforeMounte');
    },
    mounted(){ // 마운티드  화면 부착 이전 상태   (마운트"화면에 그림이 그려지는 것")
        console.log('뷰 생명주기 mounte');
    },
    beforeUpdate(){ //비포업데이트
        console.log('뷰 생명주기 beforeUpdate');
        //수정을 이곳에서 한다.
    },
    Updated(){ //업데이트드
        console.log('뷰 생명주기 Updated');
        //수정완료
    },
    beforeDestory(){ //비포디스토이리 생명주기가 끝났다!!!
        console.log('뷰 생명주기 beforeDestory');
        //요소제거 이전
    },
    destoryed(){ //디스토이리드 생명주기가 끝났다!!!
        console.log('뷰 생명주기 destoryed');
        //요소제거
    }
})
vue.$mount('#root');