package assignmentsOfTestleaf.week1;

public class Fibonacci {

	public static void main(String[] args) {
		
		int first_Number = 1;
		int sec_Number = 2;
		int last_Number = 8;
	
		
		for(int i  = 1;i<=last_Number;i++) {
			System.out.println( first_Number   + "  " + i+" ");		
			int next_Number = first_Number+ sec_Number;
			first_Number  = sec_Number;
			 sec_Number = next_Number;
			
			
			
		}

	}

}
