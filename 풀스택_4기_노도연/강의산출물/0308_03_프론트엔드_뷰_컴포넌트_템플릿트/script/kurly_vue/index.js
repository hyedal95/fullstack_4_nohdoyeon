
const vue= new Vue({
    data:{
        headerTitle:'헤더 컴포넌트',
        section1Title:'섹션1 컴포넌트',
        section2Title:'섹션2 컴포넌트',
        section3Title:'섹션3 컴포넌트',
        footerTitle:'푸터 컴포넌트',
        modalTitle:'모달 컴포넌트',
        quickTitle:'큌메뉴 컴포넌트',
        member:[
            {이름:'이숙신', 나이: 39},
            {이름:'이순신', 나이: 29},
            {이름:'이술신', 나이: 33},
            {이름:'이숨신', 나이: 49},
            {이름:'이숭신', 나이: 21},
            {이름:'이숩신', 나이: 13},
            {이름:'이숲신', 나이: 25},
        ]
    }
});
vue.$mount('#wrap');