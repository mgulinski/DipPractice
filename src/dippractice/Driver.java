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
	
//	InputStrategy in = new FileInputStrategy();
	
//	InputStrategy in = new FileInputStrategy();
	
	OutputStrategy out = new FileOutputStrategy();
	
	
	MessageService service = new MessageService(in, out);
	service.copyMessage();
	
//	// output
//	OutputStrategy out = new ConsoleOutputStrategy();//Liskov substitution principle
	
	InputStrategy in2 = new FileInputStrategy();
	
	OutputStrategy out2 = new GuiOutputStrategy();
	
//	OutputStrategy out = new FileOutputStrategy();
	
	MessageService service2 = new MessageService(in2, out2);
	
	service2.copyMessage();
    }
    
}
