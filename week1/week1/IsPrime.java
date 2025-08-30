package assignmentsOfTestleaf.week1;

public class IsPrime {

	public static void main(String[] args) {
		
		int count =0;
		int s_nums = 3;
		
		for(int i=1;i<=s_nums;i++)
		{
			if(s_nums % i == 0)
			{
				count++;
				
			}
		
		}
		if(count == 2) {
			System.out.println("its a prime number");
		}
		else 
			System.out.println("not a prime number");
		}
		
	
}
