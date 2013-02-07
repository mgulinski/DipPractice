package dippractice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Machi
 */
public class FileOutputStrategy implements OutputStrategy {

    @Override
    public void outputMessage(String msg) {

	PrintWriter messageFile = null;
	try {
	    messageFile = new PrintWriter("C:/Temp/Message.txt");
	} catch (FileNotFoundException ex) {
	    Logger.getLogger(FileOutputStrategy.class.getName()).log(Level.SEVERE, null, ex);
	}
	messageFile.println(msg);
	messageFile.close();

    }
}

