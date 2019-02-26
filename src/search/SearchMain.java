package search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchMain {

	public static void main(String[] args) {
		testBinarySearch();
		testLinearSearch();
	}
	
	@Test
	public static void testBinarySearch(){
		int [] b = {1,2,3,4,5,9,12,21,100,111,123,145};
		new BinarySearch();
		assertEquals(BinarySearch.search(b, 111), true);
	}
	@Test
	public static void testLinearSearch(){
		int [] a = {1,5,12,8,9,20};
		new LinearSearch();
		assertEquals(LinearSearch.search(a, 19), false);
		assertEquals(LinearSearch.search(a, 9), true);
	}
}