// Straxinja Labus on 05/2020
import java.util.Scanner;

public class AddingValuesForLoop
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int num;
	int total = 0;

	System.out.print("Number: ");
	num = scan.nextInt();

	for(int i = 1; i<=num; i++){
		System.out.print(i + " ");
		total += i;	
	}
	System.out.println();
	System.out.println("The sum is " + total + ".");			
 }
}
