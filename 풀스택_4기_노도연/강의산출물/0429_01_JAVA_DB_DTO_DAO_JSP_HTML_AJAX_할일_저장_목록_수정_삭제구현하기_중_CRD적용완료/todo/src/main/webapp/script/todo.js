(($)=>{

	class Todo{
		init(){
			this.todoSave();

		}
		//할일저장
		todoSave(){
			function resJsonOutput(res){
				const jsonArr = JSON.parse(res); // JSON 객체로 변경
							
				let output= '';
				jsonArr.map((item, idx)=>{
					output +=`<li>`;
					output +=`<a href="#"> ${item.할일} </a>`;
					output +=`<span>`;
					output +=`<button class="update-btn">수정</button>`;
					output +=`<button value='${item.idx}' class="delete-btn">삭제</button>`;
					output +=`<span>`;
					output +=`</li>`;

				});
				
				$('.todo-list').empty();
				$('.todo-list').append(output);
				
				// 삭제 버튼 클릭 이벤트
				// 삭제할 idx 번호를 todo_delect_action.jsp에 보내기(전달)
				// todo_delect_action.jsp / 인코딩 /파라미터 받기 /콘솔창 확인
				$('.delete-btn').on({
					click(e){
						e.preventDefault();
						//console.log( $(this).val() );
						$.ajax({
							url:'./todo_delect_action.jsp',
							type:'post',
							data:{
								idx: $(this).val()
							},
							success(res){
								resJsonOutput(res);
							},
							error(err){
								console.log("ajax 실패");
								console.log(err);
							}
						})
						
					}
				})
				
				//수정 버튼 클릭 이벤트
				$('.update-btn').on({
					click(e){
						e.preventDefault();
						alert('삭제');
						
					}
				})
			}
			
			// 리스트 목록 가져오기 함수 todo_list_action.jsp
			function todoList(){
				$.ajax({
						url:'./todo_list_action.jsp',
						type:'GET',
						success(res){
						
							resJsonOutput(res);

						},
						error(err){
							console.log('ajax 전송 성공!');
							console.log( err );
						}
					})
			}
			todoList();
			
			// 할 일 저장 버튼 클릭 이벤트
			$('.save-btn').on({
				click(e){
					e.preventDefault();
					
					if($('#todoInput').val()!==''){ // 공백이 아니면 전송해라.

						$.ajax({
							url:'./todo_insert_action.jsp',
							type:'POST',
							data:{
								todo : $('#todoInput').val()
							},
							success(res){
							
								resJsonOutput(res);

							},
							error(err){
								console.log('ajax 전송 성공!');
								console.log( err );
							}
						})

					}
					else{
						alert('할일을 입력하세요!');
					}
					
				}
			})
		}
		//할일목록
		todoList(){
			console.log('todoList()');
		}
		//할일삭제
		todoDelect(){
			console.log('todoDelect()');
		}
		//할일수정
		todoUpdate(){
			console.log('todoUpdate()');
		}
	}
	const todo = new Todo();
	todo.init();

})(jQuery);
