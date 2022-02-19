package morgan.rayon.standard;

public class TwoFactorAuthentication {

	// Username to verify
	String username;
	// password to verify
	String password;
	// Verification code sent to user as added security
	String vercode;
	// number of password attempt made
	int cred_attemp = 0;
	// variable of class which deals with database transactions
	DbAuthenticate dbauthenticate;
	//variable of class whichs deals with sending email to user
	Mail mail;

	TwoFactorAuthentication() {
		dbauthenticate = new DbAuthenticate();
		mail = new Mail();

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	public void authenticate(String username, String password) {

		 
		this.setUsername(username);
		this.setPassword(password);
		if (dbauthenticate.dbMatchCredential(username, password)) {
			//send verification code to client either via: email
		}
		else
		{
			//
		}

		 
	}
	
	public String generateCode()
	{
		return "";
	}

}
