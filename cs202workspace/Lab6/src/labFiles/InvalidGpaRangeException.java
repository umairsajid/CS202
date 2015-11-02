package labFiles;

public class InvalidGpaRangeException extends IllegalArgumentException {
	public InvalidGpaRangeException(String exc){
        super(exc);
    }
	
	public String getMessage(){
        return super.getMessage();
    }
}
