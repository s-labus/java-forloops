// Straxinja Labus on 05/2020

public class NoticingEvenNumbers
{

	public static void main(String[] args){
	
	for(int i=1; i <= 20; i++){

	if(i%2 == 0){
		System.out.println(i + " <");
		}else{
		System.out.println(i);
		}
		try{Thread.sleep(600);}catch(Exception e){};
	}
	System.out.println("Well done Bann!");
 }
}
