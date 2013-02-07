package dippractice;

import javax.swing.JOptionPane;

/**
 * @author Machi
 */
public class GuiInputStrategy implements InputStrategy {
    
  
    @Override
    public String readMessage() {
	
	String msg = JOptionPane.showInputDialog("Enter message: ");
	return msg;
    }
    
}
