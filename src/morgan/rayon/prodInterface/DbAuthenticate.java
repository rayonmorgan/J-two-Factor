package morgan.rayon.prodInterface;

/**
 * 
 * @author Rayon Morgan
 *
 */
/*
 * Interface used to control access to the underline database for login purposes
 */
public interface DbAuthenticate {
	public boolean dbMatchCredential(String username,String password);	

}
