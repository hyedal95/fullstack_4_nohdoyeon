const FooterComponent ={
    props:[''],
    template:`
        <footer id="fooeter">
            <div class="left">
                <h1><a href="./index.html"><span>JUST</span> <span>쇼핑몰</span></a></h1>
            </div>
            <div class="center">
                <div class="container">
                    <ul>
                        <li>
                            <address>서울시 마포구 홍익로 29(서교동, 동교빌딩) just 쇼핑몰</address>
                        </li>
                        <li>
                            <p>Copyright &copy; 2018 just 쇼핑몰, All right reserved.</p>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="right">
                <div class="container">
                    <a href="https://www.instagram.com/" title="인스타그램"><img src="./images/icon_1.png" alt="인스타그램"></a>
                    <a href="https://twitter.com/?lang=ko" title="트위터"><img src="./images/icon_2.png" alt="트위터"></a>
                    <a href="https://www.youtube.com/" title="유튜브"><img src="./images/icon_3.png" alt="유튜브"></a>
                </div>
            </div>
        </footer>

`
}