(($)=>{
	
	class Fanpage{
		init(){
			this.fanpageForm();
		}
		fanpageForm(){
			//회원가입 전송 버튼
			$('.submit-btn').on({
				click(e){
					e.preventDefault();
					//입력상자 전송 값 가져오기
					
					const userNickName = $('#userNickName').val();
					const userText = $('#userText').val();
					
					
	 				$.ajax({
						url:'./fanpage_action.jsp', //자바서버페이지
						type:'POST',
						data:{
							userNickName: userNickName,
							userText: userText,
							
						},
						success(res){
							const result = JSON.parse(res); 
							console.log(result);
							
							let txt ='';
							txt += "<tr>";
								txt += "<td>" + result.닉네임 +  "</td>";
								txt += "<td>" + result.남긴글 +  "</td>";
							txt += "</tr>";
							
							$('.fanpage-list').append(txt); //클래스 내부에 txt를 추가해라 . append txt 변수들 추가해라.
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
	const fanpage = new Fanpage();
	fanpage.init();
})(jQuery);