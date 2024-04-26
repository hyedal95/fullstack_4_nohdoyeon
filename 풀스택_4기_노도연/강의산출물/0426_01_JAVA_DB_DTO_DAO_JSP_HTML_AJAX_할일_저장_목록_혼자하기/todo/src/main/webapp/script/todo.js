(($)=>{
	
	//저장 버튼 클릭 이벤트
	$('.save-btn').on({
		click(e){
			e.preventDefault();
			
			// URL HTTP 통신 매개변수 전송하기
			// location.href = 웹주소/프로젝트이름/파일명/? data 내용 = 변수 데이터
			// ? 뒤에 나오는 것을 '쿼리스트림' 이라고 한다.
			// location은 이 사이트로 이동해라!!
			//location.href = "http://localhost:8080/todo/todo_action.jsp?todo="  + $('#todo').val()
			// http://localhost:8080/todo/todo_action.jsp?todo=%ED%85%8D%EC%8A%A4%ED%8A%B8+%EC%A0%84%EC%86%A1+%EB%82%B4%EC%9A%A9+TODO+LIST
			
			
			// AJAX 전송
			
			$.ajax({
				url:'./todo_insert_action.jsp',
				type:'POST',
				data:{
					todo : $('#todo').val()
				},
				success(res){
					console.log("AJAX성공");
					console.log(res);
					$('#todo').val(''); //todo안에 입력상자 지울 때는 val('공백만 넣으면된다.')
				},
				erroe(err){
					console.log("AJAX실패");
					console.log(err);
				},
			})
			
		}
	})
	

	//목록 출력 클릭 이벤트 => 목록 배열로 가져오기  => *가져오는 것만 하는 것이면 get, 방식 보내고 받고 할 때는 post *
	$('.list-btn').on({
		click(e){
			e.preventDefault();
			
			$.ajax({
				url:'./todo_list_action.jsp',
				type:'GET',

				success(res){
					//console.log("AJAX 성공");
					//console.log( res );
					//console.log( JSON.parse(res) );
					
					let txt = '';
					const result = JSON.parse(res);
					
	
					
					
					
					result.map((item, idx)=>{
							txt += `<tr>`;
							txt += `<td>${item.idx}</td>`;
							txt += `<td><a href="#"><span>${item.할일}</span></a></td>`;
							txt += `<td>${item.일시}</td>`;
							txt += `</tr>`;
					});
					
					$('.todo-list').empty(); // .empty() 청소해라!
					$('.todo-list').append(txt); // .append(txt) 새로고침이 됨.
				},
				error(err){
					//console.log("AJAX 실패");
					console.log( err );
				}
			});
		}
	})
	
})(jQuery);