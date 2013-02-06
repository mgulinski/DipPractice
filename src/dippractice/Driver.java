package dippractice;

/**
 *
 * @author Machi
 */
public class Driver {
    
    public static void main(String[] args) {
	
	InputStrategy in = new ScannerInputStrategy();
	
	OutputStrategy out = new GuiOutputStrategy();//Liskov substitution princeple
	
	
	MessageService service = new MessageService(in, out);
	
	service.copyMessage();
    }
    
}
