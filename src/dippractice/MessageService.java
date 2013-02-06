package dippractice;

/**
 * @author Machi
 */
public class MessageService {

        
    private InputStrategy in;
    private OutputStrategy out;

    public MessageService(InputStrategy in, OutputStrategy out) {
	this.in = in;
	this.out = out;
    }
    
    
    public void copyMessage() {
	
	String msg = in.getMessage();
	out.outputMessage(msg);
    }
    
    
}
