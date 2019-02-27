package sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortingMain {
	

	static int [] sorted = {1,3,4,7,9};
	public static void main(String[] args) {
		new BubbleSort();
		new QuickSort();
		new HeapSort();
		new SelectionSort();
		
		
		testQuickSort();
		testBubbleSort();
		testHeapSort();
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
	}
	@Test
	public static void testHeapSort(){
	}

}
