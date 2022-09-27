package week3.day1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="         I am Dharshini                  ";
		String myname=new String ("Dharshini");
		//Equal
		if(myname.equalsIgnoreCase(name))
		{
			System.out.println("It Equal");
			
		}
		else 
			
		{
			System.out.println("Not Equal");
		}
		
		//contains
		boolean contains = name.contains("am");
		System.out.println(contains);
		
		//finding length
		int length= name.length();
		System.out.println(length);
		
		//string to char
		char[] array = name.toCharArray();
		System.out.println(array);
		
		//index value
		int indexOf = name.indexOf('D');
		System.out.println(  "Index value of D"    +  indexOf );
		
		//Find the char availble char in given position
		char charAt = name.charAt(2);
		System.out.println("Character at thr given position"   +   charAt);
		
		//split the sentence
		String[] split = name.split(" ");
		System.out.println(split );
		
		//lower case
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		//upper case
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		//sub string
		String substring = name.substring(9);
		System.out.println(substring);
		
		//trim
		System.out.println(name);
		String trim = name.trim();
		System.out.println(trim);
		
		
		//char[] charArray=name.toCharArray();
		//for (int i = charArray.length-1; i>=0; i--) 
		//{
			//System.out.println(charArray[i]);
			
		//}
		
		

	}

}
