
/**
 * Lab 2
 * UniqueWords.java
 * Christian Felix
 * 2-28-2021
 * This Program will cycle through an ArrayList of words and determine 
 * the unique words (words that appear ONLY once in the set)
*/
import java.util.ArrayList;
import java.util.*;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		ArrayList<String> tempArray = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			String currentString = list.get(i);

			if (!(tempArray.contains(currentString))) {
				tempArray.add(currentString);
			}

		}
		return tempArray.size();
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");
		

		int unique = countUnique(words);

		System.out.println(words + " has " + unique + " unique words");
	}
}
