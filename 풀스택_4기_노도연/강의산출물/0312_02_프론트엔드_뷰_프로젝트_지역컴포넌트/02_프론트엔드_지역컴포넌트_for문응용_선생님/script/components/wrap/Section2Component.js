const Section2Component ={
    props:[''],
    template:`
        <section id="section2">
            <div class="left">
                <div class="container">
                    <div class="title">
                        <button class="notice-btn" title="공지사항">공지사항</button>    
                        <button class="gallery-btn" title="갤러리">갤러리</button>    
                    </div>
                    <div class="content">
                        <div class="notice">
                            <ul>
                                <li><a href="#" title="9월 just 쇼핑몰 세일 안내!" class="popup-btn">9월 just 쇼핑몰 세일 안내!</a><span>2018-09-03</span></li>
                                <li><a href="#" title="불편한 경험은 저희에게도 알려주세요.">불편한 경험은 저희에게도 알려주세요.</a><span>2018-09-02</span></li>
                                <li><a href="#" title="카카오톡 친구 추가하고 할인쿠폰 받아 가세요.">카카오톡 친구 추가하고 할인쿠폰 받아 가세요.</a><span>2018-09-01</span></li>
                                <li><a href="#" title="다른곳에선 못보는~ 매력발산 아이템들 구경해 보실래요?">다른곳에선 못보는~ 매력발산 아이템들 구경해 보실래요?</a><span>2018-08-31</span></li>
                                <li><a href="#" title="just 쇼핑몰을 친구에게 추천하면 할인쿠폰을 드립니다!">just 쇼핑몰을 친구에게 추천하면 할인쿠폰을 드립니다!</a><span>2018-08-30</span></li>
                            </ul>
                        </div>
                        <div class="gallery">
                            <ul>
                                <li><a href="#" title="청바지,블라우스,파우,선글라스 여성 홍보모델"><img src="./images/gallery1.jpg" alt=""></a></li>
                                <li><a href="#" title="스트라이트 티,선글라스 금발 여성 홍보모델"><img src="./images/gallery2.jpg" alt=""></a></li>
                                <li><a href="#" title="노란색 원피스, 선글라스 여성 홍보모델"><img src="./images/gallery3.jpg" alt=""></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="center">
                <div class="container">
                    <div class="title hide" title="이벤트 배너">
                        <h2>이벤트 배너</h2>
                    </div>
                    <div class="content">
                        <a href="#" title="여름 마지막 세일">
                            <h3>여름 마지막 세일</h3>
                        </a>
                    </div>
                </div>
            </div>
            <div class="right">
                <div class="container">
                    <div class="title hide" title="바로가기 배너">
                        <h2>바로가기 배너</h2>
                    </div>
                    <div class="content">
                        <ul>
                            <li><a href="#" title="할인정보">할인정보</a></li>
                            <li><a href="#" title="이벤트정보">이벤트정보</a></li>
                            <li><a href="#" title="고객정보">고객정보</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
    `
}