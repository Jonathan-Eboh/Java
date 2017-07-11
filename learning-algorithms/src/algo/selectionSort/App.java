package algo.selectionSort;

public class App {

	public static void main(String[] args) {
		int [] myArr = selectionSort(new int[] {9,8,3,13,87,12,99});
		for(int i= 0; i < myArr.length; i++){
			System.out.println(myArr[i]);
		}
	}
	
	public static int[] selectionSort(int arr[]){
		for(int i = 0; i < arr.length - 1; i++){
			int min = i; //a)
			for(int j = i + 1; j < arr.length; j++){ //b)
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			//c)
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

}
