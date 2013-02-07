package dippractice;

import java.util.Scanner;

/**
 * @author Machi
 * low level derived class that implements readMessage method
 */
public class ScannerInputStrategy implements InputStrategy {

    private String msg;

    @Override
    public String readMessage() {

	System.out.print("Enter your message: ");

	Scanner input = new Scanner(System.in);
	return input.nextLine();
    }

}
