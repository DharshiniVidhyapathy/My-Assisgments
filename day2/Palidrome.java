package week1.day2;

public class Palidrome {

	public static void main(String[] args) {
		int num=234455,temp,num1,num2=0;
		temp=num;
		while(temp!=0) {
			num1=temp%10;
			num2=num2*10+num1;
			temp=temp/10;
			
		}
		if(num2==num)
		{
			System.out.println("It's a Palindrome");
		}
		else
		{
			System.out.println("Its not a Palindrome");
		}
		
	}

}
