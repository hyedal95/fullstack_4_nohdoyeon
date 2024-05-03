(($)=>{
	// 공통 메서드 list(res)
    function list(res){
		const arr = JSON.parse(res);
		let list ='';
		
	    arr.map((item,idx)=>{
		list += `<tr data-key=${item.아이디}>`;
		list += `<td>${idx+1}</td>`;
		list += `<td>${item.아이디}</td>`;
		list += `<td>${item.비밀번호}</td>`;
		list += `<td>${item.이름}</td>`;
		list += `<td>${item.이메일}</td>`;
		list += `<td>${item.휴대폰}</td>`;
		list += `<td style="display:flex; "><button type='submit' class='update-btn'>수정</button><button type='submit' class='delete-btn'>삭제</button></td>`;
		list += `<tr>`;
		
		})
		
		$('.signup-list').empty().append(list);
		$('#userId').val('');
		$('#userPw').val('');
		$('#userName').val('');
		$('#userEmail').val('');
		$('#userHp').val('');
		// 커서 깜빡깜빡
		$('#userId').focus();
	}
	// 목록 출력하기 signupList()
	function signupList(){
		$.ajax({
			url:'signupList.do', //=> Signup.java 서블릿 파일 만들기
			type:'GET', // 가져오기만 한다.
			data:{
			},
			success(res){		
				list(res);
			},
			error(err){
				console.log(err);
			}
		})
	};
	signupList();
	
	// 입력
	$('.submit-btn').on({
		click(e){
			e.preventDefault();
			
			// 회원가입폼 아이디, 비밀번호, 이름 , 이메일 ,핸드폰번호 출력하기
			const userId = $('#userId').val();
			const userPw = $('#userPw').val();
			const userName = $('#userName').val();
			const userEmail = $('#userEmail').val();
			const userHp = $('#userHp').val();
			
			$.ajax({
				url:'signup.do', //=> Signup.java 서블릿 파일 만들기
				type:'POST',
				data:{
					userId: userId,
					userPw: userPw,
					userName: userName,
					userEmail: userEmail,
					userHp: userHp
				},
				success(res){		
					// JSON 가입정보 리스트 JSON 객체
					list(res);
				},
				error(err){
					console.log(err);
				}
			})
		}
	})
	
	// 가상태그 가상요소 이벤트 구현
	// 수정 버튼 이벤트 .update-btn
	// signup_update.jsp 이동해라! 
	// location.href ="signup_update.jsp";
	$(document).on('mouseenter','.update-btn', function(){
		$(this).on({
			click(e){
			e.preventDefault();
			
			const key = $(this).parents('tr').data('key');
			console.log(key); // 수정하고자하는 userId
			// 쿼리 스트링? 키=값
			location.href =`signup_update.jsp?userId=${key}`;
			
			$.ajax({
				url:'',
				type:'',
				data:{
					
				},
				success(res){
					console.log(res);
				},
				error(err){
					console.log(err);
				}
				
			})	
			
			}
		})
	})

	
	// 삭제 버튼 이벤트  .delete-btn
	$(document).on('mouseenter','.delete-btn', function(){
		$(this).on({
			click(e){
			e.preventDefault();
			location.href ="signup_delete.jsp";
			}
		})
	})
	
})(jQuery);