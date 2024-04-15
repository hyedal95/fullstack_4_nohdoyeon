(($)=>{
	
	$('.submit-btn').on({
		click(e){
			e.preventDefault();
			
			$.ajax({
				url:'./member.jsp',
				type:'POST',
				data:{
					userId :$('#userId').val(),
					userPw :$('#userPw').val(),
					userName :$('#userName').val()
				},
				success(res){
					console.log("ajax 전송성공 ");
					console.log(res);
				},
				error(err){
					console.log("ajax 전송실패");
					console.log(err);
				}
			})
		}
	})
})(jQuery);