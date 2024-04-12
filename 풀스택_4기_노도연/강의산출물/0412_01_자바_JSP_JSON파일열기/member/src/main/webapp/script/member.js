(($)=>{
	//회원가입 버튼 클릭 
	
	$('.submit-btn').on({
		click(e){
			e.preventDefault();
			//ajax 아이디 전송 => member_signup.jsp
			$.ajax({
				url:'./member_signup.jsp',
				type:'POST',
				data:{					
					userName : $('#userName').val(),
					userAge : $('#userAge').val()
				},
				success(res){
					console.log( res );
							
				},
				error(err){
					console.log("ajax 전송실패");
					console.log(err);
				}
			})
		}
	})
	
})(jQuery);