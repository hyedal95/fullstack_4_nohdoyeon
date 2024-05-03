# 서블릿 XML 맵핑
  CRUD ( 쓰고 Insert, 읽고 Select, 수정 Update, 삭제 Delete ) 
1.입력(인서트 Insert) 서블릿  C  => Signup.java 맵핑 signup.do
=> 서블릿(이름 signup 클래스 Signup.java ) 서블릿 맵핑(이름 signup 유알엘패턴 /signup.do)

2.목록(셀렉트 Select) 서블릿  R	 => List.java 맵핑 list.do
=> 서블릿(이름 list 클래스 shop.List.java ) 서블릿 맵핑(이름 list 유알엘패턴 /list.do)

3.수정(업뎃트 Update) 서블릿  U  => Update.java 맵핑 update.do
=> 서블릿(이름 update 클래스 shop.Update.java ) 서블릿 맵핑(이름 update 유알엘패턴 /update.do)

4.삭제(딜리트 Delete) 서블릿  D  => Delete.java 맵핑 delete.do
=> 서블릿(이름 delete 클래스 shop.Delete.java ) 서블릿 맵핑(이름 delete 유알엘패턴 /delete.do)

# web.xml 만들기
  1) 프로젝트이름을 선택한다.
  2) 마우스 우측버튼 클릭한다.
  3) java EE Tools 
     => Generate Deployment Descriptor Stub 메뉴 선택
     => web.xml 자동 생성
  4) [webapp] => [WEB-INF] => web.xml => 파일열기 => Source 클릭 코드가 보인다.
  5) 서블릿 이름 생성, 서블릿 클래스 지정, 서블릿 맵핑 작성하기 
  6-1) <web-app 끝부분에 ...메타데이터-컴플리트 metadata-complete="true"> XML 사용함. => @ Annotation 사용 안함.
  6-2) <web-app 끝부분에 ...메타데이터-컴플리트 metadata-complete="false"> XML 사용안함.=> @ Annotation 사용

==================
1. 어노테이션(Annotation) 맵핑 방법 => xml 3.0 이상은 사용
   @ 어노테이션  <= 맵핑
   @WebServlet(name="signup", urlPatterns={"/signup.do"}
   메타데이터-컴플리트 metadata-complete="true"> XML 사용함. => @ Annotation 사용 안함.
   메타데이터-컴플리트 metadata-complete="false"> XML 사용안함.=> @ Annotation 사용
   
2. XML 맵핑 => 서블릿으로 시작해서 서블릿 맵핑으로 끝난다.
   [webapp] => [WEB-INF] => web.xml
... 예시
<web-app>    
   <servlet>
		<servlet-name> signup </servlet-name>
		<servlet-class> Signup </servlet-class>
   </servlet>	
   
   
   <servlet -mapping>
		<servlet-name> signup </servlet-name>
		<url-pattern> /signup.do </url-pattern>
   </servlet -mapping>
</web-app>
...