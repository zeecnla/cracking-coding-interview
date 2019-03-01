package sorting;

public class MergeSort {

	public MergeSort() {}
	
	public static void sort(int [] array){
		int [] temp  = new int[array.length];
		sort(array, temp, 0 ,array.length-1);
	}
	private static void sort(int [] array, int [] temp, int low, int high){
		
		if(low < high){
			int middle = (high+low)/2;
			sort(array, temp, low, middle);
			sort(array, temp, middle+1, high);
			merge(array, temp, low, middle,high);
		}
	}

	private static void merge(int[] array, int[] temp, int low, int middle, int high) {
		
		for(int i=low; i <= high; i++){
			temp[i] = array[i];
		}
		int i = low;
		int j = middle+1;
		int current = low;
		
		while(i <= middle && j <= high){
			
			if(temp[i] <= temp[j]){
				array[current] = temp[i];
				i++;
			}else {
				array[current] = temp[j];
				j++;
			}
			
			current++;
		}
		while(i <= middle){
			array[current] = temp[i];
			current++;
			i++;
		}
		
		
		
		
		
	}
}
