package qa_upskilling_45.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsUtility {
	
	//1
	public static int sumArray()
    {
      int sum = 0;
      int[] numbers = { 10 , 20 , 30};
      for(int no : numbers)
      {
         sum = sum + no;
      }

      System.out.println(sum);
      return sum;
    }
	
	//2
	public static HashSet<String> getDuplicateStrings(String[] names) {
	    HashSet<String> seen = new HashSet<>();
	    HashSet<String> duplicates = new HashSet<>();

	    for (String name : names) {
	        boolean isNew = seen.add(name);   // true if this was NOT already in 'seen'

	        if (isNew) {
	            // it wasn't a duplicate this time — what should happen here? (hint: maybe nothing needs to happen)
	        } else {
	            duplicates.add(name);
	        }
	    }

	    return duplicates;
	}
	
	//3
	public static HashMap<Integer,ArrayList<String>> getWordsLength(String[] names) {
	    HashMap<Integer , ArrayList<String>> map = new HashMap<>();
	  
	    for (String name : names) {
	      int count = name.length();

	      if(map.containsKey(count))
	      {
	        
	       ArrayList<String> existingList = map.get(count);
	                existingList.add(name);
	                map.put(count,existingList);
	      }
	      else
	      {
	        ArrayList<String> newList = new ArrayList<>();
	                newList.add(name);
	                map.put(count, newList);
	      }
	        
	    }

	    return map;
	}
	
	//4
	public static int[] arraySort(int[] arr)
    {
    Arrays.sort(arr);

    System.out.println(arr);                 
    System.out.println(Arrays.toString(arr));

    return arr;

  }
	
	//5
	public static int twoSum(int a , int b)
    {
        int sum = a +b ;
        System.out.println("Sum of  two numbers is : " + sum);
        return sum;


  }

	

}
