import java.util.Scanner;
import java.lang.Math;

public class SamplePlatter 
{
	
	public static String duplicate(String str)
	{
		String newString = "";
		for(int i = 0; i < str.length(); i++)
		{
			int n = str.length();
			if(n % 2 == 0)
			{
				n *= 2;
			}
			for(int j = 0; j < n; j++)
			{
				newString += str.charAt(i);
			}
		}
		
		return newString;
		
	}
	
	public static boolean isEdhesivePalindrome(String str)
	{
		str = str.toLowerCase();
		
		if(str.length() < 3 || str.length() > 15)
		{
			return false;
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == '4')
			{
				str = str.replace('4','a');
			}
			if(str.charAt(i) == '3')
			{
				str = str.replace('3', 'e');
			}
			if(str.charAt(i) == '0')
			{
				str = str.replace('0', 'o');
			}
		}
		
		
		String midLeft = "";
		for(int i = 0; i < str.length() / 2; i++)
		{
			midLeft += Character.toString(str.charAt(i));
		}
		
		String rightMid = "";
		for(int i = str.length() - 1; i > str.length() / 2; i--)
		{
			rightMid += Character.toString(str.charAt(i));
		}
				
		if(midLeft.equals(rightMid))
			return true;
		
		return false;
	}
	
	public static double numberScramble(double num)
	{
		if(num < 0)
			return 0.0;
		
		num += 5;
		num /= 2;
		num = Math.sqrt(num);
		
		return num;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String dup;
		String pali;
		double num;
		
		System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
		dup = scan.nextLine();
		System.out.println("The duplicated String is: " + duplicate(dup));
		
		System.out.println("Next, please enter a STring to check for Edhesive Palindromes.");
		pali = scan.nextLine();		
		if(isEdhesivePalindrome(pali))
		{
			System.out.println("Nice, you found an Ehesive Palindrome!");
		}
		else
		{
			System.out.println("Too bad, that isn't an Edhesive Palindrome.");
		}
		
		System.out.println("Almost done! Please enter a number to scramble.");
		num = scan.nextDouble();
		System.out.println("The scrambled number is: " + numberScramble(num));
		
	}
}
