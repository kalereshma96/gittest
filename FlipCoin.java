import java.lang.Math;
import java.util.Scanner; 
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		FlipCoin fc = new FlipCoin();
		
		int choice;
		System.out.println("percentage of head n tails");
		
		
		do
		{
			System.out.println("enter 1 for flip and 0 for quit");
			
			  Scanner scan = new Scanner(System.in);   
		        choice = scan.nextInt();
			
			
			

			
		}while(choice!=0);
		
		

	}
	public static double getRandomNo()
	{
		double x= Math.random();
		System.out.println(x);
		return x;
		
	}

}
