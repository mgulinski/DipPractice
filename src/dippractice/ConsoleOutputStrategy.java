package dippractice;

/**
 * @author Machi
 * 
 * low level derived class that implements outputMessage method
 */
public class ConsoleOutputStrategy implements OutputStrategy {
    
    @Override
    public void outputMessage(String msg) {
    
	System.out.println("Your message is: " + "\"" + msg + "\"");
    
    }
    
}
