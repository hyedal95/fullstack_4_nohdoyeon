(($)=>{
	class Signup{
		init(){
			this.signForm();
		}
		signForm(){
			//전송버튼 클릭 이벤트
			
			$('.submit-btn').on({
				click(e){
					e.preventDefault(); //버튼은 새로고침때문에 안보임. 이게 있어야함.
					const userName = $('#userName').val();
					
					console.log(userName);
					
					//ajax
					$.ajax({
						url:'./signup_action.jsp',
						type:'POST',
						data:{
							// DTO에서 받을 것 
							userName : userName
						},
						success(res){
							console.log("ajax 전송성공!")
							//const result =JSON.parse(res);
							//console.log(result);
							console.log(res);
						},
						error(err){
							console.log("ajax 전송실패");
							console.log(err);
						}
					
					})
				}
				
				
			})
		}
		
	}
	const signup =new Signup();
	signup.init();
	
	
})(jQuery);