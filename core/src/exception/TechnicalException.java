package exception;

/**
 * 
 * throw if there are some technical problems like files, folders, sounds, graphics and so on 
 *
 */
public class TechnicalException extends RuntimeException {

	private static final long serialVersionUID = 5389710111097341084L;

	public TechnicalException(String message) {
        super(message);
    }
}