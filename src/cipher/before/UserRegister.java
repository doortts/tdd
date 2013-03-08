package cipher.before;

public class UserRegister {
	private String userId;
	private String password;

	public void savePassword(String userId, String password){
		this.userId = userId;
		this.password = password;
	}
	
	public String getPassword(String userId){
		if (this.userId.equals(userId)){
			return this.password;
		} else {
			return "";
		}
		
	}
}
