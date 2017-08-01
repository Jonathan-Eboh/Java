package algo.quickSort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int [] inputArray = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
		quickSort(inputArray, 0, inputArray.length-1);
		
		System.out.println(Arrays.toString(inputArray));
	}

	public static void quickSort(int [] inputArray, int start, int end){
		if(start < end){
			int q = partition(inputArray, start, end); //q here represents our partition point
			quickSort(inputArray, start, q - 1); //before pivot or first half/left half
			quickSort(inputArray, q + 1, end);//after pivot or second half/right half
		}
	}
	
	public static int partition(int[] A, int p, int r){
		int x = A[r]; //so the value of the array at the last index
		int i = p - 1;
	/*!*/	for(int j = p; j <= r - 1 ; j++){ // This needs to be <= r -1 because we want to include that last value
			if(A[j] <= x){
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		
		int temp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = temp;
		return i +1;
	}
}
