package shop;

public class SignupDTO {
	
  private String userId;
  private String userPw;
  private String userName;
  private String userHp;	 	
  private String userEmail;
  private String userAddr;
	  
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
	public String getUserEmail() {
		return userEmail;
	}
	public String getUserAddr() {
		return userAddr;
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
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	
}
