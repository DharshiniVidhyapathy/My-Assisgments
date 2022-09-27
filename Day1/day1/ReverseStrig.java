package week3.day1;

public class ReverseStrig {

	public static void main(String[] args) {
		String  name="Dharshini";
		char[] charArray = name.toCharArray();
		//System.out.println(charArray);
		for (int i =charArray.length-1 ; i >=0 ; i--) 
		{
			System.out.println(charArray[i]);
		}
		
}
}
