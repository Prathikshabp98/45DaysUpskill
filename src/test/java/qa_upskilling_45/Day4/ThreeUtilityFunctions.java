package qa_upskilling_45.Day4;

public class ThreeUtilityFunctions {

	
	public static int isEven(int num)
	{
		if(num % 2 ==0)
		{
			System.out.println("The number is even");
			
		}
		else {
			System.out.println("The number is odd");
		}
		return num;
	}
	
	public static int maxThree(int a , int b , int c)
	{
		if (a > b && a > c) 
			return a;
		 else if (b > a && b > c) 
			return b;
		else 
			return c;

		
	}
	
	public static String reverseString(String name)
	{
		String reversed="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reversed = reversed + name.charAt(i);
		}
		if(name.equals(reversed))
		{
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}
		return reversed;
	}

}
