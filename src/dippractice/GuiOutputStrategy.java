package dippractice;

import javax.swing.JOptionPane;

/**
 * @author Machi
 * low level derived class that implements outputMessage method
 */
public class GuiOutputStrategy implements OutputStrategy {
    
    @Override
    public void outputMessage(String msg) {
    
	JOptionPane.showMessageDialog(null, "Your message is:\n" + "\"" + msg + "\"");
	
    }
    
}
