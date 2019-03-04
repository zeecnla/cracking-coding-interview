package questions;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * My implementation of all the problems in the strings and arrays 
 * chapter of the book. I tried doing all of the problems on paper
 * first until I thought i was finished, got stuck, or ran out of time
 * 
 * @author Cesar-Melchor
 *
 */

public class ArraysandStrings {
	
	public static void main(String[] args) {
		
		/**
		 * Find Unique Numbers in Array
		 * Design a list tht will return elements that are not repeated;
		 */
		int [] array = {1,3,5,6,6,7,8,10,10};
		ArrayList<Integer> list = getUniqueNumber(array);
		for(int num:list){
			System.out.println(num);
		}
		/**
		 * Key Phrase Problem: 
		 * Suppose we have a text document find the important
		 * word in the text
		 */
		//String text = "Suppose we have "
	}
	public static ArrayList<Integer> getUniqueNumber(int [] array){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int count =1;
		for(int i=0; i <array.length; i++){

			if(map.get(array[i])!=null){
				int freq = map.get(array[i]);
				map.put(array[i], freq+1);
				
			}else {
				map.put(array[i], count);
			}
		}
		
		for(int num: map.keySet()){
			if(map.get(num) ==1){
				list.add(num);
			}
			
		}
		
		return list;
	}
	
	//1.1 IsUnique
	/**The correct answer in the book was to implement 
	 * a boolean 128 bit array and for each char set that int
	 * to true or false. it is faster and you save space than 
	 * creating a new list
	 * **/
	public boolean IsUnique(String s){
		List<Character> checked = new ArrayList<Character>();
		for(char c : s.toCharArray()){
			if(checked.contains(c)){
				return false;
			}else {
				checked.add(c);
			}
		}
		return true;
	}
	//1.2 checkPermutation
	public boolean IsPermutation(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		List<Character> checked = new ArrayList<Character>();
		for(char c:s1.toCharArray()){
			checked.add(c);
		}
		for(char c:s2.toCharArray()){
			if(!checked.contains(c)) return false;
		}
		return true;
	}
	//1.3 URLify
	public String Urlify(String sentence, int length){
		String mSentence [] = new String[length];
		int i=0;
		for(char c : sentence.toCharArray()){
			if(i >= length){
				break;
			}
			if(c == ' '){
				mSentence[i] = "%20";
			}
			else{
				mSentence[i] = Character.toString(c);
			}
			System.out.println(mSentence[i]);
			i++;
		}
		
		return mSentence.toString();
	}
}
