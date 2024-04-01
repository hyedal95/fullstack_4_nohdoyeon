<!-- 뷰에서 보내온 데이터 받기 -->

<?
    header('Access-Control-Allow-Origin: *');
    header('Access-Control-Allow-Headers: *'); 

    // php 코딩
    // 뷰 폼에서 전송된 데이터 받기
    // [] 사용
    // 끝나면 세미콜론 꼭 써주기 
    // 연결은 .  문자와 문자 변수와 변수 연결할 때 마침표
    $userId = $_POST['userId'];
    $userPw = $_POST['userPw'];
    $userName = $_POST['userName'];
    $userEmail = $_POST['userEmail'];
    $userHp = $_POST['userHp'];
    $userAddr1 = $_POST['userAddr1'];
    $userAddr2 = $_POST['userAddr2'];
    $userGender = $_POST['userGender'];
    $userBirth = $_POST['userBirth'];
    $userChooga = $_POST['userChooga'];
    $userService = $_POST['userService'];

    echo "아이디 =".$userId;
    echo "비밀번호 =".$userPw;
    echo "이름 =".$userName;
    echo "이메일 =".$userEmail;
    echo "전화번호 =".$userHp;
    echo "주소1 =".$userAddr1;
    echo "주소2 =".$userAddr2;
    echo "성별 =".$userGender;
    echo "생년월일 =".$userBirth;
    echo "추가입력사항 =".$userChooga;
    echo "이용약관동의 =".$userService;

?>