# 배포하기
   - 웹호스팅 : 닷홈 회원가입 무료호스팅 신청
   - url : hyedal95.dothome.co.kr
   - 아이디 : hyedal95
   - 비밀번호 : (비밀번호)
   - 웹 배포 : hyedal95.dothome.co.kr/0129_산출물_FLEX박스_배포

# 캐러셀 슬라이드 제작하기
1. 분석, 기획, 설계
   - 프로젝트 : 마켓컬리 인트로 페이지 섹션2 4개배치*5페이지 총 20개배치 
   - 슬라이드 동작은 우측에서 좌측으로 4개씩 부드럽게 이동하는 슬라이드
   - 컨테이너 너비는 1050px 
   - 이미지 여백 : 우측 18px

2. 제작 구성요소
   - 섹션 > 컨테이너 > 타이틀 
   - html > body > #wrap> #main > #섹션section(100%) > 컨테이너.container(1050px) > 컨텐츠.content(100%) > 슬라이드 랩퍼 박스 .slide-content (1050+18px) > 슬라이드 전체 20개 목록 박스(.slide-wrap ul) > 슬라이드 목록(.slide li) > 이미지 갭(여백)박스 (ima-box) > 이미지

3. css 모듈 
   - 임포트(@Import)

4. svg아이콘 이미지
   - 벡터방식 (확대 축소시 이미지가 깨지지 않음)
   - icon_left_circle_gray.svg  fill #333
   - icon_left_circle_purple.svg  fill #5f0080;

5. position 포지션
   - 포지션 : 앱솔루트(absolute) 절대좌표
   - 수직좌표 :top(맨위), bottom(맨아래) 
   - 수평좌표 :left(왼쪽) ,right(오른쪽) 
   - 기본좌표 : top:0; left:0;
```css  
position:absolute;
left:0;
top:0;

```

6. 완성된 슬라이드 레이아웃 배포
  - 닷홈 업로드 폴더 : 0130_마켓컬리_섹션2_슬라이드_배포
  - url: hyedal95.dothome.co.kr/0130_마켓컬리_섹션2_슬라이드_배포