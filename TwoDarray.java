import java.util.Scanner;

public class TwoDarray {
	
	
	private TwoDarray()
	{
		
	}

		// TODO Auto-generated method stub
		
		public static double[][] readDouble2D() {
			
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter rows");
         int m = scan.nextInt();
	        
			System.out.println("enter column");
	        int n = scan.nextInt();
	        double[][] a = new double[m][n];
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	              
	                a[i][j]=scan.nextDouble();
	            }
	        }
	        return a;
	    }

	    
	    public static void print(double[][] a) {
	        int m = a.length;
	        int n = a[0].length;
	        System.out.println(m + " " + n);
	       
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	              
	                System.out.println(a[i][j]);
	            }
	        }
	            

	}
	    
	    public static int[][] readInt2D() {
			
			 Scanner scan=new Scanner(System.in);
			 System.out.println("enter rows");
	         int m = scan.nextInt();
		        
				System.out.println("enter column");
		        int n = scan.nextInt();
		        int[][] a = new int[m][n];
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < n; j++) {
		              
		                a[i][j]=scan.nextInt();
		            }
		        }
		        return a;
		    }

		    
		    public static void print(int[][] a) {
		        int m = a.length;
		        int n = a[0].length;
		        System.out.println(m + " " + n);
		       
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < n; j++) {
		              
		                System.out.println(a[i][j]);
		            }
		        }
		            

		}
	    
	    
	    
	        
	        
	    	public static void main(String[] args) {
	    		
	            
	            
	            double[][] x=TwoDarray.readDouble2D();
	            System.out.println(x);
	            
	            
	            int[][] y=TwoDarray.readInt2D();
	            System.out.println(y);

	    		


        }
	  }
