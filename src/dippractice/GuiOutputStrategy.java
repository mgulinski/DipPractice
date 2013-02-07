package dippractice;

import javax.swing.JOptionPane;

/**
 * @author Machi
 */
public class GuiOutputStrategy implements OutputStrategy {
    
    @Override
    public void outputMessage(String msg) {
    
	JOptionPane.showMessageDialog(null, "Your message is: " + msg);
	
    }
    
}
