import java.util.Scanner;

public class Leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		
		System.out.println("Enter year to check if it is leap year or not:\n");
        Scanner scan = new Scanner(System.in);   
        year = scan.nextInt();
        //scan.close();
        boolean isleap = false;
        
        
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            	
            {
                if (year % 400 == 0)
                	
                	isleap=true;
                else
                	isleap=false;

            }
            else
            	
            	isleap=true;

        	
        }
        else
        {
        	isleap = false;
        	
        }	
        
        if (isleap==true)
        
        	System.out.println(year + "\nis a leap year");
        	
        else
        	System.out.println(year + "\nis not a leap year");

        	
        
        	
	}

}
