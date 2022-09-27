package week3.day1;

public class CharCount {

	public static void main(String[] args) {
		String name="aaaaaaa";
		char ch='a';
		int count=0;
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++)
		{
			if(charArray[i]==ch)
			{
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}

}
