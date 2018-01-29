
import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter full name: ");
	String s = input.nextLine();

	int k = s.indexOf(' ');
	String firstName = s.substring(0, k);
	String lastName = s.substring(k + 1);

	System.out.println("Hello Mr./Mrs. " + lastName);	

	}

}
