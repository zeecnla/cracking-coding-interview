package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * This class will be used to solve any udemy questions 
 * that come up for the udemy course i am taking for data 
 * structures and algorithms
 * @author Cesar-Melchor
 *
 */

public class Main {

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
}
