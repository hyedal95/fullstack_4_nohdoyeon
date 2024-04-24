package kurly;

public class SignupDTO {
	private String userId;
	private String userPw;
	private String userName;
	private String userHp;
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserHp() {
		return userHp;
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
	public void setUserHp(String userHp) {
		this.userHp = userHp;
	}
	
}
