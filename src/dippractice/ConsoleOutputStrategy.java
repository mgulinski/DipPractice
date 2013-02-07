package dippractice;

/**
 * @author Machi
 */
public class ConsoleOutputStrategy implements OutputStrategy {
    
    @Override
    public void outputMessage(String msg) {
    
	System.out.println("Your message is: " + msg);
    
    }
    
}
