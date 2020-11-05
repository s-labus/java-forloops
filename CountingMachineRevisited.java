// Straxinja Labus on 05/2020
import java.util.Scanner;

public class CountingMachineRevisited
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.print("Count from: ");
	int one = scan.nextInt();

	System.out.print("Count to: ");
	int two = scan.nextInt();

	System.out.print("Count by: ");
	int three = scan.nextInt();	

	for(int i = one; i <= two; i += three){
		System.out.print(i + " ");
	}
 }
}
