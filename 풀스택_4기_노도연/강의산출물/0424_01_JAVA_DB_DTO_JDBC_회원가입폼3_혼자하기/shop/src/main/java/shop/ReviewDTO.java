package shop;

public class ReviewDTO {
	private String userName;
	private String userStore;
	private String userMeum;
	private String userText;
	
	public String getUserName() {
		return userName;
	}
	public String getUserStore() {
		return userStore;
	}
	public String getUserMeum() {
		return userMeum;
	}
	public String getUserText() {
		return userText;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserStore(String userStore) {
		this.userStore = userStore;
	}
	public void setUserMeum(String userMeum) {
		this.userMeum = userMeum;
	}
	public void setUserText(String userText) {
		this.userText = userText;
	}
}
