(($)=>{
	//3. 출력 내용 공통 요소
	// success(){이곳에 들어갈 내용}
	// 리스트 함수()
	function todoList(res){
		const arr = JSON.parse(res);
		let list = ''; /*진행중 할일 목록 변수 설정*/
		let list2 = ''; /*완료된 할일 목록 변수 설정*/
		let tot = arr.length; // 전체 할일 갯수
		let cnt1 = 0;
		let cnt2 = 0;
		arr.map((item,idx)=>{
			/*파란색이면 숫자로 판단이 된 것이다. 숫자로 타입변환 Number(item.완료) : 숫자 변환할 때 사용*/
			if(Number(item.완료)===0){ /*=== 3개 할일*/ 
			    cnt1++;
			    
				list += `<li>`;
				list +=	`<div>`;
				list +=	`<input type='checkbox' name='chk' id='chk${item.idx}' value='${item.idx}' /> `;
				list +=	`<input type='text' name='todo' id='todo${item.idx}' value='${item.할일}' />`;
				list +=	`<span>`;
				list +=	`<button data-value='${item.idx}' class="update-btn"><i class="material-icons">update</i></button>`;
				list +=	`<button data-value='${item.idx}' class="delete-btn"><i class="material-icons">delete_forever</i></button>	`;
				list +=	`</span>`;
				list +=	`</div>`;
				list += `</li>`;
			}
			else{// 완료된 할일
				cnt2++;
				
				list2 +=`<li>`
				list2 +=`<div>`	 
				list2 +=`<input type='checkbox' name='chk' id='chk${item.idx}' value='${item.idx}' checked/>`
				list2 +=`<input type='text' name='todo' id='todo${item.idx}' value='${item.할일}' />`
				list2 +=`<span> `
				list2 +=`<button data-value='${item.idx}'  class="update-btn"><i class="material-icons">update</i></button>`			
				list2 +=`<button data-value='${item.idx}'  class="delete-btn"><i class="material-icons">delete_forever</i></button>`				
				list2 +=`</span>`		
				list2 +=`</div>`
				list2 +=`</li>`
			}
/*			jquery는 데이터 속성을 지원한다.
			데이터를 사용할 수 있다.
			그래서 value 뿐만 아니라 data-value='' 사용할 수 있는 것이다.*/	

		});
		
		
		
		/*선택자는 empty로 지우고, 일반값은 공백으로 지운다.*/
		$('.todo-list').empty().append(list); // 완료안된(0) 할일
		$('.todo-done-list').empty().append(list2); // 완료된(1) 할일
		$('#todoInput').val('');
		
		// 카운트 번호 출력
		// .text 숫자나 문자 넣어주고 태그 사용 안됨.
		// .append html 태그 같은 걸 추가 부착 
		$('.tot').empty().append(`<em>${tot}</em>`); // .append 태그 사용가능 데이터 누적 => 그렇기에 .empty() 같이 사용
		$('.cnt1').text(cnt1); // 태그사용 안됨 but .html() 하면 태그 사용 가능 
		$('.cnt2').html(`<i>${cnt2}</i>`);  // .html() 태그 사용 가능
	}
	
	//2. 웹페이지 열리면 곧바로 할일목록 출력 
	// 할일목록함수() 
	//function은 위에든 아래든 호출이 가능하다.
	todoAction();
	function todoAction(){
		//ajax 구현
		//list는 가져오기만 하면 되기 때문에 타입은 겟 방식
		//버튼 클릭이 아닌, 로딩시 실행
		$.ajax({
			url:'./todo_list_action.jsp',
			type:'GET',
			success(res){
				todoList(res);
			},
			error(err){
				console.log(err);
			}
		});
	}
	
	
	
	
	//1. 저장 버튼 클릭 이벤트
	$('.save-btn').on({
		click(e){
			e.preventDefault();
			
			const todo = $('#todoInput').val();
			
			// 입력상자 빈값아니면 저장해라 
			if(todo!==''){
				$.ajax({
					url:'./todo_insert_action.jsp',
					type:'post',
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
				/*나중에는 div 상자 만들어서 꾸며서 띄울 것!*/
				alert("할일을 입력하고 다시 시도해주세요.");
			}

		}
	})
	
	//4. 체크박스 체인지 이벤트
	// 체크박스를 선택하면 할일 완료로 변경한다. done =1 설정
	// 체크박스 chk 현재 가상요소임. 그렇기에 도큐먼트를 사용한다.
	// 가상요소는 마우스엔터 이벤트 넣어주고 , 2번째 칸에 name속성 적어준다. 
	// input이라고 적고 속성 이름 적고 네임이 무엇이냐 ? = name 적는다.
	$(document).on('mouseenter','input[name=chk]', function(){
		$(this).on({
			change(e){ // 체인지 이벤트 구현하겠다.
				console.log(e.target.checked); // 체크박스의 선택여부 확인 true OR false
				console.log(e.target.checked?1:0); // 삼항연산자를 활용해서 true = 1 false = 0 나오겠끔  => done 필드에 전달
				console.log(e.target.value); // 체크박스의 idx 값 표시 
				
				//=> todo_update_done_action.jsp 에게 보내준다.
				// ajax를 쓰는 이유 !!! 
				$.ajax({
					url:'./todo_update_done_action.jsp',
					type:'post',
					data:{
						idx : e.target.value,
						done : e.target.checked?1:0
						
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
	
	// 5. 가상버튼 => 할일 수정 버튼 클릭 이벤트
	// 가상이기에 이렇게 누를 수 있도록 설정해줘야한다.
	$(document).on('mouseenter','.update-btn', function(){
		$(this).on({
				click(e){
				e.preventDefault();
				// 수정하고자하는 idx 가져와야함
				// const idx = $(this).val(); // value=''로 지정된 경우에는 곧바로 .val() 가져올 수 있으나,
				const idx = $(this).data('value'); // data-value=''로 지정된 경우에는  .data('value')로 데이터 가져올 수 있다. 태그 어디서나 쓸 수 있기에 데이터밸류 쓰는것이 확장성에 도움이 된다. 
				const todo = $(`#todo${idx}`).val(); // 입력상자 값은 val()로 가져온다. 할일 내용이 가져와서 todo에 들어간다.
				// ajax를 통해서 전달한다.
				$.ajax({
					url:'todo_update_action.jsp',
					type:'POST',
					data:{
						idx : idx,
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
		})
	})
	
	// 6. 가상버튼 => 할일 삭제 버튼 클릭 이벤트
	$(document).on('mouseenter','.delete-btn', function(){
		$(this).on({
			click(e){
				e.preventDefault();
				const idx = $(this).data('value');
				// 자바스크립트 <=> JSP <=> DAO(JAVA)
				// 자바와 JSP 직접 연결하는 것이 서블릿
				// 다음 번 배울 내용은 서블릿이다.
				$.ajax({
					url:'./todo_delete_action.jsp',
					type:'POST',
					data:{
						idx :idx
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
	})

})(jQuery);
/*

*/