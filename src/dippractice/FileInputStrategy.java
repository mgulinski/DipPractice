package dippractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Machi
 */
public class FileInputStrategy implements InputStrategy {

    @Override
    public String readMessage() {

	String msg = null;
	File messageFile = new File("C:/Temp/Message.txt");
	try {
	    Scanner inputMessage = new Scanner(messageFile);
	    msg = inputMessage.nextLine();

	} catch (FileNotFoundException ex) {
	    Logger.getLogger(FileInputStrategy.class.getName()).log(Level.SEVERE, null, ex);
	}

	return msg;
    }
}
