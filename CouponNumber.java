import java.util.Scanner;

public class CouponNumber {
	
	public static int getCoupon(int n)
	{
	   return(int) (Math.random()*n);
		//return n;
	}
	
	public static int collect(int n) {
		boolean[] isCollected=new boolean(n);

		int count=0;
		int distinct=0;
		
		while(distinct<n)
			{
			int value=getCoupon(n);
             count++;	
            if(!isCollected[value])
     
            {
            	distint++;
            	isCollected[value]=true;
            }
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=scan.nextInt(n);
		count=collect(n);
		System.out.println("count is :" +count);
		

	}

	
}
