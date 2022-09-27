package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 String str1="care";
		 String str2="car";
		 int length1 = str1.length();
		 int length2 = str2.length();
		 if(length1==length2)
		 {
			 char[] ch1 = str1.toCharArray();
			 char[] ch2 = str2.toCharArray();
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 for (int i = 0; i < ch2.length; i++) {
				 if(ch1[i]==ch2[i])
				 {
					 System.out.println("Its a Anagram");
					 break;
				 }
				 else
				 {
					 System.out.println("Its not a Anagram");
				 }
				
			}
			 
			 
		 }
		 
		 else
		 {
			 System.out.println("Invalid input");
		 }

	}

}
