(($)=>{
	
	class Singup{
		init(){
			this.signupForm();
		}
		signupForm(){
			//회원가입 전송 버튼
			$('.submit-btn').on({
				click(e){
					e.preventDefault();
					//입력상자 전송 값 가져오기
					
					const userId = $('#userId').val();
					const userPw = $('#userPw').val();
					const userName = $('#userName').val();
					const userEmail = $('#userEmail').val();
					const userHp = $('#userHp').val();
					const userGender = $('input[name="userGender"]:checked').val();
					const userAddress = $('#userAddress').val();
					
	 				$.ajax({
						url:'./signup_action.jsp', //자바서버페이지
						type:'POST',
						data:{
							userId: userId,
							userPw: userPw,
							userName: userName,
							userEmail: userEmail,
							userHp: userHp,
							userGender: userGender,
							userAddress: userAddress,
						},
						success(res){
							const result = JSON.parse(res); //JSON형식으로 변환
							
							let txt ='';
							txt += "<tr>";
								txt += "<td>" +result.아이디+  "</td>";
								txt += "<td>" +result.비밀번호+  "</td>";
								txt += "<td>" +result.이름+  "</td>";
								txt += "<td>" +result.이메일+  "</td>";
								txt += "<td>" +result.전화번호+  "</td>";
								txt += "<td>" +result.성별+  "</td>";
								txt += "<td>" +result.주소+  "</td>";
							txt += "</tr>";
							
							$('.signup-list').append(txt); //클래스 내부에 txt를 추가해라 . append txt 변수들 추가해라.
						},
						error(err){
							console.log("ajax 전송실패");
							console.log(err);
						}
						
						
					})
				}
			});
		}
		
	}
	const signup = new Singup();
	signup.init();
})(jQuery);