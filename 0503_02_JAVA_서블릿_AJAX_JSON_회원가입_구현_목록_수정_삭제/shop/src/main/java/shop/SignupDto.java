package shop;

public class SignupDto {
	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
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
	public String getUserEmail() {
		return userEmail;
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
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setUserHp(String userHp) {
		this.userHp = userHp;
	}
	
	@Override
	public String toString() {
		return "SignupDto [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userHp=" + userHp + "]";
	}
	
	
	
}
