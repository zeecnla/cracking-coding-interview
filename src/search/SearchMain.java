package search;

public class SearchMain {

	public static void main(String[] args) {
		
		int [] a = {1,5,12,8,9,20};
		new LinearSearch();
		System.out.println( LinearSearch.search(a, 19));
		
		int [] b = {1,4,5,9,12};
		new BinarySearch();
		System.out.println( BinarySearch.search(b, 9));

	}

}
