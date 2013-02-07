package dippractice;

import java.util.Scanner;

/**
 * @author Machi
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
