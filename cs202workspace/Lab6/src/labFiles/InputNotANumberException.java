package labFiles;

import java.util.InputMismatchException;

public class InputNotANumberException extends InputMismatchException {
	public InputNotANumberException(){
		super("Input is not a number!");
    }
	
	public InputNotANumberException(String message){
        super(message);
    }
	
	public String getMessage(){
        return super.getMessage();
    }
	
}
