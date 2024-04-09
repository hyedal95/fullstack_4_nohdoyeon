(($)=>{
	//전송버튼 클릭 이벤트
	$('.submit-btn').on({
		click(e){
			e.preventDefault(); // 버튼 눌렀을 때 새로고침 안되게 막는 것.
			const userId = $('#userId').val();
			const userName = $('#userName').val();
			
			//AJAX
			$.ajax({
				url:'./member_action.jsp', // jsp파일 경로
				type:'POST',
				data:{
					userId : userId,
					userName :userName
				},
				success(res){
					console.log("ajax 전송성공!");
					const result =JSON.parse(res); // JSON 파일형식으로 변경
					console.log(result);
					console.log(result.아이디);
					console.log(result.이름);
				},
				error(err){
					console.log("ajax 전송실패!");
					console.log(err);
				}
			})
		}
	})
	
})(jQuery);