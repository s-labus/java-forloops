// Straxinja Labus on 05/2020

import java.util.Scanner;

public class CountingFor
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Type in a message, and I'll display it five times.");
	System.out.print("Message: ");
	String message = scan.nextLine();

	for(int n=2; n <= 10; n = n+2){
		System.out.println(n+". " + message);
	}	
 }
}
