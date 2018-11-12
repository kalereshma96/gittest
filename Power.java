import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	    	   int power=Integer.parseInt(args[0]);
	          
	           if(power >31)
	           {
	        	   System.out.println("enter no less than 31");
	        	  
	        	  
	        		   
	           }else
	           {
	           
	           int temp=1;
	           for(int i=1;i<power;i++)
	           {
	        	   temp=temp*2;
	        	   
	           }
	        
	        System.out.println(power + "of no is" + temp);
		
	           }
	}

}
