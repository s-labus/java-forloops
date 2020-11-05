// Straxinja Labus on 05/2020
import java.util.Random;

public class BabyBlackjack
{

	public static void main(String[] args){
	Random r = new Random();
	int pCard1 = 1 + r.nextInt(10);	
	int pCard2 = 1 + r.nextInt(10);

	System.out.println();
	System.out.println("You drew " + pCard1 + " and " + pCard2 + ".");
		System.out.println("Your total is " + (pCard1 + pCard2) + ".");
	System.out.println();
	int cCard1 = 1 + r.nextInt(10);
	int cCard2 = 1 + r.nextInt(10);
	System.out.println("You drew " + cCard1 + " and " + cCard2 + ".");	
			System.out.println("Your total is " + (cCard1 + cCard2) + ".");
	System.out.println();
	if((pCard1+pCard2)>(cCard1+cCard2)){
	System.out.println("You WIN!");}else{System.out.println("You LOSE!");}		
 }
}
