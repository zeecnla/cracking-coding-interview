 package search;
/*
 * This search assumes only integer numbers you can search other
 * types by making this generic will fix in the future
 */
public class LinearSearch {
	
	public LinearSearch(){}
	
	
	public static boolean search(int [] array, int num){
		for(int i =0; i < array.length; i++){
			if(array[i] == num){
				return true;
			}
		}
		return false;
	}

}
