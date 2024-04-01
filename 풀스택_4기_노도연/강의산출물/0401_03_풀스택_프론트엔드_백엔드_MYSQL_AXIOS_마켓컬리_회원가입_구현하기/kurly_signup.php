<!-- 뷰에서 보내온 데이터 받기 -->

<?
    //1. cors 정책 해결
    header('Access-Control-Allow-Origin: *');
    header('Access-Control-Allow-Headers: *'); 

    //2. DB(데이터베이스) 권한 설정
    $db_server ='localhost';
    $user_name = 'hyedal95';
    $user_password = 'n0118hrim!';
    $db_name ='hyedal95';

    //3.DB(데이터베이스) 접속 (connection) =>mysqli_connect () 함수로 연결
    $conn = mysqli_connect($db_server, $user_name,$user_password,$db_name);
    mysqli_set_charset($conn, 'utf8'); //DB 한글 인코딩 utf-8 

    if($conn ==false){
        echo "데이터베이스접속실패!";
    }else{
        echo "데이터베이스접속성공!";
    }
    

    // php 코딩
    //4. 뷰 폼에서 전송된 데이터 받기
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

    //5. DB에 저장하기  SQL INSERT INTO();
    $SQL = "INSERT INTO vue_kurly_signup(userId,userPw,userName,userEmail,userHp,userAddr1,userAddr2,userGender,userBirth,userChooga,userService) 
    VALUES('$userId','$userPw','$userName','$userEmail','$userHp','$userAddr1','$userAddr2','$userGender','$userBirth','$userChooga','$userService')";

    //6. SQL 실행 해야 저장된다. 완료
    $result = mysqli_query($conn, $SQL);
    
    if($result ==true){
        echo "데이터베이스 데이터 저장 성공";
    }else{
        echo "데이터베이스 데이터 저장 실패";
    }

?>