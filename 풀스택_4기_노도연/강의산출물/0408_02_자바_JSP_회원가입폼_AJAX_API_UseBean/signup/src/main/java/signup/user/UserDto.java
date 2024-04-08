package signup.user;

public class UserDto {
	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private String userHp;
	private String userGender;
	private String userAddress;
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public String getUserHp() {
		return userHp;
	}
	public String getUserGender() {
		return userGender;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setUserHp(String userHp) {
		this.userHp = userHp;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
}
