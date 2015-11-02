package labFiles;

public class RadiusCannotBeNegativeException extends IllegalArgumentException {
	public RadiusCannotBeNegativeException(String exc){
        super(exc);
    }
	
	public String getMessage(){
        return super.getMessage();
    }

}
