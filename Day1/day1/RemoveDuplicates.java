package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */

String text="We learn java basics as part of java sessions in java week1";
int count = 0;
char[] charArray = text.toCharArray();
for (int i = 0; i < charArray.length; i++)
{
	//System.out.println(charArray [i]);
	for (int j = 0; j < charArray.length; j++)
	{
		if(charArray[i]==charArray[j]) {
			count++;
		}
				
	}
	
	
}

	}

}
