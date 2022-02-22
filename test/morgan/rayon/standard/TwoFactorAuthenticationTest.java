package morgan.rayon.standard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwoFactorAuthenticationTest {
	
	TwoFactorAuthentication twofactorauthentication; 
	
	@Before 
	public void ExecuteBefore()
	{
		twofactorauthentication = new TwoFactorAuthentication(); 
	}

	@Test
	public void testGenerateCode_sizeFour() {
		
		 int test_size = 4;
		 assertEquals(test_size, twofactorauthentication.generateCode(test_size).length() );
	}

}
