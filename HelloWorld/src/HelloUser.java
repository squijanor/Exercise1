

public class HelloUser {
	String userName;
	
	HelloUser(String userName){
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void greetUser(){
		System.out.println("Hello " + this.userName);
	}
	
	public void greetUser(String userName){
		System.out.println("Hello " + userName + "!");
	}
}
