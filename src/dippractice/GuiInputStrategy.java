package dippractice;

import javax.swing.JOptionPane;

/**
 * @author Machi
 */
public class GuiInputStrategy implements InputStrategy {
    
  
    @Override
    public String getMessage() {
	
	String input = JOptionPane.showInputDialog("Enter message: ");
	String msg = input;
       
	return msg;
    }
    
}
