package sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortingMain {
	

	static int [] sorted = {1,3,4,7,9};
	public static void main(String[] args) {
		new BubbleSort();
		new QuickSort();
		new MergeSort();
		new HeapSort();
		new SelectionSort();
		
		
		testQuickSort();
		testBubbleSort();
		testMergeSort();
		testSelectionSort();

	}
	public static boolean Equal(int []a, int []b){
		if(a.length != b.length) return false;
		
		for(int i=0; i < a.length; i++){
			if(a[i] != b[i]) return false;
		}
		
		return true;
	}
	
	@Test
	public static void testBubbleSort(){
		int [] a = {4,7,9,3,1};
		BubbleSort.sort(a);
		assertEquals(Equal(a,sorted), true);
	}
	@Test
	public static void testSelectionSort(){
		int [] a = {4,7,9,3,1};
		SelectionSort.sort(a);
		assertEquals(Equal(a,sorted), true);
	}
	@Test
	public static void testQuickSort(){
		int [] a = {9,2,6,4,3,5,1};
		int [] sorted = {1,2,3,4,5,6,9};
		QuickSort.sort(a);
		assertEquals(Equal(a,sorted), true);
	}
	@Test
	public static void testMergeSort(){

		int [] a = {9,2,6,4,3,5,1};
		int [] sorted = {1,2,3,4,5,6,9};
		MergeSort.sort(a);
		assertEquals(Equal(a,sorted), true);
	}

}
