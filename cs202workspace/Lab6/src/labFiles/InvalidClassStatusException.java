package labFiles;

public class InvalidClassStatusException extends IllegalArgumentException {
	public InvalidClassStatusException(String exc){
        super(exc);
    }
	
	public String getMessage(){
        return super.getMessage();
    }
}
