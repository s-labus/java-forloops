// Straxinja Labus on 05/2020

public class FizzBuzz
{

	public static void main(String[] args){
	
	for(int i=1; i <= 100; i++){
		
		if((i % 3 == 0) && (i%5 ==0)){System.out.println("FizzBuzz");}
		else if(i % 3 == 0){System.out.println("Fizz");}
		else if(i % 5 == 0){System.out.println("Buzz");}
		else{System.out.println(i);}
		try{Thread.sleep(500);}catch(Exception e){} 
	}
	System.out.println("Well done Bann!");
 }
}
