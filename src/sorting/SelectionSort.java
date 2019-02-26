package sorting;
/**
 * My implementation of selection sort
 * @author Cesar-Melchor
 *
 */
public class SelectionSort {
	
	public SelectionSort(){}
	
	public static int[] search(int [] array){
	
	
		int min = array[0];
		for(int i=0; i < array.length-1; i++ ){
			int index = i;
			for(int j =i+1; j < array.length;j++){
				if(array[j] < array[index]){
					index=j;
				}	
			}
			if(index!=i){
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
		return array;
	}

}
