/**
 * 
 */
package morgan.rayon.Main;
import morgan.rayon.standard.*;

/**
 * @author Rayon Morgan
 *  
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoFactorAuthentication login = new  TwoFactorAuthentication();
		login.authenticate("rayon", "morgan", true);

	}

}
