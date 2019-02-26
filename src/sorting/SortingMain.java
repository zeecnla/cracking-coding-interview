package sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortingMain {

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
		int [] sorted = {1,3,4,7,9};
		int [] b = BubbleSort.search(a);
		assertEquals(Equal(a,b), true);
		assertEquals(Equal(a,b), false);
	}
	@Test
	public static void testSelectionSort(){
		
	}
	@Test
	public static void testQuickSort(){
	}
	@Test
	public static void testHeapSort(){
	}

}
