(($)=>{
	// 저장 입력 
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
				url:'signup.do', // 맵핑 주소 url-pattern
				type:'POST',
				data:{
					userId: userId,
					userPw: userPw,
					userName: userName,
					userEmail: userEmail,
					userHp: userHp
				},
				success(res){
					// res=> 타입 문자열 String 이기 때문에 숫자로 바꿔줘야한다.
					// Number(res)
					
					if(Number(res)=="1") {
						alert("회원가입을 축하드립니다.");
						location.href="response.jsp";
	
					}else {
						alert("회원가입 다시 확인하고 시도해주세요.");	
					}
				},
				error(err){
					console.log(err);
				}
			})
		}
	})
	// 목록
	$('.list-btn').on({
		click(e){
			e.preventDefault();
			
			$.ajax({
				url:'list.do', // 맵핑 주소 url-pattern
				type:'POST',
				data:{},
				success(res){
					// res=> 타입 문자열 String 이기 때문에 숫자로 바꿔줘야한다.
					// Number(res)
					
					if(Number(res)=="1") {
						alert("서블릿 목록으로 맵핑 되었습니다.");
	
					}else {
						alert("서블릿 목록으로 맵핑 실패!!!!!");	
					}
				},
				error(err){
					console.log(err);
				}
			})
		}
	})
	
	// 수정
	
	$('.update-btn').on({
		click(e){
			e.preventDefault();
			
			$.ajax({
				url:'update.do', // 맵핑 주소 url-pattern
				type:'POST',
				data:{},
				success(res){
					// res=> 타입 문자열 String 이기 때문에 숫자로 바꿔줘야한다.
					// Number(res)
					
					if(Number(res)=="1") {
						alert("서블릿 업데이트로 맵핑 되었습니다.");
	
					}else {
						alert("서블릿 업데이트로 맵핑 실패!!!!!");	
					}
				},
				error(err){
					console.log(err);
				}
			})
		}
	})
	
	// 삭제
	$('.delete-btn').on({
		click(e){
			e.preventDefault();
			
			$.ajax({
				url:'delete.do', // 맵핑 주소 url-pattern
				type:'POST',
				data:{},
				success(res){
					// res=> 타입 문자열 String 이기 때문에 숫자로 바꿔줘야한다.
					// Number(res)
					
					if(Number(res)=="1") {
						alert("서블릿 삭제 맵핑 되었습니다.");
	
					}else {
						alert("서블릿 삭제 맵핑 실패!!!!!");	
					}
				},
				error(err){
					console.log(err);
				}
			})
		}
	})
	
	
})(jQuery);