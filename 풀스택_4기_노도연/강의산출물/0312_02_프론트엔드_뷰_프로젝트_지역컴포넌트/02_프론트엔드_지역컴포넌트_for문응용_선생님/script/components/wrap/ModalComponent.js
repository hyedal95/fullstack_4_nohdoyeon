const ModalComponent = {
    props:[''],
    template:`
        <div class="popup"><!--  너비 600 높이 400 -->
            <div class="container">
                <div class="title">
                    <h1>9월 JUST 쇼핑몰 세일 안내</h1>
                </div>
                <div class="content">
                    <ul>
                        <li>오랜만에 찾아온 세일 안내!</li> 
                        <li>JUST 쇼핑몰이 제안하는 유니크한 시즌별 패션 트렌드를 즐겨보세요.</li>
                        <li>오랜만에 찾아온 휴면고객이라면, <br>
                            지금 바로 로그인 하고 적립금 1,000원을 받으세요!</li>
                    </ul>
                </div>
                <div class="button-box">
                    <button class="close-btn" title="닫기">닫기</button>
                </div>
            </div>
        </div>
    `
}