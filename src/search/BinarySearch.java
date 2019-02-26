package search;
/*
 * Implementation of Binary Search
 * Key requirement *DATA MUST BE SORTED*
 * 
 */
public class BinarySearch {

	public BinarySearch() {}
	
	public static boolean search(int [] array, int num){
		
		int low = 0;
		int high = array.length - 1;
		
		while(low < high){
			
			int middle = low + (high - low)/2;
			System.out.println(middle);
			
			if(array[middle] == num){
				return true;
			}else if(array[middle] > num){
				low = middle+1;
				return false;
			}else if(array[middle] < num){
				high = middle-1;
			}
		}
		return false;
	}
	

}
