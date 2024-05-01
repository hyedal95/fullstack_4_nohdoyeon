# ToDo List
  - 할일 등록 done=>0
  - 완료된 할일 done=>1
  
1. 데이터베이스
   - DB Name : mytodo
   - TABLE Name : todo_table
     idx INT NOT NULL AUTO_INCREMENT PK
     todo VARCHAR(250) NOT NULL
     done TINYINT(1) NOT NULL DEFAULT 0
     todoDate TIMESTAMP NOT NULL DEFAULT NOW()
	
2. index.html    UI/UX
   - 할일 입력상자
   - 할일 저장버튼
   - 할일 목록
   - 할일 완료목록
   - 할일 체크박스
     - 입력상자 (수정)
     - 수정버튼-삭제버튼
   -----------------------
```HTML
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>My ToDo List</title>
	<link rel="stylesheet" href="./css/style.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<script src="./script/lib/jquery-1.9.0.min.js"></script>
	<script src="./script/mytodo.js" defer></script>
	

</head>
<body>
	<div id ="wrap">
		<div class="todo-title">
			<h1>My ToDo List</h1>
		</div>
		<!-- 할일추가하는 입력폼 -->
		<form class="todo-form">
			<div>
				<input type='text' name='todoInput' id='todoInput' placeholder='할일 입력해주세요.' />
				<button class="save-btn"><i class="material-icons">playlist_add</i></button>
			</div>
		</form>
		<!-- 할일리스트목록 -->
		<div class="todo-box">
			<h2>Task (n) </h2>
			<ul class="todo-list">
				<li>
					<div> <!-- 포지션 래러티브 -->
						<input type='checkbox' name='chk' id='chk1' value='1' /> <!-- 포지션 앱솔루트 -->
						<input type='text' name='todo' id='todo' value='할일내용' />
						<span> <!-- 포지션 앱솔루트 -->
							<button value='1' class="update-btn"><i class="material-icons">update</i></button>
							<button value='1' class="delete-btn"><i class="material-icons">delete_forever</i></button>	
						</span>
					</div>
				</li>
				<li>
					<div> <!-- 포지션 래러티브 -->
						<input type='checkbox' name='chk' id='chk1' value='1' /> <!-- 포지션 앱솔루트 -->
						<input type='text' name='todo' id='todo' value='할일내용' />
						<span> <!-- 포지션 앱솔루트 -->
							<button value='1' class="update-btn"><i class="material-icons">update</i></button>
							<button value='1' class="delete-btn"><i class="material-icons">delete_forever</i></button>	
						</span>
					</div>
				</li>
			</ul>
		</div>
		<!-- 할일리스트목록 중 완료[체크]한 목록 -->
		<div class="todo-box">
			<h2>Done (n) </h2>
			<ul class="todo-done-list">
				<li>
					<div> <!-- 포지션 래러티브 -->
						<input type='checkbox' name='chk' id='chk1' value='1' checked/> <!-- 포지션 앱솔루트 -->
						<input type='text' name='todo' id='todo' value='할일내용' />
						<span> <!-- 포지션 앱솔루트 -->
							<button value='1' class="update-btn"><i class="material-icons">update</i></button>
							<button value='1' class="delete-btn"><i class="material-icons">delete_forever</i></button>	
						</span>
					</div>
				</li>
				<li>
					<div> <!-- 포지션 래러티브 -->
						<input type='checkbox' name='chk' id='chk1' value='1' checked/> <!-- 포지션 앱솔루트 -->
						<input type='text' name='todo' id='todo' value='할일내용' />
						<span> <!-- 포지션 앱솔루트 -->
							<button value='1' class="update-btn"><i class="material-icons">update</i></button>
							<button value='1' class="delete-btn"><i class="material-icons">delete_forever</i></button>	
						</span>
					</div>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
```
   
3. AJAX API
   - mytodo.js
   1) 저장 : 할일 등록
      저장버튼 클릭이벤트 save-btn => todo_insert_action.jsp
      
   2) 목록 : 할일 목록, 할일 완료 목록 
   3) 수정1 : 할일 수정, 날짜 수정 
   4) 수정2 : 할일 완료 여부 (done=1 '완료', done=0 '할일') 
		console.log(e.target.checked); // 체크박스의 선택여부 확인 true OR false
		console.log(e.target.checked?1:0); // 삼항연산자를 활용해서 true = 1 false = 0 나오겠끔  => done 필드에 전달
		console.log(e.target.value); // 체크박스의 idx 값 표시 
   5) 삭제 : 할일 삭제
 
4. ACTION JSP
   1) todo_insert_action.jsp
   	  -1. 인코딩 => UTF-8 => <%request.setCharacterEncoding("UTF-8");%>
   	  -
   2) todo_list_action.jsp

   3) todo_update_done_action.jsp
-----------체크 내용 전달 받을 곳 ------------
   4) todo_update_action.jsp

-------------------완료
   5) todo_delete_action.jsp
   
5. JAVA DTO 
   - TodoDto.java
     private int idx;
     private String todo;
     private int done;


6. JAVA DAO
   - TodoDao.java
   
   변수4개 설정  
   	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQL;
   
   1) TodoDao()  //기본생성자
      => JDBC 드라이버 설정 
      Class.forName("org.mariadb.jdbc.Driver");
      => JDBC 컨넥션 연결 (DB 권한 인가)
      conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/mytodo","root","1234");
      
   2) todoInsert()

   3) todoList()
      -1. JSONArray 선언
   	  -2. SQL = "SELECT * FROM todo_table ORDER BY todoDate DESC ";
   	  -3. JSONObject 선언 및 while 반복문 수행으로 인해 1줄 1줄 json형태의 데이터 출력 
   
   4) todoDoneUpdate() 체크박스 구현 done 수정 

   5) todoUpdate()
      ======================완료	  
   6) todoDelete() 
   
   
   

 
   
   
   
   
