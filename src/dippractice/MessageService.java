package dippractice;

/**
 * @author Machi
 */
public class MessageService {

   /* Message Service is a High Level Class
    * that communicates 
    */    
    private InputStrategy in;
    private OutputStrategy out;

    public MessageService(InputStrategy in, OutputStrategy out) {
	this.in = in;
	this.out = out;
    }
    
    
    public void copyMessage() {
	
	String msg = in.readMessage();
	out.outputMessage(msg);
    }
    
    
}
