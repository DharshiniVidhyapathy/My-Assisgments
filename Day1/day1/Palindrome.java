package week3.day1;

public class Palindrome {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
	String input="madam";
	String rev="";
	char[] charArray = input.toCharArray();
		for (int i =charArray.length-1 ; i >=0 ; i--)
		{
			System.out.println(charArray[i]);
			rev=rev+charArray[i];
			
			
		}
		if(rev.equalsIgnoreCase(input))
		{
			System.out.println("Its a  palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		
		
	}

}
