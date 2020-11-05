// Straxinja Labus on 05/2020
import java.util.Scanner;

public class LetterAtATime
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String msg;
	System.out.print("What is your message? ");
	msg = scan.nextLine();
	System.out.println();

	System.out.println("Your message is " + msg.length() + " characters long.");
	System.out.println("The first character is at position 0 and it is " + "'"+msg.charAt(0)+"'"+".");
	System.out.println("The last characters is at position " + (msg.length()-1) + " and is " +"'"+ (msg.charAt(msg.length()-1))+"'"+".");	

	System.out.println();

	System.out.println("Here all the characters, one at a time: ");
	System.out.println();

	for(int i = 0; i < msg.length(); i++){
		System.out.println("\t" + i + " - " + "'"+msg.charAt(i) + "'");
	}
 }
}
