package Anagrams;

import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first string: ");
String str1 = scanner.nextLine().toLowerCase();
System.out.print("Enter the second string: ");
String str2 = scanner.nextLine().toLowerCase();
scanner.close();

if (areAnagrams(str1, str2))
{
	System.out.println("The strings are anagrams.");
	}
else
{
	System.out.println("The strings are not anagrams.");
	}
}
	public static boolean areAnagrams(String str1, String str2) 
	{
		if (str1.length() != str2.length()) 
		{
			return false;
			}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

return Arrays.equals(charArray1, charArray2);
}
	
}


