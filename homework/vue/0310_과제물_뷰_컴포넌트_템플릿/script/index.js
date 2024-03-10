const vue = new Vue({
    data:{
        headerTitle:'이곳은 헤더 타이틀입니다. 왼쪽엔 로고와 오른쪽에는 네비게이션바를 만들거에요',
        section1Title:'이곳은 섹션1 영역! => top영역에는 이미지를 bottom영역에는 서브메뉴 클릭이벤트를  ',
        section2Title:'이곳은 섹션2 영역! => 내용이 바뀌는 구간을 꾸밀 곳',
        section3Title:'이곳은 섹션3 영역! => top영역에는 spot로그인 회원가입 탭[아이디 비밀번호 입력창을] bottom에는 이미지 삽입 바로가기',
        footerTitle:'사이트 개발자 : ',
        modalTitle:'모달창이에용',
        quickTitle:'퀵메뉴에용'

    }
});
vue.$mount('#wrap');