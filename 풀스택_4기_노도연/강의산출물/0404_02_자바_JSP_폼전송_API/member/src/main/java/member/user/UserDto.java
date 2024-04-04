package member.user;

public class UserDto { //정보은닉 캡슐화 private => 세터 게터 이용해야함.
	private String userName;
	private String userId ;
	private String userPw;
	private String userGender;
	private String[] userHobby;
	private int userAge;
	private String userMovie;
	
	
	public String getUserName() {
		return userName;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserGender() {
		return userGender;
	}
	public String[] getUserHobby() {
		return userHobby;
	}
	public int getUserAge() {
		return userAge;
	}
	public String getUserMovie() {
		return userMovie;
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
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public void setUserHobby(String[] userHobby) {
		this.userHobby = userHobby;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void setUserMovie(String userMovie) {
		this.userMovie = userMovie;
	}
	
	

}
