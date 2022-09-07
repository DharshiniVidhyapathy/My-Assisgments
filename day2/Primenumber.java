package week1.day2;

public class Primenumber 
{

	public static void main(String[] args)
	{
		int i,num = 91;
	    boolean flag = false;
	    for ( i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is not a prime number.");
	    else
	      System.out.println(num + " is a prime number.");

		
		

	}

}
