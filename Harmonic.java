import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		double result = 0, no = 0, i;

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the harmonic no u want to find");
		n = scan.nextInt();

		
	/*	if(no==0) {
			
		 	for (i = 1; i <= n; i++) {

				no = no + (1 / i);
				result = no;
      
			}
		 	
			System.out.println("enter no greater than 0");
		}
			
		
			System.out.println("value of harmonic no:" + n + " is " + result);
		}
	

}*/
		
     if(no!=0) 
    	 
    	 
     {
    	 
			   System.out.println("enter no greater than 0");

		}
     else
     {
    	 for (i = 1; i <= n; i++) 

				no = no + (1 / i);{
				result = no;
			} 	
				
		System.out.println("value of harmonic no:" + n + " is " + result);
		}
 

     }
}
