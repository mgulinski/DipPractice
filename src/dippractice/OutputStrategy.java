/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Machi
 * 
 * this is an interface through which High Lever Module MessageServies 
 * communicates with Low Level Modules: ConsoleOutputStrategy and
 * GuiOutputStrategy 
*/
public interface OutputStrategy {

    public abstract void outputMessage(String msg);
}
