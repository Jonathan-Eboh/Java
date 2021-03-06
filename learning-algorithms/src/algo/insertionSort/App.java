package algo.insertionSort;

public class App {

	public static void main(String[] args) {
		int [] myArr = insertionSort(new int[] {9,8,3,13,87,8,12,99});
		for(int i= 0; i < myArr.length; i++){
			System.out.println(myArr[i]);
		}
	}

	public static int[] insertionSort(int [] arr){
		for(int i = 1; i < arr.length - 1; i++){ //i starts at one here because we consider the first slot to already be sorted
			
			//A)
			int element = arr[i];// comntains data we intend to bring over to the sorted side of the array
			int j = i - 1; // j always points to the last index position of the sorted area which is always right before i
			//B)
			while(j >= 0 && arr[j] > element){
				arr[j + 1] = arr[j];
				j--;
			}
			//C)
			arr[j + 1] = element;
			
		}
		return arr;
	}
}
