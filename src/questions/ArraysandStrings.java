package questions;

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
