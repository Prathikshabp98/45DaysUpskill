package qa_upskilling_45.Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsTest {

	public static void main(String[] args) {
		//1
		CollectionsUtility.sumArray();
		
		//2
		String[] names = {"John", "Alice", "Bob", "John", "Alice", "Eve"};
		HashSet<String> result = CollectionsUtility.getDuplicateStrings(names);
		System.out.println("Duplicate strings: " + result);

		
		//3
		 String[] testNames = {"hat" , "moon" , "sun" , "tv" , "bp" , "prathiksha"};
	     HashMap<Integer , ArrayList<String >> res = CollectionsUtility.getWordsLength(testNames);
	     System.out.println(res);
	     
	     //4
	     int[] num = {4,3,6,2,8};
	     CollectionsUtility.arraySort(num);
	     
	     //5
	     CollectionsUtility.twoSum(2,8);
	}
	
	

}
