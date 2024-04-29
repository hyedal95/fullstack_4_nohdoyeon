# ToDo List
- 프로젝트 이름: todo
- 데이터베이스 이름: todo_list
- 테이블 이름 : todo_list

1. 데이터베이스 설계
   - 데이터베이스 이름: todo_list
   - 테이블 이름 : todo_list
     idx INT NOT NULL  AUTO_INCREMENT PK
     todo VARCHAR(250) NOT NULL
     todoDate TIMESTAMP DEFAULT NOW() NOT NULL

2. 입출력 화면 설계
   - index.html
   - 입력화면폼
   - JQUERY 구현 저장 버튼 클릭 이벤트
   - .save-btn 버튼 클릭 이벤트
   
   - #todoInput : 값 입력
   - .todo-list: 목록 출력
   - AJAX API 구현 
   - 입력하면 저장되고, 곧바로 목록에 출력된다.
   - 웹페이지 로딩시 목록 출력된다.
   
   
3. JAVA & JSP
   - JAVA => DTO :TodoDto.java
   - 저장 JSP = > todo_insert_action.jsp => wrbapp=> 폼 입력값 => 받기 겟파라미터 => 콘솔창으로 보기
   
  
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQL; 
   
   
   - JAVA => DAO : TodoDao.java(1. JDBC 드라이버, 컨넥션)
   
   - JAVA => DAO : TodoDao.java(2. 저장메서드 todoInsert()) => 저장완료 => 리턴1
   - 저장완료 메시지 1이면 => 목록 호출 => TodoDao.java(3. 목록메서드 todoList()) => JSON 리턴
   
   
   - JSON => AJAX 에게 응답
   - AJAX => 목록출력(반복문)
   

   - 웹페이지 로딩시 목록 출력된다.  => todo_list_action.jsp
   ------------------------------------------------------------------------------ 완료

4. 삭제버튼 구현 TodoDao.java(4. 삭제메서드 todoDelect())
   - DB todo_list_table => 테이블 목록 삭제 구현 
   - AJAX 삭제할 idx 번호를 => jsp 전달 
   		=> todo_delect_action.jsp
   		=> idx를 파라미터로 전달
   		=> TodoDao.todoDelect(삭제할 idx)
   1) AJAX idx 삭제할 목록의 인덱스 번호를 추출기술 필요
   2) AJAX 가 idx 를 todo_delect_action.jsp에 전송


5. 수정버튼 구현 TodoDao.java(5. 수정메서드 todoUpdate())

