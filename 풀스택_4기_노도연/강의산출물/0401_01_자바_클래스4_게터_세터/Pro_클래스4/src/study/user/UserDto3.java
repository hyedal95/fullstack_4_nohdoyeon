package study.user;

public class UserDto3 {
	private String userName;
	private String userId;
	private String userPw;
	private String userBirth;
	private String userAddress;
	private String userPhone;
	private String userEmail;
	private String userRecommender;
	
	
	
	//기본 생성자 있으면, this가 빠지고 기본 생성자 없으면 this.가 나온다.
	public UserDto3() {

	}



	public String getUserName() {
		return userName;
	}



	public String getUserId() {
		return userId;
	}



	public String getUserPw() {
		return userPw;
	}



	public String getUserBirth() {
		return userBirth;
	}



	public String getUserAddress() {
		return userAddress;
	}



	public String getUserPhone() {
		return userPhone;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public String getUserRecommender() {
		return userRecommender;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}



	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}



	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}



	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public void setUserRecommender(String userRecommender) {
		this.userRecommender = userRecommender;
	}

}
