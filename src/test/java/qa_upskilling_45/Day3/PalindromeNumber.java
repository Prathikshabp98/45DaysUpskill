package qa_upskilling_45.Day3;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n = 123217 ;
		
		String num = String.valueOf(n);
		
		int reversed = 0;
		
		for (int i = num.length()-1; i>=0 ; i--) 
		{
			int digit = num.charAt(i) - '0';
			reversed = reversed *10 + digit ;
		}
		
		if (n == reversed) {
			System.out.println(n + " is a palindrome number");
		} else {
			System.out.println(n + " is not a palindrome number");
		}
	}

}
