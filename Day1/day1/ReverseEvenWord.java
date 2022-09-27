package week3.day1;

public class ReverseEvenWord 
{

	public static void main(String[] args) 
	{
		String input="Testleaf located in chennai";
		
		String[] split = input.split(" ");
		for (int i = 0; i < split.length; i++) 
		{
		
			if(i%2!=0)
			{
				char[] charArray = split[i].toCharArray();
				for (int j =  charArray.length-1; j >=0; j--)
				
					System.out.println(charArray [j]);
			}
		}
		
	
			System.out.println(split[i]);
		
		
				
			
		}
}


