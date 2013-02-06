package dippractice;

import java.util.Scanner;

/**
 * @author Machi
 */
public class ScannerInputStrategy implements InputStrategy {
    
   
    @Override
    public String getMessage() {
    
	Scanner input =  new Scanner(System.in);
	
	System.out.print("Enter your message: ");
	String msg = input.nextLine();
	
	return msg;
    }
    
}
