package sorting;

public class BubbleSort {

	public BubbleSort() {}
	public static int[] sort(int [] numbers){
		
		for(int i=0;i < numbers.length -1;i++){
			for(int j =0; j < numbers.length -1 - i ; j++){
				
				if(numbers[j] >  numbers[j+1] ){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}	
			}
		}
		return numbers;
	}

}
