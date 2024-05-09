(($)=>{
	
	//공통요소 todoList(res)
	function todoList(res){
		console.log(res);
		
		const arr = JSON.parse(res);
		let list= '';
		let list2 = '';
		let tot = arr.length;
		let cnt1 = 0;
		let cnt2 = 0;
		
		arr.map((item)=>{
			if(Number(item.완료)===0){//진행중 할일
				cnt1++;
				list += `<li data-key='${item.idx}'>`;
				list +=	`<div>`;
				list +=	`<input type='checkbox' name='chk' id='chk${item.idx}' value='${item.idx}' /> `;
				list +=	`<input type='text' name='todo' id='todo${item.idx}' value='${item.할일}' />`;
				list +=	`<span>`;
				list +=	`<button  class="update-btn"><i class="material-icons">playlist_add_check</i></button>`;
				list +=	`<button  class="delete-btn"><i class="material-icons">delete_sweep</i></button>	`;
				list +=	`</span>`;
				list +=	`</div>`;
				list += `</li>`;
				
			}
			else{//완료된 할일
				cnt2++;
				list2 +=`<li data-key='${item.idx}'>`
				list2 +=`<div>`	 
				list2 +=`<input type='checkbox' name='chk' id='chk${item.idx}' value='${item.idx}' checked/>`
				list2 +=`<input type='text' name='todo' id='todo${item.idx}' value='${item.할일}' />`
				list2 +=`<span> `
				list2 +=`<button  class="update-btn"><i class="material-icons">playlist_add_check</i></button>`			
				list2 +=`<button  class="delete-btn"><i class="material-icons">delete_sweep</i></button>`				
				list2 +=`</span>`		
				list2 +=`</div>`
				list2 +=`</li>`
			}
		});
		
		$('.todo-list').empty().append(list);
		$('.todo-done-list').empty().append(list2);
		$('#todoInput').val('');
		
		$('.tot').empty().append(`<em>${tot}</em>`);
		$('.cnt1').empty().append(`<em>${cnt1}</em>`);
		$('.cnt2').empty().append(`<em>${cnt2}</em>`);
		
	};
	//1. 저장버튼 클릭이벤트 save-btn  => todo_insert_action.jsp
	$('.save-btn').on({
		click(e){
			e.preventDefault();
			
			const todo = $('#todoInput').val();
			if(todo!==''){
				$.ajax({
					url:'./todo_insert_action.jsp',
					type:'POST',
					data:{
						todo : todo
					},
					success(res){
						todoList(res);
					},
					error(err){
						console.log(err);
					}
				})
			}
			else{
				alert("할일을 입력하고 다시 시도해주세요.");
			}

		}
	});
	//2. 할일 목록, 할일 완료 목록 => todo_list_action.jsp  todoAction()
	
	function todoAction(){
		$.ajax({
			url:'./todo_list_action.jsp',
			type:'GET',
			success(res){
				todoList(res);
			},
			error(err){
				console.log(err);
			}
		})
	};
	todoAction();
	//3. 가상버튼 input[name=chk] 수정1 : 할일 완료 여부 (done=1 '완료', done=0 '할일') 
	$(document).on('mouseenter','input[name=chk]', function(){
		$(this).on({
			change(e){
				//체크박스 선택여부 확인 트루 또는 펄스
				console.log(e.target.checked); 
				//트루 또는 펄스 삼항연산자 이용 1 또는 0 표시
				console.log(e.target.checked?1:0);
				//체크박스의 idx 값 표시
				console.log(e.target.value);
				
				//ajax => todo_update_done_action.jsp 
				$.ajax({
					url:'./todo_update_done_action.jsp',
					type:'POST',
					data:{
						idx : e.target.value,
						done: e.target.checked?1:0
					},
					success(res){
						todoList(res);
					},
					error(err){
						console.log(err);
					}
				})
			}
		})
	});
	//4. 가상버튼 update-btn 수정2  : 할일 수정, 날짜 수정 수정2
	$(document).on('mouseenter','.update-btn', function(){
		$(this).on({
			click(e){
				e.preventDefault();
				const idx = $(this).parents('li').data('key');
				const todo = $(`#todo${idx}`).val();
				// todo_update_action.jsp 로 ajax 통해 전달
				$.ajax({
					url:'./todo_update_action.jsp',
					type:'POST',
					data:{
						idx :idx,
						todo:todo
					},
					success(res){
						todoList(res);
					},
					error(err){
						console.log(err);
					}
				})
			}
		})
	});
	//5. 가상버튼 delete-btn 삭제 : 할일 삭제
	$(document).on('mouseenter','.delete-btn', function(){
		$(this).on({
			click(e){
				e.preventDefault();
				
				const idx = $(this).parents('li').data('key');
				// todo_delete_action.jsp 로 ajax 통해 전달
				$.ajax({
					url:'./todo_delete_action.jsp',
					type:'POST',
					data:{
						idx:idx
					},
					success(res){
						todoList(res);
					},
					error(err){
						console.log(err);
					}
				})
				
			}
		})
	});		
})(jQuery);