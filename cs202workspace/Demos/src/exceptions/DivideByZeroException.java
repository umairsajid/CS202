package exceptions;

public class DivideByZeroException extends ArithmeticException {
	public DivideByZeroException(String exc){
        super(exc);
    }
	
	public String getMessage(){
        return super.getMessage();
    }
}
