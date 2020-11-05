// Straxinja Labus on 05/2020

public class XsAndYs
{

	public static void main(String[] args){
	
	System.out.println("x\ty");
	System.out.println("---------------");	
	for(double i = -10.0; i <= 10.0; i+=0.5){
	 System.out.println(i + "\t" + (i*i));
	 try{Thread.sleep(500);}catch(Exception e){}
	}
	System.out.println("---------------");	
 }
}
