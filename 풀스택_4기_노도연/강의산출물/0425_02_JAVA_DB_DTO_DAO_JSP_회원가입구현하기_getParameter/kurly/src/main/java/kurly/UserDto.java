package kurly;

public class UserDto {
	private String userId;
	private String userPw;
	private String userName;
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
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	
	
}
