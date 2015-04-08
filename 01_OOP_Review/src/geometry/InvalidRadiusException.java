package geometry;

@SuppressWarnings("serial")
public class InvalidRadiusException extends RuntimeException {
	
	public InvalidRadiusException(){
		super("Invalid Radius");
	}
	public InvalidRadiusException(String message){
		super(message);
	}
}
