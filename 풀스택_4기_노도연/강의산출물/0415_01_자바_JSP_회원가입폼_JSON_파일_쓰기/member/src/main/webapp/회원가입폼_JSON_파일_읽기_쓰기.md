# 회원가입폼 JSON 파일 읽기 쓰기

# localhost:8080/member/

1. 회원가입폼 입력상자 => 
   - 아이디 userId
   - 비밀번호 userPw
   - 이름 userName
   
   $.ajax({
   		url: './member.jsp', 
   		type: 'POST',
   		data:{
   			userId : $('#userId').val(),
   			userPw : $('#userPw').val(),
   			userName : $('#userName').val()
   		},
   		success(res){
   			console.log("ajax 전송 성공");
   			console.log(res);
   		},
   		error(err){
   			console.log("ajax 전송 실패!");
   			console.log(err);
   		}
   })
   
2. 회원가입버튼 클릭 전송된 폼데이터 => JSP에서 데이터 받기 
   String userId = request.gerParameter("userId");
   String userPw = request.gerParameter("userPw");
   String userName = request.gerParameter("userName");
   * 화면으로 내용 확인하기 
   System.out.println("userId");
   System.out.println("userPw");
   System.out.println("userPw");
   
3. JSONObject JSON 형식
   JSONObject obj = new JSONObject();
   obj.put("아이디", userId);
   obj.put("비밀번호", userPw);
   obj.put("이름", userName);

   	- JSONObject 확인 (자바콘솔창 확인)
	System.out.println(obj);
	- JSONObject 확인 (자바스크립트 콘솔창 확인)
	out.println(obj);


4. 파일쓰기  FileWriter
   - 파일경로
   E:\풀스택_4기_노도연\강의산출물\04월\0415_01_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기\data
   
   - 파일명
   member.json
   
   - 파일쓰기
   String file = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0415_01_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기\\data\\member.json"
   FileWriter filewriter = new FileWriter(file);
   
   
   - FILE 처리는 반드시 예외 처리 try{} catch(IOException e ){}
   String file = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0415_01_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기\\data\\member.json";
   try{
		String file = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0415_01_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기\\data\\member.json";
		FileWriter filewriter = new FileWriter(file);
		filewriter.write(obj.toJSONString());
		filewriter.close();
		System.out.println("파일 저장 완료 ");
	}
	catch(IOException e){
		System.out.println("에러 메세지 : " +e.getMessage());
	}

수업내용

회원가입폼 버튼 클릭 마다 계속 추가
기본 json 파일 열고 => 폼내용 쓰고 => 추가 = > 저장
