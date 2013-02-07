package dippractice;

/**
 *
 * @author Machi
 */
public class Driver {
    
    public static void main(String[] args) {
	// input
	InputStrategy in = new ScannerInputStrategy();
	
//	InputStrategy in = new GuiInputStrategy();
	
//	// output
//	OutputStrategy out = new ConsoleOutputStrategy();//Liskov substitution principle	
	
	OutputStrategy out = new GuiOutputStrategy();
	
	MessageService service = new MessageService(in, out);
	
	service.copyMessage();
    }
    
}
