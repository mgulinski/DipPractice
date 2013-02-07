package dippractice;

import javax.swing.JOptionPane;

/**
 * @author Machi
 * low level derived class that implements readMessage method
 */
public class GuiInputStrategy implements InputStrategy {
    
  
    @Override
    public String readMessage() {
	
	String msg = JOptionPane.showInputDialog("Enter message: ");
	return msg;
    }
    
}
