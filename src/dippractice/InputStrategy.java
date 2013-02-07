
package dippractice;

/**
 *
 * @author Machi
 * 
 * this is an interface through which High Level Module MessageService 
 * communicates with Low Level Modules: ScannerInputStrategy and 
 * GuiInputStrategy
 */
public interface InputStrategy {

    public abstract String readMessage();
    
}
