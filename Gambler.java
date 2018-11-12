import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int $stake,$goal;
		int bets=0,wins=0;
		
		Scanner scan=new Scanner(System.in);

		
		System.out.println("enter stakes:\n");
		$stake=scan.nextInt();
		
		System.out.println("enter goals:\n");
		$goal=scan.nextInt();
		
		
		System.out.println("Enter number of times:\n");
		int noOfTimes=scan.nextInt();
		
		
		for(int i=0; i<noOfTimes; i++)
		{
			int money=$stake;
			
			while((money>0)&&(money<$goal))
			{
				bets++;
			
		if(Math.random()<0.5)
		
		  money++;
		else
		 money--;
		     }
		
			if(money==$goal)
			{
				wins++;
			}
		}
			System.out.println(wins+ "no of wins" +noOfTimes);
		    System.out.println("percentage of wins:" +100.0*wins/noOfTimes);
			System.out.println("Avg bets:" +100.0*bets/noOfTimes);
		
		
		

	}

}


