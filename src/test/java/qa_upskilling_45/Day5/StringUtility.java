package qa_upskilling_45.Day5;

import java.util.HashMap;
import java.util.Map;

public class StringUtility {

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
	
	public static String countVowels(String name)
	{
		int count = 0;
		for(int i =0 ; i<name.length() ; i++)
			{
                char ch = name.charAt(i);
                if(ch =='a' || ch =='e' || ch == 'i' || ch =='o' || ch =='u')
                {
                	count++;
                }
			}
		System.out.println("Number of vowels in the string is : "  +count);
		return name;
		
	}
	
	public static String capitalWord(String name)
	{
		String str = name.toUpperCase();
		System.out.println("The string in capital letters is : " + str);
		return str;
	}
	
	public static Map<Character,Integer> charFrequency(String name)
    {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i =0 ; i<name.length() ; i++)
        {
          Character ch = name.charAt(i);
          if(map.containsKey(ch))
          {
            map.put (ch , map.get(ch)+1);
          }
          else
          {
            map.put(ch , 1);
          }
        }

        System.out.println(map);

        return map;
        




            }

}
