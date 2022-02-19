package morgan.rayon.standard;

import java.util.ArrayList;
import java.util.Random;

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
	// variable of class whichs deals with sending email to user
	Mail mail;

	public TwoFactorAuthentication() {
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

	/**
	 * Authenticate credentials
	 * 
	 * @param username
	 * @param password
	 */
	public void authenticate(String username, String password, boolean twoFactor) {
		String generatedCode = "";
		int size = 4; // use to set length of random code to be generated

		this.setUsername(username);
		this.setPassword(password);
		if (dbauthenticate.dbMatchCredential(username, password)) {
			// if two factor is enabled then generate code and send it to client
			if (twoFactor) {
				generatedCode = generateCode(size);
				System.out.println("Random code is : " + generatedCode);
			}
		} else {
			//
		}

	}

	// generage sequence of characters used to validate user
	// @param size - size of randomize string
	public String generateCode(int size) {

		char[] codelist = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
				'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String final_code  ;

		Random rand = new Random(); // instance of random class
		ArrayList<Character> random_code = new ArrayList<Character>();
		int int_random = 0;
		//generate sequence of random characters and store value(s) in random_code
		for (int incre = 1; incre <= size; incre++) {
			int_random = rand.nextInt((codelist.length + 1));
			random_code.add(codelist[int_random]);
		}
		
		//Format string and save final format which will be returned.
		final_code = (random_code.toString());
		final_code = final_code.replace(',', ' ')
				.replace('[', ' ')
				.replace(']', ' ')
				.replaceAll(" ", "");
				 

		return final_code;
	}

}
