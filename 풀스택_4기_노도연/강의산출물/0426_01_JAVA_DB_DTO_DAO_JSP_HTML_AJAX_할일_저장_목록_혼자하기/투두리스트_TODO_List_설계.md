# TODO LIST 설계
  - 프로젝트 이름 :todo
  
  : 할일 저장 => DB 저장 
  => HTML(할일 입력폼) 
  => AJAX(JS)
  * 비동기식 객체기반;화면 새로고침 없이 데이터를 DTO에 저장해주는 것.
  => JSP(HTML + JAVA)
  *JAVA 서버 페이지
  => DTO(JAVA)
  => DAO(JAVA+JDBC+SQL) => 서블릿 HTTP 통신 (서버)
  => DB (정보의 목적지 (정보가 가라앉는 곳) RD;관계형데이터베이스)
   
  : 할일 목록
  => DB 목록 가져오기 org.json.simple.JSONArray & JSONObject 
  => HTML(할일 목록 테이블) <=> AJAX(JS) <=> JSP(HTML+JAVA) 
  <=> DTO(JAVA) || JSON 데이터 <=> DAO(JAVA+JDBC+SQL) <=> DB(RD)
  
1. DB 설계  
   - DATABASE  이름 : todo
   - TABLE : todo_list_table
     필드1 idx INT NOT NULL AUTO_INCREMENT PK
     필드2 할일 todo VARCHAR(100) NOT NULL
     필드3 등록일자 todoDate TIMESTAMP DEFAULT NOW() NOT NULL
     * NOW() = 대체 가능 CURRENT_TIMESTAMP
     
  
2. index.html => [webapp] => index.html
   - 할일 입력폼 디자인 (UIUX) => 할일 저장 버튼 클릭 이벤트
   - AJAX 구현
   - 할일 목록 테이블 디자인 (UIUX)

   
3. index.html + jQuery(AJAX API)=> HTTP 통신
   - AJAX API =>HTTP통신 QueryString ?쿼리 스트림"웹주소/액션.jsp? 파라미터1개= +내용값 & +파라미터2개=내용값" 보내는 법 배움 
   - JSON 데이터 처리 => 키 : 값

4. DTO(JAVA) - 입출력담당
   - TodoDto.java
   
5. JSP(HTML+JAVA)
   // todo 저장 구현 JSP
   - todo_insert_action.jsp 
   
   - getParameter()사용
   - setParameter()사용
   - TodoDto.java => import => 객체생성
   
   // todo 목록 구현 JSP
   - todo_list_action.jsp
AJAX가 목록 요청 
<=> todo_list_action.jsp 
<=> 서버목록 구현 함수 호출 
<=> 서버 todoListSelect()
{조회 SELECT * FROM todo_list_table;}
  
   

6. DAO(JAVA+JDBC+SQL)
   - TodoDao.java
   - import java.sql.*;
   - JDBC mariadb 드라이버 Driver 설정
   - JDBC mariadb 컨넥션 아이디 비번 인증하고 연결
완료----------------------------------------------------------------  
   - 저장 메서드 int todoInsert(){return 1,-1} 
   - SQL : INSERT INTO => 저장
완료---------------------------------------------------------------- 
   - HTML 목록버튼 클릭이벤트 JS AJAX =>
   - 목록 메서드 JSONArray todoListSelect (){return arr}
   - 리턴이 JSON 객체이기 때문에 리턴 타입이 JSONArray 가 된다. 
   
   - SQL : SELECT => 목록
   - JSONArray 
   - JSONObject
   - 리턴값 JSONArray

7. HTML 목록 버튼 클릭이벤트
   - AJAX 구현
   - ToDo LIST = >TABLE 출력 
   
  